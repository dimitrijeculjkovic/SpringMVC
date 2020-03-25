<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="/saveUser" method="post" modelAttribute="user">
<table>
<tbody>
<tr>
<td> name: </td>
<td>
<form:input path="name" id = "name"/>
</td>


</tr>
<tr>
<td> Surname: </td>
<td>
<form:input path="surname" id = "surname"/>
</td>
</tr>

<tr>
<td> Username: </td>
<td>
<form:input path="username" id = "username"/>
</td>
</tr>

<tr>
<td> Password: </td>
<td>
<form:input path="password" id = "password"/>
</td>
</tr>

<tr>
<td> 
<button id = "save">Save</button>
 </td>

 </tr>

</tbody>



</table>


</form:form>


this is add user page.

${action}
</body>
</html>