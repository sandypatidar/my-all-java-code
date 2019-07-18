package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmeraldHeights_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Emerald Heights International</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("        <script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/slideshow.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/font-awesome.css\" /> \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/my.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slideshow.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <img src=\"image/emelogo.png\" alt=\"Emerald  Heights\" align=\"middle\" style=\"padding-bottom:25px;\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8\" style=\"text-align:justify;\">\n");
      out.write("                        \n");
      out.write("<div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">1 / 3</div>\n");
      out.write("  <img src=\"image/eme1.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Front view</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">2 / 3</div>\n");
      out.write("  <img src=\"image/eme2.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Disney world</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">3 / 3</div>\n");
      out.write("  <img src=\"image/eme3.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Auditoriam</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("\n");
      out.write("function showSlides() {\n");
      out.write("    var i;\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("    for (i = 0; i < slides.length; i++) {\n");
      out.write("       slides[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    slideIndex++;\n");
      out.write("    if (slideIndex> slides.length) {slideIndex = 1;}    \n");
      out.write("    for (i = 0; i < dots.length; i++) {\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("    }\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("    dots[slideIndex-1].className += \" active\";\n");
      out.write("    setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<p><b>“The First International School of Madhya Pradesh”</b><br>\n");
      out.write("    Emerald Heights, founded in 1982 is the first international, co-educational English medium school with residential facility in Madhya Pradesh. Drawing inspiration from Sri Aurobindo and the Mother, it undertook to work out and develop a scheme of integral education compatible with the contemporary needs. Since its establishment, the students of school have made their mark in academics and sports. The outstanding performance of the school is borne out by merit lists every year and several coveted trophies in academics, dramatics, music, dance, fine arts, and various indoor and outdoor sports. The Emerald Heights International School stands tallest in central India as an educational institution with a global ambience. With a reputation for creating future oriented global youth, who adorn the society with their scholastic achievements and possess an invincible drive to excel in every sphere of life, it has cultivated an environment which provides its students intellectual exposure with many avenues to reach their goals successfully and express their creativity and talents.<br>\n");
      out.write("<br>Emerald Heights is affiliated to Central Board of Secondary Education (CBSE), New Delhi - An autonomous organization under the ministry of Human Resource Development, Govt. of India and Cambridge International Examination (CIE), one of the world’s leading provider of educational qualification and assessments.\n");
      out.write("\n");
      out.write("<br><br>The Emerald Heights International School offers its students in India, Internationally renowned qualifications that are recognized by educational institutions and employers across the globe. The school provides its students with the opportunity to gain global exposure by affiliating itself with institutions like AFS, British Council School Award, Lead America, IAYP (International Award for Young People) and Harvard University Model United Nations. Our aim through these program is to prepare our students to get globally recognized.\n");
      out.write("    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            CONTACT US\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write(" <span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font>8720009992 <br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Fax:</font> 0731-4059046<br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Email:</font> info@emeraldheights.edu.in\n");
      out.write("                         \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            VISIT US\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <img src=\"image/ememap.png\" class=\"img-thumbnail\" width=\"400\">\n");
      out.write("                           <span class=\"glyphicon glyphicon-map-marker\"style=\"color:green\"></span><font color=\"green\">Location:</font> Emerald Heights International School <br>\n");
      out.write("Opposite Akashwani,A.B Road,Rau\n");
      out.write("Indore-453331 (M.P) <br>\n");
      out.write("                           </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("</body>\n");
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
