<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>
<h2>List AllLeads</h2>
<table>
   <tr>
      <td>Id</td>
      <td>First Name</td>
      <td>Last Name</td>
      <td>Email</td>
      <td>Mobile</td>
      <td>Action</td>
      <td>Action</td>
   </tr>
   <c:forEach var = "lead" items="${leads}" >
    <tr>
      <th>${lead.id}</th>
      <th>${lead.firstName}</th>
      <th>${lead.lastName}</th>
      <th>${lead.email}</th>
      <th>${lead.mobile}</th>
      <th><a href="delete?id=${lead.id}">delete</a></th>
      <th><a href="update?id=${lead.id}">update</a></th>
   </tr>
      </c:forEach>
</table>
${leads}
</body>
</html>