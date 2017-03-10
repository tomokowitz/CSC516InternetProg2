<%-- Example 2 --%>
<% String name = request.getParameter("name");
   String color = request.getParameter("color");
%>
<html>
<head><title>JSP Example 2 Results</title></head>
<body bgcolor=
<%= color %>
>
<h1>Hello 
<%= name  %>
. Your favorite color is
<%= color %>
.
</h1>
</body>
</html>