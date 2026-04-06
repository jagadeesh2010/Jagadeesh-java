<%@page import="java.util.List" %>
<%@page import=java.util.Arrays" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "jakarta.tags.core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>JSTL Core Tags</h1>
   
   <c:forEach>  var="a" begin="1" end="10">
     <c:out value="${a}"></c:out><br>
    
   </c:forEach>
   
   <%
    List<String> listNames = Arrays.asList("Rohit","virat","SKt","Dhone","Axar");
   application.setAttribute("name",listNames);
   %>
   <c:forEach> var ="data" items="${names}">
   <ul>
       <c:out value="${data}"></c:out><br>
       </ul>
    </c:forEach>
    
    <c:set> var="age" value="${18}"></c:set>c:set>
    
    <c:out value="${age}"/>/c:out>
    
     <c:remove var="age"/>
     
       <c:out value="${age}"></c:out>
       
  <%--   <c:remove var="age"/>  --%>
  
  <%--    <c:out value="${age}"></C:out> --%>
  
       <c:choose>
         <c:when test="${ age == 18 }">
         <c:out value="just Eligible"></c:out>
         </c:when>
         <c:when test="${age > 18 }">
          <c:out value=""most eleigible"></c:out>
         </c:when>
         <c:otherwise>
         <c:out value="not eleigible for voting"></c:out>
         </c:otherwise>
       </c:choose>
       
       <c:forTokens items="Rogit,virat,kohli,SKY,Axar.All are Players-for-India" delims=",.-" var = "names">
       
       <c:out value=""${names }"></c:out>
     </c:forTokens>  
       
       
    
</body>
</html>