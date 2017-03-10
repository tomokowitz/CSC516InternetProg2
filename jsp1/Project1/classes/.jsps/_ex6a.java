
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;


public class _ex6a extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
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
    _ex6a page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
        int[] count= new int[3];
          String[] colors = {"Red", "Green", "Blue"};
          Vector colorVector = new Vector();
          Vector nameVector = new Vector();
      
         try 
         { 
           File myFile = new File("c:\\temp\\mydata.txt");
           Scanner in = new Scanner(myFile); 
        // stores in C:\Documents and Settings\john\Desktop\installs\newjdevstudio1013\jdev\system\oracle.j2ee.10.1.3.36.73\embedded-oc4j\config
           String s; 
           while (in.hasNextLine()) 
           { 
              s = in.nextLine(); 
              int colon = s.indexOf(':');
              String color = s.substring(0,colon);
              String name = s.substring(colon+1);
              if (color.equals("red"))
                count[0]++;
              else if (color.equals("green"))
                count[1]++;
              else
                count[2]++;
              colorVector.addElement(color);
              nameVector.addElement(name);
            } 
            in.close(); 
         } 
         catch (Exception e) // if there is an error, we execute this code. 
         { 
            out.println("error reading file"); 
         } 
        
         int i;
         String name = request.getParameter("name");
         String color = request.getParameter("color");
         if (color.equals("red"))
           count[0]++;
         else if (color.equals("green"))
           count[1]++;
         else
           count[2]++;
         colorVector.addElement(color);
         nameVector.addElement(name);
      
      out.write(__oracle_jsp_text[3]);
      out.print( color );
      out.write(__oracle_jsp_text[4]);
      out.print( name  );
      out.write(__oracle_jsp_text[5]);
      out.print( color );
      out.write(__oracle_jsp_text[6]);
       for (i = 0; i <= 2; i++) 
            out.println("<TR><TD>" + colors[i] + "</TD><TD>" + count[i] +
                         "</TD></TR>");
      
      out.write(__oracle_jsp_text[7]);
       for (i = 0; i < colorVector.size(); i++) 
           out.println("<TR><TD>" + (String)colorVector.elementAt(i) 
                        + "</TD><TD>" + (String)nameVector.elementAt(i)
                        + "</TD></TR>");
      
      out.write(__oracle_jsp_text[8]);
      
          try { 
               PrintWriter file = new PrintWriter("c:\\temp\\mydata.txt"); 
               for (i = 0; i < colorVector.size(); i++) 
                 file.println((String)colorVector.elementAt(i) 
                        + ":" + (String)nameVector.elementAt(i));
               file.close(); 
          } 
          catch (Exception ex) { 
          } 
      
      out.write(__oracle_jsp_text[9]);
      
         try 
         { 
           File myFile = new File("c:\\temp\\mydata.txt");
           Scanner in = new Scanner(myFile); 
           String s; 
           while (in.hasNextLine()) 
           { 
              s = in.nextLine(); 
      
              out.println(s + "<BR>"); 
            } 
            in.close(); 
         } 
         catch (Exception e) // if there is an error, we execute this code. 
         { 
            out.println("error reading file"); 
         } 
      
      out.write(__oracle_jsp_text[10]);

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
  private static final char __oracle_jsp_text[][]=new char[11][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n<head><title>JSP Example 6 Results</title></head>\n<body text=\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n>\n<h1>Hello \n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n. Your favorite color is\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n.\n</h1>\nVotes so far:\n<P>\n<TABLE BORDER=1>\n<TR><TH>Color</TH><TH>Count</TH></TR>\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n</TABLE>\n<P>\nRecord of all votes made (since server started):\n<P>\n<table border=1>\n<TR><TH>Color</TH><TH>Count</TH></TR>\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\n</table>\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\n<p>\nAnd here is what the file looks like:\n<P>\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n</body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
