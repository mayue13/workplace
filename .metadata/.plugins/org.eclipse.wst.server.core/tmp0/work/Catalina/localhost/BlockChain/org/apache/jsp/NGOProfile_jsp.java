/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.13
 * Generated at: 2019-03-16 07:40:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.Format;
import java.sql.ResultSet;
import java.sql.Statement;
import com.connection.*;
import java.sql.Connection;

public final class NGOProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.connection");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.Format");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>User Dashboard</title>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap-responsive.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/uniform.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/select2.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/matrix-style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/matrix-media.css\" />\r\n");
      out.write("<link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--Header-part-->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  <h4 style=\"color: white;\">Admin Dashboard</h4>\r\n");
      out.write("  <!-- <h1><a href=\"dashboard.html\">Admin Dashboard</a></h1> -->\r\n");
      out.write("</div>\r\n");
      out.write("<!--close-Header-part--> \r\n");
      out.write("\r\n");
      out.write("<!--top-Header-menu-->\r\n");
      out.write("<div id=\"user-nav\" class=\"navbar navbar-inverse\">\r\n");
      out.write("  <ul class=\"nav\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <li class=\"\"><a title=\"\" href=\"logout.jsp\"><i class=\"icon icon-share-alt\"></i> \r\n");
      out.write("    <span style=\"color: white; font-size: 15px\" class=\"text\">Logout</span></a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--sidebar-menu-->\r\n");
      out.write("\r\n");
      out.write("<div id=\"sidebar\"> <a href=\"#\" class=\"visible-phone\"><i class=\"icon icon-th\"></i>Admin</a>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminmenu.jsp", out, true);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("  <div id=\"content-header\">\r\n");
      out.write("    <div id=\"breadcrumb\"> \r\n");
      out.write("    <a href=\"AdminHome.jsp\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Admin Home</a>\r\n");
      out.write("     <a href=\"#\" class=\"current\">Candidate Profile</a> </div>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("      <div class=\"span12\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"widget-box\">\r\n");
      out.write("          <div class=\"widget-title\"> <span class=\"icon\"> <i class=\"icon-th\"></i> </span>\r\n");
      out.write("            <h5> Upload ProFile </h5>\r\n");
      out.write("            <!-- <span class=\"label label-info\"> </span> --> </div>\r\n");
      out.write("          <div class=\"widget-content \">\r\n");
      out.write("          \r\n");
      out.write("            ");


String candidateid=null;
            Connection connection = DBConnection.getConnection();
Statement statement = connection.createStatement();
ResultSet resultset =statement.executeQuery("select * from tblngoprofile  order by Register_ID desc") ; 
if(resultset.next())
 {
	candidateid=resultset.getString(1);
 } 
else
{
	candidateid="0";
}
/* if(candidateid==null)
{
	candidateid="0";
}
else
{
	
	} */
int CountVoter=Integer.parseInt(candidateid);
int id=CountVoter+1;
String ids=String.valueOf(id);
System.out.println(CountVoter+"="+ids);
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
 
	Date date = new Date();
	String strDate= formatter.format(date);
 String emailid=(String)session.getAttribute("emailid");
 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"post_section\" align=\"center\">\r\n");
      out.write("<form action=\"profile\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table class=\"fileup\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tborder=\"0\" cellspacing=\"10\" cellpadding=\"11\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 22px; font-weight: bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Register-ID</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"candidateid\" value=");
      out.print(ids );
      out.write(" style=\"font-family: monotype corsiva; font-size: 15px\" readonly=\"readonly\" ></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Current Date</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"currentdate\" value=");
      out.print(strDate );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 15px\" required readonly=\"readonly\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Organization Name</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"organame\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 15px\" required></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>PanCard_No</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"pancard_no\" pattern=\"[A-Z0-9]+\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 15px\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Gender</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><select class=\"form-control\" id=\"partyname\" name=\"gender\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Male\">Male</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Female\">Female</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Designation</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><textarea rows=\"4\" cols=\"50\" name=\"Address\"  style=\"width: 300px; height: 100px;\">\r\n");
      out.write("\r\n");
      out.write("</textarea></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Email ID</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 15px\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Candidate Mobile</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"candidatemobile\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 15px\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Website</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"txtwebsite\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 15px\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Save\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-family: monotype corsiva; font-size: 20px; font-weight: bold\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\t\t\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<!--Footer-part-->\r\n");
      out.write("<div class=\"row-fluid\">\r\n");
      out.write("  <div id=\"footer\" class=\"span12\">  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--end-Footer-part-->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script> \r\n");
      out.write("<script src=\"js/jquery.ui.custom.js\"></script> \r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \r\n");
      out.write("<script src=\"js/jquery.uniform.js\"></script> \r\n");
      out.write("<script src=\"js/select2.min.js\"></script> \r\n");
      out.write("<script src=\"js/jquery.dataTables.min.js\"></script> \r\n");
      out.write("<script src=\"js/matrix.js\"></script> \r\n");
      out.write("<script src=\"js/matrix.tables.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}