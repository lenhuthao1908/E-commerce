<%-- 
    Document   : shop-overview
    Created on : Apr 30, 2023, 2:08:52 AM
    Author     : nhuth
--%>

<%@page import="entity.BillDetail"%>
<%@page import="entity.Brand"%>
<%@page import="entity.Category"%>
<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page import="dao.DAO"%>
<%@page import="entity.Account"%>
<%@page import="entity.Account"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title>Manager Overview | NF-Shop</title>

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

        <!-- Custom fonts for this template-->
        <!--        <link href="assets/pages/css/all.min.css" rel="stylesheet" type="text/css">-->
        <!--        <link
                    href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
                    rel="stylesheet">-->

        <!-- Custom styles for this template-->
        <link href="assets/pages/css/sb-admin-2.min.css" rel="stylesheet">
        <style>
            .text14{
                font: 300 14px 'Open Sans', sans-serif;
            }
            .border-top-primary{
                border-top: #e94d1c solid 2px;
            }

            .text-color-primary{
                color: #e94d1c;
            }
            .grid-container {
                display: grid;
                grid-template-columns: repeat(3, 1fr);
                grid-column-gap: 20px;
            }
            .table-container {
                max-height: 130px; /* Chiều cao tối đa của bảng */
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
                            <h1>Manager Information Overview</h1>

                            <div class="col-xl-4 col-md-6 mb-2" style="height: 150px">
                                <div class="card border-top-primary shadow h-100 py-2">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col">
                                                <div class=" font-weight-bold text-color-primary text-uppercase text-center">
                                                    Product
                                                </div>
                                                <div class="text-left">Products: <strong class="mb-0 font-weight-bold text-gray-800">${totalProduct}</strong></div>
                                            <div class="text-left">Sale products: <strong class="mb-0 font-weight-bold text-gray-800">${totalSale}/${totalProduct}</strong></div>
                                            <div class="text-left">Remaining products: <strong class="mb-0 font-weight-bold text-gray-800">${sumQuantity}</strong></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-md-6 mb-2" style="height: 150px">
                            <div class="card border-top-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class=" font-weight-bold text-color-primary text-uppercase text-center">
                                                Category
                                            </div>
                                            <div class="text-left">Category number: <strong class="mb-0 font-weight-bold text-gray-800">${totalCategory}</strong></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-md-6 mb-2" style="height: 150px">
                            <div class="card border-top-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class=" font-weight-bold text-color-primary text-uppercase text-center">
                                                Size
                                            </div>
                                            <div class="text-left">Size number: <strong class="mb-0 font-weight-bold text-gray-800">${totalSize}</strong></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-md-6 mb-2" style="height: 150px">
                            <div class="card border-top-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class=" font-weight-bold text-color-primary text-uppercase text-center">
                                                Bill
                                            </div>
                                            <div class="text-left">Bills: <strong class="mb-0 font-weight-bold text-gray-800">${totalBill}</strong></div>
                                            <div class="text-left">Total bill today: <strong class="mb-0 font-weight-bold text-gray-800">${totalBillToday}</strong></div>
                                            <div class="text-left">Total bill Processing today: <strong class="mb-0 font-weight-bold text-gray-800">${totalBillProcessingToday}</strong></div>
                                            <div class="text-left">Total bill Delivery today: <strong class="mb-0 font-weight-bold text-gray-800">${totalBillDeliveryToday}</strong></div>
                                            <div class="text-left">Total bill Successful Delivery today: <strong class="mb-0 font-weight-bold text-gray-800">${totalBillSuccessfulDeliveryToday}</strong></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-xl-4 col-md-6 mb-2" style="height: 150px">
                            <div class="card border-top-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class=" font-weight-bold text-color-primary text-uppercase text-center">
                                                Account
                                            </div>
                                            <div class="text-left">Employee number: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalAccountEmployee}</strong></div>
                                            <div class="text-left">Customers number: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalAccountCustomers}</strong></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-xl-4 col-md-6 mb-2" style="height: 150px">
                            <div class="card border-top-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col">
                                            <div class=" font-weight-bold text-color-primary text-uppercase text-center">
                                                Profit information
                                            </div>
                                            <div class="text-left">Present: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalMoneyPresent} VND</strong></div>
                                            <div class="text-left">Income present: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalMoneyIncomePresent} VND</strong></div>
                                            <div class="text-left">Income processing today: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalMoneyIncomeProcessingToday} VND</strong></div>
                                            <div class="text-left">Income delivery today: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalMoneyIncomeDeliveryToday} VND</strong></div>
                                            <div class="text-left">Income successful delivery today: <strong class="mb-0 font-weight-bold text-gray-800"> ${totalMoneyIncomeSuccessfulDeliveryToday} VND</strong></div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="grid-container col-md-12 col-sm-12">
                            <div class="goods-page">
                                <div class="goods-data clearfix border-top-primary">
                                    <div class="table-wrapper-responsive table-container">
                                        <table summary="Manager Overview In Year">
                                            <tr>
                                                <th class="text-left" colspan="1"><strong>Date</strong></th>
                                                <th class="text-left text-color-primary" colspan="1"><strong>Total</strong></th>
                                                <th class="text-right text-primary" colspan="1"><strong>Quantity</strong></th>
                                                <th class="" ></th>
                                            </tr>
                                            <%
                                                Account a = (Account) session.getAttribute("acc");
                                                DAO dao = new DAO();
                                                List<BillDetail> list = dao.getAllRevenueAndQuantityInYear();
                                                for (BillDetail item : list) {
                                            %>
                                            <tr>
                                                <td class="text-left" colspan="1">
                                                    <strong><%= item.getYear()%></strong>
                                                </td>
                                                <td class="text-left" colspan="1">
                                                    <strong class="text-color-primary"><%= item.getSubtotal()%></strong>
                                                </td>
                                                <td class="text-right" colspan="1">
                                                    <strong class="text-primary"><%= item.getQuantity()%></strong>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>


                                        </table>

                                    </div>
                                </div>
                            </div>
                            <div class="goods-page">
                                <div class="goods-data clearfix border-top-primary">
                                    <div class="table-wrapper-responsive table-container">
                                        <table summary="Manager Overview In Month">
                                            <tr>
                                                <th class="text-left" colspan="1"><strong>Date</strong></th>
                                                <th class="text-left text-color-primary" colspan="1"><strong>Total</strong></th>
                                                <th class="text-right text-primary" colspan="1"><strong>Quantity</strong></th>
                                                <th class="" ></th>
                                            </tr>
                                            <%
                                                List<BillDetail> list1 = dao.getAllBillDetailInMonth();
                                                for (BillDetail item1 : list1) {
                                            %>
                                            <tr>
                                                <td class="text-left" colspan="1">
                                                    <strong><%= item1.getYear()%>-<%= item1.getMonth()%></strong>
                                                </td>
                                                <td class="text-left" colspan="1">
                                                    <strong class="text-color-primary"><%= item1.getSubtotal()%></strong>
                                                </td>
                                                <td class="text-right" colspan="1">
                                                    <strong class="text-primary"><%= item1.getQuantity()%></strong>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>


                                        </table>

                                    </div>
                                </div>
                            </div>
                            <div class="goods-page">
                                <div class="goods-data clearfix border-top-primary">
                                    <div class="table-wrapper-responsive table-container">
                                        <table summary="Manager Overview In Day">
                                            <tr>
                                                <th class="text-left" colspan="1"><strong>Date</strong></th>
                                                <th class="text-left text-color-primary" colspan="1"><strong>Total</strong></th>
                                                <th class="text-right text-primary" colspan="1"><strong>Quantity</strong></th>
                                                <th class="" ></th>
                                            </tr>
                                            <%
                                                List<BillDetail> list2 = dao.getAllBillDetailInDay();
                                                for (BillDetail item2 : list2) {
                                            %>
                                            <tr>
                                                <td class="text-left" colspan="1">
                                                    <strong><%= item2.getDate()%></strong>
                                                </td>
                                                <td class="text-left" colspan="1">
                                                    <strong class="text-color-primary"><%= item2.getSubtotal()%></strong>
                                                </td>
                                                <td class="text-right" colspan="1">
                                                    <strong class="text-primary"><%= item2.getQuantity()%></strong>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>


                                        </table>

                                    </div>
                                </div>
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

            <!-- Custom scripts for all pages-->
            <script src="assets/pages/scripts/sb-admin-2.min.js"></script>
            <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>

