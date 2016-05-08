<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<title>Automobile</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/jumbosmaller.css" rel="stylesheet" type="text/css">
</head>
<body>
	<f:view>
		<div class="jumbotron">
			<h1>Automobile<br><small>  dettagli:</small>
			</h1>
		</div>
		<ul class="list-group">
			<li class="list-group-item">Modello: ${carController.car.id}</li>
			<!-- <li class="list-group-item">Codice: ${carController.car.code}</li>
			<li class="list-group-item">Prezzo: ${carController.car.price}</li>
			<li class="list-group-item">Casa automobilistica: ${carController.car.quantity}</li>
			<li class="list-group-item">Descrizione: ${carController.car.description}</li>-->
		</ul>
		
	</f:view>
	<script src="//code.jquery.com/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>