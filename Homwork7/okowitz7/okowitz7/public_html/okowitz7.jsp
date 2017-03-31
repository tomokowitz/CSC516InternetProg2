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
    <c:set var="deliver_fee" value="0"/>
    
   
    Customer:
    <c:out value="${myCakes.custName}" />
    
  <P> # of cakes sold:
    <c:out value="${myCakes.cakes_sold}" />
    
  <P> Delivery fee:
    <c:set var="deliver_fee" value="${myCakes.cakes_sold * 2}"/>
    <c:out value
    <P> _______________________
    <P> Total:
    <jsp:getProperty name="myCakes" property="total"/>
  </body>
</html>