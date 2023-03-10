<%-- 
    Document   : shop-item
    Created on : Feb 2, 2023, 4:31:53 AM
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
                                <div class="row">
                                    <div class="col-md-6 col-sm-6">
                                        <div class="product-main-image">
                                            <img src="image/${detail.image}" alt="Cool green dress with red bell" class="img-responsive" data-BigImgsrc="${detail.image}">
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-sm-6">
                                        <h1>${detail.name}</h1>
                                        <div class="price-availability-block clearfix">
                                            <div class="price">
                                                <strong><span>$</span>${detail.price}</strong>
                                            </div>
                                            <div class="availability">
                                                Availability: <strong>In Stock</strong>
                                            </div>
                                        </div>
                                        <div class="description">
                                            <p>${detail.description}.</p>
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
                                        <div class="review">
                                            <input type="range" value="4" step="0.25" id="backing4">
                                            <div class="rateit" data-rateit-backingfld="#backing4" data-rateit-resetable="false"  data-rateit-ispreset="true" data-rateit-min="0" data-rateit-max="5">
                                            </div>
                                            <a href="javascript:;">7 reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:;">Write a review</a>
                                        </div>
                                        <ul class="social-icons">
                                            <li><a class="facebook" data-original-title="facebook" href="javascript:;"></a></li>
                                            <li><a class="twitter" data-original-title="twitter" href="javascript:;"></a></li>
                                            <li><a class="googleplus" data-original-title="googleplus" href="javascript:;"></a></li>
                                            <li><a class="evernote" data-original-title="evernote" href="javascript:;"></a></li>
                                            <li><a class="tumblr" data-original-title="tumblr" href="javascript:;"></a></li>
                                        </ul>
                                    </div>

                                    <div class="product-page-content">
                                        <ul id="myTab" class="nav nav-tabs">
                                            <li><a href="#Description" data-toggle="tab">Description</a></li>
                                            <li><a href="#Information" data-toggle="tab">Information</a></li>
                                            <li class="active"><a href="#Reviews" data-toggle="tab">Reviews (2)</a></li>
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
                                                <!--<p>There are no reviews for this product.</p>-->
                                                <div class="review-item clearfix">
                                                    <div class="review-item-submitted">
                                                        <strong>Bob</strong>
                                                        <em>30/12/2013 - 07:37</em>
                                                        <div class="rateit" data-rateit-value="5" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
                                                    </div>                                              
                                                    <div class="review-item-content">
                                                        <p>Sed velit quam, auctor id semper a, hendrerit eget justo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vel arcu pulvinar dolor tempus feugiat id in orci. Phasellus sed erat leo. Donec luctus, justo eget ultricies tristique, enim mauris bibendum orci, a sodales lectus purus ut lorem.</p>
                                                    </div>
                                                </div>
                                                <div class="review-item clearfix">
                                                    <div class="review-item-submitted">
                                                        <strong>Mary</strong>
                                                        <em>13/12/2013 - 17:49</em>
                                                        <div class="rateit" data-rateit-value="2.5" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
                                                    </div>                                              
                                                    <div class="review-item-content">
                                                        <p>Sed velit quam, auctor id semper a, hendrerit eget justo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis vel arcu pulvinar dolor tempus feugiat id in orci. Phasellus sed erat leo. Donec luctus, justo eget ultricies tristique, enim mauris bibendum orci, a sodales lectus purus ut lorem.</p>
                                                    </div>
                                                </div>

                                                <!-- BEGIN FORM-->
                                                <form action="#" class="reviews-form" role="form">
                                                    <h2>Write a review</h2>
                                                    <div class="form-group">
                                                        <label for="name">Name <span class="require">*</span></label>
                                                        <input type="text" class="form-control" id="name">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="email">Email</label>
                                                        <input type="text" class="form-control" id="email">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="review">Review <span class="require">*</span></label>
                                                        <textarea class="form-control" rows="8" id="review"></textarea>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="email">Rating</label>
                                                        <input type="range" value="4" step="0.25" id="backing5">
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
                            </div>
                        </div>
                        <!-- END CONTENT -->
                    </div>
                    <!-- END SIDEBAR & CONTENT -->

                    <!-- BEGIN SIMILAR PRODUCTS -->
                    <div class="row margin-bottom-40">
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
                    <!-- END SIMILAR PRODUCTS -->
                </div>
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
