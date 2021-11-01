<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/12/2021
  Time: 12:04 AM
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
    <h1>Update ID ${product.id}</h1>
    <table>
        <tr>
            <td>
                <label for="id">ID:</label>
            </td>
            <td>
                <input type="text" name="id" value="${product.id}" id="id">
            </td>
        </tr>
        <tr>
            <td>
                <label for="name">Name:</label>
            </td>
            <td>
                <input type="text" name="name" value="${product.name}" id="name">
            </td>
        <tr>
            <td>
                <label for="price">Price:</label>
            </td>
            <td>
                <input type="text" name="price" value="${product.price}" id="price">
            </td>
        </tr>
        <tr>
            <td>
                <label for="status">Status:</label>
            </td>
            <td>
                <input type="text" name="status" value="${product.status}" id="status">
            </td>
        </tr>
        <tr>
            <td>
                <label for="producer">Producer:</label>
            </td>
            <td>
                <input type="text" name="producer" value="${product.producer}" id="producer">
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

