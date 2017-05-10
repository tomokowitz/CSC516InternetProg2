<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Illegal Course</TITLE></HEAD>
<BODY>
<H1 align="center">Illegal Course</H1>
<%@ taglib uri="/WEB-INF/struts-bean.tld"
        prefix="bean" %>
The course you entered
<bean:write name="userFormBean" property="course" scope="request"/>
was not written properly.
Here is a possible legal course name:
<bean:write name="suggestionBean" property="course"/>
<P>
Please <A HREF="register.jsp">try again</A>.
</BODY></HTML>