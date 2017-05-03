
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _okowitz9b extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz9b page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
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
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.el.sql.QueryTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.sql.QueryTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.sql.QueryTag.class,"org.apache.taglibs.standard.tag.el.sql.QueryTag var sql");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("results");
        __jsp_taghandler_2.setSql("SELECT DISTINCT ORDERID, DATE, LOCATION FROM ORDERS WHERE CUSTOMERID = ?");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            try {
              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
              do {
                out.write(__oracle_jsp_text[7]);
                out.write(__oracle_jsp_text[8]);
                {
                  org.apache.taglibs.standard.tag.el.sql.ParamTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.sql.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.sql.ParamTag.class,"org.apache.taglibs.standard.tag.el.sql.ParamTag value");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setValue("${param.customerid}");
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
                }
                out.write(__oracle_jsp_text[9]);
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
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setTest("${ results.rowCount >= 1 }");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[11]);
            {
              org.apache.taglibs.standard.tag.el.core.ForEachTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ForEachTag.class,"org.apache.taglibs.standard.tag.el.core.ForEachTag items var");
              __jsp_taghandler_5.setParent(__jsp_taghandler_4);
              __jsp_taghandler_5.setItems("${results.rows}");
              __jsp_taghandler_5.setVar("row");
              try {
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[12]);
                    {
                      org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setValue("${row.ORDERID}");
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                    }
                    out.write(__oracle_jsp_text[13]);
                    {
                      org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_7.setValue("${row.DATE}");
                      __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                      if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                      __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_8.setValue("${row.LOCATION}");
                      __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                      if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                    }
                    out.write(__oracle_jsp_text[15]);
                  } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_5.doCatch(th);
              } finally {
                __jsp_taghandler_5.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[16]);
          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[17]);

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
  private static final char __oracle_jsp_text[][]=new char[18][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz9b</title>\n  </head>\n  <body>\n  \n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n                           \n         ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n     ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n     ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        <table BORDER=\"1\">\n            <TR>\n                <TH>ORDER ID</TH>\n                <TH>ORDER DATE</TH>\n                <TH>ORDER LOCATION</TH>\n                \n            </TR>\n            ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                <tr>\n                    <td> ".toCharArray();
    __oracle_jsp_text[13] = 
    " </td>\n                    <td> ".toCharArray();
    __oracle_jsp_text[14] = 
    " </td>\n                    <td> ".toCharArray();
    __oracle_jsp_text[15] = 
    " </td>\n                    \n                </tr>\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n        </table>\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
