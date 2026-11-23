<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Blood donor details</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Blood Group</th>
    </tr>

    <tr>
        <td>${id}</td>
        <td>${name}</td>
        <td>${email}</td>
        <td>${mobile}</td>
        <td>${group}</td>
    </tr>
</table>

</body>
</html>