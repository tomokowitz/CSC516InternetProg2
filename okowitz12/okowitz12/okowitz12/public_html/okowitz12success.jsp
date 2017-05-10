<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt3;
  PreparedStatement stmt4;
  String query = "select COUNT(*) as MATCHES from USERS where USERID like ? " +
                      " and PASSWORD like ?;";
  String query2 = "select COUNT(*) from USERROLES where ROLEID = 1 and " +
                       " USERID like ?;";
  
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
           stmt = con.prepareStatement(query);
           stmt2 = con.prepareStatement(query2);
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
    String input1 = request.getParameter( "course" );
    String input2 = request.getParameter( "username" );
    try
    {
        stmt.setString(1, input1);
        ResultSet rs = stmt.executeQuery();
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
           String crn = rs.getString("CRN");
           String section = rs.getString("SECTION");
           String date = rs.getString("DATES");
           String time = rs.getString("TIMES");
           String instructor = rs.getString("INSTRUCTOR");
           String room = rs.getString("ROOM");
    %>
           <TR>
           <TD><input type='radio' name='crn' value='<%=crn%>'> </TD>
           <TD><%= crn %></TD>
           <TD><%= section %></TD>
           <TD><%= date %></TD>
           <TD><%= time %></TD>
           <TD><%= instructor %></TD>
           <TD><%= room %></TD>  
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