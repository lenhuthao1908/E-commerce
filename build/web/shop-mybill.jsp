<%-- 
    Document   : shop-mybill
    Created on : Mar 26, 2023, 7:40:29 PM
    Author     : nhuth
--%>

<%@page import="entity.Product"%>
<%@page import="entity.BillDetail"%>
<%@page import="entity.Bill"%>
<%@page import="java.util.List"%>
<%@page import="dao.DAO"%>
<%@page import="entity.Account"%>
<%-- 
    Document   : shop-mychangepassword.jsp
    Created on : Mar 26, 2023, 4:52:41 PM
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
        <title>My Bill | NF-Shop</title>

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
        <!-- Page level plugin styles END -->

        <!-- Theme styles START -->
        <link href="assets/pages/css/components.css" rel="stylesheet">
        <link href="assets/corporate/css/style.css" rel="stylesheet">
        <link href="assets/pages/css/style-shop.css" rel="stylesheet" type="text/css">
        <link href="assets/corporate/css/style-responsive.css" rel="stylesheet">
        <link href="assets/corporate/css/themes/red.css" rel="stylesheet" id="style-color">
        <link href="assets/corporate/css/custom.css" rel="stylesheet">
        <style>  
            table, th, td {  
                /*border: 1px solid black;*/  
                /*border-collapse: collapse;*/  
            }  
            th, td {  
                padding: 10px;  
            }
            .font{
                font-weight: 700;
            }
        </style>
        <!-- Theme styles END -->
    </head>
    <!-- Head END -->

    <!-- Body BEGIN -->
    <body class="ecommerce">
        <jsp:include page="shop-header.jsp"></jsp:include>

            <div class="main">
                <div class="container">
                    <ul class="breadcrumb" style="font-weight: 700; font-size: 24px">
                        <li><a href="home">Home</a></li>
                        <li><a href="index">Store</a></li>
                        <li class="active">My Account Page</li>
                    </ul>
                    <!-- BEGIN SIDEBAR & CONTENT -->
                    <div class="row margin-bottom-40">
                        <!-- BEGIN SIDEBAR -->
                        <div class="sidebar col-md-3 col-sm-3" >
                            <ul class="list-group margin-bottom-25 sidebar-menu">
                                <li class="list-group-item clearfix"><a href="shop-account.jsp"><i class="fa fa-angle-right"></i> My account</a></li>
                                <li class="list-group-item clearfix"><a href="shop-mychangepassword.jsp"><i class="fa fa-angle-right"></i> Restore Password</a></li>
                                <li class="list-group-item clearfix active"><a href="shop-mybill.jsp"><i class="fa fa-angle-right"></i> My Bill</a></li>

                        </div>
                        <!-- END SIDEBAR -->

                        <!-- BEGIN CONTENT -->
                        <div class="col-md-9 col-sm-7">
                            <div class="content-page">
                                <table>
                                    <tr style="background: #e94d1c; color: white">
                                        <th class="goods-page-pass" colspan="1"><strong>PHONE</strong></th>
                                        <th class="goods-page-pass" colspan="3"><strong>ADDRESS</strong></th>
                                        <th class="goods-page-pass" colspan="1"><strong>DATE</strong></th>
                                        <th class="goods-page-pass" colspan="2"><strong>DESBILL</strong></th>
                                        <th class="goods-page-pass" colspan="1"><strong>TOTAL</strong></th>
                                        <th class="goods-page-pass" colspan="1"><strong>STATUS</strong></th>
                                    </tr>
                                <%
                                    int ship = 30000;
                                    Account a = (Account) session.getAttribute("acc");
                                    DAO dao = new DAO();
                                    List<Bill> list = dao.getAllOrderBill();
                                    for (int i = list.size() - 1; i >= 0; i--) {
                                        Bill bill = list.get(i);
                                        if (a.getId() == bill.getAcc_id()) {
                                            List<BillDetail> detail = dao.getBillDetailById(bill.getBill_id());
                                %>
                                <tr>
                                    <td colspan="9" style="border-left: none; background: silver;"></td>
                                </tr>
                                <tr style="background: whitesmoke;">
                                    <td class="font" colspan="1"><%= bill.getPhone1()%> <br> <%= bill.getPhone2()%></td>
                                    <td class="font" colspan="3"><%= bill.getCity()%> <br> <%= bill.getDistrict()%> <br> <%= bill.getWard()%></td>
                                    <td class="font" colspan="1"><%= bill.getDate()%></td>
                                    <td class="font" colspan="2"><%= bill.getDesbill()%></td>
                                    <td class="font" colspan="1"><%= bill.getTotal() %></td>
                                    <td class="font" colspan="1">
                                        <%
                                            if (bill.getStatus() == 0) {
                                        %>
                                        Cancel order
                                        <%
                                            }
                                        %>
                                        <%
                                            if (bill.getStatus() == 1) {
                                        %>
                                        Processing
                                        <%
                                            }
                                        %>
                                        <%
                                            if (bill.getStatus() == 2) {
                                        %>
                                        delivery
                                        <%
                                            }
                                        %>
                                        <%
                                            if (bill.getStatus() == 3) {
                                        %>
                                        Successful Delivery
                                        <%
                                            }
                                        %>
                                    </td>
                                </tr>
                                <tr>
                                    <th class="goods-page-stt" colspan="1">STT</th>
                                    <th class="goods-page-image" colspan="2" >IMAGE</th>
                                    <th class="goods-page-id" colspan="1">ID</th>
                                    <th class="goods-page-id" colspan="3">NAME</th>
                                    <th class="goods-page-quantity" colspan="1">QUANTITY</th>
                                    <th class="goods-page-price" colspan="1">PRICE</th>
                                </tr>
                                <%
                                    for (int j = 0; j < detail.size(); j++) {
                                        BillDetail b = detail.get(j);
                                        Product p = dao.getProductByID(Integer.toString(b.getPid()));
                                %>

                                <tr style="">
                                    <td colspan="1"><%= j + 1%></td>
                                    <td class="goods-page-image" colspan="2">
                                        <a href="detail?pid=<%= p.getId()%>"><img src="image/<%= p.getImage()%>" alt="Product image"></a>
                                    </td>
                                    <td colspan="1"><%= p.getId()%></td>
                                    <td colspan="3"><%= p.getName()%></td>
                                    <td colspan="1"><%= b.getQuantity()%></td>
                                    <td colspan="1"><%= p.getPrice()%></td>

                                </tr>
                                <%
                                    }
                                %>    


                                <%
                                        }
                                    }
                                %>
                            </table>
                        </div>
                    </div>
                    <!-- END CONTENT -->
                </div>
                <!-- END SIDEBAR & CONTENT -->
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

        <script src="assets/corporate/scripts/layout.js" type="text/javascript"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {
                Layout.init();
                Layout.initOWL();
                Layout.initTwitter();
            });
        </script>
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>

