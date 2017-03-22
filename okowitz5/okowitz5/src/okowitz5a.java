import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.*;

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
