<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<HTML>
  <HEAD>
    <TITLE><bean:message key="form.errorTitle" arg0="Password"/></TITLE>
  </HEAD>
  <BODY>
    <DIV align="center">
      <H1><bean:message key="form.errorTitle" arg0="Password"/></H1>
      <P><bean:message key="form.someOKMessage" 
                    arg0="username is ok and it's"
                    arg1='<%= request.getParameter("username") %>'/>
      <P><bean:message key="form.errorMessage" arg0="password"/>
      <P><bean:message key="form.tryAgain" arg0="login.jsp"/>
    </DIV>
  </BODY>
</HTML>