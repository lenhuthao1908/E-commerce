package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002dindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Head BEGIN -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title> Home | NF-Shop </title>\n");
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
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all\" rel=\"stylesheet\" type=\"text/css\"><!--- fonts for slider on the index page -->  \n");
      out.write("        <!-- Fonts END -->\n");
      out.write("\n");
      out.write("        <!-- Global styles START -->          \n");
      out.write("        <link href=\"assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Global styles END --> \n");
      out.write("\n");
      out.write("        <!-- Page level plugin styles START -->\n");
      out.write("        <link href=\"assets/pages/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/fancybox/source/jquery.fancybox.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/owl.carousel/assets/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Page level plugin styles END -->\n");
      out.write("\n");
      out.write("        <!-- Theme styles START -->\n");
      out.write("        <link href=\"assets/pages/css/components.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/pages/css/slider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/pages/css/style-shop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"assets/corporate/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/corporate/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/corporate/css/themes/red.css\" rel=\"stylesheet\" id=\"style-color\">\n");
      out.write("        <link href=\"assets/corporate/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Theme styles END -->\n");
      out.write("    </head>\n");
      out.write("    <!-- Head END -->\n");
      out.write("\n");
      out.write("    <!-- Body BEGIN -->\n");
      out.write("    <body class=\"ecommerce\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- BEGIN SLIDER -->\n");
      out.write("            <div class=\"page-slider margin-bottom-35\">\n");
      out.write("                <div id=\"carousel-example-generic\" class=\"carousel slide carousel-slider\">\n");
      out.write("                    <!-- Indicators -->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                        <li data-target=\"#carousel-example-generic\" data-slide-to=\"3\"></li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!-- Wrapper for slides -->\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        <!-- First slide -->\n");
      out.write("                        <div class=\"item carousel-item-four active\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"carousel-position-four text-center\">\n");
      out.write("                                    <h2 class=\"margin-bottom-20 animate-delay carousel-title-v3 border-bottom-title text-uppercase\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                        Tones of <br/><span class=\"color-red-v2\">Shop UI Features</span><br/> designed\n");
      out.write("                                    </h2>\n");
      out.write("                                    <p class=\"carousel-subtitle-v2\" data-animation=\"animated fadeInUp\">Lorem ipsum dolor sit amet constectetuer diam <br/>\n");
      out.write("                                        adipiscing elit euismod ut laoreet dolore.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Second slide -->\n");
      out.write("                        <div class=\"item carousel-item-five\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"carousel-position-four text-center\">\n");
      out.write("                                    <h2 class=\"animate-delay carousel-title-v4\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                        Unlimted\n");
      out.write("                                    </h2>\n");
      out.write("                                    <p class=\"carousel-subtitle-v2\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                        Layout Options\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"carousel-subtitle-v3 margin-bottom-30\" data-animation=\"animated fadeInUp\">\n");
      out.write("                                        Fully Responsive\n");
      out.write("                                    </p>\n");
      out.write("                                    <a class=\"carousel-btn\" href=\"#\" data-animation=\"animated fadeInUp\">See More Details</a>\n");
      out.write("                                </div>\n");
      out.write("                                <img class=\"carousel-position-five animate-delay hidden-sm hidden-xs\"  alt=\"Price\" data-animation=\"animated zoomIn\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Third slide -->\n");
      out.write("                        <div class=\"item carousel-item-six\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"carousel-position-four text-center\">\n");
      out.write("                                    <span class=\"carousel-subtitle-v3 margin-bottom-15\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                        Full Admin &amp; Frontend\n");
      out.write("                                    </span>\n");
      out.write("                                    <p class=\"carousel-subtitle-v4\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                        eCommerce UI\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"carousel-subtitle-v3\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                        Is Ready For Your Project\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Fourth slide -->\n");
      out.write("                        <div class=\"item carousel-item-seven\">\n");
      out.write("                            <div class=\"center-block\">\n");
      out.write("                                <div class=\"center-block-wrap\">\n");
      out.write("                                    <div class=\"center-block-body\">\n");
      out.write("                                        <h2 class=\"carousel-title-v1 margin-bottom-20\" data-animation=\"animated fadeInDown\">\n");
      out.write("                                            The most <br/>\n");
      out.write("                                            wanted bijouterie\n");
      out.write("                                        </h2>\n");
      out.write("                                        <a class=\"carousel-btn\" href=\"#\" data-animation=\"animated fadeInUp\">But It Now!</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Controls -->\n");
      out.write("                    <a class=\"left carousel-control carousel-control-shop\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"right carousel-control carousel-control-shop\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- END SLIDER -->\n");
      out.write("\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- BEGIN SALE PRODUCT & NEW ARRIVALS -->\n");
      out.write("                    <div class=\"row margin-bottom-40\">\n");
      out.write("                        <!-- BEGIN SALE PRODUCT -->\n");
      out.write("                        <div class=\"col-md-12 sale-product\">\n");
      out.write("                            <h2>Chỉ từ 99.000đ</h2>\n");
      out.write("                            <div class=\"owl-carousel owl-carousel5\">\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END SALE PRODUCT -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- END SALE PRODUCT & NEW ARRIVALS -->\n");
      out.write("\n");
      out.write("                <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("                <div class=\"row margin-bottom-40 \">\n");
      out.write("                    <!-- BEGIN SIDEBAR -->\n");
      out.write("                    <div class=\"sidebar col-md-3 col-sm-4\">\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-menu.jsp", out, false);
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END SIDEBAR -->\n");
      out.write("                        <!-- BEGIN CONTENT -->\n");
      out.write("                        <div class=\"col-md-9 col-sm-8 \">\n");
      out.write("                            <h2>Sản phẩm mới</h2>\n");
      out.write("                            <div class=\"owl-carousel owl-carousel3\" >\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END CONTENT -->\n");
      out.write("                </div>\n");
      out.write("                <!-- END SIDEBAR & CONTENT -->\n");
      out.write("\n");
      out.write("                <!-- BEGIN TWO PRODUCTS & PROMO -->\n");
      out.write("                <div class=\"row margin-bottom-35 \">\n");
      out.write("                    <!-- BEGIN TWO PRODUCTS -->\n");
      out.write("                    <div class=\"col-md-6 two-items-bottom-items\">\n");
      out.write("                        <h2>Sản phẩm giá rẻ</h2>\n");
      out.write("                        <div class=\"owl-carousel owl-carousel2\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END TWO PRODUCTS -->\n");
      out.write("                    <!-- BEGIN PROMO -->\n");
      out.write("                    <div class=\"col-md-6 shop-index-carousel\">\n");
      out.write("                        <div class=\"content-slider\">\n");
      out.write("                            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <!-- Indicators -->\n");
      out.write("                                <ol class=\"carousel-indicators\">\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                                </ol>\n");
      out.write("                                <div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"item active\">\n");
      out.write("                                        <img src=\"assets/pages/img/index-sliders/ads1.png\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img src=\"assets/pages/img/index-sliders/ads2.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img src=\"assets/pages/img/index-sliders/ads3.jpg\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END PROMO -->\n");
      out.write("                </div>        \n");
      out.write("                <!-- END TWO PRODUCTS & PROMO -->\n");
      out.write("            </div>\n");
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
      out.write("        <![endif]-->\n");
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
      out.write("\n");
      out.write("        <script src=\"assets/corporate/scripts/layout.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/pages/scripts/bs-carousel.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function () {\n");
      out.write("                Layout.init();\n");
      out.write("                Layout.initOWL();\n");
      out.write("                Layout.initImageZoom();\n");
      out.write("                Layout.initTouchspin();\n");
      out.write("                Layout.initTwitter();\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p5l}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"product-item\">\n");
          out.write("                                    <div class=\"pi-img-wrapper\">\n");
          out.write("                                        <img src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 250px\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
          out.write("                                        <div>\n");
          out.write("                                            <a href=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                    <div class=\"pi-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    <a href=\"addcart?action=AddToCartOnHome&code=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
          out.write("                                    <!--<div class=\"sticker sticker-sale\"></div>-->\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p3l}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"product-item\">\n");
          out.write("                                    <div class=\"pi-img-wrapper\">\n");
          out.write("                                        <img src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 250px\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
          out.write("                                        <div>\n");
          out.write("                                            <a href=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                    <div class=\"pi-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    <a href=\"addcart?action=AddToCartOnHome&code=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
          out.write("<!--                                <div class=\"sticker sticker-sale\"></div>-->\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p2l}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"product-item\">\n");
          out.write("                                        <div class=\"pi-img-wrapper\">\n");
          out.write("                                            <img src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 250px\" class=\"img-responsive\" alt=\"Berry Lace Dress\">\n");
          out.write("                                            <div>\n");
          out.write("                                                <a href=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default fancybox-button\">Zoom</a>\n");
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                        <div class=\"pi-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                        <a href=\"addcart?action=AddToCartOnHome&code=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-default add2cart\">Add to cart</a>\n");
          out.write("                                        <!--<div class=\"sticker sticker-sale\"></div>-->\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
