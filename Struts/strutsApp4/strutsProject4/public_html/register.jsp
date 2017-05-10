<HTML> 
<HEAD><TITLE>Success</TITLE></HEAD> 
<BODY> 
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<H1 align="center">
  You have logged on successfully.
</H1> 
Welcome <bean:write name="data" scope="session" property="firstName"/>
 <bean:write name="data" scope="session" property="lastName"/>
<form action="register.do" method="POST">
  <P>  Enter class: <input type="text" name="course"> </P>
  <P>  Enter section: <input type="text" name="section"> </P>
  <P> <input type="submit" value="Register"> </P>
</form>
</BODY>
</HTML>