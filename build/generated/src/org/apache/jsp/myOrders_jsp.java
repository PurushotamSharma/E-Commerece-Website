package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">My Orders <i class='fab fa-elementor'></i></div>\r\n");
      out.write("<table>\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th scope=\"col\">S.No</th>\r\n");
      out.write("            <th scope=\"col\">Product Name</th>\r\n");
      out.write("            <th scope=\"col\">category</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i>  Price</th>\r\n");
      out.write("            <th scope=\"col\">Quantity</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> Sub Total</th>\r\n");
      out.write("            <th scope=\"col\">Order Date</th>\r\n");
      out.write("             <th scope=\"col\">Expected Delivery Date</th>\r\n");
      out.write("             <th scope=\"col\">Payment Method</th>\r\n");
      out.write("              <th scope=\"col\">Status</th>\r\n");
      out.write("              \r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> </td>\r\n");
      out.write("             <td></td>\r\n");
      out.write("              <td></td>\r\n");
      out.write("               <td></td>\r\n");
      out.write("               <td></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("         \r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
