<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<HTML> 
<HEAD><TITLE><bean:message key="form.title" /> </TITLE></HEAD> 
<BODY> 
<H1 align="center">
  <bean:message key="form.title" /> 
</H1> 
<FORM ACTION="login.do" METHOD="POST"> 
 <bean:message key="form.userNamePrompt" />  
    <INPUT TYPE="TEXT" NAME="username">
  <BR> <bean:message key="form.passwordPrompt" /> 
    <INPUT TYPE="PASSWORD" NAME="password">
  <BR><bean:message key="form.actionPrompt" /> 
  <select name="operation">
    <option value="register">
        <bean:message key="form.registerMessage" /> 
    </option>
    <option value="drop">
        <bean:message key="form.dropMessage" />
    </option> 
    <option value="see">
        <bean:message key="form.seeGradesMessage" />
    </option>   
  </select>
  <BR> <INPUT TYPE="SUBMIT" VALUE="<bean:message key="form.submitPrompt" />"> 
</FORM>
</BODY>
</HTML>