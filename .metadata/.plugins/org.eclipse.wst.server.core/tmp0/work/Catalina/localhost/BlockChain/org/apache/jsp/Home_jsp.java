/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.13
 * Generated at: 2019-04-01 19:06:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("  <title>Block Chain</title>\r\n");
      out.write("    <!-- Required meta tags always come first -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,600,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("    <header id=\"home\" class=\"gradient-violat\">\r\n");
      out.write("      <nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            \r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><span class=\"logo-wraper logo-white\">\r\n");
      out.write("               Blockchain Technology \r\n");
      out.write("              </span>          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav  navbar-right\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#home\">Home <span class=\"sr-only\">(current)</span></a></li> \r\n");
      out.write("            \r\n");
      out.write("              <li><a href=\"UserLogin.jsp\">User</a></li>\r\n");
      out.write("              <li><a href=\"AdminLogin.jsp\">Admin</a></li>\r\n");
      out.write("                         \r\n");
      out.write("            </ul>\r\n");
      out.write("          </div><!-- /.navbar-collapse -->\r\n");
      out.write("          <hr class=\"navbar-divider\">\r\n");
      out.write("        </div><!-- /.container-fluid -->\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <section id=\"introduction\" class=\"gradient-violat padding-top-90 home-slider\">\r\n");
      out.write("      \r\n");
      out.write("   <div id=\"home-slider\" class=\"owl-carousel\">\r\n");
      out.write("   <div>\r\n");
      out.write("          <div class=\"sliding-card-with-bottom-image text-center padding-top-90\">\r\n");
      out.write("                 <h3 class=\"cta-heading text-white\">  BlockChain Technology for Distributed Environment</h3>\r\n");
      out.write("         \r\n");
      out.write("     \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <div class=\"image-container text-center sm-display-none\">\r\n");
      out.write("              <img class=\"img-responsive\" src=\"images/main.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("         \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("\t          <hr class=\"footer-divider\">\r\n");
      out.write("    \t        \r\n");
      out.write("    \t        <p class=\"text-uppercase\">All rights Reserved </p>\r\n");
      out.write("        \t  <div class=\"copyright-cta\"></div>\r\n");
      out.write("\r\n");
      out.write(" \t   <div id=\"scroll-top-div\" class=\"scroll-top-div\">\r\n");
      out.write("    \t  <div class=\"scroll-top-icon-container\">\r\n");
      out.write("    \t    <i class=\"ion-ios-arrow-thin-up\"></i>\r\n");
      out.write("  \t    </div>\r\n");
      out.write(" \t   </div>\r\n");
      out.write("        \t  \r\n");
      out.write("        \t <div class=\"footer-end-line\"></div>\r\n");
      out.write("\t\t\t\t      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/script.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    </section>\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
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
