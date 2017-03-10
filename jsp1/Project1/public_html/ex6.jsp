<%-- Example 6 --%>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>

<%  int[] count= new int[3];
    String[] colors = {"Red", "Green", "Blue"};
    Vector colorVector = new Vector();
    Vector nameVector = new Vector();

   try 
   { 
     BufferedReader in = new BufferedReader(new FileReader("c:/mydata.txt")); 
  // stores in C:\Documents and Settings\john\Desktop\installs\newjdevstudio1013\jdev\system\oracle.j2ee.10.1.3.36.73\embedded-oc4j\config
     String s; 
     while (true) 
     { 
        s = in.readLine(); 
        if (s == null) break; 
        int colon = s.indexOf(':');
        String color = s.substring(0,colon);
        String name = s.substring(colon+1);
        if (color.equals("red"))
          count[0]++;
        else if (color.equals("green"))
          count[1]++;
        else
          count[2]++;
        colorVector.addElement(color);
        nameVector.addElement(name);
      } 
      in.close(); 
   } 
   catch (Exception e) // if there is an error, we execute this code. 
   { 
      out.println("error reading file"); 
   } 
  
   int i;
   String name = request.getParameter("name");
   String color = request.getParameter("color");
   if (color.equals("red"))
     count[0]++;
   else if (color.equals("green"))
     count[1]++;
   else
     count[2]++;
   colorVector.addElement(color);
   nameVector.addElement(name);
%>
<html>
<head><title>JSP Example 6 Results</title></head>
<body text=
<%= color %>
>
<h1>Hello 
<%= name  %>
. Your favorite color is
<%= color %>
.
</h1>
Votes so far:
<P>
<TABLE BORDER=1>
<TR><TH>Color</TH><TH>Count</TH></TR>
<% for (i = 0; i <= 2; i++) 
      out.println("<TR><TD>" + colors[i] + "</TD><TD>" + count[i] +
                   "</TD></TR>");
%>
</TABLE>
<P>
Record of all votes made (since server started):
<P>
<table border=1>
<TR><TH>Color</TH><TH>Count</TH></TR>
<% for (i = 0; i < colorVector.size(); i++) 
     out.println("<TR><TD>" + (String)colorVector.elementAt(i) 
                  + "</TD><TD>" + (String)nameVector.elementAt(i)
                  + "</TD></TR>");
%>
</table>
<%
    try { 
         PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(
               "c:/mydata.txt"))); 
         for (i = 0; i < colorVector.size(); i++) 
           file.println((String)colorVector.elementAt(i) 
                  + ":" + (String)nameVector.elementAt(i));
         file.close(); 
    } 
    catch (Exception ex) { 
    } 
%>
<p>
And here is what the file looks like:
<P>
<%
   try 
   { 
     BufferedReader in = new BufferedReader(new FileReader("c:/mydata.txt")); 
     String s; 
     while (true) 
     { 
        s = in.readLine(); 
        if (s == null) break;  
        out.println(s + "\n<BR>"); 
      } 
      in.close(); 
   } 
   catch (Exception e) // if there is an error, we execute this code. 
   { 
      out.println("error reading file"); 
   } 
%>
</body>
</html>