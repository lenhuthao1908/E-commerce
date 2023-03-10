package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002dedit_002daccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Head BEGIN -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Manager Account | NF-Shop</title>\n");
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
      out.write("        <link href=\"assets/plugins/uniform/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\"><!-- for slider-range -->\n");
      out.write("        <link href=\"assets/plugins/rateit/src/rateit.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Page level plugin styles END -->\n");
      out.write("\n");
      out.write("        <!-- Theme styles START -->\n");
      out.write("        <link href=\"assets/pages/css/components.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/corporate/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/pages/css/style-shop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"assets/corporate/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/corporate/css/themes/red.css\" rel=\"stylesheet\" id=\"style-color\">\n");
      out.write("        <link href=\"assets/corporate/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Theme styles END -->\n");
      out.write("    </head>\n");
      out.write("    <!-- Head END -->\n");
      out.write("\n");
      out.write("    <!-- Body BEGIN -->\n");
      out.write("    <body class=\"ecommerce\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- add Modal HTML -->\n");
      out.write("                    <form action=\"editacc\" method=\"post\">\n");
      out.write("                        <div class=\"modal-header\" style=\"background: #e94d1c; color: #FFF\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Edit Manager</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>userID</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listA.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\" type=\"text\" class=\"form-control\" readonly required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Username</label>\n");
      out.write("                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listA.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"user\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listA.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"pass\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Sellstrators</label>\n");
      out.write("                            <br>\n");
      out.write("                            <input name=\"sell\" type=\"radio\" value=\"0\" class=\"form-group\"> NO\n");
      out.write("                            <br>\n");
      out.write("                            <input name=\"sell\" type=\"radio\" value=\"1\" class=\"form-group\"> YES\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Administrators</label>\n");
      out.write("                            <br>\n");
      out.write("                            <input name=\"admin\" type=\"radio\" value=\"0\" class=\"form-group\"> NO\n");
      out.write("                            <br>\n");
      out.write("                            <input name=\"admin\" type=\"radio\" value=\"1\" class=\"form-group\"> YES\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary\" value=\"Edit\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Load javascripts at bottom, this will reduce page load time -->\n");
      out.write("        <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"assets/plugins/respond.min.js\"></script>  \n");
      out.write("        <![endif]-->  \n");
      out.write("        <script src=\"assets/plugins/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/plugins/jquery-migrate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>      \n");
      out.write("        <script src=\"assets/corporate/scripts/back-to-top.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- END CORE PLUGINS -->\n");
      out.write("\n");
      out.write("        <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->\n");
      out.write("        <script src=\"assets/plugins/fancybox/source/jquery.fancybox.pack.js\" type=\"text/javascript\"></script><!-- pop up -->\n");
      out.write("        <script src=\"assets/plugins/owl.carousel/owl.carousel.min.js\" type=\"text/javascript\"></script><!-- slider for products -->\n");
      out.write("        <script src='assets/plugins/zoom/jquery.zoom.min.js' type=\"text/javascript\"></script><!-- product zoom -->\n");
      out.write("        <script src=\"assets/plugins/bootstrap-touchspin/bootstrap.touchspin.js\" type=\"text/javascript\"></script><!-- Quantity -->\n");
      out.write("        <script src=\"assets/plugins/uniform/jquery.uniform.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/plugins/rateit/src/jquery.rateit.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.10.3/jquery-ui.js\" type=\"text/javascript\"></script><!-- for slider-range -->\n");
      out.write("\n");
      out.write("        <script src=\"assets/corporate/scripts/layout.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function () {\n");
      out.write("                Layout.init();\n");
      out.write("                Layout.initOWL();\n");
      out.write("                Layout.initTwitter();\n");
      out.write("                Layout.initImageZoom();\n");
      out.write("                Layout.initTouchspin();\n");
      out.write("                Layout.initUniform();\n");
      out.write("                Layout.initSliderRange();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- END PAGE LEVEL JAVASCRIPTS -->\n");
      out.write("    </body>\n");
      out.write("    <!-- END BODY -->\n");
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
