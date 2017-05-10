package okowitz12;

import org.apache.struts.action.Action;
import javax.servlet.http.*;
import java.sql.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class okowitz12Action extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) 
                                 throws Exception 
    {
         
         return (mapping.findForward(" ")); 
         
         
         return (mapping.findForward(" ")); 
         
                 
         String url = "jdbc:odbc:bakery";
         Connection con;
         Statement stmt;
         
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
             
             stmt.executeUpdate("insert into ORDERS values(" +
                                            input1 + ",'" + input2 + "','" + today_date +
                                            "','');");
         }
         catch(SQLException ex)
         {
            System.err.println("SQLException: " + ex.getMessage());
         }
         
         
         
         
         return (mapping.findForward("okowitz12success")); 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                                 
     }
    public okowitz12Action() {
    }
}
