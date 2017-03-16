<%-- ex1.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<html>
  <head>
    <title>ex1.jsp</title>
  </head>
  <body>
  <%
    String connection_string = "jdbc:odbc:registrar";
    Connection con;
    try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    }
    catch(java.lang.ClassNotFoundException e)
    {
      System.err.print("ClassNotFoundException: ");
      System.err.println(e.getMessage());
    }
    try
    {
      con = DriverManager.getConnection (connection_string,"","");
      Statement s = con.createStatement();
      ResultSet rs = s.executeQuery(
        "select count(*) from OFFERINGS where INSTRUCTOR = 'Avitabile'");
      rs.next();
  %>
  <P> <%= rs.getString(1) %> courses offered by Avitabile
  <%
      s.close();
      con.close();
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
