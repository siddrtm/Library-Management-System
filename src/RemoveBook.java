import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class RemoveBook extends ActionSupport implements SessionAware{
	
	
	private String id;
	
	private static final long serialVersionUID = 1L;
	private SessionMap<String,Object> sessionMap;
	
	@Override
	public void setSession(Map<String, Object> map) {

		sessionMap= (SessionMap) map; 
		
	}
	
	
	public String execute(){
		
		if(getId().isEmpty()){
			addFieldError("id","Book media ID is empty");
			return "input";
		}
		
		String query = "Delete from bookmedia where  media_id=" + getId();
		
		try {
			database.update(query);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error in remove book update bookmedia");
			addFieldError("b_id","Could not remove book (bookmedia update) ");
			return "input";
			
		}
		addFieldError("b_id","Book removed successfully");
		return "input";
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}