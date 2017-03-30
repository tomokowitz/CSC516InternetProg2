<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<html>
  <head>
    <title>ex9</title>
  </head> 
  <body>
      <p>Everything ok about:
      <p>Mountain: <c:out value="${param.mountain}" /></p>
      <c:catch var="exception" >
        <p>Date: <fmt:parseDate value="${param.date}"
                       dateStyle="short"
                       type="date"/></p>
      </c:catch>
      <c:if test="${exception != null}">
          <jsp:forward page="ex10.jsp">
            <jsp:param name="msg"
             value="Illegal format for the date"/>
          </jsp:forward>
      </c:if>
      <c:catch var="exception">
        <p>Climber ID:
           <fmt:parseNumber value="${param.id}"
                            integerOnly="true"/></p>
      </c:catch>
      <c:if test="${exception != null}">
          <jsp:forward page="ex10.jsp">
            <jsp:param name="msg"
             value="Illegal format for the climber id"/>
          </jsp:forward>
      </c:if>
  </body>
</html>
