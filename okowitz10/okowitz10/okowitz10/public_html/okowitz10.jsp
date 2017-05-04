<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<html>
  <head>
    <title>okowitz10</title>
  </head>
  <body>
  <c:import var="xmlFile" url="hw10.xml" />
    <x:parse var="myDoc" xml="${xmlFile}" />
        <table border="2">
            <tr><th>CustNo</th><th>CustFirstName</th><th>CustLastName</th>
            <th>CustStreet</th><th>CustCity</th><th>CustState</th>
            <th>CustZip</th><th>CustBal</th></tr>
            <x:forEach select="$myDoc/DATA/CUSTOMERS/Customer"
                       var="customer">
              <tr>
                <td><x:out select="$customer/CustNo" /></td>
                <td><x:out select="$customer/CustFirstName" /></td>
                <td><x:out select="$customer/CustLastName" /></td>
                <td><x:out select="$customer/CustStreet" /></td>
                <td><x:out select="$customer/CustCity" /></td>
                <td><x:out select="$customer/CustStatee" /></td>
                <td><x:out select="$customer/CustZip" /></td>
                <td><x:out select="$customer/CustBal" /></td>
                
              </tr>
            </x:forEach>
            
        </table>
  </body>
</html>