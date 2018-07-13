
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>${param.pageTitle}</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
    
    		<c:url var="listUrl" value="/productList"/>
    		<c:url var="tableUrl" value="/productTable"/>
    		<c:url var="tileUrl" value="/productTiles"/>
        <ul>
            <li><a href="${listUrl}">List</a></li>
            <li><a href="${tileUrl}">Tile</a></li>
            <li><a href="${tableUrl}">Table</a></li>
        </ul>
        
    </nav>