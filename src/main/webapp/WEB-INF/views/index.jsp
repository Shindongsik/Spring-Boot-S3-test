<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/api/aws/s3/upload" enctype="multipart/form-data" method="POST">
		<input type="file" name="file"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>