
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex1 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex1 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      
          String connection_string = "jdbc:odbc:registrar";
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
              "select count(*) from OFFERINGS where INSTRUCTOR = 'Avitabile'");
            rs.next();
        
      out.write(__oracle_jsp_text[3]);
      out.print( rs.getString(1) );
      out.write(__oracle_jsp_text[4]);
      
            s.close();
            con.close();
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[5]);

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
  private static final char __oracle_jsp_text[][]=new char[6][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <title>ex1.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  <P> ".toCharArray();
    __oracle_jsp_text[4] = 
    " courses offered by Avitabile\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
