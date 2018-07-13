<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product List View"/>
</c:import>
    <section id="main-content">
    		<h2>Toy Department</h2>
    		<div class="container list-container">
    			<c:forEach var="product" items="${productList}">
    			
    				<%-- set variables --%>
				<fmt:parseNumber var = "starvalue" integerOnly = "true" type = "number" value = "${product.averageRating}" />
    				<fmt:parseNumber var = "weightvalue" type = "number" value = "${product.weightInLbs}" />
    				<c:url var="productUrl" value="/productDetail">
    					<c:param name="productId" value="${product.productId}"/>
    				</c:url>
				
				<%-- display --%>


				<div class="row">
					<div class="left">
						<a href="${productUrl}">
							<img src="img/${product.imageName}" class="photo"/>
						</a>
					</div>
    					<div class="right">
	    					<h3>
	    						<a href="${productUrl}">
	    							<c:out value="${product.name}"/>
	    						</a>
	    						<c:if test="${product.topSeller}">
	    							<span>Best Seller!</span>
	    						</c:if>
	    					</h3>
		    				<p>by <c:out value="${product.manufacturer}"/></p>
		    				<c:if test="${product.remainingStock < 5}">
		    					<span>Only ${product.remainingStock} left!</span>
		    				</c:if>
		    				<h4>$<c:out value="${product.price}"/></h4>
		    				<p><strong>Weight</strong> ${weightvalue} lbs</p>
		    				<img src="img/${starvalue}-star.png" class="star"/>
    					</div>
    					
    				</div>
    				
    			</c:forEach>
    		</div>   

       <c:forEach var="item" items="${productList}">
       		<c:out value="${item.name}" /><br />
       </c:forEach>


    </section>
    
<c:import url="/WEB-INF/jsp/footer.jsp"/>