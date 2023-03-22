<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Guerra Civil Imperial - Resultado</title>
</head>
<body>
    <h1>Guerra Civil Imperial - Resultado</h1>
    
    <%-- Recibimos los datos enviados por el usuario --%>
    <% int distancia = Integer.parseInt(request.getParameter("distancia")); %>
    <% int halconM = Integer.parseInt(request.getParameter("halconM")); %>
    <% int halconMCantidad = Integer.parseInt(request.getParameter("halconMCantidad")); %>
    <% int destructor = Integer.parseInt(request.getParameter("destructor")); %>
    <% int destructorCantidad = Integer.parseInt(request.getParameter("destructorCantidad")); %>
    <% int lanzadera = Integer.parseInt(request.getParameter("lanzadera")); %>
    <% int lanzaderaCantidad = Integer.parseInt(request.getParameter("lanzaderaCantidad")); %>
    <% int supremacy = Integer.parseInt(request.getParameter("supremacy")); %>
    <% int supremacyCantidad = Integer.parseInt(request.getParameter("supremacyCantidad")); %>
    <% int atAt = Integer.parseInt(request.getParameter("atAt")); %>
    <% int atAtCantidad = Integer.parseInt(request.getParameter("atAtCantidad")); %>
    
    <%-- Creamos un objeto de la clase GuerraCivilImperial y le pasamos los datos ingresados por el usuario --%>
    <% GuerraCivilImperial gci = new GuerraCivilImperial(); %>
    <% gci.setDistancia(distancia); %>
    <% gci.setHalconM(halconM, halconMCantidad); %>
    <% gci.setDestructor(destructor, destructorCantidad); %>
    <% gci.setLanzadera(lanzadera, lanzaderaCantidad); %>
    <% gci.setSupremacy(supremacy, supremacyCantidad); %>
    <% gci.setAtAt(atAt, atAtCantidad); %>
    
    <%-- Calculamos el combustible total necesario --%>
    <% double combustibleTotal = gci.calcularCombustibleTotal(); %>
    
    <%-- Mostramos el resultado al usuario --%>
    <p>Para enfrentar al Imperio, la Alianza Rebelde necesita un total de <%= String.format("%.2f", combustibleTotal) %> litros de combustible.</p>
    
</body>
</html>
