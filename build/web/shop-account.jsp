<%-- 
    Document   : shop-account
    Created on : Feb 2, 2023, 4:27:10 AM
    Author     : nhuth
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Account"%>
<%@page import="dao.DAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title>My Account | NF-Shop</title>

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
                                <li class="list-group-item clearfix active"><a href="shop-account.jsp"><i class="fa fa-angle-right"></i> My account</a></li>
                                <li class="list-group-item clearfix"><a href="shop-mychangepassword.jsp"><i class="fa fa-angle-right"></i> Restore Password</a></li>
                                <c:if test="${sessionScope.acc.isAdmin != 1 }">
                                    <c:if test="${sessionScope.acc.isSell != 1 }">
                                    <li class="list-group-item clearfix"><a href="shop-mybill.jsp"><i class="fa fa-angle-right"></i> My Bill</a></li>
                                    </c:if>
                                </c:if>

                        </ul>
                    </div>
                    <!-- END SIDEBAR -->

                    <!-- BEGIN CONTENT -->
                    <div class="col-md-9 col-sm-7">
                        <div class="content-page">
                            <form action="" method="post">
                                <div class="modal-header" style="background: #e94d1c; color: #FFF">						
                                    <h4 class="modal-title">My Account Page</h4>
                                </div>
                                <%
                                    Account a = (Account) session.getAttribute("acc");
                                    DAO dao = new DAO();
                                    Account acc = dao.getAccountByID(Integer.toString(a.getId()));
                                %>
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label>ID</label>
                                        <p><%= acc.getId() %></p>

                                    </div>
                                    <div class="form-group">
                                        <label>Username</label>
                                        <p><%= acc.getUser()%></p>
                                    </div>
                                    <div class="form-group">
                                        <label>Fullname</label>
                                        <p><%= acc.getFullname()%></p>
                                    </div>
                                    <div class="form-group">
                                        <label>Phone</label>
                                        <p><%= acc.getPhone()%></p>
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <p><%= acc.getEmail()%></p>
                                    </div>
                                    <div class="form-group">
                                        <label>Address</label>
                                        <p><%= acc.getWard()%> / <%= acc.getDistrict()%> / <%= acc.getCity()%></p>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button class="btn btn-primary"><a href="loadmyaccount?aid=<%= acc.getId() %>" style="color: #FFF; text-decoration: none;">Edit Account</a></button>
                                </div>
                                <%
                                %>
                            </form>

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