<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Illegal Course</TITLE></HEAD>
<BODY>
<H1 align="center">Illegal Section</H1>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
The section
<bean:write name="userFormBean" property="section" scope="request"/>
was not written properly.
Here is a possible section:
<bean:write name="suggestionBean" property="section"/>
<P>
Please <A HREF="register.jsp">try again</A>.
</BODY></HTML>