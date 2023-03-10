<%-- 
    Document   : shop-login-and-signup
    Created on : Feb 4, 2023, 5:23:16 PM
    Author     : nhuth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <!--<![endif]-->

    <!-- Head BEGIN -->
    <head>
        <meta charset="utf-8">
        <title>Login</title>

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

        <link rel="stylesheet" href="assets/pages/css/LoginCSS.css">
        <!-- Theme styles END -->
    </head>
    <!-- Head END -->
    <body>
        <div class="container">
            <input type="checkbox" id="check">
            <div class="login form">
                <header>Login</header>
                <form action="login" method="post">
                    <input name="user" type="text" placeholder="Enter your account">
                    <input name="pass" type="password" placeholder="Enter your password">
                    <div class="text-danger" style="font-size: 16px;">
                        <p><b>${messDanger}</b></p>
                    </div>
                    <a href="#">Forgot password?</a>
                    <input type="submit" class="button" value="Login">
                </form>
                <div class="signup">
                    <span class="signup">Don't have an account?
                        <label for="check">Signup</label>
                    </span>
                </div>
            </div>
            <div class="registration form">
                <header>Signup</header>
                <form action="signup" method="post">
                    <input name="user" type="text" placeholder="Enter your account">
                    <input name="pass" type="password" placeholder="Create a password">
                    <input name="repass" type="password" placeholder="Confirm your password">
                    <input name="fullname" type="text" placeholder="Enter your fullname">
                    <input name="phone" type="tel" placeholder="Enter your phone">
                    <input name="address" type="text" placeholder="Enter your fullname">
                    <input type="submit" class="button" value="Signup">
                </form>
                <div class="signup">
                    <span class="signup">Already have an account?
                        <label for="check">Login</label>
                    </span>
                </div>
            </div>
        </div>
    </body>
</html>
