<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuarios</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="<c:url value="/resources/css/reporte.css"/>" rel="stylesheet">
</head>
<body>
<div class="container" id="tourpackages-carousel">
      <div class="row">
        <div class="col-lg-12"><h1><font color="white">Usuarios ${fn:length(usuarios)} </font> <a class="btn icon-btn btn-primary pull-right" href="<%=request.getContextPath()%>/to/menu"><span class="glyphicon btn-glyphicon glyphicon-hand-left img-circle"></span> Regresar</a></h1></div>
        
        
        
        <c:forEach var="usuarios" items="${usuarios}">
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
          <div class="thumbnail" style="background:  #EBF5FB">
              <div class="caption">
               
                <div class='col-lg-12 well well-add-card'>
                    <h4>Name:  ${usuarios.name} </h4>
                </div>
                <div class='col-lg-12'>
                    <p>Email: ${usuarios.email} </p>
                    <p class"text-muted">Código:  ${usuarios.codigo} </p>
                    <p class"text-muted">Tipo:  ${usuarios.tipo} </p>
                </div>
            </div>
          </div>
        </div>
</c:forEach>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
</body>
</html>