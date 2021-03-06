<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/xml" prefix="x"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz10b</title>
  </head>
  <body>
 <h1>Information about
        <c:out value="${param.customer}" />
    </h1>
  <c:import var="xmlFile" url="hw10.xml" />
    <x:parse var="myDoc" xml="${xmlFile}" />
    
        <x:choose>
            <x:when select="$myDoc/DATA/CUSTOMERS/Customer[CustLastName=$param:customer]">
                <x:set select="$myDoc/DATA/CUSTOMERS/Customer[CustLastName=$param:customer]"
                var="customer" />
               
                    <table border="2">
                        <tr><th>CustNo</th><th>CustFirstName</th><th>CustLastName</th>
                        <th>CustStreet</th><th>CustCity</th><th>CustState</th>
                        <th>CustZip</th><th>CustBal</th></tr>
                     
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
                     
                    </table>
            </x:when>
        </x:choose>
  </body>
</html>
  
  
  
