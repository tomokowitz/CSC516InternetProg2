<%-- Example 1 --%>
<html>
<head><title>JSP Example 1 Results</title></head>
<body>
<h1>Hello 
<% 
   out.println(" " + request.getParameter("name")); 
%>
</h1>
</body>
</html>