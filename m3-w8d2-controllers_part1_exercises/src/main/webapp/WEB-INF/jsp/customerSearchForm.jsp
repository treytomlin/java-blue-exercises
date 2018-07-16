<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Customer Search Form</title>
</head>
<body>
	<c:url value="/searchCustomers" var="formAction" />
	<form method="GET" action="${formAction}">
	<label for="name">Search Word: </label>
	<input type="text" id="searchTerm" name="searchTerm"/>
	<label for="sortBy">Sort By:</label>
	<select name="sortBy">
		<option value="first_name"> First Name </option>
		<option value="last_name"> Last Name</option>
		<option value="email"> Email</option>
		<option value="active"> Active</option>
	</select>
	<input type="submit" value="search customers" />
	
	</form>

</body>
</html>