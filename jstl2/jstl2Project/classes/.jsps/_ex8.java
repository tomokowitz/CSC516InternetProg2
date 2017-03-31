
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ReadFileBean;
import PersonInfo;


public class _ex8 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex8 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      ReadFileBean inFile;
      synchronized (pageContext) {
        if ((inFile = (ReadFileBean) pageContext.getAttribute( "inFile", PageContext.PAGE_SCOPE)) == null) {
          inFile = (ReadFileBean) new ReadFileBean();
          pageContext.setAttribute( "inFile", inFile, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[3]);
          inFile.setFile("data.txt");
          out.write(__oracle_jsp_text[4]);
        }
      }
      out.write(__oracle_jsp_text[5]);
      PersonInfo person;
      synchronized (request) {
        if ((person = (PersonInfo) pageContext.getAttribute( "person", PageContext.REQUEST_SCOPE)) == null) {
          person = (PersonInfo) new PersonInfo();
          pageContext.setAttribute( "person", person, PageContext.REQUEST_SCOPE);
          out.write(__oracle_jsp_text[6]);
        }
      }
      out.write(__oracle_jsp_text[7]);
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
              out.write(__oracle_jsp_text[8]);
              {
                org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setValue("${line}");
                __jsp_taghandler_2.setTarget("${person}");
                __jsp_taghandler_2.setProperty("all");
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setValue("${person.name}");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setValue("${person.email}");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setValue("${person.phone}");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag.class,"org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag value type maxFractionDigits minFractionDigits");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setValue("${person.bet}");
                __jsp_taghandler_6.setType("currency");
                __jsp_taghandler_6.setMaxFractionDigits("2");
                __jsp_taghandler_6.setMinFractionDigits("2");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag.class,"org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag value type maxIntegerDigits minIntegerDigits");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setValue("${person.number}");
                __jsp_taghandler_7.setType("number");
                __jsp_taghandler_7.setMaxIntegerDigits("3");
                __jsp_taghandler_7.setMinIntegerDigits("3");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setVar("totalBet");
                __jsp_taghandler_8.setValue("${totalBet + person.bet }");
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[15]);
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
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag.class,"org.apache.taglibs.standard.tag.el.fmt.FormatNumberTag value type maxFractionDigits minFractionDigits");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setValue("${totalBet}");
        __jsp_taghandler_9.setType("currency");
        __jsp_taghandler_9.setMaxFractionDigits("2");
        __jsp_taghandler_9.setMinFractionDigits("2");
        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
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
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <title>ex8</title>\n  </head> \n  <body>\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    <table border=\"2\">\n    <tr>\n      <th>Name</th><th>Email</th><th>Phone</th><th>Bet</th>\n      <th>Number</th>\n    </tr>\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n      <tr>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        </td>\n      </tr>\n      ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n    </table>\n    <h2>Total bet: \n      ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n    </h2>\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
