import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ex5 extends HttpServlet {

    PreparedStatement stmt;
    PreparedStatement stmt2;
    Statement stmt3;
    PreparedStatement stmt4;

   public void init( ServletConfig config )
      throws ServletException
   {
       super.init( config );
       String url = "jdbc:odbc:registrar";
       Connection con;
       String query = "select COUNT(*) as MATCHES from USERS " +
                      "where USERID like ?  and PASSWORD like ?;";
       String query2 = "select COUNT(*) from USERROLES where ROLEID = 1 and " +
                       " USERID like ?;";
       String query4 = "select FNAME, LNAME from USERS where USERID like ?;";
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

   public void doPost( HttpServletRequest request,
                      HttpServletResponse response )
      throws ServletException, IOException
   {
      HttpSession session = request.getSession(true);
      String input1 = request.getParameter( "username" );
      session.setAttribute("username", input1);
      String input2 = request.getParameter( "password" );
      PrintWriter output;
      response.setContentType( "text/html" );  
      output = response.getWriter();           
      output.println( "<HTML><HEAD><TITLE>\n");
      output.println( "Add a Course\n" );
      output.println( "</TITLE></HEAD><BODY>\n" );

      try
      {
        stmt.setString(1, input1);
        stmt.setString(2, input2);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int match_count = rs.getInt("MATCHES");
        if (match_count > 1)
        {
            output.println("Too many matches!");           
        }
        else if (match_count == 0)
          output.println("Not a legal username/password");
        else 
        {
            stmt2.setString(1, input1);
            ResultSet rs2 = stmt2.executeQuery();            
            rs2.next();
            int matches = rs2.getInt(1);
            if (matches != 1)
            { 
              output.println("Not a student!");  
            }
            else 
            {
              String query3 = "select distinct OFFERINGS.COURSE, DESCRIPTION " 
                               + "FROM OFFERINGS inner join COURSES on " +
                                 "OFFERINGS.COURSE = COURSES.COURSE;";
              ResultSet rs3 = stmt3.executeQuery(query3);
              
              output.println("<P>Pick a course");
              
              stmt4.setString(1, input1);
              ResultSet rs4 = stmt4.executeQuery();            
              rs4.next();
              output.println(", " + rs4.getString("FNAME") + " " + 
                             rs4.getString("LNAME"));
              output.println("<FORM ACTION=\"ex6\" METHOD=\"POST\">");
              output.println("<SELECT name='course'>");
              while (rs3.next()) 
              {
                  String cname = rs3.getString("COURSE");
                  String cdesc = rs3.getString("DESCRIPTION");
                  output.println("<OPTION value='" + cname + "'>");
                  output.println(cname + " " + cdesc);
                  output.println("</OPTION>");
              }
              output.println("</SELECT>"); 
              output.println("<input type = submit value=\"Submit\">");
              output.println("</FORM>");
            }
        }
        output.println( "</BODY></HTML>" );
        output.close();    
      }
      catch(SQLException ex)
      {
         System.err.println("SQLException: " + ex.getMessage());
      }
   }

} 