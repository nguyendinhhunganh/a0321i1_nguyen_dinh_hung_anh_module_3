<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/28/2021
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Calculator</h1>

  <form action="/calculator" method="post">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>
            <label> First operand:</label>
          </td>
          <td>
            <input type="number" name="firstOperand">
          </td>
        </tr>
        <tr>
          <td>
            <label> Operator: </label>
          </td>
          <td>
            <select name="operator">
              <option value="addition">Addition</option>
              <option value="subtraction">Subtraction</option>
              <option value="multiplication">Multiplication</option>
              <option value="division">Division</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            <label> Second Operand: </label>
          </td>
          <td>
            <input type="number" name="secondOperand">
          </td>
        </tr>
        <tr>
          <td></td>
          <td>
            <button type="submit">Calculator</button>
          </td>
        </tr>
      </table>
    </fieldset>
  </form>  </body>
</html>
