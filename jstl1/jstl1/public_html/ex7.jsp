<%-- Another example of c tag library --%>
<%-- Calculate the value of the order --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<HTML>
<body>
<c:set var="jacket_cost" value="0" />
<c:if test="${! empty param.product1}">
  <P>Ordered <c:out value="${param.quantity1}"/> 
     Jacket<c:if test="${param.quantity1>1}">s</c:if>
  <c:set var="jacket_cost" value="50" />
</c:if>
<c:set var="hat_cost" value="0" />
<c:if test="${! empty param.product2}">
  <P>Ordered <c:out value="${param.quantity2}"/> 
     Hat<c:if test="${param.quantity2>1}">s</c:if>
  <c:set var="hat_cost" value="10" />
</c:if>
<c:set var="shirt_cost" value="0" />
<c:if test="${! empty param.product3}">
  <P>Ordered <c:out value="${param.quantity3}"/> 
     Shirt<c:if test="${param.quantity3>1}">s</c:if>
  <c:set var="shirt_cost" value="20" />
</c:if>
<P>
<c:choose>
  <c:when test="${param.delivery == 'ups'}">
    Sent by UPS
    <c:set var="delivery_cost" value="5" />
  </c:when>
  <c:when test="${param.delivery == 'firstclass'}">
    Sent by USPS First Class
    <c:set var="delivery_cost" value="4" />
  </c:when>
  <c:when test="${param.delivery == 'fedex'}">
    Sent by Federal Express
    <c:set var="delivery_cost" value="8" />
  </c:when>
</c:choose>
<P>Cost: $<c:out value="${jacket_cost * param.quantity1
                + hat_cost * param.quantity2
                + shirt_cost * param.quantity3
                + delivery_cost}" />
</body>
</HTML>