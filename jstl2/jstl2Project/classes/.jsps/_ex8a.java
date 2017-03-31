
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ReadFileBean;


public class _ex8a extends com.orionserver.http.OrionHttpJspPage {


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
    _ex8a page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      ReadFileBean inFile;
      synchronized (pageContext) {
        if ((inFile = (ReadFileBean) pageContext.getAttribute( "inFile", PageContext.PAGE_SCOPE)) == null) {
          inFile = (ReadFileBean) new ReadFileBean();
          pageContext.setAttribute( "inFile", inFile, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[2]);
          inFile.setFile("data.txt");
          out.write(__oracle_jsp_text[3]);
        }
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.el.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ForEachTag.class,"org.apache.taglibs.standard.tag.el.core.ForEachTag items var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setItems("${inFile.data}");
        __jsp_taghandler_1.setVar("line");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.apache.taglibs.standard.tag.el.core.ForTokensTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.ForTokensTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ForTokensTag.class,"org.apache.taglibs.standard.tag.el.core.ForTokensTag items delims var");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setItems("${line}");
                __jsp_taghandler_2.setDelims(":");
                __jsp_taghandler_2.setVar("item");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[6]);
                      {
                        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                        __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                        __jsp_taghandler_3.setValue("${item}");
                        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                      }
                      out.write(__oracle_jsp_text[7]);
                    } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_2.doCatch(th);
                } finally {
                  __jsp_taghandler_2.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[8]);
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[9]);

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
  private static final char __oracle_jsp_text[][]=new char[10][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n  <head>\n    <title>ex8a</title>\n  </head> \n  <body>\n    ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    <table border=\"2\">\n    <tr>\n      <th>Name</th><th>Email</th><th>Phone</th><th>Bet</th>\n      <th>Number</th>\n    </tr>\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n      <tr>\n      ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n        <td>\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    " \n        </td>\n      ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n      </tr>\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n    </table>\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
