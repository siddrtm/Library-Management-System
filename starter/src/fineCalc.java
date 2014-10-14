import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class fineCalc {

	int mediaID;
	long fineAmount;
	
	
	public String execute()
	{
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
	
	public int getMediaID() {
		return mediaID;
	}

	public void setMediaID(int mediaID) {
		this.mediaID = mediaID;
	}

	public long getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(long fineAmount) {
		this.fineAmount = fineAmount;
	}
	
	
}
