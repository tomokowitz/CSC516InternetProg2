<%--- Request, session and application scope variables --%>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
  <head>
    <title>ex3</title>
  </head>
  <body>
    <jsp:useBean id="myRandom"
              class="RandomBean">
       <jsp:setProperty name="myRandom" property="minRange" 
                      value="0"/>
       <jsp:setProperty name="myRandom" property="maxRange" 
                      value="9"/>
     </jsp:useBean>
   <P>The name for this page is <c:out value="${pageName}"/>.
   <P>The name for this request is <c:out value="${requestName}"/>.
   <P>The email for this request is <c:out value="${param.email}"/>.
   <P>The message from the last page was <c:out value="${param.msg}"/>.
   <P>Today's winning number is
   <c:set var="number" value="0" />
   <c:forEach begin="1" end="3" var="i">
     <c:set var="digit" value="${myRandom.random}"/>
<%---     <c:set var="digit" value="1"/>
---%>
     <c:out value="${digit}"/>
     <c:set var="number" value="${number * 10 + digit}" />
   </c:forEach>            
   <c:choose>
       <c:when test="${number == param.number}">
         You would win <fmt:formatNumber type="currency"
                       value="${param.bet * 600}" 
                       minFractionDigits="2"
                       maxFractionDigits="2" />
       </c:when>
       <c:otherwise>
         You would lose <fmt:formatNumber type="currency"
                       value="${param.bet}" 
                       minFractionDigits="2"
                       maxFractionDigits="2" />
       </c:otherwise>
    </c:choose>
  </body>
</html>
