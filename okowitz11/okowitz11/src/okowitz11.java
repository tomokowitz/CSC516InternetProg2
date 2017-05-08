import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
 
import java.util.ArrayList;

public class okowitz11 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        String connection_string = "jdbc:odbc:classes";
        Connection con;
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(java.lang.ClassNotFoundException e)
        {
          return student;
        }
        try
        {
          con = DriverManager.getConnection (connection_string,"","");
            String query = 
              "SELECT FIRSTNAME, LASTNAME, PHONE, DOB, MAJOR, ADDRESS, " +
              "CITY, STATE " +
              "FROM STUDENTS WHERE CAKE_ID = ?";
            PreparedStatement s = con.prepareStatement(query);
            ResultSet rs = s.executeQuery();
            if (rs.next())
            {
            }
        }
        catch (Exception e)
        {
        }
    }

    /**Process the HTTP doGet request.
     */
    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) throws ServletException, IOException {response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>okowitz11</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

    /**Process the HTTP doPost request.
     */
    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response) throws ServletException, IOException {response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>okowitz11</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
}
