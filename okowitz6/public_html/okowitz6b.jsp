<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt1;
  PreparedStatement stmt2;
  String query1 = "select ORDERID, DATE, and LOCATION from ORDER where CUSTOMERID = ?;";
  
  public void setupDB()
  {
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
           con = DriverManager.getConnection(url, "", "");
           stmt1 = con.createStatement();
           stmt2 = con.prepareStatement(query1);
    }
    catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }   
  }
%>

<html>
  <head>
    
    <title>okowitz6b</title>
    <style type="text/css">
      body {
      background-color: #ffde73; 
}
    </style>
  </head>
  <body>
  <%
    setupDB();
    String input1 = request.getParameter( "CUSTOMERID" );
    
    try
    {
        stmt2.setString(1, input1);
        ResultSet rs = stmt2.executeQuery();
        }
        catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }  
  %>
  
  
  </body>
</html>