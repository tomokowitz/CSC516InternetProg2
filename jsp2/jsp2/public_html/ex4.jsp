<%-- ex4.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String connection_string = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement s1, s2;
  String query1 = "select count(*) from OFFERINGS where INSTRUCTOR = ?";
  String query2 = "select * from OFFERINGS where INSTRUCTOR = ?";
  
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
        con = DriverManager.getConnection(connection_string, "", "");
        s1 = con.prepareStatement(query1);
        s2 = con.prepareStatement(query2);
    }
    catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }   
  }
%>
<html>
  <head>
    <title>ex4.jsp</title>
  </head>
  <body>
  <%
    setupDB();
    try
    {
      s1.setString(1, request.getParameter("instructor"));
      ResultSet rs = s1.executeQuery();
      rs.next();
      int myCount = rs.getInt(1);
  %>
  <P> <%= myCount %> CIS courses offered by 
         <%= request.getParameter("instructor") %>
  <%  if (myCount > 0)
      {
        s2.setString(1, request.getParameter("instructor"));
        rs = s2.executeQuery();
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
      }
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
