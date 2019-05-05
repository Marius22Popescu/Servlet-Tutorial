<%@ page import="java.util.List" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List styles=(List)request.getAttribute("coffee");
for(Object style : styles){
	out.println(style);
}

%>

</body>
</html>