

// An Action class to handle Requests
package strutsproject2;
import org.apache.struts.action.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterAction extends Action 
{ 
  public ActionForward execute(ActionMapping mapping, ActionForm form, 
                               HttpServletRequest request, 
                               HttpServletResponse response) 
                               throws Exception 
  { 
      PreparedStatement stmt;
      PreparedStatement stmt2;
      PreparedStatement stmt3;

      String username = request.getParameter("username"); 
      if (username == null || username.trim().equals(""))
      { 
        return (mapping.findForward("emptyUserName"));   
      }
      String password = request.getParameter("password"); 
      if (password == null || password.trim().equals(""))
      { 
        return (mapping.findForward("emptyPassword"));   
      }
      String url = "jdbc:odbc:registrar";
      Connection con;
      String query = 
            "select COUNT(*) as MATCHES from USERS where USERID like ? " +
                     " and PASSWORD like ?;";
      String query2 = "select COUNT(*) from USERROLES where ROLEID = 1 and " +
                      " USERID like ?;";
      String query3 = 
            "select COUNT(*) as MATCHES from USERS where USERID like ? ";
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
          stmt3 = con.prepareStatement(query3);
          stmt3.setString(1, username);
          ResultSet rs3 = stmt3.executeQuery();            
          rs3.next();
          int matches = rs3.getInt(1);
          if (matches != 1)
              return (mapping.findForward("notUser")); 
          stmt = con.prepareStatement(query);
          stmt.setString(1, username);
          stmt.setString(2, password);
          ResultSet rs = stmt.executeQuery();
          rs.next();
          int match_count = rs.getInt("MATCHES");
          if (match_count > 1)
              return (mapping.findForward("tooManyMatches"));         
          else if (match_count == 0)
            return (mapping.findForward("illegalUsernamePassword"));
          else 
          {    
              stmt2 = con.prepareStatement(query2);
              stmt2.setString(1, username);
              ResultSet rs2 = stmt2.executeQuery();            
              rs2.next();
              matches = rs2.getInt(1);
              if (matches != 1)
                  return (mapping.findForward("notStudent"));   
          }
      }
      catch(SQLException ex)
      {
         System.err.println("SQLException: " + ex.getMessage());
      }
      return (mapping.findForward("success"));
  }
}
