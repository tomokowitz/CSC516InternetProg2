<%-- ex9.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  Statement stmt3;
  PreparedStatement stmt4;
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
    <title>ex9.jsp</title>
  </head>
  <body>
  <%
    setupDB();
    String input1 = request.getParameter( "username" );
    session.setAttribute("username", input1);
    try
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
              <FORM ACTION="ex10.jsp" METHOD="POST">
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
               <input type = submit value="Submit">
               </form>
    <%
        
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
