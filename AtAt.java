
public class AtAt extends Nave {

    private int cantidadNaves;

    public AtAt(int cantidadPersonas, int cantidadNaves) {
        super("AT-AT", cantidadPersonas, 5.0);
        this.cantidadNaves = cantidadNaves;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    @Override
    public double calcularConsumoTotalCombustible(double parsecs) {
        return cantidadNaves * parsecs * (consumoCombustible - 0.25);
    }
}
