<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
<s:form method="post" modelAttribute="product">
     Product ID:<input type="text" name="productId"/><br>
     Product Name:<input type="text" name="name"/><br>
     Product Description:<input type="text" name="description"/><br>
     Product Price:<input type="text" name="price"/><br>
     <input type="submit" name="Save" value="Save"/>
</s:form>
</body>
</html>