<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.io.CharArrayWriter"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>


<% 
    Vector customerVector = new Vector();
    int[] count= new int[1];
  try
  {
   BufferedReader customerin = new BufferedReader(new FileReader("D:/Users/okowitz/Documents/GitHub/CSC516InternetProg2/DataFiles/CUSTOMERS.txt"));
   
  // stores in C:\Documents and Settings\john\Desktop\installs\newjdevstudio1013\jdev\system\oracle.j2ee.10.1.3.36.73\embedded-oc4j\config
  String s; 
     while (true) 
     { 
        s = customerin.readLine(); 
        if (s == null) break; 
        int comma = s.indexOf(',');
        String id = s.substring(0,comma);
         count[0]++;
        customerVector.addElement(id);
    } 
    customerin.close(); 
   
  }
  catch (Exception e) // if there is an error, we execute this code. 
   { 
      out.println("error reading file"); 
   } 
%>




<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz6a</title>
  </head>
  <body> this is a test 
  
  <form ACTION="okowitz6b.jsp" METHOD="POST">
   <%
int i;
     try
    {
        //ResultSet rs1 = stmt2.executeQuery(query1); 
        
         out.println("<select name='CUSTOMERID'>");
      
        //while (rs1.next())
        for (i = 1; i < customerVector.size()+1; i++) 
        
              {
                String cid = (String)customerVector.elementAt(i) ;
                
                out.println(" <option value='" + cid + "'>");
                out.println( cid );
                out.println("</option>");
                
                }
                out.println("</select>");
                
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
    
    %>
  <input type = submit value="Submit">
         </form>
  </body>
</html>