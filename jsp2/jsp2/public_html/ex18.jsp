<%-- ex18.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Enumeration" %>
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
    <title>ex18.jsp</title>
  </head>
  <body>
  <%
      setupDB();
      String input2 = (String)session.getAttribute("username");
      if (input2 == null)
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
        Enumeration e = request.getParameterNames();
        while (e.hasMoreElements())
        {
          String paramName = (String)e.nextElement();
          if (paramName.startsWith("crn")) 
          {
            String input1 = request.getParameter(paramName);
            ResultSet result1 = stmt.executeQuery(
                                     "select COUNT(*) from ENROLLMENTS" 
                                      + " where CRN = " + input1  +
                                      " and USERID ='" + input2 + "';");
            result1.next();
            boolean ok1 = (result1.getInt(1) == 0);
            ResultSet result2 = stmt.executeQuery(
                                        "select COUNT(*) from OFFERINGS "
                                        + "where CRN = " + input1 + ";");
            result2.next();      
            boolean ok2 = (result2.getInt(1) == 1);
            ResultSet result3 = stmt.executeQuery(
                                            "select ENROLLMAX - ENROLLCURRENT " 
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
                out.println("<P>Insert made into CRN " + input1 );
            }
           else if (! ok1)
           {
              String this_error = "Already registered for " + input1;
    %>
            <jsp:include page="ex14.jsp">
             <jsp:param name="error" value="<%= this_error %>" />
           </jsp:include>
    <%  
           }
           else if (! ok2)
           {
              String this_error = "No such CRN " + input1;
    %>
            <jsp:include page="ex14.jsp">
             <jsp:param name="error" value="<%= this_error %>" />
           </jsp:include>
    <%  
           }
           else if (! ok3)
           {
              String this_error = input1 + " is full";
    %>
            <jsp:include page="ex14.jsp">
             <jsp:param name="error" value="<%= this_error %>" />
           </jsp:include>
    <%  
           }
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
