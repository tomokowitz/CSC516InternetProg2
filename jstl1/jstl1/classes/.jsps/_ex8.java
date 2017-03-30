
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean9;
import Bean8;


public class _ex8 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex8 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      Bean8 myData;
      synchronized (pageContext) {
        if ((myData = (Bean8) pageContext.getAttribute( "myData", PageContext.PAGE_SCOPE)) == null) {
          myData = (Bean8) new Bean8();
          pageContext.setAttribute( "myData", myData, PageContext.PAGE_SCOPE);
          out.write(__oracle_jsp_text[4]);
          OracleJspRuntime.__jspSetAllParams(request, (Object)myData, true);
          out.write(__oracle_jsp_text[5]);
        }
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue("${myData.name}");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue("${myData.email}");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue("${myData.orderDate}");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setVar("jacket_cost");
        __jsp_taghandler_4.setValue("0");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setTest("${! empty param.product1}");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[11]);
            {
              org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_5);
              __jsp_taghandler_6.setValue("${param.quantity1}");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            out.write(__oracle_jsp_text[12]);
            {
              org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
              __jsp_taghandler_7.setParent(__jsp_taghandler_5);
              __jsp_taghandler_7.setTest("${param.quantity1>1}");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[13]);
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
            }
            out.write(__oracle_jsp_text[14]);
            {
              org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_5);
              __jsp_taghandler_8.setVar("jacket_cost");
              __jsp_taghandler_8.setValue("50");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            out.write(__oracle_jsp_text[15]);
          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setVar("hat_cost");
        __jsp_taghandler_9.setValue("0");
        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setTest("${! empty param.product2}");
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[18]);
            {
              org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_10);
              __jsp_taghandler_11.setValue("${param.quantity2}");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
            }
            out.write(__oracle_jsp_text[19]);
            {
              org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
              __jsp_taghandler_12.setParent(__jsp_taghandler_10);
              __jsp_taghandler_12.setTest("${param.quantity2>1}");
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[20]);
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
            }
            out.write(__oracle_jsp_text[21]);
            {
              org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
              __jsp_taghandler_13.setParent(__jsp_taghandler_10);
              __jsp_taghandler_13.setVar("hat_cost");
              __jsp_taghandler_13.setValue("10");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
            }
            out.write(__oracle_jsp_text[22]);
          } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[23]);
      {
        org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setVar("shirt_cost");
        __jsp_taghandler_14.setValue("0");
        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[24]);
      {
        org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setTest("${! empty param.product3}");
        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[25]);
            {
              org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
              __jsp_taghandler_16.setParent(__jsp_taghandler_15);
              __jsp_taghandler_16.setValue("${param.quantity3}");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
            }
            out.write(__oracle_jsp_text[26]);
            {
              org.apache.taglibs.standard.tag.el.core.IfTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.el.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.IfTag.class,"org.apache.taglibs.standard.tag.el.core.IfTag test");
              __jsp_taghandler_17.setParent(__jsp_taghandler_15);
              __jsp_taghandler_17.setTest("${param.quantity3>1}");
              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[27]);
                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
            }
            out.write(__oracle_jsp_text[28]);
            {
              org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
              __jsp_taghandler_18.setParent(__jsp_taghandler_15);
              __jsp_taghandler_18.setVar("shirt_cost");
              __jsp_taghandler_18.setValue("20");
              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
            }
            out.write(__oracle_jsp_text[29]);
          } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
      }
      out.write(__oracle_jsp_text[30]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_19.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[31]);
            {
              org.apache.taglibs.standard.tag.el.core.WhenTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.el.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.WhenTag.class,"org.apache.taglibs.standard.tag.el.core.WhenTag test");
              __jsp_taghandler_20.setParent(__jsp_taghandler_19);
              __jsp_taghandler_20.setTest("${param.delivery == 'ups'}");
              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[32]);
                  {
                    org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                    __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                    __jsp_taghandler_21.setVar("delivery_cost");
                    __jsp_taghandler_21.setValue("5");
                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                    if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                  }
                  out.write(__oracle_jsp_text[33]);
                } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
            }
            out.write(__oracle_jsp_text[34]);
            {
              org.apache.taglibs.standard.tag.el.core.WhenTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.el.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.WhenTag.class,"org.apache.taglibs.standard.tag.el.core.WhenTag test");
              __jsp_taghandler_22.setParent(__jsp_taghandler_19);
              __jsp_taghandler_22.setTest("${param.delivery == 'firstclass'}");
              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[35]);
                  {
                    org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                    __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                    __jsp_taghandler_23.setVar("delivery_cost");
                    __jsp_taghandler_23.setValue("4");
                    __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                    if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                  }
                  out.write(__oracle_jsp_text[36]);
                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
            }
            out.write(__oracle_jsp_text[37]);
            {
              org.apache.taglibs.standard.tag.el.core.WhenTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.el.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.WhenTag.class,"org.apache.taglibs.standard.tag.el.core.WhenTag test");
              __jsp_taghandler_24.setParent(__jsp_taghandler_19);
              __jsp_taghandler_24.setTest("${param.delivery == 'fedex'}");
              __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[38]);
                  {
                    org.apache.taglibs.standard.tag.el.core.SetTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.el.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.SetTag.class,"org.apache.taglibs.standard.tag.el.core.SetTag var value");
                    __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                    __jsp_taghandler_25.setVar("delivery_cost");
                    __jsp_taghandler_25.setValue("8");
                    __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                    if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                  }
                  out.write(__oracle_jsp_text[39]);
                } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
            }
            out.write(__oracle_jsp_text[40]);
          } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
      }
      out.write(__oracle_jsp_text[41]);
      {
        org.apache.taglibs.standard.tag.el.core.OutTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.el.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.el.core.OutTag.class,"org.apache.taglibs.standard.tag.el.core.OutTag value");
        __jsp_taghandler_26.setParent(null);
        __jsp_taghandler_26.setValue("${jacket_cost * param.quantity1\n                + hat_cost * param.quantity2\n                + shirt_cost * param.quantity3\n                + delivery_cost}");
        __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
        if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,1);
      }
      out.write(__oracle_jsp_text[42]);

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
  private static final char __oracle_jsp_text[][]=new char[43][];
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
    "\n<HTML>\n<body>\nName: ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n<P>Email: ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n<P>Order Date: ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\n  <P>Ordered ".toCharArray();
    __oracle_jsp_text[12] = 
    " \n     Jacket".toCharArray();
    __oracle_jsp_text[13] = 
    "s".toCharArray();
    __oracle_jsp_text[14] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n".toCharArray();
    __oracle_jsp_text[16] = 
    "\n".toCharArray();
    __oracle_jsp_text[17] = 
    "\n".toCharArray();
    __oracle_jsp_text[18] = 
    "\n  <P>Ordered ".toCharArray();
    __oracle_jsp_text[19] = 
    " \n     Hat".toCharArray();
    __oracle_jsp_text[20] = 
    "s".toCharArray();
    __oracle_jsp_text[21] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n".toCharArray();
    __oracle_jsp_text[23] = 
    "\n".toCharArray();
    __oracle_jsp_text[24] = 
    "\n".toCharArray();
    __oracle_jsp_text[25] = 
    "\n  <P>Ordered ".toCharArray();
    __oracle_jsp_text[26] = 
    " \n     Shirt".toCharArray();
    __oracle_jsp_text[27] = 
    "s".toCharArray();
    __oracle_jsp_text[28] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n".toCharArray();
    __oracle_jsp_text[30] = 
    "\n<P>\n".toCharArray();
    __oracle_jsp_text[31] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n    Sent by UPS\n    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n    Sent by USPS First Class\n    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n    Sent by Federal Express\n    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n".toCharArray();
    __oracle_jsp_text[41] = 
    "\n<P>Cost: $".toCharArray();
    __oracle_jsp_text[42] = 
    "\n</body>\n</HTML>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
