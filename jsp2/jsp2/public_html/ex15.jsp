<%-- ex15.jsp --%>
<%--Same as ex12.jsp, different forward --%>
<%@ include file="ex13.jsp" %> 
<%-- Static content --%>
<html>
  <head>
    <title>ex15.jsp</title>
  </head>
  <body>
  <%
    setupDB();
    String input1 = request.getParameter( "username" );
    String input2 = request.getParameter( "password" );
    try
    {
        stmt.setString(1, input1);
        stmt.setString(2, input2);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int match_count = rs.getInt("MATCHES");
        if (match_count > 1)
        {
    %>
           <jsp:include page="ex14.jsp">
             <jsp:param name="error" value="Too many matches" />
           </jsp:include>
           <%-- dynamic or constant --%>
    <%
        }
        else if (match_count == 0)
        {
    %>
           <jsp:include page="ex14.jsp">
             <jsp:param name="error" value="Not a legal username/password" />
           </jsp:include>
    <%  
        }
        else 
        {
            stmt2.setString(1, input1);
            ResultSet rs2 = stmt2.executeQuery();            
            rs2.next();
            int matches = rs2.getInt(1);
            if (matches != 1)
            { 
    %>
            <jsp:include page="ex14.jsp">
             <jsp:param name="error" value="Not a student" />
           </jsp:include>
    <%   
            }
            else 
            {
    %>
    <jsp:forward page="ex16.jsp" />
    <%
            }
        }
        
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
