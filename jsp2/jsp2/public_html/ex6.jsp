<%-- ex6.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement stmt;
  String query = "select CRN, SECTION, DATES, TIMES, INSTRUCTOR, ROOM " +
                       "from OFFERINGS where COURSE like ?;";
  
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
    }
    catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }   
  }
%>
<html>
  <head>
    <title>ex6.jsp</title>
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
   <FORM ACTION="ex7.jsp" METHOD="POST">
   <TABLE BORDER='1'>
     <TR>
       <TH>Choice</TH>
       <TH>CRN</TH>
       <TH>Section</TH>
       <TH>Date</TH>
       <TH>Time</TH>
       <TH>Instructor</TH>
       <TH>Room</TH>
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
        </TABLE>
        <input type = submit value="Submit">
        <INPUT type='hidden' name='username' 
               value='<%=input2%>' >
        </FORM>
  <%
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
