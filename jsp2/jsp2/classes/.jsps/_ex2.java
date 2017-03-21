
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex2 extends com.orionserver.http.OrionHttpJspPage {


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
    _ex2 page = this;
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
      
            rs = s.executeQuery(
              "select * from OFFERINGS where INSTRUCTOR = 'Avitabile'"); 
        
      out.write(__oracle_jsp_text[5]);
        while (rs.next())
            {
        
      out.write(__oracle_jsp_text[6]);
      out.print( rs.getString("CRN") );
      out.write(__oracle_jsp_text[7]);
      out.print( rs.getString("COURSE") );
      out.write(__oracle_jsp_text[8]);
      out.print( rs.getString("SECTION") );
      out.write(__oracle_jsp_text[9]);
      out.print( rs.getString("DATES") );
      out.write(__oracle_jsp_text[10]);
      out.print( rs.getString("TIMES") );
      out.write(__oracle_jsp_text[11]);
      out.print( rs.getString("ROOM") );
      out.write(__oracle_jsp_text[12]);
        
            }
        
      out.write(__oracle_jsp_text[13]);
      
            s.close();
            con.close();
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[14]);

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
  private static final char __oracle_jsp_text[][]=new char[15][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<html>\n  <head>\n    <title>ex2.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[3] = 
    "\n  <P> ".toCharArray();
    __oracle_jsp_text[4] = 
    " courses offered by Avitabile\n  ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n  <TABLE BORDER=\"1\">\n  <TR>\n    <TH>CRN</TH>\n    <TH>Course</TH>\n    <TH>Section</TH>\n    <TH>Date</TH>\n    <TH>Time</TH>\n    <TH>Room</TH>\n  </TR>\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n   <TR>\n    <TD>".toCharArray();
    __oracle_jsp_text[7] = 
    "</TD>\n    <TD>".toCharArray();
    __oracle_jsp_text[8] = 
    "</TD>\n    <TD>".toCharArray();
    __oracle_jsp_text[9] = 
    "</TD>\n    <TD>".toCharArray();
    __oracle_jsp_text[10] = 
    "</TD>\n    <TD>".toCharArray();
    __oracle_jsp_text[11] = 
    "</TD>\n    <TD>".toCharArray();
    __oracle_jsp_text[12] = 
    "</TD>\n  </TR> \n  ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n  </TABLE>\n  ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
