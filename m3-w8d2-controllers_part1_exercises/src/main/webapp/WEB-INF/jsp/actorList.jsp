<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<!-- Form goes here -->
<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
	<td> ${actor.lastName}, ${actor.firstName}</td> 
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>