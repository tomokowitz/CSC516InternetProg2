import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class okowitz5a extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        String url = "jdbc:odbc:registrar";
               Connection con;
               String query =
                 "select COUNT(*) as MATCHES from USERS where USERID like ? " +
                              " and PASSWORD like ?;";
               String query2 =
                  "select COUNT(*) from USERROLES where ROLEID = 1 and " +
                               " USERID like ?;";
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
                   
                  if (ok1 && ok2 && ok3)
                              {
                                  stmt.executeUpdate("insert into ENROLLMENTS values(" +
                                                 input1 + ",'" + input2 + "','" + today_date +
                                                 "','');");
                               
                   stmt = con.prepareStatement(query);
                   stmt2 = con.prepareStatement(query2);
              }
               catch(SQLException ex)
               {
                  System.err.println("SQLException: " + ex.getMessage());
               }
    }

    /**Process the HTTP doGet request.
     */
    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) throws ServletException, 
                                                           IOException {
        String CAKENAME = "";
        int CAKEID;
        double CAKEPRICE;
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>okowitz5a</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

    /**Process the HTTP doPost request.
     */
    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response) throws ServletException, 
                                                            IOException {
        
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5b");
        dispatcher.forward(request, response);
        
        
        String CAKENAME = "";
        int CAKEID;
        double CAKEPRICE;
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>okowitz5a</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
}
