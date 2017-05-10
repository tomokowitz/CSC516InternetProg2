<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Not exists</TITLE></HEAD>
<BODY>
<H1 align="center">You have not registered successfully.</H1>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
The class you want to register for does not exist.
<UL>
  <LI>Course: 
<bean:write name="userFormBean" property="course"/>
  <LI>Section: 
<bean:write name="userFormBean" property="section"/>
</UL>
Please <A HREF="register.jsp?username=">try again</A>.
</BODY></HTML>