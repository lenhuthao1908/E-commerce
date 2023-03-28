<%-- 
    Document   : shop-item
    Created on : Feb 2, 2023, 4:31:53 AM
    Author     : nhuth
--%>

<%@page import="entity.Comment"%>
<%@page import="entity.size"%>
<%@page import="entity.Category"%>
<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page import="dao.DAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title> Information Product | Shop Fashion</title>

        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

        <meta content="Metronic Shop UI description" name="description">
        <meta content="Metronic Shop UI keywords" name="keywords">
        <meta content="keenthemes" name="author">

        <meta property="og:site_name" content="-CUSTOMER VALUE-">
        <meta property="og:title" content="-CUSTOMER VALUE-">
        <meta property="og:description" content="-CUSTOMER VALUE-">
        <meta property="og:type" content="website">
        <meta property="og:image" content="-CUSTOMER VALUE-"><!-- link to image for socio -->
        <meta property="og:url" content="-CUSTOMER VALUE-">

        <link rel="shortcut icon" href="favicon.ico">

        <!-- Fonts START -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css"> 
        <!-- Fonts END -->

        <!-- Global styles START -->          
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Global styles END --> 

        <!-- Page level plugin styles START -->
        <link href="assets/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
        <link href="assets/plugins/owl.carousel/assets/owl.carousel.css" rel="stylesheet">
        <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
        <link href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" rel="stylesheet" type="text/css"><!-- for slider-range -->
        <link href="assets/plugins/rateit/src/rateit.css" rel="stylesheet" type="text/css">
        <!-- Page level plugin styles END -->

        <!-- Theme styles START -->
        <link href="assets/pages/css/components.css" rel="stylesheet">
        <link href="assets/corporate/css/style.css" rel="stylesheet">
        <link href="assets/pages/css/style-shop.css" rel="stylesheet" type="text/css">
        <link href="assets/corporate/css/style-responsive.css" rel="stylesheet">
        <link href="assets/corporate/css/themes/red.css" rel="stylesheet" id="style-color">
        <link href="assets/corporate/css/custom.css" rel="stylesheet">
        <!-- Theme styles END -->
    </head>
    <!-- Head END -->

    <!-- Body BEGIN -->
    <body class="ecommerce">
        <jsp:include page="shop-header.jsp"></jsp:include>

            <div class="main">
                <div class="container">
                    <ul class="breadcrumb">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="index">Store</a></li>
                        <li class="active">${detail.name}</li>
                </ul>
                <!-- BEGIN SIDEBAR & CONTENT -->

                <div class="row margin-bottom-40">
                    <!-- BEGIN SIDEBAR -->
                    <div class="sidebar col-md-3 col-sm-5">
                        <jsp:include page="shop-menu.jsp"></jsp:include>

                            <div class="sidebar-products clearfix">
                            <jsp:include page="shop-product-new.jsp"></jsp:include>
                            </div>
                        </div>
                        <!-- END SIDEBAR -->

                        <!-- BEGIN CONTENT -->
                        <div class="col-md-9 col-sm-7">
                            <div class="product-page">
                            <%
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

                            %>
                            <div class="row">
                                <div class="col-md-6 col-sm-6">
                                    <div class="product-main-image">
                                        <img src="image/${detail.image}" alt="Cool green dress with red bell" class="img-responsive" data-BigImgsrc="${detail.image}">
                                    </div>
                                </div>
                                <div class="col-md-6 col-sm-6">
                                    <h1><%= p.getName()%></h1>
                                    <div class="price-availability-block clearfix">
                                        <div class="price">
                                            <strong><span>$</span><%= p.getPrice()%></strong>
                                        </div>
                                        <div class="availability">
                                            Product ID: <strong><%= p.getId()%></strong>
                                        </div>
                                    </div>
                                    <div class="description">
                                        <p><%= p.getDescription()%></p>
                                    </div>
                                    <div class="product-page-options">
                                        <div class="pull-left">
                                            <label class="control-label">Size:</label>
                                            <select class="form-control input-sm">
                                                <c:forEach items="${listS}" var="o">
                                                    <option>${o.sname}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="product-page-cart">
                                        <div class="product-quantity">
                                            <input name="quantity" id="product-quantity" type="text" value="1" readonly class="form-control input-sm">
                                        </div>
                                        <a href="addcart?action=AddToCartOndetail&code=${detail.id}" class="btn btn-default add2cart btn-primary">Add to cart</a>
                                    </div>
                                    <%

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

                                    %>
                                    <div class="review">
                                        <div class="rateit" data-rateit-value="<%= totalstar%>" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
                                        <a href="#Reviews"><%= list.size()%> reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#comment">Write a review</a>
                                    </div>
                                    
                                </div>
                            </div>

                            <div class="product-page-content">
                                <ul id="myTab" class="nav nav-tabs">
                                    <li><a href="#Description" data-toggle="tab">Description</a></li>
                                    <li><a href="#Information" data-toggle="tab">Information</a></li>

                                    <li class="active"><a href="#Reviews" data-toggle="tab">Reviews (<%= list.size()%>)</a></li>


                                </ul>
                                <div id="myTabContent" class="tab-content">
                                    <div class="tab-pane fade" id="Description">
                                        <p>${detail.description} </p>
                                    </div>
                                    <div class="tab-pane fade" id="Information">
                                        <table class="datasheet">
                                            <tr>
                                                <th colspan="2">Additional features</th>
                                            </tr>
                                            <tr>
                                                <td class="datasheet-features-type">Value 1</td>
                                                <td>21 cm</td>
                                            </tr>
                                            <tr>
                                                <td class="datasheet-features-type">Value 2</td>
                                                <td>700 gr.</td>
                                            </tr>
                                            <tr>
                                                <td class="datasheet-features-type">Value 3</td>
                                                <td>10 person</td>
                                            </tr>
                                            <tr>
                                                <td class="datasheet-features-type">Value 4</td>
                                                <td>14 cm</td>
                                            </tr>
                                            <tr>
                                                <td class="datasheet-features-type">Value 5</td>
                                                <td>plastic</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div class="tab-pane fade in active" id="Reviews">
                                        <%
                                            for (int i = list.size() - 1; i >= 0; i--) {
                                                Comment comment = list.get(i);

                                        %>
                                        <div class="review-item clearfix">
                                            <div class="review-item-submitted">
                                                <a href="delcomment?cm_id=<%= comment.getComment_id()%>&pid=<%= comment.getComment_pid() %>" ><i class="del-goods"title="Delete"></i></a>
                                            </div>
                                            <div class="review-item-submitted">
                                                <strong><%= comment.getComment_name()%></strong>
                                                <div class="rateit" data-rateit-value="<%= comment.getComment_star()%>" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
                                            </div> 
                                            <div class="review-item-content">
                                                <p><%= comment.getComment_descrsiption()%></p>
                                            </div>
                                        </div>
                                        <%

                                            }

                                        %>






                                        <!-- BEGIN FORM-->
                                        <form action="addcomment" id="comment">
                                            <h2>Write a review</h2>
                                            <div class="form-group">
                                                <label>Username</label>
                                                <input type="text" class="form-control" value="${sessionScope.acc.user}" name="comment_user" readonly>
                                            </div>
                                            <div class="form-group" style="display: none;">
                                                <input type="text" class="form-control" value="${sessionScope.acc.id}" name="comment_aid" readonly>
                                                <input type="text" class="form-control" value="${detail.id}" name="comment_pid" readonly>
                                            </div>
                                            <div class="form-group">
                                                <label>Comment</label>
                                                <textarea name="comment_des" class="form-control" rows="8" id="review"></textarea>
                                            </div>
                                            <div class="form-group">
                                                <label>Rating</label>
                                                <input name="comment_star" type="range" value="4" step="1" id="backing5">
                                                <div class="rateit" data-rateit-backingfld="#backing5" data-rateit-resetable="false"  data-rateit-ispreset="true" data-rateit-min="0" data-rateit-max="5">
                                                </div>
                                            </div>
                                            <div class="padding-top-20">                  
                                                <button type="submit" class="btn btn-primary">Send</button>
                                            </div>
                                        </form>
                                        <!-- END FORM--> 
                                    </div>
                                </div>
                            </div>

                            <div class="sticker sticker-sale"></div>
                        </div>
                        <%
                        %>
                    </div>
                </div>
                <!-- END CONTENT -->
            </div>
            <!-- END SIDEBAR & CONTENT -->

            <!-- BEGIN SIMILAR PRODUCTS -->
<!--            <div class="row margin-bottom-40">
                <div class="col-md-12 col-sm-12">
                    <h2>Product low price under 100 </h2>
                    <div class="owl-carousel owl-carousel4">
                        <c:forEach items="${p4l}" var="o">
                            <div>
                                <div class="product-item">
                                    <div class="pi-img-wrapper">
                                        <img src="${o.image}" style="width: 270px; height: 300px;" class="img-responsive" alt="Berry Lace Dress">
                                        <div>
                                            <a href="${o.image}" class="btn btn-default fancybox-button">Zoom</a>

                                        </div>
                                    </div>
                                    <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
                                    <div class="pi-price">${o.price}</div>
                                    <a href="javascript:;" class="btn btn-default add2cart">Add to cart</a>
                                    <div class="sticker sticker-new"></div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                 END SIMILAR PRODUCTS 
            </div>-->
        </div>

        <jsp:include page="shop-footer.jsp"></jsp:include>

        <!-- Load javascripts at bottom, this will reduce page load time -->
        <!-- BEGIN CORE PLUGINS(REQUIRED FOR ALL PAGES) -->
        <!--[if lt IE 9]>
        <script src="assets/plugins/respond.min.js"></script>  
        <![endif]-->  
        <script src="assets/plugins/jquery.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-migrate.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>      
        <script src="assets/corporate/scripts/back-to-top.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->

        <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
        <script src="assets/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
        <script src="assets/plugins/owl.carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->
        <script src='assets/plugins/zoom/jquery.zoom.min.js' type="text/javascript"></script><!-- product zoom -->
        <script src="assets/plugins/bootstrap-touchspin/bootstrap.touchspin.js" type="text/javascript"></script><!-- Quantity -->
        <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
        <script src="assets/plugins/rateit/src/jquery.rateit.js" type="text/javascript"></script>

        <script src="assets/corporate/scripts/layout.js" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {
                Layout.init();
                Layout.initOWL();
                Layout.initTwitter();
                Layout.initImageZoom();
                Layout.initTouchspin();
                Layout.initUniform();
            });
        </script>
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>
