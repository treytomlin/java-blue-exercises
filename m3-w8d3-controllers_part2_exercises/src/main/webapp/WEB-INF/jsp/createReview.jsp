<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Create A Review</title>
</head>
<body>
<h1>Please fill out the review form</h1>

<c:url var="addReviewURL" value="/addReview"/>

<form action="${addReviewURL}" method="POST" >
	Username: <br />
	<input type="text" name="username">
	<br />
	Review Title: <br />
	<input type="text" name="title">
	<br />
	Review: <br />
	<input type="text" name="text">
	<br />
	Rating: <br/>
	<input type="radio" name="rating" value="1" checked> One Star <br />
	<input type="radio" name="rating" value="2"> Two Stars <br />
	<input type="radio" name="rating" value="3"> Three Stars <br />
	<input type="radio" name="rating" value="4"> Four Stars <br />
	<input type="radio" name="rating" value="5"> Five Stars <br />
	<input type="submit"/>
	
	
</form>


</body>
</html>