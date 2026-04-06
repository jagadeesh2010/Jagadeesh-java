<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <c:set> var="today" value="<%= new Date()%>"></c:set>
     
     <p> Time <strong><fmt:formateDate type="time" value="${today}" /></strong></p><br><br>
     
     <p> Date : <strong><fmt:formatDate value="${today}" /> </strong></p></p><br><br>
     
     <p> Date &amp; Time : <strong><fmt:formatDate type="both" value="${today}"/> </strong>strong></p><br>
     
     <p> Date &amp;  <strong><fmt:formatDate type="both" value="${today}"/> </strong>strong></p><br>
     
     

</body>
</html>