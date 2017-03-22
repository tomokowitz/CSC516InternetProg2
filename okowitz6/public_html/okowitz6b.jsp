<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.io.CharArrayWriter"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>

<% 
    String fldOrderid;
    String fldDate;
    String fldLocation;
    Vector orderVector = new Vector();
    Vector dateVector = new Vector();
    Vector locationVector = new Vector();
    
    int[] count= new int[1];
  try
  {
   BufferedReader orderin = new BufferedReader(new FileReader("D:/Users/okowitz/Documents/GitHub/CSC516InternetProg2/DataFiles/ORDERS.txt"));
   
  // stores in C:\Documents and Settings\john\Desktop\installs\newjdevstudio1013\jdev\system\oracle.j2ee.10.1.3.36.73\embedded-oc4j\config
  String s; 
     while (true) 
     { 
        s = orderin.readLine(); 
        if (s == null) break; 
        int comma = s.indexOf(',') ;
        String id = s.substring(0,comma);
        String secondSubstring = s.substring(comma+1);
        int secondComma = secondSubstring.indexOf(',');
        String date = secondSubstring.substring(0, secondComma);
        String thirdSubstring = secondSubstring.substring(secondComma+1);
        int thirdComma = thirdSubstring.indexOf(',');
        String location = thirdSubstring.substring(0,thirdComma);
        String customerid = thirdSubstring.substring(thirdComma+1);
        if(customerid.equals(request.getParameter("CUSTOMERID")))
        { 
            orderVector.addElement(id);
            dateVector.addElement(date);
            locationVector.addElement(location);
        }
         count[0]++;
        
    } 
    orderin.close(); 
   
  }
  catch (Exception e) // if there is an error, we execute this code. 
   { 
      out.println("error reading file"); 
   } 
%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz6b</title>
  </head>
  <body> this is only a test 
  
  
  <TABLE BORDER='1'>
     <TR>
       <TH>Order ID</TH>
       <TH>Date</TH>
       <TH>Location</TH>
      
     </TR>
     <% int i;
        for (i = 0; i < orderVector.size(); i++) {
            fldOrderid = (String)orderVector.elementAt(i);
            fldDate = (String)dateVector.elementAt(i);
            fldLocation = (String)locationVector.elementAt(i);
       
        %>
     <TR>
           
           <TD><%= fldOrderid %></TD>
           <TD><%= fldDate %></TD>
           <TD><%= fldLocation %></TD>
         
      </TR>
           <%
        }
        %>
  </TABLE>
  </body>
</html>