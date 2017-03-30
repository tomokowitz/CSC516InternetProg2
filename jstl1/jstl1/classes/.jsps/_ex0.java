
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean0;


public class _ex0 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex0 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      Bean0 myUser;
      synchronized (pageContext) {
        if ((myUser = (Bean0) pageContext.getAttribute( "myUser", PageContext.PAGE_SCOPE)) == null) {
          myUser = (Bean0) new Bean0();
          pageContext.setAttribute( "myUser", myUser, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[2]);
      myUser.setUsername(OracleJspRuntime.toStr( request.getParameter("username")));
      out.write(__oracle_jsp_text[3]);
      myUser.setPassword(OracleJspRuntime.toStr( request.getParameter("password")));
      out.write(__oracle_jsp_text[4]);
      out.print( myUser.getUsername());
      out.write(__oracle_jsp_text[5]);
      out.print( myUser.getHiddenPassword());
      out.write(__oracle_jsp_text[6]);

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
  private static final char __oracle_jsp_text[][]=new char[7][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n  <head>\n    <title>ex0</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n  \n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n\n  Hello,  \n     ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n     \n  <P> Your password is \n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n     \n\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
