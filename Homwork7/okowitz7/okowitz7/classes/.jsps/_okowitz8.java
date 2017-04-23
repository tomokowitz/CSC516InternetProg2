
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import okowitz8;
import okowitz7;


public class _okowitz8 extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz8 page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      okowitz8 myOrders;
      synchronized (application) {
        if ((myOrders = (okowitz8) pageContext.getAttribute( "myOrders", PageContext.APPLICATION_SCOPE)) == null) {
          myOrders = (okowitz8) new okowitz8();
          pageContext.setAttribute( "myOrders", myOrders, PageContext.APPLICATION_SCOPE);
          out.write(__oracle_jsp_text[3]);
          OracleJspRuntime.__jspSetAllParams(request, (Object)myOrders, true);
          out.write(__oracle_jsp_text[4]);
        }
      }
      out.write(__oracle_jsp_text[5]);
      okowitz7 myCake;
      synchronized (request) {
        if ((myCake = (okowitz7) pageContext.getAttribute( "myCake", PageContext.REQUEST_SCOPE)) == null) {
          myCake = (okowitz7) new okowitz7();
          pageContext.setAttribute( "myCake", myCake, PageContext.REQUEST_SCOPE);
          out.write(__oracle_jsp_text[6]);
        }
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("cakeList");
        __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${myOrders.all}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag begin end var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setBegin(0);
        __jsp_taghandler_2.setEnd(OracleJspRuntime.toInt( (java.lang.Integer)oracle.jsp.runtime.OracleJspRuntime.evaluate("${myOrders.orderCount - 1}",java.lang.Integer.class, __ojsp_varRes,null)));
        __jsp_taghandler_2.setVar("i");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cakeList[i].custName}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cakeList[i].cakes_sold}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cakeList[i].deliver_fee}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cakeList[i].total}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[13]);
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
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
      out.write(__oracle_jsp_text[14]);

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
  private static final char __oracle_jsp_text[][]=new char[15][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz8</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    \n    \n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n    <table border=\"2\">\n    <tr>\n      <th>Customer Name</th><th>Cakes Sold</th><th>Total</th><th>Number</th>\n    </tr>\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n      <tr>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        </td>\n        \n      </tr>\n      \n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n    </table>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
