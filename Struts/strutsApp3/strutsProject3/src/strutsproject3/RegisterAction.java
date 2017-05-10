package strutsproject3;

import javax.servlet.http.*;
import org.apache.struts.action.*;  // Action, ActionForm, etc.
import org.apache.struts.actions.*; // DispatchAction
import java.sql.*;

public class RegisterAction extends DispatchAction 
{

    public ActionForward register
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {   
        String answer1 = findInputError(request);
        if (! answer1.equalsIgnoreCase("ok"))
            return (mapping.findForward(answer1));  
        String answer2 = findDataError(request);
        System.err.println(answer2);
        if (! answer2.equalsIgnoreCase("ok"))
            return (mapping.findForward(answer2));  
        return (mapping.findForward("register"));
    }
    
    public ActionForward drop
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {
        String answer1 = findInputError(request);
        if (! answer1.equalsIgnoreCase("ok"))
            return (mapping.findForward(answer1));  
        String answer2 = findDataError(request);
        if (! answer2.equalsIgnoreCase("ok"))
            return (mapping.findForward(answer2));  
        return (mapping.findForward("drop"));    
    }
    
    public ActionForward see
                           (ActionMapping mapping,
                            ActionForm form,
                            HttpServletRequest request,
                            HttpServletResponse response)
        throws Exception 
    {
        String answer1 = findInputError(request);
        if (! answer1.equalsIgnoreCase("ok"))
            return (mapping.findForward(answer1));  
        String answer2 = findDataError(request);
        if (! answer2.equalsIgnoreCase("ok"))
            return (mapping.findForward(answer2));  
        return (mapping.findForward("see"));    
    }
    
    private String findInputError(HttpServletRequest request) 
    {
        String username = request.getParameter("username"); 
        if (username == null || username.trim().equals(""))
        { 
          return ("emptyUserName");   
        }
        String password = request.getParameter("password"); 
        if (password == null || password.trim().equals(""))
        { 
          return ("emptyPassword");   
        }
        return ("OK");
    }
    
    private String findDataError(HttpServletRequest request) 
    {    
        String username = request.getParameter("username");
        String password = request.getParameter("password");
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
            PreparedStatement stmt;
            PreparedStatement stmt2;
            PreparedStatement stmt3;
            con = DriverManager.getConnection(url, "", "");
            stmt3 = con.prepareStatement(query3);
            stmt3.setString(1, username);
            ResultSet rs3 = stmt3.executeQuery();            
            rs3.next();
            int matches = rs3.getInt(1);
            if (matches != 1)
                return ("notUser"); 
            stmt = con.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            int match_count = rs.getInt("MATCHES");
            if (match_count > 1)
                return ("tooManyMatches");         
            else if (match_count == 0)
              return ("illegalUsernamePassword");
            else 
            {    
                stmt2 = con.prepareStatement(query2);
                stmt2.setString(1, username);
                ResultSet rs2 = stmt2.executeQuery();            
                rs2.next();
                matches = rs2.getInt(1);
                if (matches != 1)
                    return ("notStudent");   
            }
        }
        catch(SQLException ex)
        {
           System.err.println("SQLException: " + ex.getMessage());
        }
        return "ok";
    }
}
