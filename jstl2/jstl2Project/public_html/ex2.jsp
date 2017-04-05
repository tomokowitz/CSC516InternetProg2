<%--- Page, request, session and application scope variables --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex2</title>
  </head>
  <body> 
    <c:set var="pageName" scope="page"
          value="${param.name}" />
    <c:set var="requestName" scope="request"
          value="${param.name}" />
    <c:if test="${ empty param.email}">
      <c:redirect url="ex4.jsp" >
        <c:param name="msg" value="Missing email!" />
      </c:redirect>
    </c:if>
    <c:if test="${! empty param.name}">
      <jsp:forward page="ex3.jsp">
        <jsp:param name="msg" value="everything ok" />
      </jsp:forward>
    </c:if>
    The name field was missing or empty!
  </body>
</html>
