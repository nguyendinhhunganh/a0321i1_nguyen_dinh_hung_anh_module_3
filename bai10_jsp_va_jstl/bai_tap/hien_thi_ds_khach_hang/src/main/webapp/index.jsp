<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/28/2021
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Danh Sách khách Hàng</h1>
  <table>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerListServlet}" varStatus="loop">
      <tr>
        <td><c:out value="${customer.name}"></c:out></td>
        <td><c:out value="${customer.day_of_birth}"></c:out></td>
        <td><c:out value="${customer.address}"></c:out></td>
        <td><img src="<c:url value="${customer.image}"/> "></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
