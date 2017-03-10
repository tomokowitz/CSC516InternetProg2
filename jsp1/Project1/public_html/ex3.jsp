<%-- Example 3 --%>

<html>
<head><title>JSP Example 3 Results</title></head>
<body text=
<%= request.getParameter("color") %>
>
<h1>Hello 
<%= request.getParameter("name")  %>
. Your favorite color is
<%= request.getParameter("color") %>
.
</h1>
</body>
</html>