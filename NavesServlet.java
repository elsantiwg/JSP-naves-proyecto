import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;


public class NavesServlet extends HttpServlet {
    private ArrayList<NaveEspacial> naves = new ArrayList<NaveEspacial>();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar los datos del formulario
        String[] tipoNave = request.getParameterValues("tipoNave");
        String[] capacidadTransporteStr = request.getParameterValues("capacidadTransporte");
        String[] consumoCombustibleStr = request.getParameterValues("consumoCombustible");
        String[] cantidadNavesStr = request.getParameterValues("cantidadNaves");
        String[] atributoEspecificoStr = request.getParameterValues("atributoEspecifico");
        
        // Crear una instancia de cada nave espacial correspondiente
        for (int i = 0; i < tipoNave.length; i++) {
            int capacidadTransporte = Integer.parseInt(capacidadTransporteStr[i]);
            int consumoCombustible = Integer.parseInt(consumoCombustibleStr[i]);
            int cantidadNaves = Integer.parseInt(cantidadNavesStr[i]);
            int atributoEspecifico = Integer.parseInt(atributoEspecificoStr[i]);
            NaveEspacial nave;
            switch(tipoNave[i]) {
                case "HalconMilenario":
                    nave = new HalconMilenario(capacidadTransporte, consumoCombustible, cantidadNaves, atributoEspecifico);
                    break;
                case "DestructorEstelar":
                    nave = new DestructorEstelar(capacidadTransporte, consumoCombustible, cantidadNaves, atributoEspecifico);
                    break;
                case "LanzaderaImperial":
                    nave = new LanzaderaImperial(capacidadTransporte, consumoCombustible, cantidadNaves, atributoEspecifico);
                    break;
                case "Supremacy":
                    nave = new Supremacy(capacidadTransporte, consumoCombustible, cantidadNaves, atributoEspecifico);
                    break;
                case "AtAt":
                    nave = new AtAt(capacidadTransporte, consumoCombustible, cantidadNaves, atributoEspecifico);
                    break;
                default:
                    nave = null;
            }
            naves.add(nave);
        }
        
        // Calcular y mostrar los resultados de cada nave
        int totalCombustible = 0;
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Resultados de naves espaciales</title></head>");
        out.println("<body>");
        out.println("<h1>Resultados de naves espaciales</h1>");
        out.println("<table>");
        out.println("<tr><th>Tipo de nave</th><th>Capacidad de transporte</th><th>Consumo de combustible</th><th>Cantidad de naves</th><th>Atributo específico</th><th>Combustible necesario</th></tr>");
        for (NaveEspacial nave : naves) {
            out.println("<tr><td>" + nave.getTipoNave() + "</td><td>" + nave.getCapacidadTransporte() + "</td><td>" + nave.getConsumoCombustible() + "</td><td>" + nave.getCantidadNaves() + "</td><td>" + nave.getAtributoEspecifico() + "</
            int combustibleNecesario = nave.calcularCombustibleNecesario();
            totalCombustible += combustibleNecesario;
            out.println("<td>" + combustibleNecesario + "</td></tr>");
        }
        out.println("<tr><td colspan=\"5\">Total de combustible necesario</td><td>" + totalCombustible + "</td></tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
