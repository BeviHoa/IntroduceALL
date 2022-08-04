package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>JSP Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <style file=\"text/css\">\r\n");
      out.write("        .mu-footer-top{\r\n");
      out.write("            background-color: #b7e89c;\r\n");
      out.write("        }\r\n");
      out.write("        .first-footer-text1{\r\n");
      out.write("            font-size: 34px;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .Information{\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .About{\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!-- Start footer -->\r\n");
      out.write("<footer id=\"mu-footer\">\r\n");
      out.write("    <!-- start footer top -->\r\n");
      out.write("    <div class=\"mu-footer-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"mu-footer-top-area\">\r\n");
      out.write("                <div class=\"first-footer\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h3 class=\"first-footer-text1\">Quiz Pracice</h3>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n");
      out.write("                        <div class=\"mu-footer-widget\">\r\n");
      out.write("                            <h4 class=\"Information\">Information</h4>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a class=\"About\" href=\"#\">About Us</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Features</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Course</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Event</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Sitemap</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Term Of Use</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n");
      out.write("                        <div class=\"mu-footer-widget\">\r\n");
      out.write("                            <h4 class=\"About\" >Student Help</h4>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Get Started</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"#\">My Questions</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Download Files</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Latest Course</a></li>\r\n");
      out.write("                                <li><a class=\"About\" href=\"\">Academic News</a></li>                  \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n");
      out.write("                        <div class=\"mu-footer-widget\">\r\n");
      out.write("                            <h4 class=\"About\">News letter</h4>\r\n");
      out.write("                            <p class=\"About\">Get latest update, news & academic offers</p>\r\n");
      out.write("                            <form class=\"mu-subscribe-form\">\r\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your Email\">\r\n");
      out.write("                                <button class=\"mu-subscribe-btn\" type=\"submit\"><a class=\"About\">Subscribe!</button>\r\n");
      out.write("                            </form>               \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n");
      out.write("                        <div class=\"mu-footer-widget\">\r\n");
      out.write("                            <h4 class=\"About\">Contact</h4>\r\n");
      out.write("                            <address>\r\n");
      out.write("                                <p class=\"About\">FPT.HL.HN</p>\r\n");
      out.write("                                <p class=\"About\">Phone: 00000000 </p>\r\n");
      out.write("                                <p class=\"About\">\r\n");
      out.write("                                    <img src=\"images/tải xuống.png\" width=\"30px\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"About\">\r\n");
      out.write("                                    <img src=\"images/1480494815-facebook-sao-viet.png\" width=\"30px\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"About\">\r\n");
      out.write("                                    <img src=\"images/Twitter-logo.jpg\" width=\"30px\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                \r\n");
      out.write("                            </address>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end footer top -->\r\n");
      out.write("    <!-- start footer bottom -->\r\n");
      out.write("    <div class=\"mu-footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"mu-footer-bottom-area\">\r\n");
      out.write("                <p>&copy; All Right Reserved. Designed by Group 5</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end footer bottom -->\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- End footer -->\r\n");
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
