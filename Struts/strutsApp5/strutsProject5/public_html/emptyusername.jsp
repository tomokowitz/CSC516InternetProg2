<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<HTML>
  <HEAD>
    <TITLE><bean:message key="form.errorTitle" arg0="User"/>
    </TITLE>
  </HEAD>
  <BODY>
    <DIV align="center">
      <H1><bean:message key="form.errorTitle" arg0="User"/></H1>
      <bean:message key="form.errorMessage" arg0="username"/>
      <bean:message key="form.tryAgain" arg0="login.jsp"/>
    </DIV>
  </BODY>
</HTML>