
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.sql.*;


public class _okowitz6a extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt1;
  PreparedStatement stmt2;
  String query1 = "select CUSTOMERID from CUSTOMERS;";
  
  public void setupDB()
  {
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
           con = DriverManager.getConnection(url, "", "");
           stmt1 = con.createStatement();
           stmt2 = con.prepareStatement(query1);
    }
    catch(SQLException ex)
    {
        System.err.println("SQLException: " + ex.getMessage());
    }   
  }

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
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      
          setupDB();
          try
          {
              ResultSet rs1 = stmt2.executeQuery(query1); 
              
               out.println("<select name='customerids'>");
            
              while (rs1.next())
                    {
                      String cid = rs1.getString("CUSTOMERID");
                      
                      out.println(" <option value='" + cid + "'>");
                      out.println( cid );
                      out.println("</option>");
                      
                      }
                      out.println("</select>");
              
      out.write(__oracle_jsp_text[6]);
      
              
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[7]);

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
  private static final char __oracle_jsp_text[][]=new char[8][];
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
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz6a</title>\n    <style type=\"text/css\">\n      body {\n      background-color: #ffde73; \n    }\n    </style>\n  </head>\n  <body>\n  <FORM ACTION=\"okowitz6b.jsp\" METHOD=\"POST\">\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n \n  \n  \n  \n   ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n  \n            <input type = submit value=\"Submit\">\n         </form>\n    </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
