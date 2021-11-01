<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--

  Created by IntelliJ IDEA.
  User: HP
  Date: 10/20/2021
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");

    String search = request.getParameter("search");

    String result = dic.get(search);
    if (result != null) {
        out.prinln("Word: " + search);
        out.prinln("Result: " + result);
    } else {
        out.println("Not found");
    }

%>
</body>
</html>
