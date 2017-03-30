<%-- Another example of c tag library --%>
<%-- Using paramValues map --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex4</title>
  </head>
  <body>
  <h1>Getting parameter data</h1>
  <table>
  <tr>
    <th>Header</th><th>Value</th>
  </tr>
  <c:forEach items="${paramValues}" var="p">
    <tr>
      <td><c:out value="${p.key}" /></td>
      <td><c:out value="${param[p.key]}" /></td>
    </tr>
  </c:forEach>
  </table>
  </body>
</html>
