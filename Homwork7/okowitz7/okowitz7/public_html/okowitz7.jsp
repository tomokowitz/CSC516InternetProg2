<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz7</title>
  </head>
  <body>
   <jsp:useBean id="myCakes" class="okowitz7" >
        
        
        <jsp:setProperty name="myCakes" property="*" />
    </jsp:useBean>
    <jsp:useBean id="myOrders" scope="application" class="okowitz8" >
        <jsp:setProperty name="myOrders" property="*" />
    </jsp:useBean>
    
    <c:set target="${myCakes}" value="${param.custName}"
           property="custName"/>
    <c:set target="${myCakes}" value="${param.cakes_sold}"
           property="cakes_sold"/>
    <c:set target="${myOrders}" value="${myCakes}" // bug here tvo 23 apr 2017
           property="order"/>
    
    
    
    <c:set var="deliver_fee" value="0"/>
    
    <c:set var="cakes_price" value="${myCakes.cakes_sold * 12 }" />

    
  <P> # of cakes sold:
    <c:set var="sold" value="${myCakes.cakes_sold}" />
    <c:if test="${ empty myCakes.cakes_sold}">
        <c:set var="sold" value="Cakes Sold parameter is blank." />
    </c:if>
    <c:out value="${ sold }" />
    
  <P> Delivery fee:
    <c:set var="deliver_fee" value="${myCakes.cakes_sold * 2}"/>
    <c:out value ="${deliver_fee}"  />
    <P> _______________________
    <P> Total: 
    $<c:out value="${ cakes_price + deliver_fee  }"/>
  </body>
</html>