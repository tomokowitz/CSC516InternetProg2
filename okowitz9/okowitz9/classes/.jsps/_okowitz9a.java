
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _okowitz9a extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz9a page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag.class,"org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag driver url");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setDriver("sun.jdbc.odbc.JdbcOdbcDriver");
        __jsp_taghandler_1.setUrl("jdbc:odbc:bakery");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.el.sql.QueryTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.sql.QueryTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.sql.QueryTag.class,"org.apache.taglibs.standard.tag.el.sql.QueryTag var sql");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("results");
        __jsp_taghandler_2.setSql(" SELECT DISTINCT CUSTOMERID FROM CUSTOMERS");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
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
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz9a</title>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffde73; \n}\n    </style>\n  </head>\n  <body>\n  <form ACTION=\"okowitz9b.jsp\" METHOD=\"POST\">\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n                       \n                       \n         ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n  <input type = submit value=\"Submit\">\n         </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
