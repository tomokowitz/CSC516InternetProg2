<%@ page contentType="text/html" %>
<%-- Absolute First example of Java bean --%>
<html>
  <head>
    <title>ex0</title>
  </head>
  <body>
  <jsp:useBean id="myUser" class="Bean0"/>
  
  <jsp:setProperty name="myUser" property="username"
          value='<%= request.getParameter("username") %>'/>

  <jsp:setProperty name="myUser" property="password"
          value='<%= request.getParameter("password") %>'/>

  Hello,  
     <jsp:getProperty name="myUser" property="username" />
     
  <P> Your password is 
  <jsp:getProperty name="myUser" property="hiddenPassword" />
     

  </body>
</html>
