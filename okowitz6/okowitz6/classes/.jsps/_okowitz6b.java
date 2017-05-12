
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.sql.*;


public class _okowitz6b extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 // Declarations ok for the page
  String url = "jdbc:odbc:bakery";
  Connection con;
  Statement stmt1;
  PreparedStatement stmt2;
  String query = "select ORDERID, DATE, LOCATION from ORDERS where CUSTOMERID = ?;";
 
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
           stmt2 = con.prepareStatement(query);
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
    _okowitz6b page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      
          setupDB();
          String input1 = request.getParameter( "customerid" );
          
          try
          {
              stmt2.setString(1, input1);
              ResultSet rs = stmt2.executeQuery();
              
              
      out.write(__oracle_jsp_text[3]);
      
              while (rs.next())
              {
                 String orderid = rs.getString("ORDERID");
                 String date = rs.getString("DATE");
                 String location = rs.getString("LOCATION");
               
          
      out.write(__oracle_jsp_text[4]);
      out.print( orderid );
      out.write(__oracle_jsp_text[5]);
      out.print( date );
      out.write(__oracle_jsp_text[6]);
      out.print( location );
      out.write(__oracle_jsp_text[7]);
      
              }
              }
              catch(SQLException ex)
          {
              System.err.println("SQLException: " + ex.getMessage());
          }  
        
      out.write(__oracle_jsp_text[8]);

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
  private static final char __oracle_jsp_text[][]=new char[9][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>okowitz6b</title>\n  </head>\n  <body>\n   ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n        <TABLE BORDER='1'>\n     <TR>\n       <TH>Order ID</TH>\n       <TH>Date</TH>\n       <TH>Location</TH>\n      \n     </TR>\n    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n           <TR>\n           \n           <TD>".toCharArray();
    __oracle_jsp_text[5] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[6] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[7] = 
    "</TD>\n         \n           </TR>\n           ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n  </TABLE>\n  </body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
