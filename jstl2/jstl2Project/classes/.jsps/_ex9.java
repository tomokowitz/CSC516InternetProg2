
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _ex9 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex9 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue("${param.mountain}");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.common.core.CatchTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.common.core.CatchTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.CatchTag.class,"org.apache.taglibs.standard.tag.common.core.CatchTag var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("exception");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.apache.taglibs.standard.tag.el.fmt.ParseDateTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.fmt.ParseDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.ParseDateTag.class,"org.apache.taglibs.standard.tag.el.fmt.ParseDateTag value type dateStyle");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setValue("${param.date}");
                __jsp_taghandler_3.setType("date");
                __jsp_taghandler_3.setDateStyle("short");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[5]);
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
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setTest("${exception != null}");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[7]);
            if (true) {
              String __url=OracleJspRuntime.toStr("ex10.jsp");
              __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"msg" } ,new String[] {OracleJspRuntime.toStr("Illegal format for the date") } );
              // Forward 
              pageContext.forward( __url);
              return;
            }

            out.write(__oracle_jsp_text[8]);
          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.common.core.CatchTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.common.core.CatchTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.CatchTag.class,"org.apache.taglibs.standard.tag.common.core.CatchTag var");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setVar("exception");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[10]);
              {
                org.apache.taglibs.standard.tag.el.fmt.ParseNumberTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.fmt.ParseNumberTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.ParseNumberTag.class,"org.apache.taglibs.standard.tag.el.fmt.ParseNumberTag value integerOnly");
                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                __jsp_taghandler_6.setValue("${param.id}");
                __jsp_taghandler_6.setIntegerOnly("true");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[11]);
            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setTest("${exception != null}");
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[13]);
            if (true) {
              String __url=OracleJspRuntime.toStr("ex10.jsp");
              __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"msg" } ,new String[] {OracleJspRuntime.toStr("Illegal format for the climber id") } );
              // Forward 
              pageContext.forward( __url);
              return;
            }

            out.write(__oracle_jsp_text[14]);
          } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[15]);

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
  private static final char __oracle_jsp_text[][]=new char[16][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <title>ex9</title>\n  </head> \n  <body>\n      <p>Everything ok about:\n      <p>Mountain: ".toCharArray();
    __oracle_jsp_text[3] = 
    "</p>\n      ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n        <p>Date: ".toCharArray();
    __oracle_jsp_text[5] = 
    "</p>\n      ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n        <p>Climber ID:\n           ".toCharArray();
    __oracle_jsp_text[11] = 
    "</p>\n      ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
