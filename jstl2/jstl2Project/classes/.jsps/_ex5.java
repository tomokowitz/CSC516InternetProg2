
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ReadFileBean;
import PersonInfo;
import WriteFileBean;
import PeopleBean;


public class _ex5 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex5 page = this;
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
      PersonInfo person;
      synchronized (request) {
        if ((person = (PersonInfo) pageContext.getAttribute( "person", PageContext.REQUEST_SCOPE)) == null) {
          person = (PersonInfo) new PersonInfo();
          pageContext.setAttribute( "person", person, PageContext.REQUEST_SCOPE);
          out.write(__oracle_jsp_text[4]);
        }
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue("${param.name}");
        __jsp_taghandler_1.setTarget("${person}");
        __jsp_taghandler_1.setProperty("name");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue("${param.email}");
        __jsp_taghandler_2.setTarget("${person}");
        __jsp_taghandler_2.setProperty("email");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue("${param.phone}");
        __jsp_taghandler_3.setTarget("${person}");
        __jsp_taghandler_3.setProperty("phone");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setValue("${param.bet}");
        __jsp_taghandler_4.setTarget("${person}");
        __jsp_taghandler_4.setProperty("bet");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setValue("${param.number}");
        __jsp_taghandler_5.setTarget("${person}");
        __jsp_taghandler_5.setProperty("number");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setValue("${person.name}");
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag value target property");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setValue("${person}");
        __jsp_taghandler_7.setTarget("${people}");
        __jsp_taghandler_7.setProperty("person");
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
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
    "\n<html>\n  <head>\n    <title>ex5</title>\n  </head> \n  <body>\n    ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n    <h1>Information entered for\n       ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n    </h1>\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "    \n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
