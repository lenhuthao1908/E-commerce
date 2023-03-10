<%-- 
    Document   : shop-product-list
    Created on : Feb 2, 2023, 4:32:49 AM
    Author     : nhuth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title> Store | Shop Fashion</title>

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

            <div class="title-wrapper">
                <div class="container"><div class="container-inner">
                        <h1><span>N</span>-<span>-F</span>ashion</h1>
                        <em>Disruptive fashion - Cool style</em>
                    </div></div>
            </div>

            <div class="main">
                <div class="container">
                    <ul class="breadcrumb">
                        <li><a href="home">Home</a></li>
                        <li><a href="index">Store</a></li>
                        <li class="active">${o.name}</li>
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
                        <div class="col-md-9 col-sm-7">
                            <div class="content-search margin-bottom-20">
                                <div class="row">
                                    <div class="col-md-6">
                                        <h1>Search result for <em>shoes</em></h1>
                                    </div>
                                    <div class="col-md-6">
                                        <form action="search" method="post">
                                            <div class="input-group">
                                                <input name="txt" type="text" placeholder="Search again" class="form-control">
                                                <span class="input-group-btn">
                                                    <button class="btn btn-primary" type="submit">Search</button>
                                                </span>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <p><b>PRODUCT</b></p> 
                        </div>
                        <!-- BEGIN PRODUCT LIST -->
                        <div class="row product-list">
                            <c:forEach items="${listP}" var="o">
                                <!-- PRODUCT ITEM START -->
                                <div class="col-md-4 col-sm-6 col-xs-12">
                                    <div class="product-item">
                                        <div class="pi-img-wrapper">
                                            <img src="image/${o.image}" style="width: 270px; height: 300px;" class="img-responsive" alt="Product">
                                            <div>
                                                <a href="image/${o.image}" class="btn btn-default fancybox-button">Zoom</a>
                                                <!--<a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>-->
                                            </div>
                                        </div>
                                        <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
                                        <div class="pi-price">${o.price}</div>
                                        <a href="addcart?action=AddCart&code=${o.id}" class="btn btn-default add2cart">Add to cart</a>
                                    </div>
                                </div>
                                <!-- PRODUCT ITEM END -->
                            </c:forEach>
                        </div>
                        <!-- END PRODUCT LIST -->
                        <!-- BEGIN PAGINATOR -->
                        <div class="row">
                            <div class="col-md-4 col-sm-4 items-info">Items 1 to 9 of 10 total</div>
                            <div class="col-md-8 col-sm-8">
                                <ul class="pagination pull-right">
                                    <li><a href="javascript:;">&laquo;</a></li>
                                    <li><a href="javascript:;">1</a></li>
                                    <li><span>2</span></li>
                                    <li><a href="javascript:;">3</a></li>
                                    <li><a href="javascript:;">4</a></li>
                                    <li><a href="javascript:;">5</a></li>
                                    <li><a href="javascript:;">&raquo;</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- END PAGINATOR -->
                    </div>


                </div>
                <!-- END PAGINATOR -->
            </div>
            <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->

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
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js" type="text/javascript"></script><!-- for slider-range -->

        <script src="assets/corporate/scripts/layout.js" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {
                Layout.init();
                Layout.initOWL();
                Layout.initTwitter();
                Layout.initImageZoom();
                Layout.initTouchspin();
                Layout.initUniform();
                Layout.initSliderRange();
            });
        </script>
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>
