<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<table class="table">
<tr>
<th>Name</th>
<th>Email</th>
<th>Active</th>
</tr>
<c:forEach items="${customers}" var="customer">
<tr>
	<td>${customer.firstName}, ${customer.lastName}</td>
	<td>${customer.email}</td>
	<td>${customer.active}</td>
	</tr>
	</c:forEach>
	
</table>

<%@include file="common/footer.jspf"%>