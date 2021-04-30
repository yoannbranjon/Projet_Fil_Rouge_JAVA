<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>espacePro</title>
</head>
<body>

	<c:import url="header.jsp">
		<c:param name="title" value="espacePro" />
	</c:import>
	
	<form method="post" action="espacePro">
    	<label for="firstName">First Name : </label>
    	<input type="text" id="firstName" name="firstName" />
    	
    	<label for="lastName">Last Name : </label>
    	<input type="text" id="lastName" name="lastName" />
    	
    	<input type="submit" />
    </form>
    
    <c:if test="${ !empty sessionScope.firstName and !empty sessionScope.lastName }">
    	<p>
    		<c:out value="Bonjour, ${ sessionScope.firstName } ${ sessionScope.lastName }" />
    	</p>
    </c:if>

</body>
</html>