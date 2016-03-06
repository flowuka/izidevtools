<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>IziDevTools</title>
	<link href="<c:url value="/resources/css/bootstrap.css" />"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/AdminLTE.css" />"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/skin-green.css" />"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jQuery-2.2.0.min.js" />"></script>
</head>


<body class="hold-transition skin-green sidebar-mini wysihtml5-supported">
	<div class="wrapper">
		
		<jsp:include page="com/header.jsp" />
		<jsp:include page="com/menu.jsp" />
		
		<div class="content-wrapper">
		
			<section class="content-header">
		      	<h1>TODO liste</h1>
		    </section>
		
			<section class="content">
				<div class="row">
					<c:forEach var="item" items="${todoBean.listeTypeTodos}">
						<div class="col-md-4">
	      					<div class="box box-solid box-primary">
	        					<div class="box-header">
	          						<h3 class="box-title">${item.libelle}</h3>
	        					</div>
	        					<div class="box-body">
	        						<c:forEach var="item2" items="${item2.listeTodos}">
										${item2.libelle}	        						
	        						</c:forEach>
	        					</div>
	      					</div>
	    				</div>						
					</c:forEach>
  				</div>
      		</section>
      		
		</div>

	</div>
</body>

</html>