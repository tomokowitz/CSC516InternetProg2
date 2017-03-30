<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<html>
  <head>
    <title>ex8</title>
  </head> 
  <body>
    <jsp:useBean id="inFile" class="ReadFileBean">
      <jsp:setProperty name="inFile"  property="file"
          value="data.txt"
      />
    </jsp:useBean>
    <jsp:useBean id="person" scope="request"
               class="PersonInfo">
    </jsp:useBean>
    <table border="2">
    <tr>
      <th>Name</th><th>Email</th><th>Phone</th><th>Bet</th>
      <th>Number</th>
    </tr>
    <c:forEach items="${inFile.data}" var="line">
      <c:set target="${person}" property="all"
             value="${line}" />
      <tr>
        <td>
          <c:out value="${person.name}" />
        </td>
        <td>
          <c:out value="${person.email}" />
        </td>
        <td>
          <c:out value="${person.phone}" />
        </td>
        <td>
          <fmt:formatNumber type="currency" 
             value="${person.bet}"
             minFractionDigits="2"
             maxFractionDigits="2"/>
        </td>
        <td>
          <fmt:formatNumber type="number" 
             value="${person.number}"
             maxIntegerDigits="3"
             minIntegerDigits="3" />
        </td>
      </tr>
      <c:set var="totalBet" 
             value="${totalBet + person.bet }" />
    </c:forEach>
    </table>
    <h2>Total bet: 
      <fmt:formatNumber type="currency" 
             value="${totalBet}"
             minFractionDigits="2"
             maxFractionDigits="2"/>
    </h2>
  </body>
</html>
