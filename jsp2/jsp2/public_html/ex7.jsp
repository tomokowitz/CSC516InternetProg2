<%-- ex7.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.GregorianCalendar" %>
<%! // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  Statement stmt;
  
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
    }
    catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }   
  }
%>
<html>
  <head>
    <title>ex7.jsp</title>
  </head>
  <body>
  <%
      setupDB();
      String input1 = request.getParameter( "crn" );
      String input2 = request.getParameter( "username" );
      if (input1 == null)
      {
        out.println("No section selected");
        out.println( "</BODY></HTML>" );
        return;
      }
      GregorianCalendar today = new GregorianCalendar();
      String today_date = (today.get(GregorianCalendar.MONTH) + 1) + "/" +
                            today.get(GregorianCalendar.DATE) + "/" +
                            today.get(GregorianCalendar.YEAR);
      try
      {
        ResultSet result1 = stmt.executeQuery("select COUNT(*) from ENROLLMENTS" 
                                            + " where CRN = " + input1  +
                                            " and USERID ='" + input2 + "';");
        result1.next();
        boolean ok1 = (result1.getInt(1) == 0);
        ResultSet result2 = stmt.executeQuery("select COUNT(*) from OFFERINGS "
                                               + "where CRN = " + input1 + ";");
        result2.next();      
        boolean ok2 = (result2.getInt(1) == 1);
        ResultSet result3 = stmt.executeQuery("select ENROLLMAX - ENROLLCURRENT " 
                                              + "from OFFERINGS where CRN = " 
                                              + input1 + ";");
        result3.next();      
        boolean ok3 = (result3.getInt(1) >= 1);
        if (ok1 && ok2 && ok3)
        {
          stmt.executeUpdate("insert into ENROLLMENTS values(" +
                               input1 + ",'" + input2 + "','" + today_date +
                               "','');");
          stmt.executeUpdate("update OFFERINGS set ENROLLCURRENT = " +
                                 "ENROLLCURRENT + 1 WHERE CRN = " 
                                 + input1 + ";");
          out.println("Insert made");
        }
        else if (! ok1)
          out.println("Duplicate entry");
        else if (! ok2)
          out.println("No such CRN");
        else if (! ok3)
          out.println("Class is full");
      }
      catch (Exception e)
      {
         e.printStackTrace();     
      }
  %>
  </body>
</html>
