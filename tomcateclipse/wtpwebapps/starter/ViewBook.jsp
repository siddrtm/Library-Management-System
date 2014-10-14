<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="package1.Book" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("books", "0");

      function initialize() {
        var viewer = new google.books.DefaultViewer(document.getElementById('viewerCanvas'));
        viewer.load('ISBN:<s:property value="getISBN()" />');
      }

      google.setOnLoadCallback(initialize);
    </script>
<title>Insert title here</title>
</head>
<body>
<div id="templatemo_container">
	<div id="templatemo_menu">
    	<ul>
            <li><a href="UserWelcome.jsp" class="current">Home</a></li>
           
            <li><a href="#">Contact Us</a></li>
			<li><a href="logout">Logout</a></li>
    	</ul>
    </div> <!-- end of menu -->
    
    <div id="templatemo_header">
    	<div id="templatemo_special_offers">
        	<p>
               
        	</p>
        </div>
        
        
        <div id="templatemo_new_books">
        	<ul>
                <li>Academics And Professional</li>
                <li>Autobiographies</li>
                <li>Literature And Fiction</li>
				<li>Entrance Exam Books</li>
				<li>Children Books</li>


            </ul>
      </div>
    </div> <!-- end of header -->
    
    <div id="templatemo_content"> 
    
      <div id="templatemo_content_left">
        	<div class="templatemo_content_left_section">
            	
			            <s:form action="search_res" method= "post">
					
					    &nbsp&nbsp Search book<br>
						
						<s:textfield name="query" value="Search Here"/>
						<s:select name="criteria"  list="{'Title','Author','Publication','ISBN','Subject','Tag'}">  
						
						
						
						</s:select> 
					
						
						<s:submit name="Submit" value="Search" />
											
						</s:form>
			            
			            	<a href="IssueDetails"> &nbsp&nbsp Show Issue Details</a></br>
			            <% 
			            	ResultSet temp = (ResultSet) session.getAttribute("userinfo") ;
			            	if ( temp.getString(9).equals("Librarian") ){
			            %>	
            			    <a href="AddCustomer.jsp"> &nbsp&nbsp Add Customer</a><br>	
            			<%
			            	} 
			            	
			            %>
			            <%	
			            	if ( temp.getString(9).equals("Librarian") ){
			            %>	
            			    <a href="RemoveCustomerForum.jsp"> &nbsp&nbsp Remove Customer</a><br>	
            			<%
			            	}
            			%>
            			<%	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            %>	
            			    <a href="ViewCustomerForum.jsp"> &nbsp&nbsp View Customer</a><br>	
            			<%
			            	}
            			%>
            			<%	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            %>	
            			    <a href="AddBook.jsp"> &nbsp&nbsp Add Book</a><br>	
            			<%
			            	}
            			%>
            			<%	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            %>	
            			    <a href="RemoveBook.jsp"> &nbsp&nbsp Remove Book</a><br>	
            			<%
			            	}
            			%> 	
            			<%	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            %>	
            			    <a href="IssueBook.jsp"> &nbsp&nbsp Issue Book</a><br>	
            			<%
			            	}
            			%>
            			<%	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            %>	
            			    <a href="ReturnBook.jsp"> &nbsp&nbsp Return Book</a><br>	
            			<%
			            	}
            			%> 
            			<%	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            %>	
            			    <a href="ShowOverdue"> &nbsp&nbsp Show Overdue Details</a><br>	
            			<%
			            	}
            			%> 
            			 
            			 <a href="ResetPassword.jsp"> &nbsp&nbsp Reset Password </a><br>	
            	
            </div>
			<div class="templatemo_content_left_section">
            	<%
				    ResultSet resultset = (ResultSet) session.getAttribute("userinfo");
				    %>
				    <TABLE >
<%-- 				    <% resultset.next(); %> --%>
				    <TR>
				    	<TD>  USER_ID</TD>
				        <TD> <%= resultset.getString(1) %></TD>
				    </TR>
				    <TR>
				    	<TD>  NAME </TD>
				        <TD> <%= resultset.getString(2) %></TD>
				    </TR>
				    <TR>
				    	<TD> ADDRESS </TD>
				        <TD> <%= resultset.getString(3) %></TD>
				    </TR>
				    <TR>
				    	<TD>  DOB </TD>
				        <TD> <%= resultset.getString(4) %></TD>
				    </TR>
				    <TR>
				    	<TD>  SEX </TD>
				        <TD> <%= resultset.getString(5) %></TD>
				    </TR>
				    <TR>
				    	<TD>  PHONE </TD>
				        <TD> <%= resultset.getString(6) %></TD>
				    </TR>
				    <TR>
				    	<TD>  USERNAME </TD>
				        <TD> <%= resultset.getString(7) %></TD>
				    </TR>
				    <TR>
				    	<TD> TYPE </TD>
				        <TD> <%= resultset.getString(9) %></TD>
				    </TR>
				    <TR>
				    	<TD>  EMAIL_ID </TD>
				        <TD> <%= resultset.getString(10) %></TD>
				    </TR>   		    
					</TABLE>
					
					  <br><br><br>
				    <%
					    ResultSet rs = (ResultSet) request.getAttribute("rs");
					    ResultSet rs1 = (ResultSet) request.getAttribute("rs1"); //rating
					    
					    %><br>
					    <% rs1.next();%>
					    Net Rating:<%= rs1.getString(1) 
					%>
				    <br><br>
				    Roll no ----- Review
				    <br>
				    <%
							if(request.getAttribute("size_review").equals((Integer)0))
								out.println("No review");
							else
							{
								try{
									ResultSet rs_review = (ResultSet) request.getAttribute("rs_review");
									while(rs_review.next()){
										out.println(rs_review.getString(1));
										out.println(rs_review.getString(2));
										out.println("<br>");
										
									}
								}
								catch(Exception e){
									
									out.println("Exception even on size>0, aisa kyun??");
									out.println(request.getAttribute("size_review"));
									e.printStackTrace();
								}
							}
						
						%>
					
					
            </div>
            
   <div class="templatemo_content_left_section">                
                <a href="http://facebook.com"><img style="border:0;width:40px;height:31px" src="http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://twitter.com"><img style="border:0;width:40px;height:31px"  src="https://www.jetairfly.com/images/footer/Twitterlogo.png" alt="Valid CSS!" vspace="8" border="0" /></a>
<a href="http://facebook.com"><img style="border:0;width:40px;height:31px" src="http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://facebook.com"><img style="border:0;width:40px;height:31px" src="http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>			</div>
      </div> <!-- end of content left -->

	
		
		
<!-- 		 <div id="templatemo_content_center"  > -->
        	<div style="width: 100%; height: 100%; position:absloute;">
        	
<%--     <s:property value="getISBN()" /> --%>
<%--     <% String act = new String("post_rating202"); %> --%>
<%--     <s:set var="act2" value="act" /> --%>
    <form action= "<%= "post_rating" + request.getAttribute("ISBN")%>" method= "post">
   
		
		
			<s:select name="rating" label="Rate (lowest 1 , Highest 5) " list="{'1','2','3','4','5'}">  
			</s:select> 
	<s:submit name="Submit_rating" value="Post Rating" />
								
	</form>		
		
	<form  action= "<%= "post_review" + request.getAttribute("ISBN")%>" method= "post">	
					
			<s:textfield name="review"/>
			<s:submit name="Submit_review" value="Post review" />
								
	</form>
    
    
    
      
    <TABLE >
    <TR>
        <TH>TITLE</TH>
        <TH>ISBN</TH>
		      
    </TR>
    <% while(rs.next()){ %>
    <TR>
        <TD> <%= rs.getString(1) %></td>
        <TD> <%= rs.getString(2) %></TD>
       
    </TR>
    <% } %>
	</TABLE>
	
	<div id="viewerContainer" style="width:102% ; height:600px ;z-index:-10; " >
	
    <div id="viewerCanvas" style="width: 100%; height: 100%; position:absloute;"  >
    </div>
    
    </div>    
        	
			
            </div>
			
<!--          </div> -->
	
	
            
  
     
        
       
            
           
    
    <div id="templatemo_footer">
    
	       
        Copyright � 2014 <a href="#"><strong>Digital Library Management</strong></a> | Designed by <a target="_parent" title="">Group 2</a>	</div> 
    <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div>
</div> <!-- end of container -->

</body>
</html>
