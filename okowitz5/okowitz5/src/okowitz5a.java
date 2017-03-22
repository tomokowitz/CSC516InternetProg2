import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class okowitz5a extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    //PreparedStatement stmt;
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        
        
//        String url = "jdbc:odbc:bakery";
//             // more generally, url = "jdbc:mySubprotocol:myDataSource";
//               
//             Connection con;
//             // A Connection represents a session with a specific database.
//             // Within the
//             // context of a Connection, SQL statements are executed and
//             // results are returned.
//            
//             //Statement stmt;
//             // A Statement object is used for executing a static SQL
//             // statement and obtaining
//             // the results produced by it.
//            
//         
//        String query = "select COUNT(*) as MATCHES from CUSTOMERS where CAKEID like ? ;";

        
      
              // Attempt to establish a connection to the given database
              // URL. The Driver Manager attempts to select an appropriate
              // driver from the set of registered
              // JDBC drivers.
              // Genral form is:
              // DriverManager.getConnection(url, "myLogin", "myPassword");
              //con = DriverManager.getConnection(url, "", "");
              //con =   DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Tom Okowitz/Documents/IT and Software/jdbc/bakery.accdb");
              // Returns a new Statement object for this Connection
              //stmt = con.prepareStatement(query);
              
//        // Returns a ResultSet that contains the data produced by the
//              // query; never null
//              ResultSet rs = stmt.executeQuery(query);
//                while (rs.next()) // advances the current row until no more
//              {
//               // get the data from the current row
//               int cakeID = rs.getInt("Matches");
//               
//               if(cakeID > 0)
//               {
//               
//               }
//              }
//              // In many cases, it is desirable to immediately release a
//              // Statements's database and JDBC resources instead of
//              // waiting for this to happen when it is
//              // automatically closed; the close method provides this
//              // immediate release.
//              stmt.close();
//             
//              // Releases Connection's resources
//              con.close();

 try {
             }
             catch(Exception ex)
             {
              System.err.println("Exception: " + ex.getMessage());
             }
    }

    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) throws ServletException, 
                                                           IOException {
                                                           
        // Returns a ResultSet that contains the data produced by the
              // query; never null
              
//               
//              ResultSet rs = stmt.executeQuery(query);
//                while (rs.next()) // advances the current row until no more
//              {
//               // get the data from the current row
//               int cakeID = rs.getInt("Matches");
//               
//               if(cakeID > 0)
//               {
//               
//               }
//              }
//              // In many cases, it is desirable to immediately release a
//              // Statements's database and JDBC resources instead of
//              // waiting for this to happen when it is
//              // automatically closed; the close method provides this
//              // immediate release.
//              stmt.close();
//             
//              // Releases Connection's resources
//              con.close();
//             }
//             catch(SQLException ex)
//             {
//              System.err.println("SQLException: " + ex.getMessage());
//             }
//        int CAKEID;
//        String CAKENAME = "";
//        double CAKEPRICE;
//        response.setContentType(CONTENT_TYPE);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>okowitz5a</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a GET. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
    }

    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response) throws ServletException, 
                                                            IOException {
                                                            
        
                
        int CAKEID;
        boolean exists = false;
        String input1= request.getParameter( "CAKEID" );
        CAKEID = Integer.parseInt( request.getParameter( "CAKEID" ));
        String CAKENAME = request.getParameter( "CAKENAME" );
        double CAKEPRICE;
        CAKEPRICE = Double.parseDouble(request.getParameter( "CAKEPRICE" ));
        
        
        String id="";
        String name="";
        String price="";

        Vector nameVector = new Vector();
        Vector priceVector = new Vector();
        
        Vector customerVector = new Vector();
        int[] count= new int[1];
            
            
         
        try {
            BufferedReader cakein = new BufferedReader(new FileReader("D:/Users/okowitz/Documents/GitHub/CSC516InternetProg2/DataFiles/CAKES.txt"));
            
                     
       
            String s; 
                 while (true) 
                 { 
                    s = cakein.readLine(); 
                    if (s == null) break; 
                    int comma = s.indexOf(',');
                    id = s.substring(0,comma);
                    int intID = Integer.parseInt(id);
                    count[0]++;
                    
                    
                    String secondSubstring = s.substring(comma+1);
                    int secondComma = secondSubstring.indexOf(',');
                    name = secondSubstring.substring(0, secondComma);
                    
                    String thirdSubstring = secondSubstring.substring(secondComma+1);
                    int thirdComma = thirdSubstring.indexOf(',');
                    price = thirdSubstring.substring(0,thirdComma);
                    
                    if(intID==CAKEID)
                    {
                        exists = true;
                    }
                    
                    
                } 
                cakein.close(); 
                if(exists) {
                    String paramErrMsg = "This cake ID already exists.";
                    request.setAttribute("strErrMsg", paramErrMsg);
                    ServletContext context = getServletContext();
                    RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5c");
                    dispatcher.forward(request, response);
                    
                }
                else
                {
                    request.setAttribute("CAKEID", id);
                    request.setAttribute("CAKENAME", name);
                    request.setAttribute("CAKEPRICE", price);
                    
                    ServletContext context = getServletContext();
                    RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5b");
                    dispatcher.forward(request, response);
                }
                
        }
        catch(Exception e)
        {
            System.out.println("error reading file"); 
        }
        try
        {
            //stmt.setString(1, input1);
            //ResultSet rs = stmt.executeQuery();
            //rs.next();
            //int match_count = rs.getInt("MATCHES");
             // while (rs.next()) // advances the current row until no more
             //   {
                // get the data from the current row
             //   int cakeID = rs.getInt("Matches");
             
             //   if(cakeID > 0)
             //   {
             
//                    String paramErrMsg = "This cake ID already exists.";
//                    request.setAttribute("strErrMsg", paramErrMsg);
//                    ServletContext context = getServletContext();
//                    RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5c");
//                    dispatcher.forward(request, response);
//                }
//                else 
//                {
                    
//                    request.setAttribute("CAKEID", CAKEID);
//                    request.setAttribute("CAKENAME", CAKENAME);
//                    request.setAttribute("CAKEPRICE", CAKEPRICE);
//                    
//                    ServletContext context = getServletContext();
//                    RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5b");
//                    dispatcher.forward(request, response);
//                }
   //          }
            
        
                
        
                
              
                        
                response.setContentType(CONTENT_TYPE);
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head><title>okowitz5a</title></head>");
                out.println("<body>");
                out.println("<p>The servlet has received a POST. This is the reply.</p>");
                out.println("</body></html>");
                out.close();
        
        }
        catch(Exception ex)
        {
           System.err.println("Exception: " + ex.getMessage());
        }
    }
}
