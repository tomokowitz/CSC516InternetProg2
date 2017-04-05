<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz7</title>
  </head>
  <body>
   <jsp:useBean id="myCakes" class="okowitz7" />
  
    <jsp:setProperty name="myCakes" property="name"
    value='<%= request.getParameter("name") %>'/>
    
    <jsp:setProperty name="myCakes" property="cakes_sold"
    value='<%= request.getParameter("cakesSold") %>' />
    
    <jsp:getProperty name="myCakes" property="name" />
    
    <jsp:getProperty name="myCakes" property="cakes_sold" />
  
  </body>
</html>