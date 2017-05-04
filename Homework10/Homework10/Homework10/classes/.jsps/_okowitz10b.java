
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _okowitz10b extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz10b page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue("${param.customer}");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.el.core.ImportTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.ImportTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.ImportTag.class,"org.apache.taglibs.standard.tag.el.core.ImportTag url var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setUrl("hw10.xml");
        __jsp_taghandler_2.setVar("xmlFile");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.el.xml.ParseTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.xml.ParseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ParseTag.class,"org.apache.taglibs.standard.tag.el.xml.ParseTag var xml");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setVar("myDoc");
        __jsp_taghandler_3.setXml("${xmlFile}");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_4.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[6]);
            {
              org.apache.taglibs.standard.tag.common.xml.WhenTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.common.xml.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.xml.WhenTag.class,"org.apache.taglibs.standard.tag.common.xml.WhenTag select");
              __jsp_taghandler_5.setParent(__jsp_taghandler_4);
              __jsp_taghandler_5.setSelect("$myDoc/DATA/CUSTOMERS/Customer[CustLastName=$param:customer]");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[7]);
                  {
                    org.apache.taglibs.standard.tag.common.xml.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.common.xml.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.xml.SetTag.class,"org.apache.taglibs.standard.tag.common.xml.SetTag var select");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_6.setVar("customer");
                    __jsp_taghandler_6.setSelect("$myDoc/DATA/CUSTOMERS/Customer[CustLastName=$param:customer]");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                  }
                  out.write(__oracle_jsp_text[8]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_7.setSelect("$customer/CustNo");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                  }
                  out.write(__oracle_jsp_text[9]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_8.setSelect("$customer/CustFirstName");
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                  }
                  out.write(__oracle_jsp_text[10]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_9.setSelect("$customer/CustLastName");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                  }
                  out.write(__oracle_jsp_text[11]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_10.setSelect("$customer/CustStreet");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                  }
                  out.write(__oracle_jsp_text[12]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_11.setSelect("$customer/CustCity");
                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                  }
                  out.write(__oracle_jsp_text[13]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_12.setSelect("$customer/CustState");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                  }
                  out.write(__oracle_jsp_text[14]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_13.setSelect("$customer/CustZip");
                    __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                    if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                  }
                  out.write(__oracle_jsp_text[15]);
                  {
                    org.apache.taglibs.standard.tag.el.xml.ExprTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.el.xml.ExprTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.xml.ExprTag.class,"org.apache.taglibs.standard.tag.el.xml.ExprTag select");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_14.setSelect("$customer/CustBal");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                  }
                  out.write(__oracle_jsp_text[16]);
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[17]);
          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[18]);

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
  private static final char __oracle_jsp_text[][]=new char[19][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz10b</title>\n  </head>\n  <body>\n <h1>Information about\n        ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    </h1>\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    \n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n               \n                    <table border=\"2\">\n                        <tr><th>CustNo</th><th>CustFirstName</th><th>CustLastName</th>\n                        <th>CustStreet</th><th>CustCity</th><th>CustState</th>\n                        <th>CustZip</th><th>CustBal</th></tr>\n                     \n                          <tr>\n                            <td>".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\n                            <td>".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\n                            \n                          </tr>\n                     \n                    </table>\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n  </body>\n</html>\n  \n  \n  \n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
