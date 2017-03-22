
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
import java.io.*;


public class _okowitz6a extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _okowitz6a page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
       
          Vector customerVector = new Vector();
          int[] count= new int[1];
        try
        {
         BufferedReader customerin = new BufferedReader(new FileReader("D:/Users/okowitz/Documents/GitHub/CSC516InternetProg2/DataFiles/CUSTOMERS.txt"));
         
        // stores in C:\Documents and Settings\john\Desktop\installs\newjdevstudio1013\jdev\system\oracle.j2ee.10.1.3.36.73\embedded-oc4j\config
        String s; 
           while (true) 
           { 
              s = customerin.readLine(); 
              if (s == null) break; 
              int comma = s.indexOf(',');
              String id = s.substring(0,comma);
               count[0]++;
              customerVector.addElement(id);
          } 
          customerin.close(); 
         
        }
        catch (Exception e) // if there is an error, we execute this code. 
         { 
            out.println("error reading file"); 
         } 
      
      out.write(__oracle_jsp_text[7]);
      
      int i;
           try
          {
              //ResultSet rs1 = stmt2.executeQuery(query1); 
              
               out.println("<select name='CUSTOMERID'>");
            
              //while (rs1.next())
              for (i = 1; i < customerVector.size()+1; i++) 
              
                    {
                      String cid = (String)customerVector.elementAt(i) ;
                      
                      out.println(" <option value='" + cid + "'>");
                      out.println( cid );
                      out.println("</option>");
                      
                      }
                      out.println("</select>");
                      
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
          
          
      out.write(__oracle_jsp_text[8]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[9][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n\n\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n\n\n\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz6a</title>\n  </head>\n  <body> this is a test \n  \n  <form ACTION=\"okowitz6b.jsp\" METHOD=\"POST\">\n   ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n  <input type = submit value=\"Submit\">\n         </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
