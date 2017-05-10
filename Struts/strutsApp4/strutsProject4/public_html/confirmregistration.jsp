<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Success</TITLE></HEAD>
<BODY>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<H1 align="center">You have registered successfully, 
<bean:write name="data" scope="session" property="firstName"/>
 <bean:write name="data" scope="session" property="lastName"/>
</H1>

<UL>
  <LI>Course: 
<bean:write name="userFormBean" property="course"/>
  <LI>Section: 
<bean:write name="userFormBean" property="section"/>
</UL>
<P>
<form action="choice2.do" method="POST">
    Choose next action:
<BR><input type="radio" name="choice" value="more" checked="checked">
Register for another class.
<BR><input type="radio" name="choice" value="see" checked="checked">
See all classes.
<BR><input type="submit" value="Go">
</form>
</BODY></HTML>