<%-- 
    Document   : shop-header
    Created on : Feb 2, 2023, 4:52:29 AM
    Author     : nhuth
--%>

<%@page import="entity.Cart"%>
<%@page import="control.AddCartControl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!-- BEGIN TOP BAR -->
<div class="pre-header">
    <div class="container">
        <div class="row">
            <!-- BEGIN TOP BAR LEFT PART -->
            <div class="col-md-6 col-sm-6 additional-shop-info">
                <ul class="list-unstyled list-inline">
                    <li><i class="fa fa-phone"></i><span>+6 339 9528</span></li>

                </ul>
            </div>
            <!-- END TOP BAR LEFT PART -->
            <!-- BEGIN TOP BAR MENU -->
            <div class="col-md-5 col-sm-5 additional-nav">
                <ul class="list-unstyled list-inline pull-right">
                    <c:if test="${sessionScope.acc != null}">
                        <li><a href="shop-account.jsp"><i class="fa fa-user"></i>${sessionScope.acc.user}</a></li>
                        <li><a href="logout">LOGOUT</a></li>
                            </c:if>
                            <c:if test="${sessionScope.acc == null}">
                        <li><a href="shop-login-and-signup.jsp">LOGIN</a></li>
                        </c:if>

                </ul>
            </div>
            <!-- END TOP BAR MENU -->
        </div>
    </div>        
</div>
<!-- END TOP BAR -->

<!-- BEGIN HEADER -->
<div class="header">
    <div class="container">
        <a class="site-logo" href="home"><img src="assets/corporate/img/logos/logo-shop-red.png" alt="Metronic Shop UI"></a>

        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>


        <%
            int count = AddCartControl.listcart.size();
        %>
        <!-- BEGIN CART -->
        <div class="top-cart-block">
            <div class="top-cart-info">
                <a href="shop-shopping-cart.jsp" class="top-cart-info-count"> <%= count  %> items</a>
            </div>
            <i class="fa fa-shopping-cart"></i>

            <div class="top-cart-content-wrapper">
                <div class="top-cart-content">
                    <ul class="scroller" style="height: 200px ">

                        <%
                            for (int i = 0; i < AddCartControl.listcart.size(); i++) {
                                Cart cart = AddCartControl.listcart.get(i);
                        %>
                        <li>
                            <a href="detail?pid=<%=cart.getCid().getId()%>"><img src="image/<%=cart.getCid().getImage()%>" width="37" height="34"></a>
                            <span class="cart-content-count">x<%=cart.getQuantity()%></span>
                            <strong><a href="detail?pid=<%=cart.getCid().getId()%>"><%=cart.getCid().getName()%></a></strong>
                            <em><%= cart.getCid().getPrice()*cart.getQuantity()%></em>
                        </li>
                        <%
                            }
                        %>

                    </ul>
<!--                    <div class="text-right">
                        <a href="shop-shopping-cart.jsp" class="btn btn-default">View Cart</a>
                        <a href="shop-checkout.jsp" class="btn btn-primary">Checkout</a>
                    </div>-->
                </div>
            </div>

        </div>
        <!--END CART -->
        <%
        %>


        <!-- BEGIN NAVIGATION -->
        <div class="header-navigation">
            <ul>
                <li class="dropdown">
                    <a class="dropdown-toggle"  href="home">
                        HOME   
                    </a>
                </li>
                <li class="dropdown dropdown-megamenu">
                    <a class="dropdown-toggle"  href="index">
                        PRODUCT
                    </a>
                </li>
                <li class="dropdown dropdown100 nav-catalogue">
                    <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="javascript:;">
                        SALE PRODUCT
                    </a>
                    <ul class="dropdown-menu">
                        <li>
                            <div class="header-navigation-content">
                                <div class="row">
                                    <c:forEach items="${p4l}" var="o">
                                        <div class="col-md-3 col-sm-4 col-xs-6">
                                            <div class="product-item">
                                                <div class="pi-img-wrapper">
                                                    <a href=""><img src="image/${o.image}" style="width: 200px; height: 250px;" class="img-responsive" alt="Berry Lace Dress"></a>
                                                </div>
                                                <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
                                                <div class="pi-price">${o.price}</div>
                                                <a href="detail?pid=${o.id}" class="btn btn-default add2cart">Detail</a>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </li>
                    </ul>
                </li>



                <c:if test="${sessionScope.acc.isSell == 1 }">
                    <li><a href="manager">Manager Product</a></li>

                </c:if>
                <c:if test="${sessionScope.acc.isAdmin == 1 }">
                    <li><a href="manageracc">Manager Admin</a></li>
                    <li><a href="managercc">Manager Category</a></li>
                    </c:if>

                <!-- BEGIN TOP SEARCH
                <li class="menu-search">
                  <span class="sep"></span>
                  <i class="fa fa-search search-btn"></i>
                  <div class="search-box">
                      <form action="search" method="post">
                      <div class="input-group">
                          <input name="txt "type="text" placeholder="Search" class="form-control">
                        <span class="input-group-btn">
                          <button class="btn btn-primary" type="submit">Search</button>
                        </span>
                      </div>
                    </form>
                  </div> 
                </li>
                END TOP SEARCH -->
            </ul>
        </div>
        <!-- END NAVIGATION -->
    </div>
</div>
<!-- Header END -->
