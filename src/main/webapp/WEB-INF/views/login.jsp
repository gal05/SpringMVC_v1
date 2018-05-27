<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="<c:url value="/resources/estilo_login.css"/>" rel="stylesheet">

<!------ Include the above in your HEAD tag ---------->

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<form class="login" action="login" method="POST">
    <img src="resources/img/imagen3.jpg" width="300" height="200">
     <h3 style="color: white">Usuario</h3>
    <input type="text" class="login-input" placeholder="107908" name="username" autofocus>
    <h3 style="color: white">Contraseña</h3>
    <input type="password" class="login-input" placeholder="********" name="password">
    <input type="submit" value="Iniciar Sesión" class="login-button">
    <br>
  <p class="login-lost"><a href="">Olvidaste tu contraseña?</a></p>
  </form>
</body>