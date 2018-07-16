<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>


<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${films}" var="films">
<tr>
	<td> ${films.title}, ${films.description}, ${films.releaseYear}, ${films.length}, ${films.rating}</td>
	</tr>
	</c:forEach>


</table>

<%@include file="common/footer.jspf"%>