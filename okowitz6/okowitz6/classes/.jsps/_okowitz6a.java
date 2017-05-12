
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.sql.*;


public class _okowitz6a extends com.orionserver.http.OrionHttpJspPage {


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
    _okowitz6a page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      
          String connection_string = "jdbc:odbc:bakery";
          Connection con;
          try
          {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          }
          catch(java.lang.ClassNotFoundException e)
          {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
          }
          try
          {
            con = DriverManager.getConnection (connection_string,"","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(
              "SELECT DISTINCT CUSTOMERID FROM CUSTOMERS");
              out.println("<SELECT name='customerid'>");
            while (rs.next())
                    {
                      String cid = rs.getString("CUSTOMERID");
                      
                      out.println(" <option value='" + cid + "'>");
                      out.println( cid );
                      out.println("</option>");
                      
                      }
                      out.println("</select>");
        
      out.write(__oracle_jsp_text[2]);
      
              
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[3]);

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
  private static final char __oracle_jsp_text[][]=new char[4][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz6a</title>\n  </head>\n  <body>\n  <FORM ACTION=\"okowitz6b.jsp\" METHOD=\"POST\">\n  ".toCharArray();
    __oracle_jsp_text[2] = 
    "\n  \n   ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  \n            <input type = submit value=\"Submit\">\n         </form>\n  \n  \n  \n  \n  \n  \n  \n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
