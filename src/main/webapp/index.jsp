<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
    <a href="<c:url value="/hello-world-json"/>">json 호출</a><br>
    <a href="<c:url value="/hello-world-page"/>">page 호출</a>
</body>
</html>