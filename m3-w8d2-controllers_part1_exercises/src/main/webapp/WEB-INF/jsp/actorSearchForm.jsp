<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Actor Search Form</title>
</head>
<body>
	<c:url value="/actorSearch" var="formAction" />
	<form method="GET" action="${formAction}">
		<label for="name">Last Name:</label>
		<input type="text" id="lastName" name="lastName" />
		<input type="submit" value="search actors"/>

	</form> 



</body>
</html>