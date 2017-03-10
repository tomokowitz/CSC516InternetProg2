<%-- Example 5 --%>
<%@page import="java.util.*" %>
<%! int[] count= new int[3];
    String[] colors = {"Red", "Green", "Blue"};
    Vector colorVector = new Vector();
    Vector nameVector = new Vector();
%>
<% int i;
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
<head><title>JSP Example 5 Results</title></head>
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
</body>
</html>