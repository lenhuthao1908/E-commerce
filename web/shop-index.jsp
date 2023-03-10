<%-- 
    Document   : shop-index
    Created on : Feb 2, 2023, 4:30:42 AM
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
        <title> Home | NF-Shop </title>

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
        <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css"><!--- fonts for slider on the index page -->  
        <!-- Fonts END -->

        <!-- Global styles START -->          
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Global styles END --> 

        <!-- Page level plugin styles START -->
        <link href="assets/pages/css/animate.css" rel="stylesheet">
        <link href="assets/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
        <link href="assets/plugins/owl.carousel/assets/owl.carousel.css" rel="stylesheet">
        <!-- Page level plugin styles END -->

        <!-- Theme styles START -->
        <link href="assets/pages/css/components.css" rel="stylesheet">
        <link href="assets/pages/css/slider.css" rel="stylesheet">
        <link href="assets/pages/css/style-shop.css" rel="stylesheet" type="text/css">
        <link href="assets/corporate/css/style.css" rel="stylesheet">
        <link href="assets/corporate/css/style-responsive.css" rel="stylesheet">
        <link href="assets/corporate/css/themes/red.css" rel="stylesheet" id="style-color">
        <link href="assets/corporate/css/custom.css" rel="stylesheet">
        <!-- Theme styles END -->
    </head>
    <!-- Head END -->

    <!-- Body BEGIN -->
    <body class="ecommerce">

        <jsp:include page="shop-header.jsp"></jsp:include>

            <!-- BEGIN SLIDER -->
            <div class="page-slider margin-bottom-35">
                <div id="carousel-example-generic" class="carousel slide carousel-slider">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                    </ol>

                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <!-- First slide -->
                        <div class="item carousel-item-four active">
                            <div class="container">
                                <div class="carousel-position-four text-center">
                                    <h2 class="margin-bottom-20 animate-delay carousel-title-v3 border-bottom-title text-uppercase" data-animation="animated fadeInDown">
                                        Tones of <br/><span class="color-red-v2">Shop UI Features</span><br/> designed
                                    </h2>
                                    <p class="carousel-subtitle-v2" data-animation="animated fadeInUp">Lorem ipsum dolor sit amet constectetuer diam <br/>
                                        adipiscing elit euismod ut laoreet dolore.</p>
                                </div>
                            </div>
                        </div>

                        <!-- Second slide -->
                        <div class="item carousel-item-five">
                            <div class="container">
                                <div class="carousel-position-four text-center">
                                    <h2 class="animate-delay carousel-title-v4" data-animation="animated fadeInDown">
                                        Unlimted
                                    </h2>
                                    <p class="carousel-subtitle-v2" data-animation="animated fadeInDown">
                                        Layout Options
                                    </p>
                                    <p class="carousel-subtitle-v3 margin-bottom-30" data-animation="animated fadeInUp">
                                        Fully Responsive
                                    </p>
                                    <a class="carousel-btn" href="#" data-animation="animated fadeInUp">See More Details</a>
                                </div>
                                <img class="carousel-position-five animate-delay hidden-sm hidden-xs"  alt="Price" data-animation="animated zoomIn">
                            </div>
                        </div>

                        <!-- Third slide -->
                        <div class="item carousel-item-six">
                            <div class="container">
                                <div class="carousel-position-four text-center">
                                    <span class="carousel-subtitle-v3 margin-bottom-15" data-animation="animated fadeInDown">
                                        Full Admin &amp; Frontend
                                    </span>
                                    <p class="carousel-subtitle-v4" data-animation="animated fadeInDown">
                                        eCommerce UI
                                    </p>
                                    <p class="carousel-subtitle-v3" data-animation="animated fadeInDown">
                                        Is Ready For Your Project
                                    </p>
                                </div>
                            </div>
                        </div>

                        <!-- Fourth slide -->
                        <div class="item carousel-item-seven">
                            <div class="center-block">
                                <div class="center-block-wrap">
                                    <div class="center-block-body">
                                        <h2 class="carousel-title-v1 margin-bottom-20" data-animation="animated fadeInDown">
                                            The most <br/>
                                            wanted bijouterie
                                        </h2>
                                        <a class="carousel-btn" href="#" data-animation="animated fadeInUp">But It Now!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Controls -->
                    <a class="left carousel-control carousel-control-shop" href="#carousel-example-generic" role="button" data-slide="prev">
                        <i class="fa fa-angle-left" aria-hidden="true"></i>
                    </a>
                    <a class="right carousel-control carousel-control-shop" href="#carousel-example-generic" role="button" data-slide="next">
                        <i class="fa fa-angle-right" aria-hidden="true"></i>
                    </a>
                </div>
            </div>
            <!-- END SLIDER -->

            <div class="main">
                <div class="container">
                    <!-- BEGIN SALE PRODUCT & NEW ARRIVALS -->
                    <div class="row margin-bottom-40">
                        <!-- BEGIN SALE PRODUCT -->
                        <div class="col-md-12 sale-product">
                            <h2>Chỉ từ 99.000đ</h2>
                            <div class="owl-carousel owl-carousel5">

                            <c:forEach items="${p5l}" var="o">
                                <div class="product-item">
                                    <div class="pi-img-wrapper">
                                        <img src="image/${o.image}" style="height: 250px" class="img-responsive" alt="Berry Lace Dress">
                                        <div>
                                            <a href="image/${o.image}" class="btn btn-default fancybox-button">Zoom</a>

                                        </div>
                                    </div>
                                    <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
                                    <div class="pi-price">${o.price}</div>
                                    <a href="addcart?action=AddToCartOnHome&code=${o.id}" class="btn btn-default add2cart">Add to cart</a>
                                    <!--<div class="sticker sticker-sale"></div>-->
                                </div>
                            </c:forEach>

                        </div>
                    </div>
                    <!-- END SALE PRODUCT -->

                </div>
                <!-- END SALE PRODUCT & NEW ARRIVALS -->

                <!-- BEGIN SIDEBAR & CONTENT -->
                <div class="row margin-bottom-40 ">
                    <!-- BEGIN SIDEBAR -->
                    <div class="sidebar col-md-3 col-sm-4">
                        <jsp:include page="shop-menu.jsp"></jsp:include>
                        </div>
                        <!-- END SIDEBAR -->
                        <!-- BEGIN CONTENT -->
                        <div class="col-md-9 col-sm-8 ">
                            <h2>Sản phẩm mới</h2>
                            <div class="owl-carousel owl-carousel3" >
                            <c:forEach items="${p3l}" var="o">
                                <div class="product-item">
                                    <div class="pi-img-wrapper">
                                        <img src="image/${o.image}" style="height: 250px" class="img-responsive" alt="Berry Lace Dress">
                                        <div>
                                            <a href="image/${o.image}" class="btn btn-default fancybox-button">Zoom</a>

                                        </div>
                                    </div>
                                    <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
                                    <div class="pi-price">${o.price}</div>
                                    <a href="addcart?action=AddToCartOnHome&code=${o.id}" class="btn btn-default add2cart">Add to cart</a>
<!--                                <div class="sticker sticker-sale"></div>-->
                                </div>
                            </c:forEach>
                        </div>


                    </div>
                    <!-- END CONTENT -->
                </div>
                <!-- END SIDEBAR & CONTENT -->

                <!-- BEGIN TWO PRODUCTS & PROMO -->
                <div class="row margin-bottom-35 ">
                    <!-- BEGIN TWO PRODUCTS -->
                    <div class="col-md-6 two-items-bottom-items">
                        <h2>Sản phẩm giá rẻ</h2>
                        <div class="owl-carousel owl-carousel2">
                                <c:forEach items="${p2l}" var="o">
                                    <div class="product-item">
                                        <div class="pi-img-wrapper">
                                            <img src="image/${o.image}" style="height: 250px" class="img-responsive" alt="Berry Lace Dress">
                                            <div>
                                                <a href="image/${o.image}" class="btn btn-default fancybox-button">Zoom</a>

                                            </div>
                                        </div>
                                        <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
                                        <div class="pi-price">${o.price}</div>
                                        <a href="addcart?action=AddToCartOnHome&code=${o.id}" class="btn btn-default add2cart">Add to cart</a>
                                        <!--<div class="sticker sticker-sale"></div>-->
                                    </div>
                                </c:forEach>
                        </div>
                    </div>
                    <!-- END TWO PRODUCTS -->
                    <!-- BEGIN PROMO -->
                    <div class="col-md-6 shop-index-carousel">
                        <div class="content-slider">
                            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <ol class="carousel-indicators">
                                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                    <li data-target="#myCarousel" data-slide-to="1"></li>
                                    <li data-target="#myCarousel" data-slide-to="2"></li>
                                </ol>
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <img src="assets/pages/img/index-sliders/ads1.png" class="img-responsive" alt="Berry Lace Dress">
                                    </div>
                                    <div class="item">
                                        <img src="assets/pages/img/index-sliders/ads2.jpg" class="img-responsive" alt="Berry Lace Dress">
                                    </div>
                                    <div class="item">
                                        <img src="assets/pages/img/index-sliders/ads3.jpg" class="img-responsive" alt="Berry Lace Dress">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END PROMO -->
                </div>        
                <!-- END TWO PRODUCTS & PROMO -->
            </div>
        </div>

        <jsp:include page="shop-footer.jsp"></jsp:include>

        <!-- Load javascripts at bottom, this will reduce page load time -->
        <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
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

        <script src="assets/corporate/scripts/layout.js" type="text/javascript"></script>
        <script src="assets/pages/scripts/bs-carousel.js" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {
                Layout.init();
                Layout.initOWL();
                Layout.initImageZoom();
                Layout.initTouchspin();
                Layout.initTwitter();
            });
        </script>
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>
