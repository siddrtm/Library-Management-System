/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-04-17 10:37:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.ResultSet;

public final class ReturnBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"templatemo_container\">\r\n");
      out.write("\t<div id=\"templatemo_menu\">\r\n");
      out.write("    \t<ul>\r\n");
      out.write("            <li><a href=\"index.php\" class=\"current\">Home</a></li>\r\n");
      out.write("   \r\n");
      out.write("            <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"logout\">Logout</a></li>\r\n");
      out.write("    \t</ul>\r\n");
      out.write("    </div> <!-- end of menu -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_header\">\r\n");
      out.write("    \t<div id=\"templatemo_special_offers\">\r\n");
      out.write("        \t<p>\r\n");
      out.write("               \r\n");
      out.write("        \t</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div id=\"templatemo_new_books\">\r\n");
      out.write("        \t<ul>\r\n");
      out.write("                <li>Academics And Professional</li>\r\n");
      out.write("                <li>Autobiographies</li>\r\n");
      out.write("                <li>Literature And Fiction</li>\r\n");
      out.write("\t\t\t\t<li>Entrance Exam Books</li>\r\n");
      out.write("\t\t\t\t<li>Children Books</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div> <!-- end of header -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_content\"> \r\n");
      out.write("    \r\n");
      out.write("      <div id=\"templatemo_content_left\">\r\n");
      out.write("        \t<div class=\"templatemo_content_left_section\">\r\n");
      out.write("            \t\r\n");
      out.write("\t\t\t            ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t            \t<a href=\"IssueDetails\"> &nbsp&nbsp Show Issue Details</a></br>\r\n");
      out.write("\t\t\t            ");
 
			            	ResultSet temp = (ResultSet) session.getAttribute("userinfo") ;
			            	if ( temp.getString(9).equals("Librarian") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"AddCustomer.jsp\"> &nbsp&nbsp Add Customer</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	} 
			            	
			            
      out.write("\r\n");
      out.write("\t\t\t            ");
	
			            	if ( temp.getString(9).equals("Librarian") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"RemoveCustomer.jsp\"> &nbsp&nbsp Remove Customer</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write("\r\n");
      out.write("            \t\t\t");
	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"ViewCustomerForum.jsp\"> &nbsp&nbsp View Customer</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write("\r\n");
      out.write("            \t\t\t");
	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"AddBook.jsp\"> &nbsp&nbsp Add Book</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write("\r\n");
      out.write("            \t\t\t");
	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"RemoveBook.jsp\"> &nbsp&nbsp Remove Book</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write(" \r\n");
      out.write("            \t\t\t");
	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"IssueBook.jsp\"> &nbsp&nbsp Issue Book</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write("\r\n");
      out.write("            \t\t\t");
	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"ReturnBook.jsp\"> &nbsp&nbsp Return Book</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write(" \r\n");
      out.write("            \t\t\t");
	
			            	if ( temp.getString(9).equals("Librarian") || temp.getString(9).equals("Staff") ){
			            
      out.write("\t\r\n");
      out.write("            \t\t\t    <a href=\"ShowOverdue\"> &nbsp&nbsp Show Overdue Details</a></br>\t\r\n");
      out.write("            \t\t\t");

			            	}
            			
      out.write(" \r\n");
      out.write("            \t\t\t \r\n");
      out.write("            \t\t\t <a href=\"ResetPassword.jsp\"> &nbsp&nbsp Reset Password </a></br>\t\r\n");
      out.write("            \t\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t<div class=\"templatemo_content_left_section\">\r\n");
      out.write("            \t<h1>Newspapers</h1>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"https://www.timesofindia.indiatimes.com\">Times Of India</a></li>\r\n");
      out.write("                    <li><a href=\"https://www.hindustantimes.com\">Hindustan Times</a></li>\r\n");
      out.write("                    <li><a href=\"https://www.thehindu.com\">The Hindu</a></li>\r\n");
      out.write("                    <li><a href=\"https://www.bhaskar.com\">Dainik Bhaskar</a></li>\r\n");
      out.write("                    <li><a href=\"https://www.rajasthanpatrika.com\">Rajasthan Patrika</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.indianexpress.com\">Indian Express</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                  \r\n");
      out.write("            \t</ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("   <div class=\"templatemo_content_left_section\">                \r\n");
      out.write("                <a href=\"http://facebook.com\"><img style=\"border:0;width:40px;height:31px\" src=\"http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png\" alt=\"Valid XHTML 1.0 Transitional\" width=\"88\" height=\"31\" vspace=\"8\" border=\"0\" /></a>\r\n");
      out.write("<a href=\"http://twitter.com\"><img style=\"border:0;width:40px;height:31px\"  src=\"https://www.jetairfly.com/images/footer/Twitterlogo.png\" alt=\"Valid CSS!\" vspace=\"8\" border=\"0\" /></a>\r\n");
      out.write("<a href=\"http://facebook.com\"><img style=\"border:0;width:40px;height:31px\" src=\"http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png\" alt=\"Valid XHTML 1.0 Transitional\" width=\"88\" height=\"31\" vspace=\"8\" border=\"0\" /></a>\r\n");
      out.write("<a href=\"http://facebook.com\"><img style=\"border:0;width:40px;height:31px\" src=\"http://www.elections.act.gov.au/__data/assets/image/0011/7958/facebook-logo.png\" alt=\"Valid XHTML 1.0 Transitional\" width=\"88\" height=\"31\" vspace=\"8\" border=\"0\" /></a>\t\t\t</div>\r\n");
      out.write("      </div> <!-- end of content left -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<div id=\"templatemo_content_right\">\r\n");
      out.write("        \t<div class=\"templatemo_content_right_section\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  ");

				    ResultSet resultset = (ResultSet) session.getAttribute("userinfo");
				    
      out.write("\r\n");
      out.write("\t\t\t\t    <TABLE >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  USER_ID</TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(1) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  NAME </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD> ADDRESS </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  DOB </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(4) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  SEX </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(5) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  PHONE </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(6) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  USERNAME </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(7) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD> TYPE </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(9) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t    <TR>\r\n");
      out.write("\t\t\t\t    \t<TD>  EMAIL_ID </TD>\r\n");
      out.write("\t\t\t\t        <TD> ");
      out.print( resultset.getString(10) );
      out.write("</TD>\r\n");
      out.write("\t\t\t\t    </TR>\r\n");
      out.write("\t\t\t\t       \r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t <div id=\"templatemo_content_center\">\r\n");
      out.write("        \t<div >\r\n");
      out.write("        \t\r\n");
      out.write("\t        \t");
      if (_jspx_meth_s_005fform_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("         </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("            \r\n");
      out.write("  \r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_footer\">\r\n");
      out.write("    \r\n");
      out.write("\t       \r\n");
      out.write("        Copyright ï¿½ 2014 <a href=\"#\"><strong>Digital Library Management</strong></a> | Designed by <a target=\"_parent\" title=\"\">Group 2</a>\t</div> \r\n");
      out.write("    <!-- end of footer -->\r\n");
      out.write("<!--  Free CSS Template www.templatemo.com -->\r\n");
      out.write("</div>\r\n");
      out.write("</div> <!-- end of container -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /ReturnBook.jsp(51,15) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("search_res");
    // /ReturnBook.jsp(51,15) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t    &nbsp&nbsp Search book</br>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /ReturnBook.jsp(55,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("query");
    // /ReturnBook.jsp(55,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setValue("Search Here");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /ReturnBook.jsp(56,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("criteria");
    // /ReturnBook.jsp(56,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("{'Title','Author','Publication','ISBN','Subject','Tag'}");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_eval_s_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f0.doInitBody();
      }
      do {
        out.write("  \r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /ReturnBook.jsp(63,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setName("Submit");
    // /ReturnBook.jsp(63,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("Search");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent(null);
    // /ReturnBook.jsp(207,10) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("ReturnBook");
    // /ReturnBook.jsp(207,10) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    int _jspx_eval_s_005fform_005f1 = _jspx_th_s_005fform_005f1.doStartTag();
    if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t        \r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t \t\t");
        if (_jspx_meth_s_005fsubmit_005f1(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
        int evalDoAfterBody = _jspx_th_s_005fform_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /ReturnBook.jsp(209,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("mediaID");
    // /ReturnBook.jsp(209,7) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setLabel("MediaID");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /ReturnBook.jsp(211,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setName("calcfine");
    // /ReturnBook.jsp(211,8) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setValue("Calculate Fine");
    int _jspx_eval_s_005fsubmit_005f1 = _jspx_th_s_005fsubmit_005f1.doStartTag();
    if (_jspx_th_s_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
    return false;
  }
}
