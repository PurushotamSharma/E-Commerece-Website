package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("    ");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("            <center><h2>Online shopping (BTech Days)</h2></center>\r\n");
      out.write("            <h2><a href=\"\"> ");
out.println(email); 
      out.write("<i class='fas fa-user-alt'></i></a></h2>\r\n");
      out.write("            <a href=\"home.jsp\">Home<i class=\"fa fa-institution\"></i></a>\r\n");
      out.write("            <a href=\"\">My Cart<i class='fas fa-cart-arrow-down'></i></a>\r\n");
      out.write("            <a href=\"\">My Orders  <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"\">Change Details <i class=\"fa fa-edit\"></i></a>\r\n");
      out.write("            <a href=\"\">Message Us <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"\">About <i class=\"fa fa-address-book\"></i></a>\r\n");
      out.write("            <a href=\"logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("            <div class=\"search-container\">\r\n");
      out.write("             <form action=\"searchHome.jsp\" method=\"post\">\r\n");
      out.write("             <input type=\"text\" placeholder=\"Search\" name=\"search\">\r\n");
      out.write("             <button type=\"submit\"><i class=\"fa-fa-search\"></i></button>\r\n");
      out.write("             </form>\r\n");
      out.write("             </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
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
