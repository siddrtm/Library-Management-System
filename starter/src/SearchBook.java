import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;



import org.apache.catalina.connector.Request;

import com.opensymphony.xwork2.ActionSupport;

import package1.Book;




public class SearchBook extends ActionSupport {

	private String criteria;
	private String query;
	private int size=0;
	private Book[] results = new Book[60];
	
	public String execute() throws SQLException
	{
		//System.out.println(criteria);
		
		if(getQuery().isEmpty()){
			addFieldError("query","query is empty");
			return "input";
		}
		
		
		
		Map<String,String> crMap = new HashMap<String,String>();
		int i=0;
		//results = new Book[60];
		crMap.put("Title", "title");
		crMap.put("Author", "name");
		crMap.put("Publication", "publication");
		crMap.put("ISBN", "b_id");
		crMap.put("Subject", "subject");
		crMap.put("Tag", "tag");
		crMap.put("Year", "year");
		crMap.put("Language", "language");
		crMap.put("Rating", "rate");
		crMap.put("Review", "comment");
		
		String sql = "SELECT book.b_id,title,year,publication,subject,language,name,rate,comment,tag FROM "
       		 + "book inner join author on book.b_id=author.b_id "
       		 + "left outer join rate on book.b_id=rate.book_ID "
       		 + "left outer join reviews on book.b_id=reviews.book_ID "
       		 + "left outer join tags on  book.b_id=tags.b_id WHERE " 
       		 + crMap.get(getCriteria()) + " LIKE '%" + getQuery() +"%'";
	
	        ResultSet rs = null;
			try {
				rs = database.query(sql);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	       
	         
	         try {
	             rs.last();
	             size = rs.getRow();
	             rs.beforeFirst();
	         }
	         catch(Exception ex) {
	             ex.printStackTrace();
	         }
	         //System.out.println(size);

	         if(size==0){
	        	 System.out.println("No results Found");
	        	 return "NoResult";
	         }
	         else
	         {
	         
	         while (rs.next()) {
	        	       	
	        	results[i] = new Book();
	        	results[i].setAuthor(rs.getString(crMap.get("Author"))) ;
	            results[i].setTitle(rs.getString(crMap.get("Title"))) ;
	            results[i].setPublication(rs.getString(crMap.get("Publication"))) ;
	            results[i].setISBN(rs.getString(crMap.get("ISBN"))) ;
	            results[i].setSubject(rs.getString(crMap.get("Subject"))) ;
	            results[i].setTags(rs.getString(crMap.get("Tag"))) ;
	            results[i].setYear(rs.getString(crMap.get("Year"))) ;
	            results[i].setLanguage(rs.getString(crMap.get("Language"))) ;
	            results[i].setRating(rs.getInt(crMap.get("Rating"))) ;
	            results[i].setReview(rs.getString(crMap.get("Review"))) ;
	                        
	            i++;
	            
	         }
	         }
	      
		
		
		
		
		
		
		return "success";
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Book[] getResults() {
		return results;
	}

	public void setResults(Book[] results) {
		this.results = results;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}
