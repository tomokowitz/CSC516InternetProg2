<%-- ex2.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<html>
  <head>
    <title>ex2.jsp</title>
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
      rs = s.executeQuery(
        "select * from OFFERINGS where INSTRUCTOR = 'Avitabile'"); 
  %>
  <TABLE BORDER="1">
  <TR>
    <TH>CRN</TH>
    <TH>Course</TH>
    <TH>Section</TH>
    <TH>Date</TH>
    <TH>Time</TH>
    <TH>Room</TH>
  </TR>
  <%  while (rs.next())
      {
  %>
   <TR>
    <TD><%= rs.getString("CRN") %></TD>
    <TD><%= rs.getString("COURSE") %></TD>
    <TD><%= rs.getString("SECTION") %></TD>
    <TD><%= rs.getString("DATES") %></TD>
    <TD><%= rs.getString("TIMES") %></TD>
    <TD><%= rs.getString("ROOM") %></TD>
  </TR> 
  <%  
      }
  %>
  </TABLE>
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
