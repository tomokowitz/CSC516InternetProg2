<%--- Request, session and application scope variables --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex4</title>
  </head>
  <body>
   <P>The name for this page is <c:out value="${pageName}"/>.
   <P>The name for this request is <c:out value="${requestName}"/>.
   <P>The email for this request is <c:out value="${param.email}"/>.
   <P>The phone for this request is <c:out value="${param.phone}"/>.
   <P>The message from the last page was <c:out value="${param.msg}"/>.
   <P>The message from the last page was <c:out value="${Math.random}"/>.
  </body>
</html>
