
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
   
    <title>okowitz7</title>
  </head>
  <body>
  
  <jsp:useBean id="myOrders" scope="application" class="okowitz8" >
    </jsp:useBean>
   <jsp:useBean id="order" scope="request" class="okowitz7"  >
    </jsp:useBean>

    <c:set target="${order}" value="${param.custname}"
           property="custname"/>
    <c:set target="${order}" value="${param.cakessold}"
           property="cakessold"/>
    <c:set target="${myOrders}" value="${order}" 
           property="order"/>  
    
    <c:set var="delfee" value="0"/>
    <c:set var="cakes_price" value="${order.cakessold * 12 }" />
    
  <P> # of cakes sold:
    <c:set var="sold" value="${order.cakessold}" />
    <c:if test="${ empty order.cakessold}">
        <c:set var="sold" value="Cakes Sold parameter is blank." />
    </c:if>
    <c:out value="${ sold }" />
    
  <P> Delivery fee:
    <c:set var="delfee" value="${order.delfee}"/>
    <c:out value ="${delfee}"  />
    <P> _______________________
    <P> Total: 
    $<c:out value="${ cakes_price + delfee  }"/>
  </body>
</html>