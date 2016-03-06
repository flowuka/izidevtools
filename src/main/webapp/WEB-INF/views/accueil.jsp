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
		      	<h1>Tableau de bord</h1>
		    </section>
		
		
			<section class="content">
				<div class="row">
        			<div class="col-md-3">
          				<div class="box box-success box-solid">
            				<div class="box-header with-border">
              					<h3 class="box-title">Nombre de TODO en attente</h3>
				            </div>
				            <div class="box-body">
	            				<p>TODO : alimenter</p>
	            			</div>
		          		</div>
	        		</div>
	        		<div class="col-md-3">
          				<div class="box box-warning box-solid">
            				<div class="box-header with-border">
              					<h3 class="box-title">Périodes non saisie</h3>
				            </div>
				            <div class="box-body">
	            				<p>TODO : alimenter</p>
	            			</div>
		          		</div>
	        		</div>
	        		<div class="col-md-3">
          				<div class="box box-danger box-solid">
            				<div class="box-header with-border">
              					<h3 class="box-title">Indicateur 3</h3>
				            </div>
				            <div class="box-body">
	            				<p>Corp de l'indicateur 3</p>
	            			</div>
		          		</div>
	        		</div>
	        		<div class="col-md-3">
          				<div class="box box-success box-solid">
            				<div class="box-header with-border">
              					<h3 class="box-title">Indicateur 4</h3>
				            </div>
				            <div class="box-body">
	            				<p>Corp de l'indicateur 4</p>
	            			</div>
		          		</div>
	        		</div>
	      		</div>
      		</section>
		</div>

	</div>
</body>

</html>