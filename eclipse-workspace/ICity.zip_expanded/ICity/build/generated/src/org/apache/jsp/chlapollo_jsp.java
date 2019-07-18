package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chlapollo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/font-awesome.css\" /> \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/my.css\">\n");
      out.write("        <style>\n");
      out.write("            .carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 400px;\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head> \n");
      out.write("    <body id=\"Home\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <nav class=\"navbar navbar-inverse \">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img src=\"hospital/chl logo.jpg\" alt=\"apllo\" align=\"left\" style=\"padding-bottom:25px;\"/><br>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <font color=\"GREEN\" SIZE=\"100\" style=\"text-align:center\"><b>CHL Apollo Hospital, Indore</b></font> \n");
      out.write("                  \n");
      out.write("                                           </div>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                     \n");
      out.write("            \n");
      out.write("            <div class=\"row jumbotron\">\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"hospital/doc4.jpg\" alt=\"apollo\" class=\"img-thumbnail\"/>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"hospital/sth1.jpg\" alt=\"doctor\" />\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("          <img src=\"hospital/docpat5.jpg\" alt=\"doctor patient\" class=\"img-thumbnail\"/>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"hospital/chl apollo image.jpg\" alt=\"apollo\" class=\"img-thumbnail\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Container(About)-->\n");
      out.write("        <div class=\"container\" style=\"text-align:justify\">\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("    <font <span SIZE=\"25\" style=\"text-align:center\"> Services</font> \n");
      out.write("    \n");
      out.write("        <p><b> Cardiology</b><br></br>\n");
      out.write("        \n");
      out.write("        <b> Dentistry</b><br></br>\n");
      out.write("        <b>Dermatology (Skin)</b><br></br>\n");
      out.write("        <b>ENT (Otolaryngology)</b><br></br>\n");
      out.write("        <b>Gastroenterology</b><br></br>\n");
      out.write("        <b>General Surgery</b><br></br>\n");
      out.write("        <b>Nephrology</b><br></br>\n");
      out.write("        <b>Neurology</b><br></br>\n");
      out.write("        <b>Neurosurgery</b><br></br>\n");
      out.write("        <b>Obstetrics and Gynecology</b><br></br>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("</ul>\n");
      out.write("  <img src=\"hospital/plus.png\" alt=\"arihant\" align=\"left\" style=\"padding-bottom:25px;\"/>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("          \n");
      out.write("     <p color=\"green\" style=\"text-align-last:center\">CHL Apllo Hospital develop a medical facility at par with global standards, and bring together expertise and equipments to deliver the best in healthcare & providing world class healthcare to one and all at an affordable price. </p>\n");
      out.write("  \n");
      out.write("             \n");
      out.write("      <button type=\"button\" class=\"btn btn-success btn-lg\">\n");
      out.write("          <span class=\"glyphicon glyphicon-bell\"></span>Enquire\n");
      out.write("     </button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("       \n");
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
