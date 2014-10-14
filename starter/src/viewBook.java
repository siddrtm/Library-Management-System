
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import package1.Book;

import com.opensymphony.xwork2.ActionSupport;




public class viewBook extends ActionSupport {
	/**
	 * 
	 */
	ResultSet rs = null,rs1=null,rs_review=null;
	int size_review = 0;
	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	String ISBN;
	//private static final long serialVersionUID = 1L;

	public String execute(){
		
		//HttpServlet request = 
		//System.out.println("id= "+ id);
	
		int size=0;
		//System.out.println("id= "+ ISBN);
		
		
		 String sql1="SELECT title,b_id FROM book WHERE b_id=" + ISBN;
		 
		 String sql2="SELECT AVG(rate) AS RATE FROM rate WHERE book_ID=" + ISBN ;
		 
		 String sql3="SELECT cust_ID, COMMENT FROM reviews LEFT OUTER JOIN book ON book.b_id = reviews.book_ID " +
		 		"WHERE book.b_ID =" + ISBN;
		
		
	         
			try {
				rs = database.query(sql1);
				rs1= database.query(sql2);//for rating
				rs_review = database.query(sql3);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
	        
	         
	         try {
	             rs.last();
	             size = rs.getRow();
	             rs.beforeFirst();
	             
	             rs_review.last();
	             size_review = rs_review.getRow();
	             rs_review.beforeFirst();
	             
	         }
	         catch(Exception ex) {
	             ex.printStackTrace();
	         }
	         //System.out.println(size);

	      

	         if(size==0){
	        	 System.out.println("No results Found");
	        	 return "NoResult";
	         }
		
		
		
		
		
		return "success";

		
}
	
	public String execute1(){
		//HttpServlet request = 
		//System.out.println("id= "+ id);
		
			//System.out.println("id= ");
			return "success";
	
			
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public ResultSet getRs1() {
		return rs1;
	}

	public void setRs1(ResultSet rs1) {
		this.rs1 = rs1;
	}

	public ResultSet getRs_review() {
		return rs_review;
	}

	public void setRs_review(ResultSet rs_review) {
		this.rs_review = rs_review;
	}

	public int getSize_review() {
		return size_review;
	}

	public void setSize_review(int size_review) {
		this.size_review = size_review;
	}


}
