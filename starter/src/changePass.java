import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import package1.Encryption;

import com.opensymphony.xwork2.ActionSupport;


public class changePass  extends ActionSupport implements SessionAware {
	
	private int flag=0;
	private String oldPass;
	   private String newPass;
	   private String renewPass;
	   private SessionMap<String,Object> sessionMap;
	   ResultSet rs=null,rs_pass=null;

		@Override
		public void setSession(Map<String, Object> map) {

			sessionMap= (SessionMap) map; 
			
		}
		

	public String execute()
	{
		String uid=null,pass=null;
		String encrypted=null;
		rs=(ResultSet) sessionMap.get("userinfo");
		try {
			uid=rs.getString("ID");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql=" SELECT password from customer where customer.ID= '" + uid +"'" ;
		try {
			rs_pass=database.query(sql);
			rs_pass.next();
			pass=rs_pass.getString(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		;
		if(!Encryption.md5(oldPass).equals(pass))

		{
			flag=1;
			return "success";
		}
		if(!newPass.equals(renewPass))
		{
			flag=2;
			return "success";
		}
		encrypted=Encryption.md5(newPass);
		String sql_change="UPDATE customer SET password= '" + encrypted + "'"  +
							"WHERE customer.ID= '" + uid +"'" ;
			
		try {
			database.update(sql_change);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		flag=3;
		
		
		
		
		return "success";
		
	}


	public String getOldPass() {
		return oldPass;
	}


	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}


	public String getNewPass() {
		return newPass;
	}


	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}


	public String getRenewPass() {
		return renewPass;
	}


	public void setRenewPass(String renewPass) {
		this.renewPass = renewPass;
	}


	public int getFlag() {
		return flag;
	}


	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
