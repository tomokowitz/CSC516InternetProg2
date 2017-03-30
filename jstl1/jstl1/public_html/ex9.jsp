<%-- Another example of c tag library --%>
<%-- Calculate the value of the order --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<jsp:useBean id="myData"
 class="Bean9">
  <jsp:setProperty name="myData" property="*" />
</jsp:useBean>
<HTML>
<body>
<c:choose>
<c:when test="${myData.validName}">
  Name: <c:out value="${myData.name}" />
  <P>Email: <c:out value="${myData.email}" />
  <P>Order Date: <c:out value="${myData.orderDate}" />
  <P>Jackets ordered: <c:out value="${myData.quantity1}" />
  <P>Hats ordered: <c:out value="${myData.quantity2}" />
  <P>Shirts ordered: <c:out value="${myData.quantity3}" />
  <P>Delivery method: <c:out value="${myData.delivery}" />
  <P>Delivery cost: <c:out value="${myData.deliveryCost}" />
  <P>
  <P>Cost: $<c:out value="${myData.totalCost}" />
</c:when>
<c:otherwise>
  Name not valid!
</c:otherwise>
</c:choose>
</body>
</HTML>