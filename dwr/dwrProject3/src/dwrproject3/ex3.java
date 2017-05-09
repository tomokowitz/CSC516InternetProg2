package dwrproject3;

import java.sql.*;

import java.util.ArrayList;

public class ex3 {

    public Student getStudent(String userid, String password) {
        Student student = new Student(userid, password, "Not Found", "", "", "", "", 
                                      "", "", "");
        String connection_string = "jdbc:odbc:classes";
        Connection con;
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(java.lang.ClassNotFoundException e)
        {
          return student;
        }
        try
        {
          con = DriverManager.getConnection (connection_string,"","");
          String query = 
            "SELECT FIRSTNAME, LASTNAME, PHONE, DOB, MAJOR, ADDRESS, " +
            "CITY, STATE " +
            "FROM STUDENTS WHERE USERID = ? AND PASSWORD = ?";
          PreparedStatement s = con.prepareStatement(query);
          s.setString(1, userid);
          s.setString(2, password);
          ResultSet rs = s.executeQuery();
          if (rs.next())
          {
            student = new Student( userid, password, rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7), rs.getString(8)); 
          }
        }
        catch (Exception e)
        {
        }
        return student; 
    }
    
    public ArrayList getStudents() {
        ArrayList students = new ArrayList();
        String connection_string = "jdbc:odbc:classes";
        Connection con;
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(java.lang.ClassNotFoundException e)
        {
          return students;
        }
        try
        {
          con = DriverManager.getConnection (connection_string,"","");
          String query = 
            "SELECT * FROM STUDENTS";
          PreparedStatement s = con.prepareStatement(query);
          ResultSet rs = s.executeQuery();
          while (rs.next())
          {
            students.add( new Student( rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10)));
          }
        }
        catch (Exception e)
        {
        }  
        return students;
    }
    
    public void setStudent(Student student) {  
        String connection_string = "jdbc:odbc:classes";
        Connection con;
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(java.lang.ClassNotFoundException e)
        {
          return;
        }
        try
        {
          con = DriverManager.getConnection (connection_string,"","");
          String query = 
            "UPDATE STUDENTS SET FIRSTNAME = ?, LASTNAME = ?, PHONE = ?, " +
             "DOB = ?, MAJOR = ?, ADDRESS = ?, CITY = ?, STATE = ? " +
             "WHERE USERID = ?";
          PreparedStatement s = con.prepareStatement(query);
          s.setString(9, student.getUserid());
          s.setString(1, student.getFirstName());
          s.setString(2, student.getLastName());
          s.setString(3, student.getPhone());
          s.setString(4, student.getDob());
          s.setString(5, student.getMajor());
          s.setString(6, student.getAddress());
          s.setString(7, student.getCity());
          s.setString(8, student.getState());
          s.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }       
    }
}
