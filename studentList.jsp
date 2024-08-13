<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Student record</h1>

<table>
   <thead>
     <tr>
     <th>ID</th>
       <th>fname</th>
       <th>lname</th>
       <th>email</th>
       <th>mobile</th>
       <th>password</th>
     </tr>
     <tbody>
     <tr>
       <c:forEach var="stud" items="${studList}">
        <tr>
           <td>   <c:out value="${stud.id}" />    </td>
           <td>   <c:out value="${stud.fname}" />    </td>
           <td>   <c:out value="${stud.lname}" />    </td>
           <td>   <c:out value="${stud.email}" />    </td>
           <td>   <c:out value="${stud.mobile}" />    </td>
           <td>   <c:out value="${stud.pass}" />    </td>
        </tr>
       </c:forEach>
     </tr>
   </tbody>
</table>

</body>
</html>