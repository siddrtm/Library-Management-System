import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class checkAndIssue {

	
	private String mediaID,userID;
	private int flag=0;
	
	public boolean isCorrectMedia(String Media){
		
		String sql1="SELECT * FROM bookmedia WHERE media_id=\"" + Media+"\"";
		ResultSet rs1=null;
		try {
			rs1 = database.query(sql1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(database.calcSize(rs1)>0)
			return true;
		else
			return false;
			
		}
	
	
	public boolean checkLimit(String ID)
	{
		int limit=0,issued_books=0;
		String sql2="SELECT type FROM customer WHERE customer.ID=\"" + ID+"\"";
		ResultSet rs2=null,rs3=null,rs4=null;
		try {
			rs2 = database.query(sql2);
			rs2.next();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String sql3="SELECT max_no_books FROM cust_type WHERE cust_type.type=\"" + rs2.getString(1)+"\"";
			rs3 = database.query(sql3);
			rs3.next();
			limit = rs3.getInt(1);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql4 = "SELECT COUNT(media_id) FROM checkout WHERE cust_ID=\"" + ID+"\"";
		try {
			rs4 = database.query(sql4);
			rs4.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			issued_books = rs4.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(issued_books <= limit-1){
			return true;
			
		}
		
		else
		{
			return false;
		}
		
		
		
	}
	
	
	public boolean check_status(String media_ID){
		ResultSet rs5=null;
		String sql5= "SELECT code FROM media WHERE media_id=\"" + media_ID+"\"";
		try {
			rs5=database.query(sql5);
			rs5.next();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			try {
				if(rs5.getInt(1)==1)
					return true;
				else return false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		
		
		
	}

	

	

	

//	public String getDate()
//	{
//	      
//	      
//	      return dNow.toString();
//	     }
	     
	   public static Date addDays(Date d)
	     {
	         d.setTime(d.getTime() + 15 * 1000 * 60 * 60 * 24);
	         return d;
	     }
	     
	



	
public String execute()
{
	ResultSet rs6=null,rs7=null;
	int i1,i2;
	
	if(isCorrectMedia(mediaID)==false)
	{
		flag=1;
		return "failure";
		
	}
	if(checkLimit(userID)==false){
		flag=2;
		return "failure";
	}
	
	if(check_status(mediaID)==false){
		flag=3;
		return "failure";
	}
	
	Date dNow = new Date( ), dReturn = new Date();
    SimpleDateFormat ft = 
    new SimpleDateFormat ("dd/MM/yyyy");
   // dReturn=dNow;
    //dReturn = (addDays(dReturn));
    //System.out.println("Current Date: " + ft.format(dNow));
    //System.out.println("Return Date: " + ft.format(addDays(dNow)));
	
	String sql6= "INSERT INTO checkout (media_id,cust_ID,since,until) VALUES(\""+mediaID+"\", \""
				+userID+"\",\"" + ft.format(dNow).toString() +"\",\"" +  ft.format(addDays(dNow)).toString() +"\") ";
	try {
		i1=database.update(sql6);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String sql7= "UPDATE media SET code=0 WHERE media_id=\"" + mediaID+"\"";
	try {
		i2=database.update(sql7);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return "success";
}


public String getMediaID() {
	return mediaID;
}


public void setMediaID(String mediaID) {
	this.mediaID = mediaID;
}


public String getUserID() {
	return userID;
}


public void setUserID(String userID) {
	this.userID = userID;
}


public int getFlag() {
	return flag;
}


public void setFlag(int flag) {
	this.flag = flag;
}
	
	

	
}
