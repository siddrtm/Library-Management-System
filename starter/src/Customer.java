import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.websocket.Session;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import package1.Encryption;

import com.opensymphony.xwork2.ActionSupport;


public class Customer extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String dob;
	private String address;
	private String phone;
	private String username;
	private String password;
	private String email;
	private String type;
	private String sex;
	
	private ResultSet rs_issue = null;
	
	private SessionMap<String,Object> sessionMap;
	
	@Override
	public void setSession(Map<String, Object> map) {

		sessionMap= (SessionMap) map; 
		
	}
	
	public String AddCustomer(){
		
		if(getId().isEmpty()){
			addFieldError("id","ID is empty");
			return "input";
		}
		if(getName().isEmpty()){
			addFieldError("name","Name is empty");
			return "input";
		}
		if(getDob().isEmpty()){
			addFieldError("dob","DoB is empty");
			return "input";
		}
		if(getAddress().isEmpty()){
			addFieldError("address","Address is empty");
			return "input";
		}
		if(getPhone().isEmpty()){
			addFieldError("phone","Phone is empty");
			return "input";
		}
		if(getUsername().isEmpty()){
			addFieldError("username","Username is empty");
			return "input";
		}
		if(getPassword().isEmpty()){
			addFieldError("password","Password is empty");
			return "input";
		}
		if(getEmail().isEmpty()){
			addFieldError("email","Email is empty");
			return "input";
		}
		
		
		
		
		String query = "INSERT INTO customer(ID, name, addr, DOB, sex, phone, username, password, type, email_id) VALUES ";
		query += "(\"" + getId() + "\",\"" + getName() + "\",\"" + getAddress() + "\",\"" + getDob()  + "\",\"" + getSex() + "\",\"" + getPhone() + "\",\"" + getUsername() + "\",\"" + getPassword() + "\",\"" + getType() + "\",\"" + getEmail() + "\")";
		System.out.println(query);
		try {
			database.update(query);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			System.out.println("false from AddCustomer");
			addFieldError("id","id already exists");
			return "false";
		}
		System.out.println("true from AddCustomer");
		return "true";
	}
	
	public String ViewCustomer(){
		
		//For issue details		

		String sql1="select checkout.media_id,checkout.cust_ID,title,since,until,book.b_id,subject,edition from checkout" +
				" left outer join bookmedia on " +
				" bookmedia.media_id=checkout.media_id left outer join book on" + 
				" book.b_id=bookmedia.b_id where checkout.cust_ID= '" + id + "'";
		try {
			rs_issue=database.query(sql1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		if(getId().isEmpty()){
			addFieldError("id","ID is empty");
			return "input";
		}
		
		
		
		ResultSet temp = database.getUserInfo(getId());
		if(temp != null){
			sessionMap.put("requestedInfo", temp);
			return "Requested";
		} else {
			
			return "false";
		}
		
	}
	
	public String RemoveCustomer(){
		if(getId().isEmpty()){
			addFieldError("id","ID is empty");
			return "input";
		}
		
		
		
		
		String query = "Delete from customer where  ID =\"";
		query += getId() + "\"";
		System.out.println(query);
		try {
			
			if(database.update(query)>0){
				addFieldError("id","id removed Successfully");
			} else {
				addFieldError("id","id invalid");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			System.out.println("false from RemoveCustomer");
			addFieldError("id","id cannot be removed");
			return "false";
		}
		
		System.out.println("true from RemoveCustomer");
		return "true";
		
	}
	



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Encryption.md5(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public ResultSet getRs_issue() {
		return rs_issue;
	}

	public void setRs_issue(ResultSet rs_issue) {
		this.rs_issue = rs_issue;
	}

}	
