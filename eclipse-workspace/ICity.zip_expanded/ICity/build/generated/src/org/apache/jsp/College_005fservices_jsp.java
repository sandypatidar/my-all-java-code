package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class College_005fservices_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/font-awesome.css\" /> \n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/my.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <nav class=\"navbar navbar-inverse \">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img src=\"hotels/hotelhead.png\" alt=\"header\"  height=\"50px\" class=\"img-responsive\">\n");
      out.write("                </div>\n");
      out.write("        <div class=\"container\" style=\"text-align: justify\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <font size=\"5\" align=\"center\"> <b><li><a href=\"Login.jsp\">IIT, Indore</a></li></b></font>   </br>                 \n");
      out.write("                        <image src=\"college/iit_indore_.jpg\" alt=\"iit\" width=\"400\" height=\"200\" /></br>\n");
      out.write("                        <b> Contact us</b><br>\n");
      out.write("                        <font color=\"green\" style=\"text-align:center\"><b>IIT, Indore</b></font> <br>\n");
      out.write("<span class=\"glyphicon glyphicon-map-marker\"style=\"color:green\"></span><font color=\"green\">Location:</font>1 Residency Area Indore -452001(M.P) <br>\n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font>0731-2719000,2719001,2719023<br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Fax:</font> 0731-2702674<br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Email:</font> principal@dalycollege.org,dcindore@data1.in\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <font size=\"5\" align=\"center\"> <b><li><a href=\"Login.jsp\">Raddison Blue Hotel,Indore</a></li></b></font>   </br>                 \n");
      out.write("                    <image src=\"college/iit_indore_.jpg\" alt=\"Raddison\" width=\"400\" height=\"200\" /><br>\n");
      out.write("                    \n");
      out.write("                        <b> Contact us</b><br>\n");
      out.write(" <font color=\"green\" style=\"text-align:center\"><b>Raddison Blue Hotel,Indore</b></font> <br>\n");
      out.write(" <span class=\"glyphicon glyphicon-map-marker\"style=\"color:green\"></span><font color=\"green\">Location:</font>Jalaira,Bypass Road,\n");
      out.write("Indore -452016(M.P) <br>\n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font>0731-2810017,2810018,2810019<br>\n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Senior Wing:</font> 964473315,964473316<br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Email:</font> info@shishukunj.in\n");
      out.write("   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <font size=\"5\" align=\"center\"> <b><li><a href=\"Login.jsp\">IIM, Indore</a></li></b></font>   </br>                 \n");
      out.write("                        <image src=\"college/iim indore image.jpg\" alt=\"iim\" width=\"400\" height=\"200\" /></br>\n");
      out.write("                        <b> Contact us</b><br>\n");
      out.write("<font color=\"green\" style=\"text-align:center\"><b>IIM, Indore</b></font> <br>\n");
      out.write("<span class=\"glyphicon glyphicon-map-marker\" style=\"color:green\"></span><font color=\"green\">Location:</font>Pipliakumar - Nipania Road, Village - Nipania<br>\n");
      out.write("Indore (M.P) <br>\n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font> 0731-6611000, 6611050 <br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\" style=\"color:green\"></span><font color=\"green\">Fax:</font> 0731-4064403 <br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\" style=\"color:green\"></span><font color=\"green\">Email:</font> dpsind@dpsindore.org, admin@dpsindore.org, hr@dpsindore.org\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <font size=\"5\" align=\"center\"> <b><li><a href=\"Login.jsp\">IET DAVV, Indore</a></li></b></font>   </br>                 \n");
      out.write("                        <image src=\"college/davv image.jpg\" alt=\"davv\" width=\"400\" height=\"200\" /></br>\n");
      out.write("                        <b> Contact us</b><br>\n");
      out.write("                      <font color=\"green\" style=\"text-align:center\">  <b>IET DAVV, Indore</b></font> <br>\n");
      out.write("<span class=\"glyphicon glyphicon-map-marker\"style=\"color:green\"></span><font color=\"green\">Location:</font>Opposite Akashwani,A.B Road,Rau\n");
      out.write("Indore-453331 (M.P) \n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font> 8720009992 <br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Fax:</font>0731-4059046<br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Email:</font>info@emeraldheights.edu.in\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <font size=\"5\" align=\"center\"> <b><li><a href=\"Login.jsp\">SGSITS College, Indore</a></li></b></font>   </br>                 \n");
      out.write("                        <image src=\"college/sgsits image.jpg\" alt=\"sgsits\" width=\"400\" height=\"200\" /></br>\n");
      out.write("                        <b> Contact us</b><br>\n");
      out.write("                         <font color=\"green\" style=\"text-align:center\">  <b>SGSITS College, Indore</b> </font> <br>\n");
      out.write("<span class=\"glyphicon glyphicon-map-marker\"style=\"color:green\"></span><font color=\"green\">Location:</font>Bicholi Mardana \n");
      out.write("Indore-452016 (opp.scheme no.140)(M.P) <br>\n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font>0731-4212666,0731-2592779,0731-4212666 <br>\n");
      out.write("\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Email:</font> www.apsindore.com\n");
      out.write("\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <font size=\"5\" align=\"center\"><b><li><a href=\"Login.jsp\">IPS College, Indore</a></li></b> </font>   </br>                 \n");
      out.write("                        <image src=\"college/ips image.jpg\" alt=\"ips\" width=\"400\" height=\"200\" /></br>\n");
      out.write("                         <b> Contact us</b><br>\n");
      out.write("  <font color=\"green\" style=\"text-align:center\">  <b>IPS College,Indore</b> </font>                      \n");
      out.write(" <br>\n");
      out.write("<span class=\"glyphicon glyphicon-map-marker\"style=\"color:green\"></span><font color=\"green\">Location:</font> Isckon Vihar Colony,Nipania Road                     \n");
      out.write("Indore (M.P) <br>\n");
      out.write("<span class=\"glyphicon glyphicon-phone \" style=\"color:green\"></span><font color=\"green\">Phone:</font> 0731-6466676, 6466686 ,9827720868<br>\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"style=\"color:green\"></span><font color=\"green\">Email:</font>aadvanced@ymail.com,advancedindore@gmail.com\n");
      out.write("\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-success btn-lg\" style=\"text-align: center\"><b>ENQUIRE</b></button>\n");
      out.write("            </div>\n");
      out.write("        </div>       \n");
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
