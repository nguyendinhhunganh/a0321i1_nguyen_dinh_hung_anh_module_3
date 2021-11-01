<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/28/2021
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <h1>Update ID ${customer.id}</h1>
    <table>
        <tr>
            <td>
                <label for="idCreate">ID:</label>
            </td>
            <td>
                <input type="text" name="id" value="${customer.id}" id="idCreate">
            </td>
        </tr>
        <tr>
            <td>
                <label for="nameCreate">Name:</label>
            </td>
            <td>
                <input type="text" name="name" value="${customer.name}" id="nameCreate">
            </td>
        <tr>
            <td>
                <label for="emailCreate">Email:</label>
            </td>
            <td>
                <input type="text" name="email" value="${customer.email}" id="emailCreate">
            </td>
        </tr>
        <tr>
            <td>
                <label for="addressCreate">Address:</label>
            </td>
            <td>
                <input type="text" name="address" value="${customer.address}" id="addressCreate">
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">create</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
