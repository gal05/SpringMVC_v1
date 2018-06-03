<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet" type="text/css" >
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/estd3.css" />">
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/dist/Chart.bundle.min.js"/>"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light " style="background-color:	#292949;">
		<a class="navbar-brand" href="../index.html">Menu Principal</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active">
				</li>
				<li class="nav-item">
				</li>
				<li class="nav-item">
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<div class="jumbotron jumbotron-fluid" style="background-color:	#292949;"> 
		<div class="container">
			<h1 class="display-4">Seccion Estadistica</h1>
			<p class="lead">TECSUP </p>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-4">
				<aside class="sidebar">
					<div id="leftside-navigation" class="nano">
						<ul class="nano-content">
							<li>
								<a href="index.html"><i class="fa fa-dashboard"></i><span>Dashboard</span></a>
							</li>
							<li class="sub-menu">
								<a href="javascript:void(0);"><i class="fa fa-cogs"></i><span>UI Elements</span><i class="arrow fa fa-angle-right pull-right"></i></a>
								<ul>

									<li><a href="ui-alerts-notifications.html">Alerts &amp; Notifications</a>
									</li>
									<li><a href="ui-panels.html">Panels</a>
									</li>
									<li><a href="ui-buttons.html">Buttons</a>
									</li>
									<li><a href="ui-slider-progress.html">Sliders &amp; Progress</a>
									</li>
									<li><a href="ui-modals-popups.html">Modals &amp; Popups</a>
									</li>
									<li><a href="ui-icons.html">Icons</a>
									</li>
									<li><a href="ui-grid.html">Grid</a>
									</li>
									<li><a href="ui-tabs-accordions.html">Tabs &amp; Accordions</a>
									</li>
									<li><a href="ui-nestable-list.html">Nestable Lists</a>
									</li>
								</ul>
							</li>
							<li class="sub-menu">
								<a href="javascript:void(0);"><i class="fa fa-table"></i><span>Tables</span><i class="arrow fa fa-angle-right pull-right"></i></a>
								<ul>
									<li><a href="tables-basic.html">Basic Tables</a>
									</li>

									<li><a href="tables-data.html">Data Tables</a>
									</li>
								</ul>
							</li>
							<li class="sub-menu">
								<a href="javascript:void(0);"><i class="fa fa fa-tasks"></i><span>Forms</span><i class="arrow fa fa-angle-right pull-right"></i></a>
								<ul>
									<li><a href="forms-components.html">Components</a>
									</li>
									<li><a href="forms-validation.html">Validation</a>
									</li>
									<li><a href="forms-mask.html">Mask</a>
									</li>
									<li><a href="forms-wizard.html">Wizard</a>
									</li>
									<li><a href="forms-multiple-file.html">Multiple File Upload</a>
									</li>
									<li><a href="forms-wysiwyg.html">WYSIWYG Editor</a>
									</li>
								</ul>
							</li>
							<li class="sub-menu">
								<a href="javascript:void(0);"><i class="fa fa-bar-chart-o"></i><span>Charts</span><i class="arrow fa fa-angle-right pull-right"></i></a>
								<ul>
									<li><a href="<%=request.getContextPath()%>/to/menu/estadistica/reportxdias">Rep. vs dias</a>
									</li>
									<li><a href="charts-morris.html">Morris</a>
									</li>
									<li><a href="charts-c3.html">C3 Charts</a></li>
								</ul>
							</li>
							<li class="sub-menu">
								<a href="javascript:void(0);"><i class="fa fa-map-marker"></i><span>Maps</span><i class="arrow fa fa-angle-right pull-right"></i></a>
								<ul>
									<li><a href="map-google.html">Google Map</a>
									</li>
									<li><a href="map-vector.html">Vector Map</a>
									</li>
								</ul>
							</li>
							<li class="sub-menu">
								<a href="typography.html"><i class="fa fa-text-height"></i><span>Typography</span></a>
							</li>
							<li class="sub-menu">
								<a href="javascript:void(0);"><i class="fa fa-file"></i><span>Pages</span><i class="arrow fa fa-angle-right pull-right"></i></a>
								<ul>
									<li><a href="pages-blank.html">Blank Page</a>
									</li>
									<li><a href="pages-login.html">Login</a>
									</li>
									<li><a href="pages-sign-up.html">Sign Up</a>
									</li>
									<li><a href="pages-calendar.html">Calendar</a>
									</li>
									<li><a href="pages-timeline.html">Timeline</a>
									</li>
									<li><a href="pages-404.html">404</a>
									</li>
									<li><a href="pages-500.html">500</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</aside>	      
			</div>
			<div class="col-8 justify-content-center">
				<div style="width: 70%;">
					<canvas id="myChart" width="20" height="20"></canvas>
				</div>
			</div>
		</div>
	</div>




	<script type="text/javascript" src="../resources/js/estd3.js"></script>
	<script>
		var ctx = document.getElementById("myChart").getContext('2d');
		var myChart = new Chart(ctx, {
			type: 'line',
			data: {
				labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
				datasets: [{
					label: '# of Votes',
					data: [12, 19, 3, 5, 2, 3],
					backgroundColor: [
					'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)',
					'rgba(255, 206, 86, 0.2)',
					'rgba(75, 192, 192, 0.2)',
					'rgba(153, 102, 255, 0.2)',
					'rgba(255, 159, 64, 0.2)'
					],
					borderColor: [
					'rgba(255,99,132,1)',
					'rgba(54, 162, 235, 1)',
					'rgba(255, 206, 86, 1)',
					'rgba(75, 192, 192, 1)',
					'rgba(153, 102, 255, 1)',
					'rgba(255, 159, 64, 1)'
					],
					borderWidth: 1
				}]
			},
			options: {
				scales: {
					yAxes: [{
						ticks: {
							beginAtZero:true
						}
					}]
				}
			}
		});
	</script>
</body>
<script type="text/javascript" src="<c:url value="/resources/js/dist/Chart.bundle.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/estd3.js"/>"></script>
</html>