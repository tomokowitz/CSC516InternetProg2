<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/xml" prefix="x"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz10a</title>
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
                <td><x:out select="$customer/CustState" /></td>
                <td><x:out select="$customer/CustZip" /></td>
                <td><x:out select="$customer/CustBal" /></td>
                
              </tr>
            </x:forEach>
            
        </table>
  </body>
</html>
  
  
  
