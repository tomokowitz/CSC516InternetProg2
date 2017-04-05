
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean9;


public class _ex9 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex9 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      Bean9 myData;
      synchronized (pageContext) {
        if ((myData = (Bean9) pageContext.getAttribute( "myData", PageContext.PAGE_SCOPE)) == null) {
          myData = (Bean9) new Bean9();
          pageContext.setAttribute( "myData", myData, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[4]);
          OracleJspRuntime.__jspSetAllParams(request, (Object)myData, true);
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[7]);
            {
              org.apache.taglibs.standard.tag.el.core.WhenTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.WhenTag.class,"org.apache.taglibs.standard.tag.el.core.WhenTag test");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setTest("${myData.validName}");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[8]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_3.setValue("${myData.name}");
                    __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                    if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                  }
                  out.write(__oracle_jsp_text[9]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_4.setValue("${myData.email}");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                  }
                  out.write(__oracle_jsp_text[10]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_5.setValue("${myData.orderDate}");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                  }
                  out.write(__oracle_jsp_text[11]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_6.setValue("${myData.quantity1}");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                  }
                  out.write(__oracle_jsp_text[12]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_7.setValue("${myData.quantity2}");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                  }
                  out.write(__oracle_jsp_text[13]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_8.setValue("${myData.quantity3}");
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                  }
                  out.write(__oracle_jsp_text[14]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_9.setValue("${myData.delivery}");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                  }
                  out.write(__oracle_jsp_text[15]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_10.setValue("${myData.deliveryCost}");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                  }
                  out.write(__oracle_jsp_text[16]);
                  {
                    org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_11.setValue("${myData.totalCost}");
                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                  }
                  out.write(__oracle_jsp_text[17]);
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[18]);
            {
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
              __jsp_taghandler_12.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[19]);
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
            }
            out.write(__oracle_jsp_text[20]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[21]);

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
  private static final char __oracle_jsp_text[][]=new char[22][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n<HTML>\n<body>\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\n  Name: ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n  <P>Email: ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n  <P>Order Date: ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n  <P>Jackets ordered: ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n  <P>Hats ordered: ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n  <P>Shirts ordered: ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n  <P>Delivery method: ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n  <P>Delivery cost: ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n  <P>\n  <P>Cost: $".toCharArray();
    __oracle_jsp_text[17] = 
    "\n".toCharArray();
    __oracle_jsp_text[18] = 
    "\n".toCharArray();
    __oracle_jsp_text[19] = 
    "\n  Name not valid!\n".toCharArray();
    __oracle_jsp_text[20] = 
    "\n".toCharArray();
    __oracle_jsp_text[21] = 
    "\n</body>\n</HTML>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
