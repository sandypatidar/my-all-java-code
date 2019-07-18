package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/font-awesome.css\" /> \n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" \n");
      out.write("              href=\"css/style.css\"/>\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <hr>\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("                  <div>\n");
      out.write("            <nav class=\"navbar navbar-inverse \">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("    <img src=\"image/icon.jpg\" alt=\"header\" align=\"center\" >\n");
      out.write("   <font size=\"10\" align=\"center\" color=\"white\"> <b>LOGIN</b></font>   </br>\n");
      out.write("            <form action=\"VerifyUser\" method=\"post\">\n");
      out.write("            <div class=\"form-input\">            \n");
      out.write(" \t\t\t\t\t\t\t\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Enter UserName\" align=\"center\" maxlength=\"20\"  required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-input\">            \n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" min=\"8\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain atleast one number, one upper case letter and one lower case letter, and atleast 8 charactrs or more\"   required/>\n");
      out.write("            </div>\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Login\" class=\"btn-login\"/><br>\n");
      out.write("                            \n");
      out.write("        <hr>\n");
      out.write("        <a href=\"Registration.jsp\">NEW-USER</a>\n");
      out.write("            </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
