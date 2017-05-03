
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
        org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag.class,"org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag scope driver url");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setScope("session");
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
        org.apache.taglibs.standard.tag.el.sql.QueryTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.sql.QueryTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.sql.QueryTag.class,"org.apache.taglibs.standard.tag.el.sql.QueryTag var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("results");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[6]);
              } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            finally {
              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
            }
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.el.core.ForEachTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ForEachTag.class,"org.apache.taglibs.standard.tag.el.core.ForEachTag items var");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setItems("${results.rowsByIndex}");
        __jsp_taghandler_3.setVar("row");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[8]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                __jsp_taghandler_4.setValue("${row[0]}");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                __jsp_taghandler_5.setValue("${row[0]}");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                __jsp_taghandler_6.setValue("${row[0]}");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[11]);
            } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_3.doCatch(th);
        } finally {
          __jsp_taghandler_3.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
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
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz9a</title>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffde73; \n}\n    </style>\n  </head>\n  <body>\n  <form ACTION=\"okowitz9b.jsp\" METHOD=\"POST\">\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n                           \n         ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n      SELECT DISTINCT CUSTOMERID FROM CUSTOMERS\n     \n     ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n     <select name='customerid'>\n                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                    <option value='".toCharArray();
    __oracle_jsp_text[9] = 
    "'>\n                        ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                    </option>\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n            </select>\n  <input type = submit value=\"Submit\">\n         </form>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
