<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Resultados de combustible de naves de la Alianza Rebelde</title>
</head>
<body>
	<h1>Resultados de combustible de naves de la Alianza Rebelde</h1>
	<%
		// Recupera los parámetros del formulario
		int hm_personas = Integer.parseInt(request.getParameter("hm_personas"));
		double hm_consumo = Double.parseDouble(request.getParameter("hm_consumo"));
		int hm_cantidad = Integer.parseInt(request.getParameter("hm_cantidad"));
		int de_personas = Integer.parseInt(request.getParameter("de_personas"));
		double de_consumo = Double.parseDouble(request.getParameter("de_consumo"));
		int de_cantidad = Integer.parseInt(request.getParameter("de_cantidad"));
		int li_personas = Integer.parseInt(request.getParameter("li_personas"));
		double li_consumo = Double.parseDouble(request.getParameter("li_consumo"));
		int li_cantidad = Integer.parseInt(request.getParameter("li_cantidad"));
		int s_personas = Integer.parseInt(request.getParameter("s_personas"));
		double s_consumo = Double.parseDouble(request.getParameter("s_consumo"));
		int s_cantidad = Integer.parseInt(request.getParameter("s_cantidad"));

		// Calcula la cantidad total de combustible requerido
		double hm_combustible_total = hm_personas * hm_consumo * hm_cantidad;
		double de_combustible_total = de_personas * de_consumo * de_cantidad;
		double li_combustible_total = li_personas * li_consumo * li_cantidad;
		double s_combustible_total = s_personas * s_consumo * s_cantidad;
		double combustible_total = hm_combustible_total + de_combustible_total + li_combustible_total + s_combustible_total;
	%>
	<p>La cantidad total de combustible requerido para la flota de naves de la Alianza Rebelde es: <%= combustible_total %> litros por Parsec.</p>
	<p>Detalle del combustible requerido para cada nave:</p>
	<ul>
		<li>Halcón Milenario: <%= hm_combustible_total %> litros por Parsec</li>
		<li>Destructor Estelar: <%= de_combustible_total %> litros por Parsec</li>
		<li>Lanzadera Imperial: <%= li_combustible_total %> litros por Parsec</li>
		<li>Supremacy: <%= s_combustible_total %> litros por Parsec</li>
	</ul>
</body>
</html>
