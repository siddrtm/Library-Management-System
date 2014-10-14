import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class database {
	static Connection conn = null;
	
	
	
	public static ResultSet query(String query) throws ClassNotFoundException, SQLException{
		
		
		if(conn == null){
		
			
 		 System.out.println("query executing");
 		 String URL = "jdbc:mysql://localhost:3306/sepm";
		 Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection(URL, "root", "");
		}
		 
		String sql = query;
		 
		 
		 
		 
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		 
		return rs;
		
	}
	
public static int update(String query) throws ClassNotFoundException, SQLException{
		
		
		if(conn == null){
		
			
 		 System.out.println("query executing");
 		 String URL = "jdbc:mysql://localhost:3306/sepm";
		 Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection(URL, "root", "");
		}
		 
		String sql = query;
		 
		 
		 
		 
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		 
		return ps.executeUpdate();
		
	}
	


	public static int calcSize(ResultSet rs)
	{
		 try {
			 int size=0;
	         rs.last();
	         size = rs.getRow();
	         rs.beforeFirst();
	         return size;
	     }
	     catch(Exception ex) {
	         ex.printStackTrace();
	         return -1;
	     }
		
		
	}
	
	public static ResultSet getUserInfo(String userid) {
		
		String sql = "SELECT * FROM customer WHERE ID =\"" +userid + "\"";
		ResultSet temp;
		try {
			temp = query(sql);
			if (calcSize(temp)>0){
				temp.next();
				return temp;
			} else{
				return null;
				
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	public static void closeConnection() throws SQLException{
		
		getConn().close();
	}

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		database.conn = conn;
	}
}
