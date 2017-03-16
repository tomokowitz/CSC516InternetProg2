<%-- ex14.jsp --%>
<%@ page contentType="text/html;charset=windows-1252"%>

<P>You made an error!
<P><%= request.getParameter( "error" ) %>
<P>Hit back button to try again!
