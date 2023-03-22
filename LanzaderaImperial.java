
public class LanzaderaImperial extends Nave {

    private int cantidadNaves;

    public LanzaderaImperial(int cantidadPersonas, int cantidadNaves) {
        super("Lanzadera Imperial", cantidadPersonas, 10.0);
        this.cantidadNaves = cantidadNaves;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    @Override
    public double calcularConsumoTotalCombustible(double parsecs) {
        return cantidadNaves * parsecs * consumoCombustible;
    }
}
