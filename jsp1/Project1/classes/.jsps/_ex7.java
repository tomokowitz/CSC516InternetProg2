
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;


public class _ex7 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 int[] count= new int[3];
    String[] colors = {"Red", "Green", "Blue"};

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
    _ex7 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
       int i;
         String name = request.getParameter("name");
         String color = request.getParameter("color");
         if (color.equals("red"))
           count[0]++;
         else if (color.equals("green"))
           count[1]++;
         else
           count[2]++;
         Vector colorVector = new Vector();
         Vector nameVector = new Vector();
         Object temp = session.getAttribute( "colors" ); 
         if (temp != null)
         {
           colorVector = (Vector)session.getAttribute( "colors" ); 
           nameVector = (Vector)session.getAttribute( "names" ); 
         }  
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
          session.setAttribute( "colors", colorVector ); 
          session.setAttribute( "names", nameVector );     
      
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
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n  <head>\n    <title>JSP Example 7 Results</title>\n  </head>\n  <body text=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "\"><h1>\n      Hello\n      ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n      . Your favorite color is\n      ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n      .\n    </h1>Record of all votes made (since server started):<p>\n      &nbsp;\n    </p><table border=\"1\">\n      <tr>\n        <th>Color</th>\n        <th>Count</th>\n      </tr>\n      ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    </table><p>Record of all votes made in this session:</p><p>\n      &nbsp;\n    </p><table border=\"1\">\n      <tr>\n        <th>Color</th>\n        <th>Count</th>\n      </tr>\n      ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n    </table></body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
