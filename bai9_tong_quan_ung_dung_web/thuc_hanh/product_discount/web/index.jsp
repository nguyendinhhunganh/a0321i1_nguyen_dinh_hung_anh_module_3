<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/13/2021
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form class="product" method="post" action="/productDiscount">
    <table>
      <tr>
        <td>
          Product Description:
        </td>
        <td>
          <input type="text" name="productDescription">
        </td>
      </tr>
      <tr>
        <td>
          List Price
        </td>
        <td>
          <input type="text" name="listPrice">
        </td>
      </tr>
      <tr>
        <td>
          <label> Discount Percent:</label>
        </td>
        <td>
          <input type="text" name="discountPercent">
        </td>
      </tr>
    </table>
    <input type="submit" id="submit" value="Calculate">
  </form>
  </body>
</html>
