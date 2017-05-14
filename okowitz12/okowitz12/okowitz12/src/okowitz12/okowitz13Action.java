package okowitz12;

import org.apache.struts.action.Action;
import javax.servlet.http.*;
import java.sql.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class okowitz13Action extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) 
                                 throws Exception 
    {
         
         String orderid = request.getParameter("orderid");
         String name = request.getParameter("ordername");
         String location = request.getParameter("orderlocation");
         String customerid = request.getParameter("customerid");
         Boolean emptyfield = false;
         //one or more of the data fields are empty.
         
          if (orderid == null || orderid.trim().equals(""))
          { 
            emptyfield = true;   
          }
         
         if (name == null || name.trim().equals(""))
         { 
             emptyfield = true;   
         }
         
         if (location == null || location.trim().equals(""))
         { 
             emptyfield = true;  
         }
         
         if (customerid == null || customerid.trim().equals(""))
         { 
             emptyfield = true;  
         }
         
         //one or more of the data fields are empty.
         if(emptyfield)
         {
            return (mapping.findForward("emptyfield"));
         }
         
         String url = "jdbc:odbc:bakery";
         Connection con;
         
         //the ORDERID already exists,
         String query = 
               "select COUNT(*) as ORDERMATCHES from ORDERS where ORDERERID like ? ;";
               
         //the CUSTOMERID does not exist in the 
         //         CUSTOMERS table      
         String query2 = "select COUNT(*) as CUSTMATCHES from CUSTOMERS where CUSTOMERID = ?;";
         
         
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
             Statement stmt3;
             con = DriverManager.getConnection(url, "", "");
             stmt3 = con.createStatement();
             
             //the ORDERID already exists,
             stmt = con.prepareStatement(query);
             stmt.setString(1, orderid);
             
             ResultSet rs = stmt.executeQuery();
             rs.next();
             int order_match_count = rs.getInt("ORDERMATCHES");
             if (order_match_count > 1)
             {
                 return (mapping.findForward("duporder"));         
             }
             stmt2 = con.prepareStatement(query2);
             stmt2.setString(1, customerid);
             ResultSet rs2 = stmt2.executeQuery();
             rs2.next();
             int cust_match_count = rs2.getInt("CUSTOMERMATCHES");
             if (cust_match_count > 1)
             {
                 return (mapping.findForward("nocustomer"));    
             }
             
             stmt3.executeUpdate("insert into ORDERS (ORDERID, NAME, LOCATION, CUSTOMERID) values(" +
                                            orderid + ",'" + name + "','" + location +
                                            "'," + customerid + ");");
                                            
             
             
         }
         catch(SQLException ex)
         {
            System.err.println("SQLException: " + ex.getMessage());
         }
         return (mapping.findForward("success")); 
    }
}
