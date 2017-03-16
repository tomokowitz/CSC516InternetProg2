<%-- ex17.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%! 
  String url = "jdbc:odbc:registrar";
  Statement stmt3;
  PreparedStatement stmt4;
  Connection con;
  String query3 = "select CRN, COURSE, SECTION, DATES, TIMES, " +
                        "INSTRUCTOR, ROOM " +
                          "from OFFERINGS;";
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
