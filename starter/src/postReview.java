import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class postReview extends ActionSupport implements SessionAware {
	
	private String review;
	private SessionMap sessionMap;
	private String ISBN;
	
	@Override  
	   public void setSession(Map<String, Object> map) {  
	       sessionMap = (SessionMap) map;  
	   }
	
	public String execute(){
		
		ResultSet rs= (ResultSet) sessionMap.get("userinfo");
		System.out.println("Review received: " + review + " for book " + ISBN);
		//System.out.println("Rating received: " + rating );
		
		/*
		try {
			System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception from session result set");
			e.printStackTrace();
		}
		*/
		
		try {
			String sql_rating = "SELECT * FROM reviews WHERE book_ID ="+ ISBN +" AND cust_ID =\"" + rs.getString(1) + "\"";
			ResultSet rs1=database.query(sql_rating);
			if(database.calcSize(rs1)>0){
				
				//UPDATE
				
				
				String review_update= "UPDATE reviews SET comment=\"" + review + "\" WHERE book_ID ="+ ISBN +" AND cust_ID =\"" + rs.getString(1) + "\"" ;
				
				database.update(review_update);
			}
			else {
		
				
				//INSERT
				String review_insert = "INSERT INTO reviews (cust_ID, book_ID, comment) VALUES (\'" + rs.getString(1) + "\',\"" + ISBN + "\", \"" 
										+ review +"\")";
				database.update(review_insert);
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



	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}



