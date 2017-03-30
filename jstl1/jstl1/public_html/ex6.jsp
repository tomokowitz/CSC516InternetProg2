<%-- Another example of c tag library --%>
<%-- Verify the password match --%>
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<HTML>
<body>
<h1>
  <c:if 
     test="${empty param.my_password1 || empty param.my_password2}">
     One of the password fields are either null or ''
  </c:if>
  <P>
  <c:choose>
    <c:when test="${ param.my_password1 == param.my_password2}">
      Password matches!
    </c:when>
    <c:otherwise>
      Password doesn't match!
    </c:otherwise>
  </c:choose>
</body>
</HTML>