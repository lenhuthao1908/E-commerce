<%-- 
    Document   : shop-manager-product
    Created on : Feb 7, 2023, 2:44:34 AM
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
        <title>Account Product | NF-Shop</title>

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
                    <!-- BEGIN SIDEBAR & CONTENT -->
                    <div class="row margin-bottom-40">
                        <!-- BEGIN CONTENT -->
                        <div class="col-md-12 col-sm-12">
                            <h1>Account product</h1>
                            <div class="goods-page">
                                <div class="goods-data clearfix">
                                    <div class="table-wrapper-responsive">
                                        <table summary="Manager Product">
                                            <tr>
                                                <th class="goods-page-user"><strong>USERNAME</strong></th>
                                                <th class="goods-page-pass"><strong>PASSWORD</strong></th>
                                                <th class="goods-page-issel"><strong>SELLSTRATORS</strong></th>
                                                <th class="goods-page-admin"><strong>ADMINISTRATORS</strong></th>
                                            </tr>

                                        <c:forEach items="${listA}" var="o">
                                            <tr>
                                                <td class="goods-page-user">
                                                    <strong>${o.user}</strong>
                                                </td>
                                                <td class="goods-page-pass">
                                                    <strong>${o.pass}</strong>
                                                </td>
                                                <td class="goods-page-issel">
                                                    <c:if test="${o.isSell == 1}">
                                                        <strong style="color: lime;">YES</strong>
                                                    </c:if>
                                                    <c:if test="${o.isSell == 0}">
                                                        <strong style="color: blue;">NO</strong>
                                                    </c:if>
                                                </td>
                                                <td class="goods-page-admin">
                                                    <c:if test="${o.isAdmin == 1}">
                                                        <strong style="color: lime;">YES</strong>
                                                    </c:if>
                                                    <c:if test="${o.isAdmin == 0}">
                                                        <strong style="color: blue;">NO</strong>
                                                    </c:if>
                                                </td>

                                                <td class="edit-goods-col">
                                                    <a href="loadaccount?aid=${o.id}"  class="edit" data-toggle="modal"><i class="fa fa-pencil"></i></a>
                                                </td> 
                                                <td class="del-goods-col">
                                                    <a href="deleteacc?aid=${o.id}"  data-toggle="modal"><i class="del-goods" data-toggle="tooltip" title="Delete"></i></a>
                                                </td>

                                            </tr>
                                        </c:forEach>

                                    </table>
                                </div>
                            </div>
                            <button class="btn btn-default" type="submit" ><a href="index" style="text-decoration: none; color: #FFF;">Continue shopping</a> <i class="fa fa-shopping-cart"></i></button>
                            <button href="#addEmployeeModal"  data-toggle="modal" class="btn btn-primary" ><i class="fa fa-plus"></i> Add Account</button>
                        </div>
                    </div>
                    <!-- END CONTENT -->
                </div>
                <!-- add Modal HTML -->
                <div id="addEmployeeModal" class="modal fade">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <form action="addacc" method="post">
                                <div class="modal-header" style="background: #e94d1c; color: #FFF">						
                                    <h4 class="modal-title">Add Account</h4>
                                </div>
                                <div class="modal-body">					
                                    <div class="form-group">
                                        <label>Username</label>
                                        <input name="username" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Password</label>
                                        <input name="password" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Sellstrators</label>
                                        <br>
                                        <input name="sell" type="radio" value="0" class="form-group"> NO
                                        <br>
                                        <input name="sell" type="radio" value="1" class="form-group"> YES

                                    </div>
                                    <div class="form-group">
                                        <label>Administrators</label>
                                        <br>
                                        <input name="admin" type="radio" value="0" class="form-group"> NO
                                        <br>
                                        <input name="admin" type="radio" value="1" class="form-group"> YES
                                               
                                    </div>
                                    <div class="form-group">
                                        <label>Fullname</label>
                                        <input name="fullname" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Phone</label>
                                        <input name="phone" type="tel" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Address</label>
                                        <input name="address" type="text" class="form-control" required>
                                    </div>

                                </div>
                                <div class="modal-footer">
                                    <input type="button" class="btn btn-close" data-dismiss="modal" value="Cancel">
                                    <input type="submit" class="btn btn-primary" value="Add">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>



                



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
