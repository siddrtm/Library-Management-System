import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class returnBook {

	static String mediaID;
	
	

	long fineAmount;
	
	
	public String execute(){
		
		System.out.println("Return book's execute");
		String sql_checkout = "DELETE FROM checkout WHERE media_id = \"" + mediaID + "\"";
		String sql_status = "UPDATE media SET code = 1 WHERE media_id =\"" + mediaID + "\"";
		System.out.println("ReturnBook.java execute mediaid:" + mediaID);
		
		try {
		
			if(database.update(sql_checkout)>0)
				System.out.println("Checkout query executed");
			else
				System.out.println("Checkout query not executed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		}
		try {
			if(database.update(sql_status)>0)
				System.out.println("Status query executed");
			else
				System.out.println("Status query not executed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		}
		
		
		
		
		return "success";
	}
	
	
	public String finePost()
	{
		System.out.println("ReturnBook.java finepost mediaid:" + mediaID);
		String sql = "SELECT until FROM checkout WHERE media_id = '"+ mediaID +"'";
		
		
		ResultSet rs = null;
		String dueDate = null;
		try {
			rs = database.query(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next())
			{
				System.out.println(rs.getString("until"));
				dueDate = rs.getString("until");
				fineAmount = fine.calcFine(dueDate);
				System.out.println(fineAmount);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
		
	}
	
	

	public long getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(long fineAmount) {
		this.fineAmount = fineAmount;
	}
	
	public String getMediaID() {
		return mediaID;
	}


	public void setMediaID(String mediaID) {
		this.mediaID = mediaID;
	}
	
	
}
