<%-- 
    Document   : shop-product-new
    Created on : Feb 4, 2023, 4:14:28 AM
    Author     : nhuth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>NEW PRODUCT</h2>
<c:forEach items="${p3l}" var="o">
    <div class="item">
        <a href=""><img src="image/${o.image}" alt="Some Shoes in Animal with Cut Out"></a>
        <h3><a href="detail?pid=${o.id}">${o.name}</a></h3>
        <div class="price">${o.price}</div>
    </div>
</c:forEach>
