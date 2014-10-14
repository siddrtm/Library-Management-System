import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.websocket.Session;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class issueDetails extends ActionSupport implements SessionAware{

	private SessionMap<String,Object> sessionMap;
	private ResultSet rs1=null;
	
	@Override
	public void setSession(Map<String, Object> map) {

		sessionMap= (SessionMap) map; 
		
	}
	
	
	public String execute(){
		
		String uid = null;
		ResultSet rs = (ResultSet)sessionMap.get("userinfo");
		
		try {
			System.out.println(rs.getString("ID"));
			uid = rs.getString("ID");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println
		String sql1="select checkout.media_id,checkout.cust_ID,title,since,until,book.b_id,subject,edition from checkout" +
				" left outer join bookmedia on " +
				" bookmedia.media_id=checkout.media_id left outer join book on" + 
				" book.b_id=bookmedia.b_id where checkout.cust_ID= '" + uid + "'";
		try {
			rs1=database.query(sql1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return "success";
		
		
	}


	public ResultSet getRs1() {
		return rs1;
	}


	public void setRs1(ResultSet rs1) {
		this.rs1 = rs1;
	}
	
	
}
