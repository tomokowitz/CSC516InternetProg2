
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex4 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 // Declarations ok for the page
  String connection_string = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement s1, s2;
  String query1 = "select count(*) from OFFERINGS where INSTRUCTOR = ?";
  String query2 = "select * from OFFERINGS where INSTRUCTOR = ?";
  
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
        con = DriverManager.getConnection(connection_string, "", "");
        s1 = con.prepareStatement(query1);
        s2 = con.prepareStatement(query2);
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
    _ex4 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      
          setupDB();
          try
          {
            s1.setString(1, request.getParameter("instructor"));
            ResultSet rs = s1.executeQuery();
            rs.next();
            int myCount = rs.getInt(1);
        
      out.write(__oracle_jsp_text[4]);
      out.print( myCount );
      out.write(__oracle_jsp_text[5]);
      out.print( request.getParameter("instructor") );
      out.write(__oracle_jsp_text[6]);
        if (myCount > 0)
            {
              s2.setString(1, request.getParameter("instructor"));
              rs = s2.executeQuery();
        
      out.write(__oracle_jsp_text[7]);
        while (rs.next())
             {
         
      out.write(__oracle_jsp_text[8]);
      out.print( rs.getString("CRN") );
      out.write(__oracle_jsp_text[9]);
      out.print( rs.getString("COURSE") );
      out.write(__oracle_jsp_text[10]);
      out.print( rs.getString("SECTION") );
      out.write(__oracle_jsp_text[11]);
      out.print( rs.getString("DATES") );
      out.write(__oracle_jsp_text[12]);
      out.print( rs.getString("TIMES") );
      out.write(__oracle_jsp_text[13]);
      out.print( rs.getString("ROOM") );
      out.write(__oracle_jsp_text[14]);
        
             }
        
      out.write(__oracle_jsp_text[15]);
      
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
    "\n<html>\n  <head>\n    <title>ex4.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n  <P> ".toCharArray();
    __oracle_jsp_text[5] = 
    " CIS courses offered by \n         ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n        <TABLE BORDER=\"1\">\n        <TR>\n          <TH>CRN</TH>\n          <TH>Course</TH>\n          <TH>Section</TH>\n          <TH>Date</TH>\n          <TH>Time</TH>\n          <TH>Room</TH>\n        </TR>\n   ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n         <TR>\n          <TD>".toCharArray();
    __oracle_jsp_text[9] = 
    "</TD>\n          <TD>".toCharArray();
    __oracle_jsp_text[10] = 
    "</TD>\n          <TD>".toCharArray();
    __oracle_jsp_text[11] = 
    "</TD>\n          <TD>".toCharArray();
    __oracle_jsp_text[12] = 
    "</TD>\n          <TD>".toCharArray();
    __oracle_jsp_text[13] = 
    "</TD>\n          <TD>".toCharArray();
    __oracle_jsp_text[14] = 
    "</TD>\n        </TR> \n  ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n  </TABLE>\n  ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
