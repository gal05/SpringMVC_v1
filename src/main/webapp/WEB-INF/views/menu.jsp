<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>

<link href="<c:url value="/resources/css/menu.css"/>" rel="stylesheet">
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>



	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/tecsup">Exit</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="#">Sobre mi</a>
      </li>
    </ul>
    <span class="navbar-text">
      <font color="#3498DB">${infoUser[0].email}</font>
      
    </span>
  </div>
</nav>


  <div class="menu">
  <div class="btn trigger">
    <span class="line"></span>
  </div>
  <div class="icons">
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-codepen"></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-facebook"></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-history"></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-area-chart "></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-desktop"></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-bug"></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-users"></i>
      </div>
    </div>
    <div class="rotater">
      <div class="btn btn-icon">
        <i class="fa fa-behance"></i>
      </div>
    </div>
  </div>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="<c:url value="/resources/js/index.js"/>"></script>


</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
<script>
if (window.location.href.substr(-2) !== '?r') {
    window.location = window.location.href + '?r';
}
</script>
</html>