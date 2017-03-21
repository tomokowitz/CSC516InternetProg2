<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252" %>
<%@ page import="java.io.CharArrayWriter"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt1;
  PreparedStatement stmt2;
  String query1 = "select CUSTOMERID from CUSTOMERS;";
  
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
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz6a</title>
    <style type="text/css">
      body {
      background-color: #ffde73; 
    }
    </style>
  </head>
  <body>
  <FORM ACTION="okowitz6b.jsp" METHOD="POST">
  <%
    setupDB();
    try
    {
        ResultSet rs1 = stmt2.executeQuery(query1); 
        
         out.println("<select name='customerids'>");
      
        while (rs1.next())
              {
                String cid = rs1.getString("CUSTOMERID");
                
                out.println(" <option value='" + cid + "'>");
                out.println( cid );
                out.println("</option>");
                
                }
                out.println("</select>");
        %>
 
  
  
  
   <%
        
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  
            <input type = submit value="Submit">
         </form>
    </body>
</html>