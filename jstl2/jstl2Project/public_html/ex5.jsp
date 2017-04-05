<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex5</title>
  </head> 
  <body>
    <jsp:useBean id="people" scope="application"
               class="PeopleBean">
    </jsp:useBean>
    <jsp:useBean id="person" scope="request"
               class="PersonInfo">
    </jsp:useBean>
    <c:set target="${person}" value="${param.name}"
           property="name"/>
    <c:set target="${person}" value="${param.email}"
           property="email"/>
    <c:set target="${person}" value="${param.phone}"
           property="phone"/>
    <c:set target="${person}" value="${param.bet}"
           property="bet"/>
    <c:set target="${person}" value="${param.number}"
           property="number"/>
    <h1>Information entered for
       <c:out value="${person.name}" />
    </h1>
    <c:set target="${people}" value="${person}"
           property="person"/>    
  </body>
</html>
