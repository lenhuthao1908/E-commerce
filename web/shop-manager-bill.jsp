<%-- 
    Document   : shop-manager-bill
    Created on : Mar 25, 2023, 1:36:20 PM
    Author     : nhuth
--%>

<%@page import="entity.Product"%>
<%@page import="entity.BillDetail"%>
<%@page import="java.util.List"%>
<%@page import="entity.Bill"%>
<%@page import="dao.DAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title>Manager Bill | NF-Shop</title>

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
        <style>  
            td {  
                font-weight: 600;  
            }  

        </style>
        <style>
            .border-top-primary{
                border-top: #e94d1c solid 2px;
            }

            .text-color-primary{
                color: #e94d1c;
            }
            
            .table-container-mh800{
                max-height: 400px; /* Chiều cao tối đa của bảng */
                overflow: auto; /* Hiển thị thanh cuộn khi bảng vượt quá kích thước đã định */
            }
        </style>
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
                            <h1>Manager Bill</h1>
                            <div class="goods-page">
                                <div class="goods-data clearfix border-top-primary">
                                    <div class="table-wrapper-responsive table-container-mh800">
                                        <table summary="Manager Bill">
                                                <tr>
                                                    <th class=""><strong>id</strong></th>
                                                    <th class=""><strong>name</strong></th>
                                                    <th class=""><strong>phone</strong></th>
                                                    <th class=""><strong>address</strong></th>
                                                    <th class=""><strong>Date</strong></th>
                                                    <th class=""><strong>Desbill</strong></th>
                                                    <th class="text-color-primary"><strong>Total</strong></th>
                                                    <th class=""><strong>Status</strong></th>
                                                    <th class="" colspan=""><strong>Update</strong></th>
                                                </tr>

                                        <%
                                            DAO dao = new DAO();
                                            List<Bill> list = dao.getAllOrderBill();

                                            for (int i = list.size() - 1; i >= 0; i--) {
                                                Bill bill = list.get(i);
                                                List<BillDetail> detail = dao.getBillDetailById(bill.getBill_id());

                                        %>
                                            <tr style="background: #FFF9EE">
                                                <td style="font-weight: 1000; font-size: 20px"><%= bill.getAcc_id()%></td>
                                                <td><%= bill.getFullname()%></td>
                                                <td><%= bill.getPhone1()%> <br> <%= bill.getPhone2()%></td>
                                                <td><%= bill.getCity()%> <br> <%= bill.getDistrict()%> <br> <%= bill.getWard()%></td>
                                                <td class=""><%= bill.getDate()%></td>
                                                <td class="goods-page-description"><%= bill.getDesbill()%></td>
                                                <td class="text-color-primary"><%= bill.getTotal()%></td>
                                                <td>
                                                    <%
                                                        if (bill.getStatus() == 0) {
                                                    %>
                                                    <p style="color: black">Cancel order</p>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (bill.getStatus() == 1) {
                                                    %>
                                                    <p style="color: red">Processing</p>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (bill.getStatus() == 2) {
                                                    %>
                                                    <p style="color: blue">Delivery</p>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (bill.getStatus() == 3) {
                                                    %>
                                                    <p style="color: lime">Successful Delivery</p>
                                                    <%
                                                        }
                                                    %>
                                                </td>
                                                <td class="edit-goods-col">
                                                    <a href="loadbill?bill=<%= bill.getBill_id()%>"  class="uploader" data-toggle="modal"><i class="fa fa-repeat"></i></a>
                                                </td> 
                                            </tr>
                                        <%
                                            for (int j = 0; j < detail.size(); j++) {
                                                BillDetail b = detail.get(j);
                                                Product p = dao.getProductByID(Integer.toString(b.getPid()));
                                        %>
                                            <tr style="background: #fcfcfc">
                                                <td class="goods-page-image" colspan="1">
                                                    <img src="image/<%= p.getImage()%>" alt="Product image">
                                                </td>
                                                <td colspan="12"> 
                                                    <strong>ID Product:</strong> <%= p.getId()%> <br>
                                                    <strong style="color: green">Name Product:</strong> <%= p.getName()%> <br>
                                                    <strong class="text-primary">Quantity:</strong> <%= b.getQuantity()%> <br>
                                                    <strong class="text-color-primary">Price:</strong> <%= p.getPrice()%> VND
                                                </td>
                                            </tr>
                                        <%
                                            }
                                        %>    
                                        <%
                                            }

                                        %>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--                    <div class="col-md-8 col-sm-8 pull-right">
                    <c:forEach begin="1" end="10" var="i">
                        <ul class="pagination">
                            <li><a style="font-weight: 900;" href="index?page=${i}">${i}</a></li>
                        </ul>
                    </c:forEach>

                </div>-->
                    <!-- END CONTENT -->
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

