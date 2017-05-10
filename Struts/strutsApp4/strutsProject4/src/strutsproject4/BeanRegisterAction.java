package strutsproject4;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import java.sql.*;

public class BeanRegisterAction extends Action 
{
  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response)
      throws Exception 
  {
    UserFormBean userBean = (UserFormBean)form;
    String course = userBean.getCourse();
    String section = userBean.getSection();
    if ((course == null) ||
        (course.length() != 6) ||
        (! course.substring(0,3).equalsIgnoreCase("CIS")) ||
        (course.charAt(3) < '0' && course.charAt(3) > '9') ||
        (course.charAt(4) < '0' && course.charAt(4) > '9') ||
        (course.charAt(5) < '0' && course.charAt(5) > '9')
       ) // bad course
    {
      request.setAttribute("suggestionBean",
                           SuggestionUtils.getSuggestionBean());
      return(mapping.findForward("badCourse"));
    } 
    else if ((section == null) ||
                (section.length() != 2) ||
                (section.charAt(0) != 'E' && section.charAt(0) != '0' &&
                    section.charAt(0) != '1') ||
                (section.charAt(1) < '0' && section.charAt(1) > '9')
               ) // bad section
    {
      request.setAttribute("suggestionBean",
                           SuggestionUtils.getSuggestionBean());
      return(mapping.findForward("badSection"));
    } 
    else 
    {
        String url = "jdbc:odbc:registrar";
        Connection con;
        String query = 
              "select COUNT(*) as MATCHES from OFFERINGS where COURSE like ? " +
                       " and SECTION like ?;";
        String query2 = 
              "select CRN from OFFERINGS where COURSE like ? " +
                       " and SECTION like ?;";
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
            con = DriverManager.getConnection(url, "", "");
            stmt = con.prepareStatement(query);
            stmt.setString(1, course);
            stmt.setString(2, section);
            ResultSet rs = stmt.executeQuery();            
            rs.next();
            int matches = rs.getInt(1);
            if (matches != 1)
                return (mapping.findForward("notExists")); 
            PreparedStatement stmt2; 
            stmt2 = con.prepareStatement(query2);
            stmt2.setString(1, course);
            stmt2.setString(2, section);
            ResultSet rs2 = stmt2.executeQuery();            
            rs2.next();
            HttpSession session = request.getSession(true);
            RegistrationDataBean data;
            data = (RegistrationDataBean)session.getAttribute("data");
            data.setCRN(rs2.getInt("CRN")); 
        }
        catch(SQLException ex)
        {
           System.err.println("SQLException: " + ex.getMessage());
        }
        return(mapping.findForward("success"));
    }
  }
}
