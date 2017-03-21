
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex9 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  Statement stmt3;
  PreparedStatement stmt4;
  String query4 = "select FNAME, LNAME from USERS where USERID like ?;";
  
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
           stmt3 = con.createStatement();
           stmt4 = con.prepareStatement(query4);
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
    _ex9 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      
          setupDB();
          String input1 = request.getParameter( "username" );
          session.setAttribute("username", input1);
          try
          {
              String query3 = "select distinct OFFERINGS.COURSE, DESCRIPTION " 
                                  + "FROM OFFERINGS inner join COURSES on " +
                                   "OFFERINGS.COURSE = COURSES.COURSE;";
              ResultSet rs3 = stmt3.executeQuery(query3);        
              stmt4.setString(1, input1);
              ResultSet rs4 = stmt4.executeQuery();            
              rs4.next();
          
      out.write(__oracle_jsp_text[4]);
      out.print( rs4.getString("FNAME") );
      out.write(__oracle_jsp_text[5]);
      out.print( rs4.getString("LNAME") );
      out.write(__oracle_jsp_text[6]);
      
                    out.println("<SELECT name='course'>");
                    while (rs3.next())
                    {
                        String cname = rs3.getString("COURSE");
                        String cdesc = rs3.getString("DESCRIPTION");
                        out.println("<OPTION value='" + cname + "'>");
                        out.println(cname + " " + cdesc);
                        out.println("</OPTION>");
                     } 
                     out.println("</SELECT>");
          
      out.write(__oracle_jsp_text[7]);
      
              
          }
          catch (Exception e)
          {
             e.printStackTrace();     
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
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n  <head>\n    <title>ex9.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n              <P>Pick a course, ".toCharArray();
    __oracle_jsp_text[5] = 
    " \n              ".toCharArray();
    __oracle_jsp_text[6] = 
    " \n              <FORM ACTION=\"ex10.jsp\" METHOD=\"POST\">\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n               <input type = submit value=\"Submit\">\n               </form>\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
