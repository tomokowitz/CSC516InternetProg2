
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex12 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 
  String url = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement stmt;
  PreparedStatement stmt2;
  String query = "select COUNT(*) as MATCHES from USERS where USERID like ? " +
                      " and PASSWORD like ?;";
  String query2 = "select COUNT(*) from USERROLES where ROLEID = 1 and " +
                       " USERID like ?;";
  
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
           stmt = con.prepareStatement(query);
           stmt2 = con.prepareStatement(query2);
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
    _ex12 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write("");
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      
          setupDB();
          String input1 = request.getParameter( "username" );
          String input2 = request.getParameter( "password" );
          try
          {
              stmt.setString(1, input1);
              stmt.setString(2, input2);
              ResultSet rs = stmt.executeQuery();
              rs.next();
              int match_count = rs.getInt("MATCHES");
              if (match_count > 1)
              {
          
      out.write(__oracle_jsp_text[7]);
      {
        String __url=OracleJspRuntime.toStr("ex14.jsp");
        __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"error" } ,new String[] {OracleJspRuntime.toStr("Too many matches") } );
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[8]);
      out.write(__oracle_jsp_text[9]);
      
              }
              else if (match_count == 0)
              {
          
      out.write(__oracle_jsp_text[10]);
      {
        String __url=OracleJspRuntime.toStr("ex14.jsp");
        __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"error" } ,new String[] {OracleJspRuntime.toStr("Not a legal username/password") } );
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[11]);
        
              }
              else 
              {
                  stmt2.setString(1, input1);
                  ResultSet rs2 = stmt2.executeQuery();            
                  rs2.next();
                  int matches = rs2.getInt(1);
                  if (matches != 1)
                  { 
          
      out.write(__oracle_jsp_text[12]);
      {
        String __url=OracleJspRuntime.toStr("ex14.jsp");
        __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"error" } ,new String[] {OracleJspRuntime.toStr("Not a student") } );
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[13]);
         
                  }
                  else 
                  {
          
      out.write(__oracle_jsp_text[14]);
      if (true) {
        String __url=OracleJspRuntime.toStr("ex9.jsp");
        // Forward 
        pageContext.forward( __url);
        return;
      }

      out.write(__oracle_jsp_text[15]);
      
                  }
              }
              
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[16]);

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
  private static final char __oracle_jsp_text[][]=new char[17][];
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
    " \n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n<html>\n  <head>\n    <title>ex12.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n           ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n           ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n           ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
