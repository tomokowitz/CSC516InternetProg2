<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Success</TITLE></HEAD>
<BODY>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<H1 align="center">These are the CRNs you wish to register for, 
<bean:write name="data" scope="session" property="firstName"/>
 <bean:write name="data" scope="session" property="lastName"/>
</H1>
<P>
<form action="goAhead.do">
<bean:write name="data" scope="session" property="table" filter="false"/>
<P>Choose next action:
<BR><input type="radio" name="choice" value="delete" checked="checked">
Delete selected classes.
<BR><input type="radio" name="choice" value="register" >
Choose another class.
<BR><input type="radio" name="choice" value="complete" >
Complete registration.
<BR><input type="submit" value="Go">
</form>
</BODY></HTML>