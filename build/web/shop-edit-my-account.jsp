<%-- 
    Document   : shop-edit-my-account
    Created on : Apr 20, 2023, 4:53:28 PM
    Author     : nhuth
--%>

<%-- 
    Document   : shop-account
    Created on : Feb 2, 2023, 4:27:10 AM
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
                                <li class="list-group-item clearfix"><a href="shop-mybill.jsp"><i class="fa fa-angle-right"></i> My Bill</a></li>

                            </ul>
                        </div>
                        <!-- END SIDEBAR -->

                        <!-- BEGIN CONTENT -->
                        <div class="col-md-9 col-sm-7">
                            <div class="content-page">
                                <form action="editmyaccount" method="post">
                                    <div class="modal-header" style="background: #e94d1c; color: #FFF">						
                                        <h4 class="modal-title">Edit My Account</h4>
                                    </div>
                                    <div class="modal-body">
                                        <div class="form-group">
                                            <label>ID</label>
                                            <input value="${acc.id}" name="id" type="text" class="form-control" readonly required>
                                    </div>
                                    <div class="form-group">
                                        <label>Username</label>
                                        <input value="${acc.user}" name="user" type="text" class="form-control" readonly required>
                                    </div>
                                    <div class="form-group">
                                        <label>Fullname</label>
                                        <input value="${acc.fullname}" name="fullname" type="text" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Phone</label>
                                        <input value="${acc.phone}" name="phone" type="tel" class="form-control" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Email</label>
                                        <input value="${acc.email}" name="email" type="email" class="form-control" required>
                                    </div>
                                    
                                    <div class="form-group">
                                        <select class="form-group" id="city" name="city">
                                            <option class="form-control" value="${acc.city}" selected>${acc.city}</option>           
                                        </select>
                                        <br>
                                        <select class="form-group" id="district" name="district">
                                            <option class="form-control" value="${acc.district}" selected>${acc.district}</option>
                                        </select>
                                        <br>
                                        <select class="form-group" id="ward" name="ward">
                                            <option class="form-control" value="${acc.ward}" selected>${acc.ward}</option>
                                        </select>
                                    </div> 
                                </div>
                                <div class="modal-footer">
                                    <a href="shop-account.jsp"><input type="button" class="btn btn-close" data-dismiss="modal" value="Cancel"></a>
                                    <input type="submit" class="btn btn-primary" value="Change">
                                </div>
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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js"></script>
        <script>
            var citis = document.getElementById("city");
            var districts = document.getElementById("district");
            var wards = document.getElementById("ward");
            var Parameter = {
                url: "https://raw.githubusercontent.com/kenzouno1/DiaGioiHanhChinhVN/master/data.json",
                method: "GET",
                responseType: "application/json",
            };
            var promise = axios(Parameter);
            promise.then(function (result) {
                renderCity(result.data);
            });

            function renderCity(data) {
                for (const x of data) {
                    var opt = document.createElement('option');
                    opt.value = x.Name;
                    opt.text = x.Name;
                    opt.setAttribute('data-id', x.Id);
                    citis.options.add(opt);
                }
                citis.onchange = function () {
                    district.length = 1;
                    ward.length = 1;
                    if (this.options[this.selectedIndex].dataset.id != "") {
                        const result = data.filter(n => n.Id === this.options[this.selectedIndex].dataset.id);

                        for (const k of result[0].Districts) {
                            var opt = document.createElement('option');
                            opt.value = k.Name;
                            opt.text = k.Name;
                            opt.setAttribute('data-id', k.Id);
                            district.options.add(opt);
                        }
                    }
                };
                district.onchange = function () {
                    ward.length = 1;
                    const dataCity = data.filter((n) => n.Id === citis.options[citis.selectedIndex].dataset.id);
                    if (this.options[this.selectedIndex].dataset.id != "") {
                        const dataWards = dataCity[0].Districts.filter(n => n.Id === this.options[this.selectedIndex].dataset.id)[0].Wards;

                        for (const w of dataWards) {
                            var opt = document.createElement('option');
                            opt.value = w.Name;
                            opt.text = w.Name;
                            opt.setAttribute('data-id', w.Id);
                            wards.options.add(opt);
                        }
                    }
                };
            }
        </script>
        <!-- END PAGE LEVEL JAVASCRIPTS -->
    </body>
    <!-- END BODY -->
</html>