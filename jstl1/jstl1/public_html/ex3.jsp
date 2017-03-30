<%-- Second example of c tag library --%>
<%-- Using param implicit variable --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex3</title>
  </head>
  <body>
  <h1>Getting parameter data</h1>
  You chose the 
    <c:out value="${param.favorite}" />
  <P>
  <img width=200
       height=200
       src="<c:out value="${param.favorite}" />.jpg">
  </body>
</html>
