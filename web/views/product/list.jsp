<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh Vu
  Date: 9/6/2019
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
    <link rel="stylesheet" type="text/css" href="/css/Style.css">
</head>
<body>
<div class="container">
    <h1>Product List</h1>
    <p>
        <a href="/products?action=create">Create a New Customer</a>
    </p>
    <form method="post">
        <input type="text" name="txtSearch" id="search">
        <button type="submit">Search</button>
    </form>
        <table>
            <tr>
                <td> Product ID </td>
                <td> Product Name</td>
                <td> Product Price</td>
                <td> Product Picture</td>
            </tr>
            <c:forEach items="${requestScope['products']}" var ='product'>
                <tr>
                    <td>${product.getId()}</td>
                    <td>${product.getName()}</td>
                    <td>${product.getPrice()}</td>
                    <td><img src="<%= request.getContextPath()%>/images/${product.getPicture()}"/></td>
                    <td><a href="/products?action=update&id=${product.getId()}">Edit</a></td>
                    <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
                </tr>

            </c:forEach>


        </table>



</div>

</body>
</html>
