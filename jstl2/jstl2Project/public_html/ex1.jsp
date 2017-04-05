<%--- Page, request, session and application scope variables --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex1</title>
  </head>
  <body> 
    <c:set var="requestCounter" scope="request"
          value="${request.counter + 1}" />
    <c:set var="sessionCounter" scope="session"
          value="${sessionCounter + 1}" />
    <c:set var="applCounter" scope="application"
          value="${applCounter + 1}" />
    <c:set var="pageName" scope="page"
          value="${param.name}" />
    <c:set var="requestName" scope="request"
          value="${param.name}" />
    <c:set var="pageEmail" scope="page"
          value="${param.email}" />
    <c:set var="requestEmail" scope="request"
          value="${param.email}" />
    This page has been accessed 
    <c:out value="${sessionCounter}" /> times
    during this session, and 
    <c:out value="${applCounter}" /> times since
    the application was started
    and 
    <c:out value="${requestCounter}" /> times by this request.
   <P>The name for this page is <c:out value="${pageName}"/>.
   <P>The email for this page is <c:out value="${pageEmail}"/>.
   <P>The name for this request is <c:out value="${requestName}"/>.
   <P>The email for this request is <c:out value="${requestEmail}"/>.
  
  </body>
</html>
