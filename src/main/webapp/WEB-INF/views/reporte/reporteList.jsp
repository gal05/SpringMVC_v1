<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reportes</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="<c:url value="/resources/css/reporte.css"/>" rel="stylesheet">
</head>
<body>
<div class="container" id="tourpackages-carousel">
      <div class="row">
        <div class="col-lg-11 m-5"><h1><font color="#3498DB">Reportes ${fn:length(reportes)} </font> <a class="btn icon-btn btn-primary float-right" href="<%=request.getContextPath()%>/to/menu"><span class="glyphicon btn-glyphicon glyphicon-hand-left img-circle"></span> Regresar</a></h1></div>

<section class="container mt-4 mb-4">
<div class="container ">
	<div class="row mb-3">
		<c:forEach var="rep" items="${reportes}">
		<div class="col-md-6 mb-3">
			<div class="d-flex flex-row border rounded bg-success text-white">
	  			<div class="p-0 w-25">
	  			    <img src="<c:url value="https://pi4-v2-larav-pass-excel-api-gal05.c9users.io/images/${rep.imagen}"/>" class="img-thumbnail border-0" />
	  				
	  			</div>
	  			<div class="pl-3 pt-2 pr-2 pb-2 w-75 border-left">
	  					<h4 class="text-dark">Obs:  ${rep.observacion} </h4>
	  					<h5 class="text-warning">aula: ${rep.salon}</h5>
	  					<ul class="m-0 float-left" style="list-style: none; margin:0; padding: 0">
	  						<li><i class="fab fa-facebook-square"></i>fecha:  ${rep.fecha}</li>
	  						<li><i class="fab fa-twitter-square"></i>hora: ${rep.hora}</li>
	  					</ul>
						<p class="text-right m-0"><a href="#" class="btn btn-primary"><i class="far fa-user"></i> View Profile</a></p>
				</div>
			</div>
		</div>
		</c:forEach>
	</div>

</div>
        

        

</div>
</div>

<script>
if (window.location.href.substr(-2) !== '?r') {
    window.location = window.location.href + '?r';
}
</script>



</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

</html>