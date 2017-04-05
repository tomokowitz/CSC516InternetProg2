<%-- Another example of c tag library --%>
<%-- Using paramValues map --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex5</title>
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
      <td>
      <c:forEach items="${paramValues[p.key]}" var="item">
        <c:out value="${item}" /><br>
      </c:forEach>
      </td>
    </tr>
  </c:forEach>
  </table>
  </body>
</html>
