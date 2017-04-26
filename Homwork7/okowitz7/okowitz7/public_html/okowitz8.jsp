<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz8</title>
  </head>
  <body>
  <jsp:useBean id="myOrders" scope="application" class="okowitz8" >
        <jsp:setProperty name="myOrders" property="*" />
    </jsp:useBean>
  <jsp:useBean id="myCake" scope="request"
               class="okowitz7">
    </jsp:useBean>
    
    
    <c:set var="cakeList" value="${myOrders.all}" />
    <table border="2">
    <tr>
      <th>Customer Name</th><th>Cakes Sold</th><th>Total</th><th>Number</th>
    </tr>
    <c:forEach begin="0" end="${myOrders.orderCount - 1}"
               var="i">
      <tr>
        <td>
          <c:out value="${cakeList[i].custname}" />
        </td>
        <td>
          <c:out value="${cakeList[i].cakessold}" />
        </td>
        <td>
          <c:out value="${cakeList[i].del_fee}" />
        </td>
        <td>
          <c:out value="${cakeList[i].total}" />
        </td>
        
      </tr>
      
    </c:forEach>
    </table>
  </body>
</html>