<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${operator == 'addition'}">
    ${firstOperand} + ${secondOperand} = ${result}
</c:if>
<c:if test="${operator == 'subtraction'}">
    ${firstOperand} - ${secondOperand} = ${result}
</c:if>
<c:if test="${operator == 'multiplication'}">
    ${firstOperand} * ${secondOperand} = ${result}
</c:if>
<c:if test="${operator == 'division'}">
    ${firstOperand} / ${secondOperand} = ${result}
</c:if>
</body>
</html>