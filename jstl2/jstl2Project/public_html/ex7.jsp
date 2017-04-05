<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
  <head>
    <title>ex7</title>
  </head> 
  <body>
    <jsp:useBean id="outFile" class="WriteFileBean">
      <jsp:setProperty name="outFile"  property="file"
          value="data.txt"
      />
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
    
    <c:set target="${outFile}" value="${person}"
           property="line"/> 
    <p><a href="ex8.jsp">Click here to see all data</a>
  </body>
</html>
