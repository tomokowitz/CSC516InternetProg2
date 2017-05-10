<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Success</TITLE></HEAD>
<BODY>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<H1 align="center">You have finished registering, 
<bean:write name="data" scope="session" property="firstName"/>
 <bean:write name="data" scope="session" property="lastName"/>
</H1>
<P>
<bean:write name="data" scope="session" property="results" filter="false"/>
</BODY></HTML>