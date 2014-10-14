import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class postRating extends ActionSupport implements SessionAware {
	
	private String rating;
	private SessionMap sessionMap;
	private String ISBN;
	
	@Override  
	   public void setSession(Map<String, Object> map) {  
	       sessionMap = (SessionMap) map;  
	   }
	
	public String execute(){
		
		ResultSet rs= (ResultSet) sessionMap.get("userinfo");
		System.out.println("Rating received: " + rating + " for book " + ISBN);
		//System.out.println("Rating received: " + rating );
		
		
		try {
			System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception from session result set");
			e.printStackTrace();
		}
		
		
		try {
			String sql_rating = "SELECT * FROM rate WHERE book_ID ="+ ISBN +" AND cust_ID =\"" + rs.getString(1) + "\"";
			ResultSet rs1=database.query(sql_rating);
			if(database.calcSize(rs1)>0){
				
				//UPDATE
				
				
				String rate_update= "UPDATE rate SET rate=" + rating + " WHERE book_ID ="+ ISBN +" AND cust_ID =\"" + rs.getString(1) + "\"" ;
				
				database.update(rate_update);
			}
			else {
		
				
				//INSERT
				String rate_insert = "INSERT INTO rate (cust_ID, book_ID, rate) VALUES (\'" + rs.getString(1) + "\',\"" + ISBN + "\", " 
										+ rating +")";
				database.update(rate_insert);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return "success";
		
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
