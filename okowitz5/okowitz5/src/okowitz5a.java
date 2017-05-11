import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class okowitz5a extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    PreparedStatement stmt;
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
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
        String query;
        query = "SELECT COUNT(*) AS MATCHES FROM CAKES WHERE CAKEID = ?;"  ;
        
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
       }
       catch(SQLException ex)
       {
          System.err.println("SQLException: " + ex.getMessage());
       }
        
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
        
        
        PrintWriter output;
              response.setContentType( "text/html" ); 
              output = response.getWriter();          
        
        
        try
              {
                stmt.setString(1, input1);
                ResultSet rs = stmt.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                int columns = rsmd.getColumnCount();
                int count = 0;
                boolean printed = false;
                rs.next();
                    int match_count = rs.getInt("MATCHES");
                    if (match_count >= 1)
                    {
                        exists=true;
                    }
                    
                 }
              catch(SQLException ex)
              {
                 System.err.println("SQLException: " + ex.getMessage());
              }
        

           try
           {
                
                if(exists) {
                    String paramErrMsg = "This cake ID already exists.";
                    request.setAttribute("strErrMsg", paramErrMsg);
                    ServletContext context = getServletContext();
                    RequestDispatcher dispatcher = context.getRequestDispatcher("/okowitz5c");
                    dispatcher.forward(request, response);
                    
                }
                else
                {
                    request.setAttribute("CAKEID", CAKEID);
                    request.setAttribute("CAKENAME", CAKENAME);
                    request.setAttribute("CAKEPRICE", CAKEPRICE);
                    
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
