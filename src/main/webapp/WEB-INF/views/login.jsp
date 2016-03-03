<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>IziDevTools</title>
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/AdminLTE.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/skin-green.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>


<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
		 	<a><b>Izi</b>DevTools</a>
		</div>
		<div class="login-box-body">
  			<p class="login-box-msg">Entrez vos identifiants...</p>
  			
  			<spring:url value="/login/validate" var="userActionUrl" />
			<form:form action="${userActionUrl}" method="post" modelAttribute="loginBean">
				<form:errors path="*" class="error" />
				<div class="form-group has-feedback">
					<form:input path="login" class="form-control" placeholder="Identifiant"/>
					<span class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
	      			<form:password path="motDePasse" class="form-control" placeholder="Mot de passe"/>
	      			<span class="glyphicon glyphicon-lock form-control-feedback"></span>
	    		</div>
	    		<div class="row">
	    			<div class="col-xs-3">
	    			</div>
					<div class="col-xs-6">
	  					<button type="submit" class="btn btn-primary btn-block btn-flat"><spring:message code="commun.go" /></button>
					</div>
			  	</div>
			</form:form>

			<a href="#">Mot de passe oublié</a><br>

		</div>
	</div>
</body>

</html>