<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<aside class="main-sidebar">
	<section class="sidebar">
		<ul class="sidebar-menu">
			<li class="header">MENU PRINCIPAL</li>
			<li class="<c:if test="${pageName == 'accueil'}">active</c:if>  treeview">
				<spring:url value="/accueil" var="accueilAction" />
				<a href="${accueilAction}">
					<span>Accueil</span>
				</a>
			</li>
			<li class="<c:if test="${pageName == 'todo'}">active</c:if> treeview">
				<spring:url value="/todo" var="todoAction" />
				<a href="${todoAction}"> 
					<span>TODO list</span>
				</a>
			</li>
		</ul>
	</section>
</aside>