<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/28/2021
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table tr td {
            padding: 10px;
        }
        input {
            width: 350px;
            height: 40px;
            padding: 5px;
            border-radius: 5px;
        }
        button {
            padding: 5px;
            border-radius: 5px;
            width: 150px;
            height: 30px;
        }
    </style>
</head>
<body>
<form method="post">
    <h1>Update ID ${customer.id}</h1>
    <table>
        <tr>
            <td>
                <label for="id">ID:</label>
            </td>
            <td>
                <input type="text" name="id" value="${customer.id}" id="id">
            </td>
        </tr>
        <tr>
            <td>
                <label for="name">Name:</label>
            </td>
            <td>
                <input type="text" name="name" value="${customer.name}" id="name">
            </td>
        <tr>
            <td>
                <label for="email">Email:</label>
            </td>
            <td>
                <input type="text" name="email" value="${customer.email}" id="email">
            </td>
        </tr>
        <tr>
            <td>
                <label for="address">Address:</label>
            </td>
            <td>
                <input type="text" name="address" value="${customer.address}" id="address">
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">update</button>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
