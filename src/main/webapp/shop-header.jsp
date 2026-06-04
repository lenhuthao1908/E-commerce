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
                    <!--                    <li class="dropdown dropdown-megamenu">
                                            <a class="dropdown-toggle"  href="index">
                                                PRODUCT
                                            </a>
                                        </li>-->
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

        <c:if test="${sessionScope.acc.isAdmin != 1 }">
            <c:if test="${sessionScope.acc.isSell != 1 }">
                <a class="site-logo" href="home"><img src="assets/corporate/img/logos/NF--SHOP.png" alt="NF--Shop UI" > </a>
                </c:if>
            </c:if>

        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>


        <%
            int count = AddCartControl.listcart.size();
        %>
        <!-- BEGIN CART -->
        <c:if test="${sessionScope.acc.isAdmin != 1 }">
            <c:if test="${sessionScope.acc.isSell != 1 }">
                <div class="top-cart-block">
                    <div class="top-cart-info">
                        <a href="shop-shopping-cart.jsp" class="top-cart-info-count"> <%= count%> items</a>
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
                                    <em><%= cart.getCid().getPrice() * cart.getQuantity()%></em>
                                </li>
                                <%
                                    }
                                %>

                            </ul>

                        </div>
                    </div>

                </div>
            </c:if>
        </c:if>
        <!--END CART -->
        <%
        %>


        <!-- BEGIN NAVIGATION -->
        <div class="header-navigation" >
            <ul>

                <c:if test="${sessionScope.acc.isAdmin != 1 or sessionScope.acc.isSell != 1}">
                    <li class="dropdown dropdown100 nav-catalogue">

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
                </c:if>



                    
                <c:if test="${sessionScope.acc.isAdmin == 1 }">
                    <li><a href="manageroverview">Manager Overview</a></li>
                    </c:if>
                <c:if test="${sessionScope.acc.isSell == 1 }">
                    <li><a href="manager">Manager Product</a></li>
                    </c:if>
                    <c:if test="${sessionScope.acc.isAdmin == 1 }">
                    <li><a href="managerorderbill">Manager Bill</a></li>
                    <li><a href="manageracc">Manager Admin</a></li>
                    <li><a href="managercc">Manager Category</a></li>
                    <li><a href="managersize">Manager Size</a></li>
                    </c:if>
            </ul>
        </div>
        <!-- END NAVIGATION -->
    </div>
</div>
<!-- Header END -->
