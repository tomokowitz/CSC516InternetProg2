<%@ page contentType="text/html" %>
<%-- First example of Java bean --%>
<html>
  <head>
    <title>ex1</title>
  </head>
  <body>
  <h1>Animal Picture</h1>
  <jsp:useBean id="bean" class="Bean1"/>
  <img height="100" width="100"
       src="<jsp:getProperty name="bean" 
                             property="fileName"/>">
  <P>Accesses made: 
     <jsp:getProperty name="bean" property="count" />
     
   <jsp:setProperty name="bean" property="favorite"
          value='<%= request.getParameter("favorite") %>'/>
  <P><jsp:getProperty name="bean" property="favorite" />
     

  </body>
</html>
