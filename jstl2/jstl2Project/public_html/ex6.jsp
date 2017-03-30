<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex6</title>
  </head> 
  <body>
    <jsp:useBean id="people" scope="application"
               class="PeopleBean">
    </jsp:useBean>
    <c:out value="${people.userCount}" /> bets entered. 
    <c:set var="peopleList" value="${people.all}" />
    <c:set var="totalBet" value="0" />
    <table border="2">
    <tr>
      <th>Name</th><th>Email</th><th>Phone</th><th>Bet</th>
      <th>Number</th>
    </tr>
    <c:forEach begin="0" end="${people.userCount - 1}"
               var="i">
      <tr>
        <td>
          <c:out value="${peopleList[i].name}" />
        </td>
        <td>
          <c:out value="${peopleList[i].email}" />
        </td>
        <td>
          <c:out value="${peopleList[i].phone}" />
        </td>
        <td>
          <c:out value="${peopleList[i].bet}" />
        </td>
          <td>
          <c:out value="${peopleList[i].number}" />
        </td>
      </tr>
      <c:set var="totalBet" 
             value="${totalBet + peopleList[i].bet }" />
    </c:forEach>
    </table>
    <h2>Total bet: <c:out value="${totalBet}" />
  </body>
</html>
