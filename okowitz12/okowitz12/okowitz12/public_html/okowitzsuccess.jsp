<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitzsuccess</title>
    <style type="text/css">
      body {
      background-color: #ffde73; 
}
    </style>
  </head>
  <body>
  <%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
  <H1 align="center">
  You have successfully entered the following order:
</H1> 

           
 <table BORDER="1">
            <TR>
                <TH>ORDER ID</TH>
                <TH>ORDER DATE</TH>
                <TH>ORDER LOCATION</TH>
                <TH>CUSTOMER ID</TH>
            </TR>
            <TR>
           
           <TD><bean:write name="data" property="orderid"/></TD>
           <TD><bean:write name="data" property=""/></TD>
           <TD><bean:write name="data" property="location"/></TD>
           <TD><bean:write name="data" property="customerid"/></TD>
           </TR>
        </table>
 
  </body>
</html>