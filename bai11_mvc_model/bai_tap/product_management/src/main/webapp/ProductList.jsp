<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table tr tr, td {
            padding: 10px;
        }
    </style>
</head>
<body>
<h1>Product Management</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name Product</th>
        <th>Price</th>
        <th>Status</th>
        <th>Producer</th>
        <th>Update</th>
        <th>Delete</th>
        <th>See details</th>
    </tr>
    <c:forEach var="product" items="#{productServlet}" varStatus="loop">
        <tr>
            <td><c:out value="${product.id}"></c:out></td>
            <td><c:out value="${product.name}"></c:out></td>
            <td><c:out value="${product.price}"></c:out></td>
            <td><c:out value="${product.status}"></c:out></td>
            <td><c:out value="${product.producer}"></c:out></td>
            <td>
                <button><a href="/product?action=update&id=${product.id}">Edit</a></button>
            </td>
            <td>
                <button><a href="/product?action=remove&id=${product.id}">remove</a></button>
            </td>
            <td>
                <button><a href="/product?action=seeDetails&id=${product.id}">See Details</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
<button><a href="/product?action=create">create</a></button>
</body>
</html>
