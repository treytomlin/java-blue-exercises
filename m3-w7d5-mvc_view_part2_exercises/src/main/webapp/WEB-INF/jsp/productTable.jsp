<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product List View"/>
</c:import>
    <section id="main-content">
		<h2>Toy Department</h2>
		<div class="container table-container">				
			<table cellspacing="0">
				<tr>
					<th></th>
					<c:forEach var="product" items="${productList}">
						<c:url var="productUrl" value="/productDetail">
    							<c:param name="productId" value="${product.productId}"/>
    						</c:url>
						<td>
							<a href="${productUrl}">
								<img src="img/${product.imageName}" class="photo"/>
							</a>
							<c:if test="${product.topSeller}">
								<div class="best-seller-container">
									<span>Best Seller!</span>
								</div>
	    						</c:if>
	    					</td>
					</c:forEach>
				</tr>
				<tr>
					<th>Name</th>
					<c:forEach var="product" items="${productList}">
						<c:url var="productUrl" value="/productDetail">
    							<c:param name="productId" value="${product.productId}"/>
    						</c:url>
						<td>
							<a href="${productUrl}">
								<c:out value="${product.name}"/>
							</a>
						</td>
					</c:forEach>
				</tr>
				<tr>
					<th>Rating</th>
					<c:forEach var="product" items="${productList}">
						<td>
							<fmt:parseNumber var = "starvalue" integerOnly = "true" type = "number" value = "${product.averageRating}" />
							<img src="img/${starvalue}-star.png" class="star"/>
	    					</td>
					</c:forEach>
				</tr>
				<tr>
					<th>Mfr</th>
					<c:forEach var="product" items="${productList}">
						<td><c:out value="${product.manufacturer}"/></td>
					</c:forEach>
				</tr>
				<tr>
					<th>Price</th>
					<c:forEach var="product" items="${productList}">
						<td><h4>$<c:out value="${product.price}"/></h4></td>
					</c:forEach>
				</tr>
				<tr>
					<th>wt. (in lbs)</th>
					<c:forEach var="product" items="${productList}">
						<fmt:parseNumber var = "weightvalue" type = "number" value = "${product.weightInLbs}" />
						<td>${weightvalue}</td>
					</c:forEach>
				</tr>
			</table>
		</div>
    </section>

<c:import url="/WEB-INF/jsp/footer.jsp"/>