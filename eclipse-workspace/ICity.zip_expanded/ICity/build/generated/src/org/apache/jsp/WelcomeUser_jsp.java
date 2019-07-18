package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>WELCOME PAGE</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/font-awesome.css\" /> \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/my.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" >\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                          \n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#abc\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#Home\"><b>ICityGuide</b></a>\n");
      out.write("                </div>\n");
      out.write("                   <ul class=\"nav navbar-nav \">\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"index.html\"><span class=\" glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("                    <li><<span  class=\" glyphicon glyphicon-log-out\"></span><form action=\"/Logout\"><button type=\"submit\">  Sign out</button></form></li></form>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        \n");
      out.write("        <!--Sidebar-->\n");
      out.write("        <div class=\"container col-lg-12 nopadding\" style=\"padding-top: 50px;\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-3 \" style=\"background-color:#a8f3e3;\" >\n");
      out.write("    <nav>\n");
      out.write("      <ul class=\"nav nav-pills nav-stacked\" data-spy=\"affix\" data-offset-top=\"205\">\n");
      out.write("          \n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">School Services <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li class=\"dropdown-header\">Central Board of Secondary Education</li>\n");
      out.write("            <li><a href=\"DalyCollege.jsp\">Daly College</a></li>\n");
      out.write("            <li><a href=\"DelhiPublicSchool.jsp\">Delhi Public School</a></li>\n");
      out.write("            <li><a href=\"EmeraldHeights.jsp\">Emerald International School</a></li>\n");
      out.write("            <li><a href=\"AgarwalPublic.jsp\">Agarwal Public School</a></li>\n");
      out.write("             <li><a href=\"Shishukunj.jsp\">Shishukunj School</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Hospital Services <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li class=\"dropdown-header\">Private Hospitals</li>\n");
      out.write("            <li><a href=\"#\">Bombay Hospital</a></li>\n");
      out.write("            <li><a href=\"#\">CHL Apollo</a></li>\n");
      out.write("            <li><a href=\"#\">Choithram</a></li>\n");
      out.write("            <li class=\"dropdown-header\">Government Hospitals</li>\n");
      out.write("             <li><a href=\"#\">Maharaja Yashwant Hospital </a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">College Services <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li class=\"dropdown-header\">Engineering Institute</li>\n");
      out.write("            <li><a href=\"#\">Indian Institute of research and technology</a></li>\n");
      out.write("            <li><a href=\"#\">IIM Indore</a></li>\n");
      out.write("            <li><a href=\"#\">IPS Indore</a></li>\n");
      out.write("            <li><a href=\"#\">IET DAVV</a></li>\n");
      out.write("             <li><a href=\"#\">SGSITS</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("<li><a href=\"\"></a></li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-9\"><h1 style=\"text-align: center\"><strong>WELCOME USER <font style=\"color: #000099\">");
      out.print(session.getAttribute("userid"));
      out.write("</font></strong></h1></div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
