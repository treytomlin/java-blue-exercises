<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>filmSearchForm</title>
</head>
<body>
	<c:url value="/searchFilms" var="formAction" />
		<form method="GET" action="${formAction}">
			<label for="name">Film Genre:</label>
			<input type="text" id="genre" name="genre" />
			<label for="minLength">Minimum Film Length: </label> 	
			<input type="text" id="minLength" name="minLength" />
			<label for="maxLength">Maximum Length:</label>
			<input type="text" id="maxLength" name="maxLength"/>
			<input type="submit" value = "search films"/>
		</form>
	</body>
</html>