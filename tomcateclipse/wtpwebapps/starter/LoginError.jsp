<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<div id="templatemo_container">
	<div id="templatemo_menu">
    	<ul>
            <li><a href="index.php" class="current">Home</a></li>
            <li><a href="subpage.html">Branches</a></li>            
            <li><a href="subpage.html">New Releases</a></li> 
			<li><a href="subpage.html">FAQ</a></li>
            <li><a href="#">Contact Us</a></li>
			<li><a href="logout.php">Logout</a></li>
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
            	<h1>Newspapers</h1>
                <ul>
                    <li><a href="https://www.timesofindia.indiatimes.com">Times Of India</a></li>
                    <li><a href="https://www.hindustantimes.com">Hindustan Times</a></li>
                    <li><a href="https://www.thehindu.com">The Hindu</a></li>
                    <li><a href="https://www.bhaskar.com">Dainik Bhaskar</a></li>
                    <li><a href="https://www.rajasthanpatrika.com">Rajasthan Patrika</a></li>
					<li><a href="https://www.indianexpress.com">Indian Express</a></li>
					
                  
            	</ul>
            </div>
            
   <div class="templatemo_content_left_section">                
                <a href="http://facebook.com"><img style="border:0;width:40px;height:31px" src="http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://twitter.com"><img style="border:0;width:40px;height:31px"  src="https://www.jetairfly.com/images/footer/Twitterlogo.png" alt="Valid CSS!" vspace="8" border="0" /></a>
<a href="http://facebook.com"><img style="border:0;width:40px;height:31px" src="http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://facebook.com"><img style="border:0;width:40px;height:31px" src="http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>			</div>
      </div> <!-- end of content left -->

	
			<div id="templatemo_content_right">
        	<div class="templatemo_content_right_section">


				<s:actionerror />
				<s:form action="login" method="post" class="login">
					<p>
				      
				      <s:textfield name="username" key="label.username" id="login" size="15" />
				    </p>
				
				    <p>
				      
				      <s:password name="password" key="label.password" size="15" id="password" />
				    </p>
				
				    <p class="login-submit">
				      <s:submit method="execute" key="label.login" align="center" class="login-button"/>
				    </p>
				</s:form>

				</div>
			</div>
		
		 <div id="templatemo_content_center">
        	<div class="templatemo_content_center_section">
			
            </div>
			
         </div>
	
	
            
  
     
        
       
            
           
    
    <div id="templatemo_footer">
    
	       <a href="index.php">Home</a> | <a href="">Search</a> | <a href="">Books</a> | <a href="lib_login.php">Admin Login</a> | <a href="">FAQs</a> | <a href="">Contact Us</a><br />
        Copyright � 2014 <a href="#"><strong>Digital Library Management</strong></a> | Designed by <a target="_parent" title="">Group 2</a>	</div> 
    <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div>
</div> <!-- end of container -->

</body>
</html>
