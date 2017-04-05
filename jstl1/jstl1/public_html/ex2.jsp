<%-- First example of c tag library --%>
<%-- set and out --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex2</title>
  </head>
  <body>
  <h1>Using set and out</h1>
    <c:set var="hello" value="Hello World" />
    <c:out value="${hello}" />
  <P>
  Simple math. 2 + 2 =
    <c:out value="${2+2}" />  
  </body>
</html>
