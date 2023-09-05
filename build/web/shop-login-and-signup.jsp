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
        <title>Login | NF-Shop</title>

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

        <link rel="stylesheet" href="assets/pages/css/LoginCSS.css" type="text/css">
        <!-- Theme styles END -->
        
    </head>
    <!-- Head END -->
    <body>
        <div class="container">
            <input type="checkbox" id="check">
            <div class="login form">
                <header>Login</header>
                <form action="login" method="post">
                    <input style="height: 45px; padding: 0 10px" name="user" type="text" placeholder="Enter your account" required>
                    <input style="height: 45px; padding: 0 10px" name="pass" type="password" placeholder="Enter your password" required>
                    <div class="text-danger" id="close-3s" style="font-size: 16px;">
                        <p><b>${messDanger}</b></p>
                    </div>
                    <a href="shop-forgotpassword.jsp">Forgot password?</a>
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
                    <input style="height: 30px; padding: 0 10px" class="form-control " name="user" type="text" placeholder="Enter your account" required>
                    <input style="height: 30px; padding: 0 10px" class="form-control " name="pass" type="password" placeholder="Create a password" required>
                    <input style="height: 30px; padding: 0 10px" class="form-control " name="repass" type="password" placeholder="Confirm your password" required>
                    <input style="height: 30px; padding: 0 10px" class="form-control " name="fullname" type="text" placeholder="Enter your fullname" required>
                    <input style="height: 30px; padding: 0 10px" class="form-control " name="phone" type="tel" placeholder="Enter your phone" required>
                    <input style="height: 30px; padding: 0 10px" class="form-control " name="email" type="email" placeholder="Enter your Email" required>
                    <div class="form-group">
                        <select class="form-group" id="city" name="city" required>
                            <option class="form-control" value="" selected>Chọn tỉnh thành</option>           
                        </select>
                        <br>
                        <select class="form-group" id="district" name="district" required>
                            <option class="form-control" value="" selected>Chọn quận huyện</option>
                        </select>
                        <br>
                        <select class="form-group" id="ward" name="ward" required>
                            <option class="form-control" value="" selected>Chọn phường xã</option>
                        </select>
                    </div>  
                    <input type="submit" class="button" value="Signup">
                </form>
                <div class="signup">
                    <span class="signup">Already have an account?
                        <label for="check">Login</label>
                    </span>
                </div>
            </div>
        </div>
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
        <script>
            // Lấy đối tượng thẻ div bằng ID
            var div = document.getElementById("close-3s");

            // đặt thời gian chờ 10 giây và sau đó ẩn thẻ div
            setTimeout(function () {
                div.style.display = "none";
            }, 3000);
        </script>

    </body>
</html>
