<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <form action="/users" method="post">
            <input type="hidden" name="action" value="search">
            <input style="border-radius: 5px; width: 200px;padding: 10px; margin: 10px" type="search" name="searchCountry" placeholder="searchCountry">
            <button style="border-radius: 5px; padding: 10px; margin: 10px" type="submit">
                search
            </button>
        </form>
        <form action="/users" method="post">
            <input type="hidden" name="action" value="searchId">
            <input style="border-radius: 5px; width: 200px;padding: 10px; margin: 10px" type="search" name="searchId" placeholder="searchId">
            <button style="border-radius: 5px; padding: 10px; margin: 10px" type="submit">
                search
            </button>
        </form>
        <br>
        <button style="border-radius: 5px; padding: 10px; margin: 10px" type="submit">
            <a style="color: black; text-decoration: none" href="/users?action=sort">SortName</a>
        </button>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>