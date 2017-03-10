
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _ex4 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 int redCount=0;
    int greenCount=0;
    int blueCount=0;

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
    _ex4 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
       String name = request.getParameter("name");
         String color = request.getParameter("color");
         if (color.equals("red"))
           redCount++;
         else if (color.equals("green"))
           greenCount++;
         else
           blueCount++;
      
      out.write(__oracle_jsp_text[2]);
      out.print( color );
      out.write(__oracle_jsp_text[3]);
      out.print( name  );
      out.write(__oracle_jsp_text[4]);
      out.print( color );
      out.write(__oracle_jsp_text[5]);
      out.print( redCount );
      out.write(__oracle_jsp_text[6]);
      out.print( greenCount );
      out.write(__oracle_jsp_text[7]);
      out.print( blueCount );
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
    "\n<html>\n<head><title>JSP Example 4 Results</title></head>\n<body text=\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n>\n<h1>Hello \n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n. Your favorite color is\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n.\n<P>\nVotes so far:\n<P>\n<TABLE BORDER=1>\n<TR><TH>Color</TH><TH>Count</TH></TR>\n<TR><TD>Red</TD><TD>".toCharArray();
    __oracle_jsp_text[6] = 
    "</TD></TR>\n<TR><TD>Green</TD><TD>".toCharArray();
    __oracle_jsp_text[7] = 
    "</TD></TR>\n<TR><TD>Blue</TD><TD>".toCharArray();
    __oracle_jsp_text[8] = 
    "</TD></TR>\n</TABLE>\n</h1>\n</body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
