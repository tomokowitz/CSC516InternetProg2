<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz9a</title>
    <style type="text/css">
      body {
      background-color: #ffde73; 
}
    </style>
  </head>
  <body>
  
  <%-- set data source; other attributes are password and user  --%>
    <sql:setDataSource driver="sun.jdbc.odbc.JdbcOdbcDriver"
                       url="jdbc:odbc:bakery"    />
  
  
  
  
  </body>
</html>