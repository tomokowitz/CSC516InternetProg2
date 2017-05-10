package strutsproject4;

import java.sql.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class RegistrationDataBean 
{
    ArrayList crns;
    String username = "Unknown";
    String firstName = "Unknown";
    String lastName = "Unknown";
    String results = "";

    PreparedStatement stmt1;
    PreparedStatement stmt2;
    PreparedStatement stmt3;
    PreparedStatement stmt4;
    PreparedStatement stmt5;
    
    public RegistrationDataBean() 
    {
        crns = new ArrayList();
        String url = "jdbc:odbc:registrar";
        String query1 = "select COURSE, SECTION, DATES, TIMES, INSTRUCTOR, ROOM"
                       + " from OFFERINGS " +
                         "where CRN = ?";
        String query2 = "select COUNT(*) from ENROLLMENTS " +
                        "where CRN = ? and USERID LIKE ?";
        String query3 = "select ENROLLMAX - ENROLLCURRENT from OFFERINGS " +
                        "where CRN = ? "; 
        String query4 = "insert into ENROLLMENTS(CRN, USERID, ENROLLDATE) " +
                        "values(?, ?, ?)";
        String query5 = "update OFFERINGS " +
                        "set ENROLLCURRENT = ENROLLCURRENT + 1 " +
                        "where CRN = ?";

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
            Connection con = DriverManager.getConnection(url, "", "");
            stmt1 = con.prepareStatement(query1);
            stmt2 = con.prepareStatement(query2);
            stmt3 = con.prepareStatement(query3);
            stmt4 = con.prepareStatement(query4);
            stmt5 = con.prepareStatement(query5);
        }
        catch(SQLException ex)
        {
           System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public String getTable() 
    {
        String temp = "<TABLE BORDER=1>";
        temp = temp + 
                "<TR>" +
                "<TH>CRN</TH>" +
                "<TH>COURSE</TH>" +
                "<TH>SECTION</TH>" +
                "<TH>DATES</TH>" +
                "<TH>TIMES</TH>" +
                "<TH>INSTRUCTOR</TH>" +
                "<TH>ROOM</TH>" +
                "<TH>DELETE</TH>" +
                "</TR>";
        try {
            for (int i = 0; i < crns.size(); i++)
            {
                Integer thisCRN =  (Integer)crns.get(i);
                int crn = thisCRN.intValue();
                stmt1.setInt(1, crn);
                ResultSet rs = stmt1.executeQuery();            
                rs.next();
                temp = temp +  "<TR><TD>" + crn + "</TD>";
                for (int j = 1; j <= 6; j++) 
                {
                    temp = temp + "<TD>" + rs.getString(j) + "</TD>";
                }
                temp = temp + "<TD><input type='checkbox' name='crn' value ='" +
                       crn + "'></TD>";
                temp = temp + "</TR>";
            }
        }
        catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());            
        }
        temp += "</TABLE>";
        return temp;
    }
    
    public String getUsername() 
    {
        return username;
    }
    
    public String getFirstName() 
    {
        return firstName;
    }
    
    public String getLastName() 
    {
        return lastName;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }   
    
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }   
    
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }   
    
    public void setCRN(int crn) 
    {
        crns.add(new Integer(crn));
    } 
    
    public void setDeleteCRN(int myCrn) 
    { 
        Integer crn = new Integer(myCrn);
        for (int i = 0; i < crns.size(); i++) 
        {
            Integer this_one = (Integer)crns.get(i);
            if (this_one.equals(crn))
            {
                crns.remove(i);
                return;
            }
        }
    }  
    
    public ArrayList getCRNs() 
    {
        return crns;
    }
    
    public String getRegister() 
    {
        GregorianCalendar today = new GregorianCalendar();
        String today_date = (today.get(GregorianCalendar.MONTH) + 1) + "/" +
                              today.get(GregorianCalendar.DATE) + "/" +
                              today.get(GregorianCalendar.YEAR);
        results = "";
        for (int i = 0; i < crns.size(); i++) 
        {
            Integer this_crn = (Integer)crns.get(i);
            int crn = this_crn.intValue();
            try 
            {
                stmt2.setInt(1, crn);
                stmt2.setString(2, username);
                ResultSet rs2 = stmt2.executeQuery();
                rs2.next();
                int matches = rs2.getInt(1);
                if (matches == 1) 
                {
                    results += "<P>Already registered in crn " + crn;
                    continue; // end iteration of loop
                }
                stmt3.setInt(1, crn);
                ResultSet rs3 = stmt3.executeQuery();
                rs3.next();
                int seats = rs3.getInt(1);
                if (seats <= 0) 
                {
                    results += "<P>No seats in " + crn;
                    continue; // end iteration of loop
                }   
                stmt4.setInt(1, crn);
                stmt4.setString(2, username);
                stmt4.setString(3, today_date);
                stmt4.executeUpdate();
                stmt5.setInt(1, crn);
                stmt5.executeUpdate();
                results += "<P>You are registered in crn " + crn;
            }
            catch (SQLException e) 
            {
                e.printStackTrace(); 
            }
        }
        crns.clear();
        return results;
    }
    
    public String getResults() 
    {
        return results;
    }
    
}
