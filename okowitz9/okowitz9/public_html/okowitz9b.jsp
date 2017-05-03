<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz9b</title>
  </head>
  <body>
  
  <%-- set data source; other attributes are password and user  --%>
    <sql:setDataSource driver="sun.jdbc.odbc.JdbcOdbcDriver"
                       url="jdbc:odbc:bakery" scope="session"   />
                           
         <%--Execute query; result stored in var --%>
    <sql:query 
      sql = "SELECT DISTINCT ORDERID, DATE, LOCATION FROM ORDERS WHERE CUSTOMERID = ?"
     var = "results">
     <%-- use param tag to fill in ? --%>
        <sql:param value="${param.customerid}" />
     </sql:query>
  <c:if test="${ results.rowCount >= 1 }">
        <table BORDER="1">
            <TR>
                <TH>ORDER ID</TH>
                <TH>ORDER DATE</TH>
                <TH>ORDER LOCATION</TH>
                
            </TR>
            <c:forEach var="row" items="${results.rows}" >
                <tr>
                    <td> <c:out value="${row.ORDERID}" /> </td>
                    <td> <c:out value="${row.DATE}" /> </td>
                    <td> <c:out value="${row.LOCATION}" /> </td>
                    
                </tr>
            </c:forEach>
        </table>
    </c:if>
  </body>
</html>