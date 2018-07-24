<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Greetings!</title>
	</head>
	<body>
		<h1>Hello, <c:out value="${username}" />!</h1>
		<img src="etc/forDummies.png">
		<br/>
		<br/>
		<c:forEach items="${reviews}" var="review">
		
		${review.username} <br/>
		${review.title} <br/>
		${review.text} <br/>
		${review.rating} <br/>
		${review.dateSubmitted} <br/>
		<br/>
		<br/>
		<br/>
		
		</c:forEach>c:forEach>
	</body>
	
</html>