<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Ingreso de valores de naves</title>
    </head>
    <body>
        <h1>Ingreso de valores de naves</h1>
        <form action="index.html" method="post">
            <h2>Halcón Milenario</h2>
            <label>Capacidad:</label>
            <input type="number" name="hmCapacidad" required>
            <br>
            <label>Consumo:</label>
            <input type="number" name="hmConsumo" step="0.01" required>
            <br>
            <label>Cantidad:</label>
            <input type="number" name="hmCantidad" required>
            <hr>
            <h2>Destructor Estelar</h2>
            <label>Capacidad:</label>
            <input type="number" name="deCapacidad" required>
            <br>
            <label>Consumo:</label>
            <input type="number" name="deConsumo" step="0.01" required>
            <br>
            <label>Cantidad:</label>
            <input type="number" name="deCantidad" required>
            <hr>
            <h2>Lanzadera Imperial</h2>
            <label>Capacidad:</label>
            <input type="number" name="liCapacidad" required>
            <br>
            <label>Consumo:</label>
            <input type="number" name="liConsumo" step="0.01" required>
            <br>
            <label>Cantidad:</label>
            <input type="number" name="liCantidad" required>
            <hr>
            <h2>Supremacy</h2>
            <label>Capacidad:</label>
            <input type="number" name="sCapacidad" required>
            <br>
            <label>Consumo:</label>
            <input type="number" name="sConsumo" step="0.01" required>
            <br>
            <label>Cantidad:</label>
            <input type="number" name="sCantidad" required>
            <br>
            <label>Cantidad de naves cargadas:</label>
            <input type="number" name="sCantidadCargadas" required>
            <hr>
            <h2>AT-AT</h2>
            <label>Capacidad:</label>
            <input type="number" name="atCapacidad" required>
            <br>
            <label>Consumo:</label>
            <input type="number" name="atConsumo" step="0.01" required>
            <br>
            <label>Cantidad:</label>
            <input type="number" name="atCantidad" required>
            <br>
            <label>Distancia total en Parsecs:</label>
            <input type="number" name="atDistancia" required>
            <br>
            <button type="submit">Calcular combustible necesario</button>
        </form>
        <%
        // Se recuperan los valores ingresados en el formulario
        double distanciaTotalParsecs = Double.parseDouble(request.getParameter("distancia"));
        int cantHalconMilenario = Integer.parseInt(request.getParameter("cantHalcon"));
        int cantDestructorEstelar = Integer.parseInt(request.getParameter("cantDestructor"));
        int cantLanzaderaImperial = Integer.parseInt(request.getParameter("cantLanzadera"));
        int cantSupremacy = Integer.parseInt(request.getParameter("cantSupremacy"));
        int cantAtAt = Integer.parseInt(request.getParameter("cantAtAt"));

        // Se crean las instancias de cada nave con los valores ingresados
        HalconMilenario halcon = new HalconMilenario(4, 60.0, cantHalconMilenario);
        DestructorEstelar destructor = new DestructorEstelar(45, 800.0, cantDestructorEstelar);
        LanzaderaImperial lanzadera = new LanzaderaImperial(20, 150.0, cantLanzaderaImperial);
        Supremacy supremacy = new Supremacy(500, 1000.0, cantSupremacy);
        AtAt atat = new AtAt(40, 100.0, cantAtAt);

        // Se calcula el combustible necesario para cada nave y se almacena en variables separadas
        double combustibleHalcon = halcon.calcularConsumo(distanciaTotalParsecs);
        double combustibleDestructor = destructor.calcularConsumo(distanciaTotalParsecs);
        double combustibleLanzadera = lanzadera.calcularConsumo(distanciaTotalParsecs);
        double combustibleSupremacy = supremacy.calcularConsumoSupremacy(distanciaTotalParsecs, cantHalconMilenario + cantDestructorEstelar + cantLanzaderaImperial + cantSupremacy + cantAtAt);
        double combustibleAtAt = atat.calcularConsumo(distanciaTotalParsecs);

        // Se imprime el resultado de cada cálculo
        out.println("<h2>Combustible necesario para cada nave:</h2>");
        out.println("<ul>");
            out.println("<li>" + halcon.getTipo() + ": " + String.format("%.2f", combustibleHalcon) + " kg</li>");
            out.println("<li>" + destructor.getTipo() + ": " + String.format("%.2f", combustibleDestructor) + " kg</li>");
            out.println("<li>" + lanzadera.getTipo() + ": " + String.format("%.2f", combustibleLanzadera) + " kg</li>");
            out.println("<li>" + supremacy.getTipo() + ": " + String.format("%.2f", combustibleSupremacy) + " kg</li>");
            out.println("<li>" + atat.getTipo() + ": " + String.format("%.2f", combustibleAtAt) + " kg</li>");
            out.println("</ul>");
        %>
    </body>
</html>

