
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;


public class _ex16 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 
  String url = "jdbc:odbc:registrar";
  Statement stmt3;
  PreparedStatement stmt4;
  Connection con;
  String query3 = "select CRN, COURSE, SECTION, DATES, TIMES, " +
                        "INSTRUCTOR, ROOM " +
                          "from OFFERINGS;";
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
    _ex16 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write("");
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      
          setupDB();
          String input1 = request.getParameter( "username" );
          session.setAttribute("username", input1);
          try
          {
              ResultSet rs = stmt3.executeQuery(query3);        
              stmt4.setString(1, input1);
              ResultSet rs4 = stmt4.executeQuery();            
              rs4.next();
          
      out.write(__oracle_jsp_text[6]);
      out.print( rs4.getString("FNAME") );
      out.write(__oracle_jsp_text[7]);
      out.print( rs4.getString("LNAME") );
      out.write(__oracle_jsp_text[8]);
      
                while (rs.next())
                {
                   String crn = rs.getString("CRN");
                   String course = rs.getString("COURSE");
                   String section = rs.getString("SECTION");
                   String date = rs.getString("DATES");
                   if (date == null) date = "&nbsp;";
                   String time = rs.getString("TIMES");
                   if (time == null) time = "&nbsp;";
                   String instructor = rs.getString("INSTRUCTOR");
                   if (instructor == null) instructor = "&nbsp;";
                   String room = rs.getString("ROOM");
                   if (room == null) room = "&nbsp;";
                   out.println("<TR>");
                   out.println("<TD><input type='checkbox' name='crn" + crn +
                                  "' value='" + crn + "'></TD>");
                   out.println("<TD>" + crn + "</TD>");
                   out.println("<TD>" + course + "</TD>");
                   out.println("<TD>" + section + "</TD>");     
                   out.println("<TD>" + date + "</TD>");
                   out.println("<TD>" + time + "</TD>");   
                   out.println("<TD>" + instructor + "</TD>");
                   out.println("<TD>" + room + "</TD>");   
                   out.println("</TR>");
                }
          
      out.write(__oracle_jsp_text[9]);
      
              
          }
          catch (Exception e)
          {
             e.printStackTrace();     
          }
        
      out.write(__oracle_jsp_text[10]);

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
  private static final char __oracle_jsp_text[][]=new char[11][];
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
    " \n<html>\n  <head>\n    <title>ex16.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n              <P>Pick sections, ".toCharArray();
    __oracle_jsp_text[7] = 
    " \n              ".toCharArray();
    __oracle_jsp_text[8] = 
    " \n              <FORM ACTION=\"ex18.jsp\" METHOD=\"POST\">\n              <TABLE BORDER='1'>\n              <TR>\n              <TH>Choice</TH>\n              <TH>CRN</TH>\n              <TH>Course</TH>\n              <TH>Section</TH>\n              <TH>Date</TH>\n              <TH>Time</TH>\n              <TH>Instructor</TH>\n              <TH>Room</TH>\n              </TR>\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n         </table>\n         <input type = submit value=\"Submit\">\n         </form>\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
