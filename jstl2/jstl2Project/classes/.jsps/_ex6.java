
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ReadFileBean;
import PersonInfo;
import WriteFileBean;
import PeopleBean;


public class _ex6 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex6 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      PeopleBean people;
      synchronized (application) {
        if ((people = (PeopleBean) pageContext.getAttribute( "people", PageContext.APPLICATION_SCOPE)) == null) {
          people = (PeopleBean) new PeopleBean();
          pageContext.setAttribute( "people", people, PageContext.APPLICATION_SCOPE);
          out.write(__oracle_jsp_text[2]);
        }
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue("${people.userCount}");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("peopleList");
        __jsp_taghandler_2.setValue("${people.all}");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setVar("totalBet");
        __jsp_taghandler_3.setValue("0");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.el.core.ForEachTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ForEachTag.class,"org.apache.taglibs.standard.tag.el.core.ForEachTag begin end var");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setBegin("0");
        __jsp_taghandler_4.setEnd("${people.userCount - 1}");
        __jsp_taghandler_4.setVar("i");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                __jsp_taghandler_5.setValue("${peopleList[i].name}");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                __jsp_taghandler_6.setValue("${peopleList[i].email}");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                __jsp_taghandler_7.setValue("${peopleList[i].phone}");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                __jsp_taghandler_8.setValue("${peopleList[i].bet}");
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                __jsp_taghandler_9.setValue("${peopleList[i].number}");
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                __jsp_taghandler_10.setParent(__jsp_taghandler_4);
                __jsp_taghandler_10.setVar("totalBet");
                __jsp_taghandler_10.setValue("${totalBet + peopleList[i].bet }");
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[13]);
            } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_4.doCatch(th);
        } finally {
          __jsp_taghandler_4.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[14]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setValue("${totalBet}");
        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
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
    "\n<html>\n  <head>\n    <title>ex6</title>\n  </head> \n  <body>\n    ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    " bets entered. \n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    <table border=\"2\">\n    <tr>\n      <th>Name</th><th>Email</th><th>Phone</th><th>Bet</th>\n      <th>Number</th>\n    </tr>\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n      <tr>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n        </td>\n        <td>\n          ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        </td>\n          <td>\n          ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        </td>\n      </tr>\n      ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n    </table>\n    <h2>Total bet: ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
