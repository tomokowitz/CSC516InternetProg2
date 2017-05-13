<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title><bean:message key="form.title" /></title>
  </head>
  <body>
  <form action="okowitz12.do" method="POST">
    <bean:message key="form.orderidprompt" />
        <input type="text" name="orderid"/>
  <br> <bean:message key="form.ordernameprompt" />
        <input type="text" name="ordername"/>
  <br> <bean:message key="form.orderlocationprompt" />
        <input type="text" name="orderlocation"/>
  <br> <bean:message key="form.custidprompt" />
        <input type="text" name="customerid"/>
        
        <input type="submit" value=<bean:message key="form.submitprompt" />/>
  
  </form>
  </body>
</html>