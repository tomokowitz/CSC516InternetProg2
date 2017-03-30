
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean9;
import Bean8;
import Bean1;


public class _ex1 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex1 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      Bean1 bean;
      synchronized (pageContext) {
        if ((bean = (Bean1) pageContext.getAttribute( "bean", PageContext.PAGE_SCOPE)) == null) {
          bean = (Bean1) new Bean1();
          pageContext.setAttribute( "bean", bean, PageContext.PAGE_SCOPE);
        }
      }
      out.write(__oracle_jsp_text[2]);
      out.print( bean.getFileName());
      out.write(__oracle_jsp_text[3]);
      out.print( bean.getCount());
      out.write(__oracle_jsp_text[4]);
      bean.setFavorite(OracleJspRuntime.toStr( request.getParameter("favorite")));
      out.write(__oracle_jsp_text[5]);
      out.print( bean.getFavorite());
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
    "\n<html>\n  <head>\n    <title>ex1</title>\n  </head>\n  <body>\n  <h1>Animal Picture</h1>\n  ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n  <img height=\"100\" width=\"100\"\n       src=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\">\n  <P>Accesses made: \n     ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n     \n   ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  <P>".toCharArray();
    __oracle_jsp_text[6] = 
    "\n     \n\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
