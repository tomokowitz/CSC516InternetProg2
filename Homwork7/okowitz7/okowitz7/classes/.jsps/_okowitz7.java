
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import okowitz7;


public class _okowitz7 extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz7 page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      okowitz7 myCakes;
      synchronized (pageContext) {
        if ((myCakes = (okowitz7) pageContext.getAttribute( "myCakes", PageContext.PAGE_SCOPE)) == null) {
          myCakes = (okowitz7) new okowitz7();
          pageContext.setAttribute( "myCakes", myCakes, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[3]);
      myCakes.setName(OracleJspRuntime.toStr( request.getParameter("name")));
      out.write(__oracle_jsp_text[4]);
      myCakes.setCakes_sold(OracleJspRuntime.toInt( request.getParameter("cakesSold")));
      out.write(__oracle_jsp_text[5]);
      out.print( myCakes.getName());
      out.write(__oracle_jsp_text[6]);
      out.print( myCakes.getCakes_sold());
      out.write(__oracle_jsp_text[7]);

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
  private static final char __oracle_jsp_text[][]=new char[8][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz7</title>\n  </head>\n  <body>\n   ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  \n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n  \n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
