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
Welcome <bean:write name="data" scope="session" property="firstName"/>
 <bean:write name="data" scope="session" property="lastName"/>

           
 <table BORDER="1">
            <TR>
                <TH>ORDER ID</TH>
                <TH>ORDER DATE</TH>
                <TH>ORDER LOCATION</TH>
                <TH>CUSTOMER ID</TH>
            </TR>
            <TR>
           
           <TD><bean:write name="" property=""/></TD>
           <TD><bean:write name="" property=""/></TD>
           <TD><bean:write name="" property=""/></TD>
           <TD><bean:write name="" property=""/></TD>
           </TR>
        </table>
 
<form action="success.do" method="POST">
  <P>  Enter class: <input type="text" name="course"> </P>
  <P>  Enter section: <input type="text" name="section"> </P>
  <P> <input type="submit" value="Register"> </P>
</form>
  </body>
</html>