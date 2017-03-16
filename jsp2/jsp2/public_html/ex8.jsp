<%-- ex8.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! 
  String url = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement stmt;
  PreparedStatement stmt2;
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
    <title>ex8.jsp</title>
  </head>
  <body>
  <%
    setupDB();
    String input1 = request.getParameter( "username" );
    String input2 = request.getParameter( "password" );
    try
    {
        stmt.setString(1, input1);
        stmt.setString(2, input2);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int match_count = rs.getInt("MATCHES");
        if (match_count > 1)
        {
    %>
        <P>Too many matches!  
    <%
        }
        else if (match_count == 0)
    %>
        <P>Not a legal user name/password  
    <%
        else 
        {
            stmt2.setString(1, input1);
            ResultSet rs2 = stmt2.executeQuery();            
            rs2.next();
            int matches = rs2.getInt(1);
            if (matches != 1)
            { 
    %>
         <P>Not a student
    <%   
            }
            else 
            {
    %>
    <jsp:forward page="ex9.jsp" />
    <%
            }
        }
        
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
