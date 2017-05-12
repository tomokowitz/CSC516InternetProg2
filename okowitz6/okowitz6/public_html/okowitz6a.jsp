<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.sql.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz6a</title>
  </head>
  <body>
  <FORM ACTION="okowitz6b.jsp" METHOD="POST">
  <%
    String connection_string = "jdbc:odbc:bakery";
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
        "SELECT DISTINCT CUSTOMERID FROM CUSTOMERS");
        out.println("<SELECT name='customerid'>");
      while (rs.next())
              {
                String cid = rs.getString("CUSTOMERID");
                
                out.println(" <option value='" + cid + "'>");
                out.println( cid );
                out.println("</option>");
                
                }
                out.println("</select>");
  %>
  
   <%
        
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  
            <input type = submit value="Submit">
         </form>
  
  
  
  
  
  
  
  </body>
</html>