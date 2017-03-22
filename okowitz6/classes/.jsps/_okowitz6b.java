
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


public class _okowitz6b extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz6b page = this;
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
       
          String fldOrderid;
          String fldDate;
          String fldLocation;
          Vector orderVector = new Vector();
          Vector dateVector = new Vector();
          Vector locationVector = new Vector();
          
          int[] count= new int[1];
        try
        {
         BufferedReader orderin = new BufferedReader(new FileReader("D:/Users/okowitz/Documents/GitHub/CSC516InternetProg2/DataFiles/ORDERS.txt"));
         
        // stores in C:\Documents and Settings\john\Desktop\installs\newjdevstudio1013\jdev\system\oracle.j2ee.10.1.3.36.73\embedded-oc4j\config
        String s; 
           while (true) 
           { 
              s = orderin.readLine(); 
              if (s == null) break; 
              int comma = s.indexOf(',') ;
              String id = s.substring(0,comma);
              String secondSubstring = s.substring(comma+1);
              int secondComma = secondSubstring.indexOf(',');
              String date = secondSubstring.substring(0, secondComma);
              String thirdSubstring = secondSubstring.substring(secondComma+1);
              int thirdComma = thirdSubstring.indexOf(',');
              String location = thirdSubstring.substring(0,thirdComma);
              String customerid = thirdSubstring.substring(thirdComma+1);
              if(customerid.equals(request.getParameter("CUSTOMERID")))
              { 
                  orderVector.addElement(id);
                  dateVector.addElement(date);
                  locationVector.addElement(location);
              }
               count[0]++;
              
          } 
          orderin.close(); 
         
        }
        catch (Exception e) // if there is an error, we execute this code. 
         { 
            out.println("error reading file"); 
         } 
      
      out.write(__oracle_jsp_text[7]);
       int i;
              for (i = 0; i < orderVector.size(); i++) {
                  fldOrderid = (String)orderVector.elementAt(i);
                  fldDate = (String)dateVector.elementAt(i);
                  fldLocation = (String)locationVector.elementAt(i);
             
              
      out.write(__oracle_jsp_text[8]);
      out.print( fldOrderid );
      out.write(__oracle_jsp_text[9]);
      out.print( fldDate );
      out.write(__oracle_jsp_text[10]);
      out.print( fldLocation );
      out.write(__oracle_jsp_text[11]);
      
              }
              
      out.write(__oracle_jsp_text[12]);

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
  private static final char __oracle_jsp_text[][]=new char[13][];
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
    "\n\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz6b</title>\n  </head>\n  <body> this is only a test \n  \n  \n  <TABLE BORDER='1'>\n     <TR>\n       <TH>Order ID</TH>\n       <TH>Date</TH>\n       <TH>Location</TH>\n      \n     </TR>\n     ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n     <TR>\n           \n           <TD>".toCharArray();
    __oracle_jsp_text[9] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[10] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[11] = 
    "</TD>\n         \n      </TR>\n           ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n  </TABLE>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
