<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form:form modelAttribute="registration">
<form:errors path="*" cssclass="errorblock" element="div" />
<table>
<tr>
<td>Name</td>
<td><form: input type="textbox">Name</form:></td>

</tr>
<tr>
<td colspan="2" ><input type="submit" value="Add Registration" ></td>
</tr>
</table>
</form:form>
</body>
</html>