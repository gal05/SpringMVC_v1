<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Reporte</title>
</head>
<body>
 <div class="container">
    <form>
  <div class="form-group">

    <input type="hidden" name="_token" value="{{ csrf_token() }}">

    <label for="exampleInputEmail1">Sede</label>
    <input type="text" class="form-control" name="placa" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="" value="Lima">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Laboratorio</label>
    <input type="text" class="form-control" name="color" id="exampleInputPassword1" placeholder="Laboratorio" value="705">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">Horario</label>
    <input type="text" class="form-control" name="color" id="exampleInputPassword1" placeholder="Horario" value="3-4:30">
  </div>
  <a href="laboratorio.html" class="btn btn-secondary">Enviar</a>
  <a href="laboratorio.html" class="btn btn-danger">Cancelar</a>

</form>
    
  </div>
  </body>
  </html>