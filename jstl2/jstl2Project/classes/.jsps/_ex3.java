
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ReadFileBean;
import PersonInfo;
import WriteFileBean;
import PeopleBean;
import RandomBean;


public class _ex3 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex3 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      RandomBean myRandom;
      synchronized (pageContext) {
        if ((myRandom = (RandomBean) pageContext.getAttribute( "myRandom", PageContext.PAGE_SCOPE)) == null) {
          myRandom = (RandomBean) new RandomBean();
          pageContext.setAttribute( "myRandom", myRandom, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[4]);
          myRandom.setMinRange(0);
          out.write(__oracle_jsp_text[5]);
          myRandom.setMaxRange(9);
          out.write(__oracle_jsp_text[6]);
        }
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue("${pageName}");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue("${requestName}");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue("${param.email}");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setValue("${param.msg}");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setVar("number");
        __jsp_taghandler_5.setValue("0");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.apache.taglibs.standard.tag.el.core.ForEachTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ForEachTag.class,"org.apache.taglibs.standard.tag.el.core.ForEachTag begin end var");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setBegin("1");
        __jsp_taghandler_6.setEnd("3");
        __jsp_taghandler_6.setVar("i");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[13]);
              {
                org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                __jsp_taghandler_7.setVar("digit");
                __jsp_taghandler_7.setValue("${myRandom.random}");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[14]);
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                __jsp_taghandler_8.setValue("${digit}");
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                __jsp_taghandler_9.setParent(__jsp_taghandler_6);
                __jsp_taghandler_9.setVar("number");
                __jsp_taghandler_9.setValue("${number * 10 + digit}");
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[17]);
            } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_10.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[19]);
            {
              org.apache.taglibs.standard.tag.el.core.WhenTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.el.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.WhenTag.class,"org.apache.taglibs.standard.tag.el.core.WhenTag test");
              __jsp_taghandler_11.setParent(__jsp_taghandler_10);
              __jsp_taghandler_11.setTest("${number == param.number}");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[20]);
                  {
                    org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag.class,"org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag value type maxFractionDigits minFractionDigits");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                    __jsp_taghandler_12.setValue("${param.bet * 600}");
                    __jsp_taghandler_12.setType("currency");
                    __jsp_taghandler_12.setMaxFractionDigits("2");
                    __jsp_taghandler_12.setMinFractionDigits("2");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                  }
                  out.write(__oracle_jsp_text[21]);
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
            }
            out.write(__oracle_jsp_text[22]);
            {
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
              __jsp_taghandler_13.setParent(__jsp_taghandler_10);
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[23]);
                  {
                    org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag.class,"org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag value type maxFractionDigits minFractionDigits");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                    __jsp_taghandler_14.setValue("${param.bet}");
                    __jsp_taghandler_14.setType("currency");
                    __jsp_taghandler_14.setMaxFractionDigits("2");
                    __jsp_taghandler_14.setMinFractionDigits("2");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                  }
                  out.write(__oracle_jsp_text[24]);
                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
            }
            out.write(__oracle_jsp_text[25]);
          } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[26]);

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
  private static final char __oracle_jsp_text[][]=new char[27][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n  <head>\n    <title>ex3</title>\n  </head>\n  <body>\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n       ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n       ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n     ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n   <P>The name for this page is ".toCharArray();
    __oracle_jsp_text[8] = 
    ".\n   <P>The name for this request is ".toCharArray();
    __oracle_jsp_text[9] = 
    ".\n   <P>The email for this request is ".toCharArray();
    __oracle_jsp_text[10] = 
    ".\n   <P>The message from the last page was ".toCharArray();
    __oracle_jsp_text[11] = 
    ".\n   <P>Today's winning number is\n   ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n   ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n     ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n".toCharArray();
    __oracle_jsp_text[15] = 
    "\n     ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n     ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n   ".toCharArray();
    __oracle_jsp_text[18] = 
    "            \n   ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n       ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n         You would win ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n       ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n       ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n         You would lose ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n       ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
