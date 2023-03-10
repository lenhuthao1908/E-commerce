<%-- 
    Document   : shop-menu
    Created on : Feb 3, 2023, 3:05:13 PM
    Author     : nhuth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="list-group margin-bottom-25 sidebar-menu">
    <c:forEach items="${listCC}" var="o">
         <li class="list-group-item clearfix ${tag == o.cid ? "active" : ""}"><a href="category?cid=${o.cid}"><i class="fa fa-angle-right"></i> ${o.cname}</a></li>
    </c:forEach>
</ul>
