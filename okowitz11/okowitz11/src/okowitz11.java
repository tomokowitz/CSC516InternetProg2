package okowitz11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
 
import java.util.ArrayList;

public class okowitz11 
{

    ArrayList cakes = new ArrayList();
    
    
    public Cake getCake(String cakeid, String cakename, double cakeprice) {
        Cake newCake = new Cake(cakeid, cakename, cakeprice);
        
   
        
        String connection_string = "jdbc:odbc:bakery";
        Connection con;
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(java.lang.ClassNotFoundException e)
        {
          return newCake;
        }
        try
        {
          con = DriverManager.getConnection (connection_string,"","");
            String query = 
              "SELECT CAKEID, CAKENAME, CAKEPRICE " +
              "FROM CAKES WHERE CAKEID = ?";
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, cakeid);
            ResultSet rs = s.executeQuery();
            if (rs.next())
            {
                newCake = new Cake(rs.getString(1), rs.getString(2),rs.getDouble(3));
            }
        }
        catch (Exception e)
        {
        }
        return newCake;
    }

    /**Process the HTTP doGet request.
     */
//    public void doGet(HttpServletRequest request, 
//                      HttpServletResponse response) throws ServletException, IOException {response.setContentType(CONTENT_TYPE);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>okowitz11</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a GET. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
//    }

    /**Process the HTTP doPost request.
     */
//    public void doPost(HttpServletRequest request, 
//                       HttpServletResponse response) throws ServletException, IOException {response.setContentType(CONTENT_TYPE);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>okowitz11</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a POST. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
//    }
}
