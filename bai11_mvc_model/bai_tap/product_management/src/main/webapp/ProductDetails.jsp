<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/12/2021
  Time: 1:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        a {
            text-decoration: none;
            color: black;
            padding: 5px;
        }
        table tr td {
            padding: 5px;
        }
        button {
            padding: 5px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<form method="post">
    <h1> See Details Product id ${product.id}</h1>
<table>
    <tr>
        <td>
            <p>ID:</p>
        </td>
        <td>
            <p>${product.id}</p>
        </td>
    </tr>
    <tr>
        <td>
            <p>Name:</p>
        </td>
        <td>
            <p>${product.name}</p>
        </td>
    <tr>
        <td>
            <p>Price:</p>
        </td>
        <td>
            <p>${product.price}</p>
        </td>
    </tr>
    <tr>
        <td>
            <p>Status:</p>
        </td>
        <td>
            <p>${product.status}</p>
        </td>
    </tr>
    <tr>
        <td>
            <p>Producer:</p>
        </td>
        <td>
            <p>${product.producer}</p>
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
            <button type="submit">Back Product List</button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
