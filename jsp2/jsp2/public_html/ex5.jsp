<%-- ex5.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement stmt;
  PreparedStatement stmt2;
  Statement stmt3;
  PreparedStatement stmt4;
  String query = "select COUNT(*) as MATCHES from USERS where USERID like ? " +
                      " and PASSWORD like ?;";
  String query2 = "select COUNT(*) from USERROLES where ROLEID = 1 and " +
                       " USERID like ?;";
  String query4 = "select FNAME, LNAME from USERS where USERID like ?;";
  
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
           stmt3 = con.createStatement();
           stmt4 = con.prepareStatement(query4);
    }
    catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }   
  }
%>
<html>
  <head>
    <title>ex5.jsp</title>
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
              String query3 = "select distinct OFFERINGS.COURSE, DESCRIPTION " 
                               + "FROM OFFERINGS inner join COURSES on " +
                                 "OFFERINGS.COURSE = COURSES.COURSE;";
              ResultSet rs3 = stmt3.executeQuery(query3);        
              stmt4.setString(1, input1);
              ResultSet rs4 = stmt4.executeQuery();            
              rs4.next();
    %>
              <P>Pick a course, <%= rs4.getString("FNAME") %> 
              <%= rs4.getString("LNAME") %> 
              <FORM ACTION="ex6.jsp" METHOD="POST">
    <%
              out.println("<SELECT name='course'>");
              while (rs3.next())
              {
                  String cname = rs3.getString("COURSE");
                  String cdesc = rs3.getString("DESCRIPTION");
                  out.println("<OPTION value='" + cname + "'>");
                  out.println(cname + " " + cdesc);
                  out.println("</OPTION>");
               } 
               out.println("</SELECT>");
    %>
               <INPUT type='hidden' name='username' 
                      value='<%= input1 %>'>
               <input type = submit value="Submit">
               </form>
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
