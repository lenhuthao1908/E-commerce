package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002dlogin_002dand_002dsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Head BEGIN -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\n");
      out.write("        <meta content=\"Metronic Shop UI description\" name=\"description\">\n");
      out.write("        <meta content=\"Metronic Shop UI keywords\" name=\"keywords\">\n");
      out.write("        <meta content=\"keenthemes\" name=\"author\">\n");
      out.write("\n");
      out.write("        <meta property=\"og:site_name\" content=\"-CUSTOMER VALUE-\">\n");
      out.write("        <meta property=\"og:title\" content=\"-CUSTOMER VALUE-\">\n");
      out.write("        <meta property=\"og:description\" content=\"-CUSTOMER VALUE-\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <meta property=\"og:image\" content=\"-CUSTOMER VALUE-\"><!-- link to image for socio -->\n");
      out.write("        <meta property=\"og:url\" content=\"-CUSTOMER VALUE-\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Fonts START -->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("        <!-- Fonts END -->\n");
      out.write("\n");
      out.write("        <!-- Global styles START -->          \n");
      out.write("        <link href=\"assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Global styles END --> \n");
      out.write("\n");
      out.write("        <!-- Page level plugin styles START -->\n");
      out.write("        <link href=\"assets/plugins/fancybox/source/jquery.fancybox.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/owl.carousel/assets/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Page level plugin styles END -->\n");
      out.write("\n");
      out.write("        <!-- Theme styles START -->\n");
      out.write("        <link href=\"assets/pages/css/components.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/corporate/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/pages/css/style-shop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"assets/corporate/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/corporate/css/themes/red.css\" rel=\"stylesheet\" id=\"style-color\">\n");
      out.write("        <link href=\"assets/corporate/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/pages/css/LoginCSS.css\">\n");
      out.write("        <!-- Theme styles END -->\n");
      out.write("    </head>\n");
      out.write("    <!-- Head END -->\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <input type=\"checkbox\" id=\"check\">\n");
      out.write("            <div class=\"login form\">\n");
      out.write("                <header>Login</header>\n");
      out.write("                <form action=\"login\" method=\"post\">\n");
      out.write("                    <input name=\"user\" type=\"text\" placeholder=\"Enter your account\">\n");
      out.write("                    <input name=\"pass\" type=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                    <div class=\"text-danger\" style=\"font-size: 16px;\">\n");
      out.write("                        <p><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"#\">Forgot password?</a>\n");
      out.write("                    <input type=\"submit\" class=\"button\" value=\"Login\">\n");
      out.write("                </form>\n");
      out.write("                <div class=\"signup\">\n");
      out.write("                    <span class=\"signup\">Don't have an account?\n");
      out.write("                        <label for=\"check\">Signup</label>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"registration form\">\n");
      out.write("                <header>Signup</header>\n");
      out.write("                <form action=\"signup\" method=\"post\">\n");
      out.write("                    <input name=\"user\" type=\"text\" placeholder=\"Enter your account\">\n");
      out.write("                    <input name=\"pass\" type=\"password\" placeholder=\"Create a password\">\n");
      out.write("                    <input name=\"repass\" type=\"password\" placeholder=\"Confirm your password\">\n");
      out.write("                    <input name=\"fullname\" type=\"text\" placeholder=\"Enter your fullname\">\n");
      out.write("                    <input name=\"phone\" type=\"tel\" placeholder=\"Enter your phone\">\n");
      out.write("                    <input name=\"address\" type=\"text\" placeholder=\"Enter your fullname\">\n");
      out.write("                    <input type=\"submit\" class=\"button\" value=\"Signup\">\n");
      out.write("                </form>\n");
      out.write("                <div class=\"signup\">\n");
      out.write("                    <span class=\"signup\">Already have an account?\n");
      out.write("                        <label for=\"check\">Login</label>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
