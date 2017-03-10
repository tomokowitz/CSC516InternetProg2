<%-- Example 4 --%>
<%! int redCount=0;
    int greenCount=0;
    int blueCount=0;
%>
<% String name = request.getParameter("name");
   String color = request.getParameter("color");
   if (color.equals("red"))
     redCount++;
   else if (color.equals("green"))
     greenCount++;
   else
     blueCount++;
%>
<html>
<head><title>JSP Example 4 Results</title></head>
<body text=
<%= color %>
>
<h1>Hello 
<%= name  %>
. Your favorite color is
<%= color %>
.
<P>
Votes so far:
<P>
<TABLE BORDER=1>
<TR><TH>Color</TH><TH>Count</TH></TR>
<TR><TD>Red</TD><TD><%= redCount %></TD></TR>
<TR><TD>Green</TD><TD><%= greenCount %></TD></TR>
<TR><TD>Blue</TD><TD><%= blueCount %></TD></TR>
</TABLE>
</h1>
</body>
</html>