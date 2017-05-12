<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt1;
  PreparedStatement stmt2;
  String query = "select ORDERID, DATE, LOCATION from ORDERS where CUSTOMERID = ?;";
 
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
           stmt2 = con.prepareStatement(query);
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
    <title>okowitz6b</title>
  </head>
  <body>
   <%
    setupDB();
    String input1 = request.getParameter( "customerid" );
    
    try
    {
        stmt2.setString(1, input1);
        ResultSet rs = stmt2.executeQuery();
        
        %>
        <TABLE BORDER='1'>
     <TR>
       <TH>Order ID</TH>
       <TH>Date</TH>
       <TH>Location</TH>
      
     </TR>
    <%
        while (rs.next())
        {
           String orderid = rs.getString("ORDERID");
           String date = rs.getString("DATE");
           String location = rs.getString("LOCATION");
         
    %>
           <TR>
           
           <TD><%= orderid %></TD>
           <TD><%= date %></TD>
           <TD><%= location %></TD>
         
           </TR>
           <%
        }
        }
        catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }  
  %>
  </TABLE>
  </body>
</html>