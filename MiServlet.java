
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MiServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Crear instancias de las naves
        Nave halcon = new Nave("Halcón Milenario", 6, 12, 10);
        Nave destructor = new Nave("Destructor Estelar", 20000, 500, 3);
        Nave lanzadera = new Nave("Lanzadera imperial", 8, 18, 20);
        Nave supremacy = new Nave("Supremacy", 5000, 400, 1);
        Nave atat = new Nave("At-At", 40, 50, 5);

        // Obtener los Parsec ingresados
        double parsecs = Double.parseDouble(request.getParameter("parsecs"));

        // Calcular el combustible total necesario
        double combustibleTotal = halcon.calcularCombustible(parsecs) +
                                  destructor.calcularCombustible(parsecs) +
                                  lanzadera.calcularCombustible(parsecs) +
                                  supremacy.calcularCombustible(parsecs) +
                                  atat.calcularCombustible(parsecs);

        // Mostrar los datos
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Combustible total necesario: " + combustibleTotal + " litros</h1>");
        out.println("</body></html>");
    }
}