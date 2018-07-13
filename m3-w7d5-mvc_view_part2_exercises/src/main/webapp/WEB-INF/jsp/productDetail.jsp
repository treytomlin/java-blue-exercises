<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product Detail View"/>
</c:import>

	<section id="main-content">
	
	<%-- set variables --%>
	<fmt:parseNumber var = "starvalue" integerOnly = "true" type = "number" value = "${product.averageRating}" />
    	<fmt:parseNumber var = "weightvalue" type = "number" value = "${product.weightInLbs}" />
	
	<%-- display --%>
	<div class="container detail-container">
		<div class="detail-left">
			<img src="img/${product.imageName}" class="photo"/>
		</div>
		<div class="detail-right">
			<h3>
				<c:out value="${product.name}"/>
				<c:if test="${product.topSeller}">
		    			<span>Best Seller!</span>
		    		</c:if>
			</h3>
			<p>by ${product.manufacturer}</p>
			<img src="img/${starvalue}-star.png" class="star"/>
			<br/><br/>
			<c:if test="${product.remainingStock < 5}">
				<span>Only ${product.remainingStock} left!</span>
				<br/>
			</c:if>
			<h4>$<c:out value="${product.price}"/></h4>
			<p><strong>Weight</strong> ${weightvalue} lbs</p>
			<br/>
			<p><strong>Description:</strong> <c:out value="${product.description}"/></p>
		</div>
	</div>
	
	
	</section>

<c:import url="/WEB-INF/jsp/footer.jsp"/>