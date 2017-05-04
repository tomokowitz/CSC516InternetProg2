
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _okowitz10 extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz10 page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.apache.taglibs.standard.tag.rt.core.ImportTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ImportTag.class,"org.apache.taglibs.standard.tag.rt.core.ImportTag url var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setUrl("hw10.xml");
        __jsp_taghandler_1.setVar("xmlFile");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.xml.ParseTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.xml.ParseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ParseTag.class,"org.apache.taglibs.standard.tag.rt.xml.ParseTag var xml");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("myDoc");
        __jsp_taghandler_2.setXml((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${xmlFile}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.common.xml.ForEachTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.common.xml.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.xml.ForEachTag.class,"org.apache.taglibs.standard.tag.common.xml.ForEachTag var select");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setVar("customer");
        __jsp_taghandler_3.setSelect("$myDoc/DATA/CUSTOMERS/Customer");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                __jsp_taghandler_4.setSelect("$customer/CustNo");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[5]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                __jsp_taghandler_5.setSelect("$customer/CustFirstName");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[6]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_6.setParent(__jsp_taghandler_3);
                __jsp_taghandler_6.setSelect("$customer/CustLastName");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_7.setParent(__jsp_taghandler_3);
                __jsp_taghandler_7.setSelect("$customer/CustStreet");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_8.setParent(__jsp_taghandler_3);
                __jsp_taghandler_8.setSelect("$customer/CustCity");
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_9.setParent(__jsp_taghandler_3);
                __jsp_taghandler_9.setSelect("$customer/CustStatee");
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_10.setParent(__jsp_taghandler_3);
                __jsp_taghandler_10.setSelect("$customer/CustZip");
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.rt.xml.ExprTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.xml.ExprTag.class,"org.apache.taglibs.standard.tag.rt.xml.ExprTag select");
                __jsp_taghandler_11.setParent(__jsp_taghandler_3);
                __jsp_taghandler_11.setSelect("$customer/CustBal");
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[12]);
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
      out.write(__oracle_jsp_text[13]);

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
  private static final char __oracle_jsp_text[][]=new char[14][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n  <head>\n    <title>okowitz10</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n        <table border=\"2\">\n            <tr><th>CustNo</th><th>CustFirstName</th><th>CustLastName</th>\n            <th>CustStreet</th><th>CustCity</th><th>CustState</th>\n            <th>CustZip</th><th>CustBal</th></tr>\n            ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n              <tr>\n                <td>".toCharArray();
    __oracle_jsp_text[5] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[6] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[7] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\n                <td>".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\n                \n              </tr>\n            ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n            \n        </table>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
