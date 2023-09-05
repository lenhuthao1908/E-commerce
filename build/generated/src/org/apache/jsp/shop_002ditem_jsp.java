package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Comment;
import entity.size;
import entity.Category;
import java.util.List;
import entity.Product;
import dao.DAO;

public final class shop_002ditem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
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
      out.write("        <title> Information Product | Shop Fashion</title>\n");
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
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"index\">Store</a></li>\n");
      out.write("                        <li class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- BEGIN SIDEBAR & CONTENT -->\n");
      out.write("\n");
      out.write("                <div class=\"row margin-bottom-40\">\n");
      out.write("                    <!-- BEGIN SIDEBAR -->\n");
      out.write("                    <div class=\"sidebar col-md-3 col-sm-5\">\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"sidebar-products clearfix\">\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-product-new.jsp", out, false);
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END SIDEBAR -->\n");
      out.write("\n");
      out.write("                        <!-- BEGIN CONTENT -->\n");
      out.write("                        <div class=\"col-md-9 col-sm-7\">\n");
      out.write("                            <div class=\"product-page\">\n");
      out.write("                            ");

                                int pid = Integer.parseInt(request.getParameter("pid"));

                                String id = request.getParameter("pid");
                                String cateID = request.getParameter("cid");

                                DAO dao = new DAO();
                                List<Comment> list = dao.getCommentById(pid);
                                Product p = dao.getProductByID(id);
                                List<Category> listC = dao.getAllCategory();
                                List<Product> top3lastP = dao.getTop3Last();
                                List<Product> top4lowP = dao.getTop4Lowprice();
                                List<size> listS = dao.getALLSize();

                                request.setAttribute("listCC", listC);
                                request.setAttribute("listS", listS);
                                request.setAttribute("p3l", top3lastP);
                                request.setAttribute("p4l", top4lowP);
                                request.setAttribute("tag", cateID);

                            
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                                    <div class=\"product-main-image\">\n");
      out.write("                                        <img src=\"image/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Cool green dress with red bell\" class=\"img-responsive\" data-BigImgsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                                    <h1>");
      out.print( p.getName());
      out.write("</h1>\n");
      out.write("                                    <div class=\"price-availability-block clearfix\">\n");
      out.write("                                        <div class=\"price\">\n");
      out.write("                                            <strong><span>$</span>");
      out.print( p.getPrice());
      out.write("</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"availability\">\n");
      out.write("                                            Product ID: <strong>");
      out.print( p.getId());
      out.write("</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"description\">\n");
      out.write("                                        <p>");
      out.print( p.getDescription());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <form action=\"addcart?action=AddToCartOndetail\">\n");
      out.write("                                        <div class=\"product-page-options\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <label class=\"control-label\">Size:</label>\n");
      out.write("                                                <select class=\"form-control input-sm\" name=\"size\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"product-page-cart\">\n");
      out.write("                                            <div class=\"product-quantity\">\n");
      out.write("                                                <input name=\"quantity\" id=\"product-quantity\" type=\"text\" value=\"1\" readonly class=\"form-control input-sm\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <!--<a href=\"addcart?action=AddToCartOndetail&code=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-default add2cart btn-primary\">Add to cart</a>-->\n");
      out.write("                                            <button name=\"code\" type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">add to cart</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    ");


                                        int total = 0;
                                        int totalstar = 0;
                                        for (int i = list.size() - 1; i >= 0; i--) {
                                            Comment comment = list.get(i);
                                            total = total + comment.getComment_star();
                                        }

                                        int n = list.size();

                                        if (list.size() > 0) {

                                            totalstar = total / list.size();

                                        } else {
                                            totalstar = 0;
                                        }

                                    
      out.write("\n");
      out.write("                                    <div class=\"review\">\n");
      out.write("                                        <div class=\"rateit\" data-rateit-value=\"");
      out.print( totalstar);
      out.write("\" data-rateit-ispreset=\"true\" data-rateit-readonly=\"true\"></div>\n");
      out.write("                                        <a href=\"#Reviews\">");
      out.print( list.size());
      out.write(" reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"#comment\">Write a review</a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-page-content\">\n");
      out.write("                                <ul id=\"myTab\" class=\"nav nav-tabs\">\n");
      out.write("                                    <li><a href=\"#Description\" data-toggle=\"tab\">Description</a></li>\n");
      out.write("                                    <li><a href=\"#Information\" data-toggle=\"tab\">Information</a></li>\n");
      out.write("\n");
      out.write("                                    <li class=\"active\"><a href=\"#Reviews\" data-toggle=\"tab\">Reviews (");
      out.print( list.size());
      out.write(")</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                                <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                                    <div class=\"tab-pane fade\" id=\"Description\">\n");
      out.write("                                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"tab-pane fade\" id=\"Information\">\n");
      out.write("                                        <table class=\"datasheet\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th colspan=\"2\">Additional features</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"datasheet-features-type\">Value 1</td>\n");
      out.write("                                                <td>21 cm</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"datasheet-features-type\">Value 2</td>\n");
      out.write("                                                <td>700 gr.</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"datasheet-features-type\">Value 3</td>\n");
      out.write("                                                <td>10 person</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"datasheet-features-type\">Value 4</td>\n");
      out.write("                                                <td>14 cm</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"datasheet-features-type\">Value 5</td>\n");
      out.write("                                                <td>plastic</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"tab-pane fade in active\" id=\"Reviews\">\n");
      out.write("                                        ");

                                            for (int i = list.size() - 1; i >= 0; i--) {
                                                Comment comment = list.get(i);

                                        
      out.write("\n");
      out.write("                                        <div class=\"review-item clearfix\">\n");
      out.write("                                            <div class=\"review-item-submitted\">\n");
      out.write("                                                <a href=\"delcomment?cm_id=");
      out.print( comment.getComment_id());
      out.write("&pid=");
      out.print( comment.getComment_pid());
      out.write("\" ><i class=\"del-goods\"title=\"Delete\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"review-item-submitted\">\n");
      out.write("                                                <strong>");
      out.print( comment.getComment_name());
      out.write("</strong>\n");
      out.write("                                                <div class=\"rateit\" data-rateit-value=\"");
      out.print( comment.getComment_star());
      out.write("\" data-rateit-ispreset=\"true\" data-rateit-readonly=\"true\"></div>\n");
      out.write("                                            </div> \n");
      out.write("                                            <div class=\"review-item-content\">\n");
      out.write("                                                <p>");
      out.print( comment.getComment_descrsiption());
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");


                                            }

                                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <!-- BEGIN FORM-->\n");
      out.write("                                        <form action=\"addcomment\" id=\"comment\">\n");
      out.write("                                            <h2>Write a review</h2>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Username</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"comment_user\" readonly>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\" style=\"display: none;\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"comment_aid\" readonly>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"comment_pid\" readonly>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Comment</label>\n");
      out.write("                                                <textarea name=\"comment_des\" class=\"form-control\" rows=\"8\" id=\"review\"></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Rating</label>\n");
      out.write("                                                <input name=\"comment_star\" type=\"range\" value=\"4\" step=\"1\" id=\"backing5\">\n");
      out.write("                                                <div class=\"rateit\" data-rateit-backingfld=\"#backing5\" data-rateit-resetable=\"false\"  data-rateit-ispreset=\"true\" data-rateit-min=\"0\" data-rateit-max=\"5\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"padding-top-20\">                  \n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-primary\">Send</button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"text-warning\" style=\"font-size: 14px;\">\n");
      out.write("                                                    <p><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("                                                </div>\n");
      out.write("                                        </form>\n");
      out.write("                                        <!-- END FORM--> \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"sticker sticker-sale\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- END CONTENT -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"messagebox\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"messbox\" method=\"\">\n");
      out.write("                        <div class=\"modal-header\" style=\"background: #e94d1c; color: #FFF\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Message</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Message warring!!\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shop-footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Load javascripts at bottom, this will reduce page load time -->\n");
      out.write("        <!-- BEGIN CORE PLUGINS(REQUIRED FOR ALL PAGES) -->\n");
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
      out.write("            });\n");
      out.write("            window.setTimeout(function () {\n");
      out.write("                $(\".alert\").fadeTo(500, 0).slideUp(500, function () {\n");
      out.write("                    $(this).remove();\n");
      out.write("                });\n");
      out.write("            }, 4000);\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                    ");
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
}
