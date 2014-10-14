
import java.sql.ResultSet;
import java.sql.SQLException;


public class overdueDetails {

	
	private ResultSet rs=null;
	
	public String execute()
	{
		//System.out.println("check check");
		
		String sql_overdue="select checkout.media_id,bookmedia.b_id,checkout.cust_ID,title,customer.name,since,until from checkout " +
				" left outer join customer on customer.ID=checkout.cust_ID " +
				" left outer join bookmedia on bookmedia.media_id=checkout.media_id" + 
                " left outer join book on bookmedia.b_id=book.b_id";
		
		try {

			
				rs=database.query(sql_overdue);
			//	rs.next();
			//	System.out.println(rs.getString(1));
				//rs.next();
				//System.out.println(rs.getString(3));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("not working");
			
			//return "failure";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//return "failure";
			System.out.println("not working");
		}
		
		
		
		return "success";
	}
	
	public  ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	
}
