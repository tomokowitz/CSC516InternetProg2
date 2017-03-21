
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex6 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  PreparedStatement stmt;
  String query = "select CRN, SECTION, DATES, TIMES, INSTRUCTOR, ROOM " +
                       "from OFFERINGS where COURSE like ?;";
  
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
    _ex6 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      
          setupDB();
          String input1 = request.getParameter( "course" );
          String input2 = request.getParameter( "username" );
          try
          {
              stmt.setString(1, input1);
              ResultSet rs = stmt.executeQuery();
        
      out.write(__oracle_jsp_text[4]);
      
              while (rs.next())
              {
                 String crn = rs.getString("CRN");
                 String section = rs.getString("SECTION");
                 String date = rs.getString("DATES");
                 String time = rs.getString("TIMES");
                 String instructor = rs.getString("INSTRUCTOR");
                 String room = rs.getString("ROOM");
          
      out.write(__oracle_jsp_text[5]);
      out.print(crn);
      out.write(__oracle_jsp_text[6]);
      out.print( crn );
      out.write(__oracle_jsp_text[7]);
      out.print( section );
      out.write(__oracle_jsp_text[8]);
      out.print( date );
      out.write(__oracle_jsp_text[9]);
      out.print( time );
      out.write(__oracle_jsp_text[10]);
      out.print( instructor );
      out.write(__oracle_jsp_text[11]);
      out.print( room );
      out.write(__oracle_jsp_text[12]);
      
              }
          
      out.write(__oracle_jsp_text[13]);
      out.print(input2);
      out.write(__oracle_jsp_text[14]);
      
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[15]);

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
  private static final char __oracle_jsp_text[][]=new char[16][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n  <head>\n    <title>ex6.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n   <FORM ACTION=\"ex7.jsp\" METHOD=\"POST\">\n   <TABLE BORDER='1'>\n     <TR>\n       <TH>Choice</TH>\n       <TH>CRN</TH>\n       <TH>Section</TH>\n       <TH>Date</TH>\n       <TH>Time</TH>\n       <TH>Instructor</TH>\n       <TH>Room</TH>\n     </TR>\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n           <TR>\n           <TD><input type='radio' name='crn' value='".toCharArray();
    __oracle_jsp_text[6] = 
    "'> </TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[7] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[8] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[9] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[10] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[11] = 
    "</TD>\n           <TD>".toCharArray();
    __oracle_jsp_text[12] = 
    "</TD>  \n           </TR>\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n        </TABLE>\n        <input type = submit value=\"Submit\">\n        <INPUT type='hidden' name='username' \n               value='".toCharArray();
    __oracle_jsp_text[14] = 
    "' >\n        </FORM>\n  ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
