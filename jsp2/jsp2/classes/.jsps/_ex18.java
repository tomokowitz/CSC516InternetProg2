
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.Enumeration;


public class _ex18 extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 // Declarations ok for the page
  String url = "jdbc:odbc:registrar";
  Connection con;
  Statement stmt;
  
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
           stmt = con.createStatement();
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
    _ex18 page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      
            setupDB();
            String input2 = (String)session.getAttribute("username");
            if (input2 == null)
            {
              out.println("No section selected");
              out.println( "</BODY></HTML>" );
              return;
            }
            GregorianCalendar today = new GregorianCalendar();
            String today_date = (today.get(GregorianCalendar.MONTH) + 1) + "/" +
                                  today.get(GregorianCalendar.DATE) + "/" +
                                  today.get(GregorianCalendar.YEAR);
            try
            {
              Enumeration e = request.getParameterNames();
              while (e.hasMoreElements())
              {
                String paramName = (String)e.nextElement();
                if (paramName.startsWith("crn")) 
                {
                  String input1 = request.getParameter(paramName);
                  ResultSet result1 = stmt.executeQuery(
                                           "select COUNT(*) from ENROLLMENTS" 
                                            + " where CRN = " + input1  +
                                            " and USERID ='" + input2 + "';");
                  result1.next();
                  boolean ok1 = (result1.getInt(1) == 0);
                  ResultSet result2 = stmt.executeQuery(
                                              "select COUNT(*) from OFFERINGS "
                                              + "where CRN = " + input1 + ";");
                  result2.next();      
                  boolean ok2 = (result2.getInt(1) == 1);
                  ResultSet result3 = stmt.executeQuery(
                                                  "select ENROLLMAX - ENROLLCURRENT " 
                                                    + "from OFFERINGS where CRN = " 
                                                    + input1 + ";");
                  result3.next();      
                  boolean ok3 = (result3.getInt(1) >= 1);
                  if (ok1 && ok2 && ok3)
                  {
                      stmt.executeUpdate("insert into ENROLLMENTS values(" +
                                     input1 + ",'" + input2 + "','" + today_date +
                                     "','');");
                      stmt.executeUpdate("update OFFERINGS set ENROLLCURRENT = " +
                                       "ENROLLCURRENT + 1 WHERE CRN = " 
                                       + input1 + ";");
                      out.println("<P>Insert made into CRN " + input1 );
                  }
                 else if (! ok1)
                 {
                    String this_error = "Already registered for " + input1;
          
      out.write(__oracle_jsp_text[6]);
      {
        String __url=OracleJspRuntime.toStr("ex14.jsp");
        __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"error" } ,new String[] {OracleJspRuntime.toStr(this_error) } );
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[7]);
        
                 }
                 else if (! ok2)
                 {
                    String this_error = "No such CRN " + input1;
          
      out.write(__oracle_jsp_text[8]);
      {
        String __url=OracleJspRuntime.toStr("ex14.jsp");
        __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"error" } ,new String[] {OracleJspRuntime.toStr(this_error) } );
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[9]);
        
                 }
                 else if (! ok3)
                 {
                    String this_error = input1 + " is full";
          
      out.write(__oracle_jsp_text[10]);
      {
        String __url=OracleJspRuntime.toStr("ex14.jsp");
        __url=OracleJspRuntime.genPageUrl(__url,request,response,new String[] {"error" } ,new String[] {OracleJspRuntime.toStr(this_error) } );
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[11]);
        
                 }
                }
              }
            }
            catch (Exception e)
            {
               e.printStackTrace();     
            }
        
      out.write(__oracle_jsp_text[12]);

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
  private static final char __oracle_jsp_text[][]=new char[13][];
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
    "\n<html>\n  <head>\n    <title>ex18.jsp</title>\n  </head>\n  <body>\n  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n  </body>\n</html>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
