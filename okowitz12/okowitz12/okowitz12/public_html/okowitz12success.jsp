<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt;
  PreparedStatement stmt2;
  String query = "SELECT DISTINCT ORDERID, DATE, LOCATION FROM ORDERS;";
  
  
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
           stmt = con.createStatement();
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
    <title>okowitz12success</title>
  </head>
  <body>
  <%
    setupDB();
    
    try
    {
        
        ResultSet rs = stmt2.executeQuery();
  %>
  
  
  <table BORDER="1">
            <TR>
                <TH>ORDER ID</TH>
                <TH>ORDER DATE</TH>
                <TH>ORDER LOCATION</TH>
                
            </TR>
            <%
        while (rs.next())
        {
           String orderid = rs.getString("ORDERID");
           String date = rs.getString("DATE");
           String location = rs.getString("LOCATION");
    %>
           <TR>
           <TD><input type='radio' name='crn' value='<%=crn%>'> </TD>
           <TD><%= orderid %></TD>
           <TD><%= date %></TD>
           <TD><%= location %></TD>

           </TR>
    <%
        }
    %>
            </table>
  
  <%
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>