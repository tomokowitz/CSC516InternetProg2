import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class okowitz5b extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    /**Process the HTTP doGet request.
     */
    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) throws ServletException, 
                                                           IOException {
        int CAKEID;
        String CAKENAME = "";
        double CAKEPRICE;
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>okowitz5b</title></head>");
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
                                                            
        String url = "jdbc:odbc:bakery";
             // more generally, url = "jdbc:mySubprotocol:myDataSource";
               
             Connection con;
             // A Connection represents a session with a specific database.
             // Within the
             // context of a Connection, SQL statements are executed and
             // results are returned.
            
             Statement stmt;
             // A Statement object is used for executing a static SQL
             // statement and obtaining
             // the results produced by it.                
        int CAKEID;
        
        String input1= request.getParameter( "CAKEID" );
        CAKEID = Integer.parseInt( request.getParameter( "CAKEID" ));
        String CAKENAME = request.getParameter( "CAKENAME" );
        double CAKEPRICE;
        CAKEPRICE = Double.parseDouble(request.getParameter( "CAKEPRICE" ));

        try {
            con =   DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Tom Okowitz/Documents/IT and Software/jdbc/bakery.accdb");
            stmt = con.createStatement();
            
            stmt.executeUpdate("insert into CAKES values(" +
                                CAKEID + ",'" + CAKENAME + "'," +
                                    CAKEPRICE + ");");
            stmt.close();
            con.close();
        
        
        } catch (SQLException e) {
            // TODO ISABELA
            // System.err.println("SQLException: " + e.getMessage());
            String paramErrMsg = e.getMessage();
            request.setAttribute("strErrMsg", paramErrMsg);
            ServletContext context = getServletContext();
            RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5c");
            dispatcher.forward(request, response);
        }
        
             
             
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>okowitz5b</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
}
