<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex8a</title>
  </head> 
  <body>
    <jsp:useBean id="inFile" class="ReadFileBean">
      <jsp:setProperty name="inFile"  property="file"
          value="data.txt"
      />
    </jsp:useBean>
    <table border="2">
    <tr>
      <th>Name</th><th>Email</th><th>Phone</th><th>Bet</th>
      <th>Number</th>
    </tr>
    <c:forEach items="${inFile.data}" var="line">
      <tr>
      <c:forTokens items="${line}" var="item" delims=":">
        <td>
            <c:out value="${item}" /> 
        </td>
      </c:forTokens>
      </tr>
    </c:forEach>
    </table>
  </body>
</html>
