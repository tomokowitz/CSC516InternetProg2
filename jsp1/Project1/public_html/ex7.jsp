<%-- Example 7--%>
<%@ page import="java.util.*"%>
<%! int[] count= new int[3];
    String[] colors = {"Red", "Green", "Blue"};
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
   Vector colorVector = new Vector();
   Vector nameVector = new Vector();
   Object temp = session.getAttribute( "colors" ); 
   if (temp != null)
   {
     colorVector = (Vector)session.getAttribute( "colors" ); 
     nameVector = (Vector)session.getAttribute( "names" ); 
   }  
   colorVector.addElement(color);
   nameVector.addElement(name);
%>
<html>
  <head>
    <title>JSP Example 7 Results</title>
  </head>
  <body text="<%= color %>"><h1>
      Hello
      <%= name  %>
      . Your favorite color is
      <%= color %>
      .
    </h1>Record of all votes made (since server started):<p>
      &nbsp;
    </p><table border="1">
      <tr>
        <th>Color</th>
        <th>Count</th>
      </tr>
      <% for (i = 0; i <= 2; i++) 
      out.println("<TR><TD>" + colors[i] + "</TD><TD>" + count[i] +
                   "</TD></TR>");
%>
    </table><p>Record of all votes made in this session:</p><p>
      &nbsp;
    </p><table border="1">
      <tr>
        <th>Color</th>
        <th>Count</th>
      </tr>
      <% for (i = 0; i < colorVector.size(); i++) 
     out.println("<TR><TD>" + (String)colorVector.elementAt(i) 
                  + "</TD><TD>" + (String)nameVector.elementAt(i)
                  + "</TD></TR>");
    session.setAttribute( "colors", colorVector ); 
    session.setAttribute( "names", nameVector );     
%>
    </table></body>
</html>