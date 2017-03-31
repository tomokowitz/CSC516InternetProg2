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
  
    <jsp:setProperty name="myCakes" property="custName"
    value='<%= request.getParameter("custName") %>'/>
    
    <jsp:setProperty name="myCakes" property="cakes_sold"
    value='<%= request.getParameter("cakesSold") %>' />
    Customer:
    <c:out value="${myCakes.custName}" />
    <jsp:getProperty name="myCakes" property="custName" />
  <P> # of cakes sold:
    <jsp:getProperty name="myCakes" property="cakes_sold" />
  <P> Delivery fee:
    <jsp:getProperty name="myCakes" property="delivery_fee" />
    <P> _______________________
    <P> Total:
    <jsp:getProperty name="myCakes" property="total"/>
  </body>
</html>