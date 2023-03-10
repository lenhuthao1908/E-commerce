<%-- 
    Document   : shop-shopping-cart
    Created on : Feb 2, 2023, 4:34:29 AM
    Author     : nhuth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Cart"%>
<%@page import="control.AddCartControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title>Shopping cart | Metronic Shop UI</title>

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
        <link href="assets/pages/css/portfolio.css" rel="stylesheet">
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
                            <h1>Shopping cart</h1>
                            <div class="goods-page">
                                <div class="goods-data clearfix">
                                    <div class="table-wrapper-responsive">
                                        <table summary="Shopping cart">
                                            <tr>
                                                <th class="goods-page-stt">STT</th>
                                                <th class="goods-page-id">ID</th>
                                                <th class="goods-page-image" >IMAGE</th>
                                                <th class="goods-page-description">DESCRIPTION</th>
                                                <th class="goods-page-quantity" colspan="3">QUANTITY</th>
                                                <th class="goods-page-price" colspan="2">PRICE</th>
                                                <th class="goods-page-total" colspan="2">TOTAL</th>
                                            </tr>

                                        <%

                                            if (AddCartControl.listcart != null) {
                                                double total = 0;
                                                double ship = 0;
                                        %>
                                        <%
                                            for (int i = 0; i < AddCartControl.listcart.size(); i++) {
                                                Cart cart = AddCartControl.listcart.get(i);
                                                ship = 30;
                                                total = total + (cart.getQuantity() * cart.getCid().getPrice());
                                        %>
                                        <tr>
                                            <td class="goods-page-stt">
                                                <strong><%=i + 1%></strong>
                                            </td>

                                            <td class="goods-page-id">
                                                <strong><%=cart.getCid().getId()%></strong>
                                            </td>
                                            <td class="goods-page-image">
                                                <a href="detail?pid=<%=cart.getCid().getId()%>"><img src="image/<%=cart.getCid().getImage()%>" alt="Berry Lace Dress"></a>
                                            </td>
                                            <td class="goods-page-description">
                                                <h3><a href="detail?pid=<%=cart.getCid().getId()%>"><%=cart.getCid().getName()%></a></h3>
                                                <p><strong><%=cart.getCid().getTitle()%></strong></p>
                                                <em><%=cart.getCid().getDescription()%></em>
                                            </td>
                                            <td class="del-goods-col">
                                                <a class="" href="addcart?action=AddToCart&code=<%= cart.getCid().getId()%>"><i class="fa fa-plus"></i></a>
                                            </td>
                                            <td class="goods-page-quantity">
                                                <strong><%=cart.getQuantity()%></strong>
                                            </td>
                                            <td class="del-goods-col">
                                                <a class="" href="delcart?action=DelCart&code=<%= cart.getCid().getId()%>"><i class="fa fa-minus"></i></a>
                                            </td>
                                            <td class="goods-page-price">
                                                <strong><%=cart.getCid().getPrice()%></strong>
                                            </td>
                                            <td class="goods-page-total" colspan="2">
                                                <strong><%=cart.getCid().getPrice() * cart.getQuantity()%></strong>
                                            </td>
                                            <td class="del-goods-col">
                                                <a class="" href="delcart?action=DelCartP&code=<%= cart.getCid().getId()%>"><i class="fa fa-trash"></i></a>
                                            </td>
                                            <!--                                            <td class="goods-page-price">
                                                                                            <strong>${sessionScope.list.id}</strong>
                                                                                        </td>-->
                                        </tr>

                                        <%
                                            }
                                        %>
                                    </table>
                                </div>


                                <div class="shopping-total">
                                    <ul>
                                        <li>
                                            <em>Sub total</em>
                                            <strong class="price"><%=total%></strong>
                                        </li>
                                        <li>
                                            <em>Shipping cost</em>
                                            <strong class="price"><span>$</span><%= ship%></strong>
                                        </li>

                                        <li class="shopping-total-price">
                                            <em>Total</em>
                                            <strong class="price"><span>$</span><%= total + ship%></strong>
                                        </li>


                                    </ul>
                                </div>
                                <%
                                    }

                                %>

                            </div>
                            <button class="btn btn-default" type="submit" ><a href="index" style="text-decoration: none; color: #FFF;">Continue shopping</a> <i class="fa fa-shopping-cart"></i></button>
                            <button href="#checkoutEmployeeModal" data-toggle="modal" class="btn btn-primary" type="submit">Checkout <i class="fa fa-check"></i></button>
                        </div>
                    </div>
                    <!-- END CONTENT -->
                </div>
                <!-- END SIDEBAR & CONTENT -->

                <!-- add Modal HTML -->
                <div id="checkoutEmployeeModal" class="modal fade">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <form action="checkout" method="post">
                                <div class="modal-header" style="background: #e94d1c; color: #FFF">						
                                    <h4 class="modal-title">Check out</h4>
                                </div>
                                <div class="modal-body">
                                    <div class="form-group">
                                        <div class="form-group">
                                            <label>ID</label>
                                            <input value="${sessionScope.acc.id}" name="idacc" type="text" class="form-control" readonly required>
                                        </div>
                                        <label>Account</label>
                                        <input value="${sessionScope.acc.user}" name="acc" type="text" class="form-control" readonly required>
                                    </div>
                                    <div class="form-group">
                                        <label>Fullname</label>
                                        <input name="name" type="text" class="form-control" required placeholder="Enter your full name">
                                    </div>
                                    <div class="form-group">
                                        <label>Phone</label>
                                        <input name="phone" type="tel" class="form-control" required placeholder="Enter your phone">
                                    </div>
                                    <div class="form-group">
                                        <label >City</label>
                                        <select class="form-control input-sm" id="country" name="city">
                                            <option value=""> --- Please Select --- </option>
                                            <option value="Can Tho">Cần Thơ</option>
                                            <option value="An Giang">An Giang</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Address delivery</label>
                                        <textarea name="address" rows="3" class="form-control" placeholder="Enter your delivery address"></textarea>
                                    </div>


                                    <table class="col-md-12 col-sm-12">
                                        <h3>Bill</h3>
                                        <tr>
                                            <th class="goods-page-name" colspan="2">NAME</th>
                                            <th class="goods-page-quantity" colspan="1">QUANTITY</th>
                                            <th class="goods-page-price" colspan="1">PRICE</th>
                                        </tr>
                                        <%                                            
                                            if (AddCartControl.listcart != null) {
                                                int ship = 30;
                                                double total = 0;
                                        %>
                                        <%
                                            for (int i = 0; i < AddCartControl.listcart.size(); i++) {
                                                Cart cart = AddCartControl.listcart.get(i);

                                                total = total + (cart.getQuantity() * cart.getCid().getPrice());
                                        %>
                                        <tr>
                                            <td class="goods-page-name" colspan="2" ><%=cart.getCid().getName()%></td>
                                            <td class="goods-page-quantity" colspan="1"><%=cart.getQuantity()%></td>
                                            <td class="goods-page-price" colspan="1"><%=cart.getCid().getPrice()%></td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </table>

                                    <table class="col-md-12 col-sm-12">
                                        <tr>
                                            <th class="goods-page-name" colspan="2">TOTAL</th>
                                            <th class="goods-page-quantity" colspan="1"></th>
                                            <th class="goods-page-price" colspan="1"><%= total%></th>
                                        </tr>
                                        <tr>
                                            <th class="goods-page-name" colspan="2">SHIP</th>
                                            <th class="goods-page-quantity" colspan="1"></th>
                                            <th class="goods-page-price" colspan="1"><%= ship%></th>
                                        </tr>
                                        <tr>
                                            <th class="goods-page-name" colspan="2">TOTAL</th>
                                            <th class="goods-page-quantity" colspan="1"></th>
                                            <th class="goods-page-price" colspan="1"><%= total + ship%></th>
                                        </tr>

                                    </table>

                                    <%
                                        }
                                    %>

                                </div>

                                <div class="modal-footer">
                                    <input type="button" class="btn btn-close" data-dismiss="modal" value="Cancel">
                                    <a href="checkout"><input type="submit" class="btn btn-primary" value="Checkout"></a>
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
