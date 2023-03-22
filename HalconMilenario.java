
public class HalconMilenario extends Nave {

    private int cantidadNaves;

    public HalconMilenario(int cantidadPersonas, int cantidadNaves) {
        super("Halcón Milenario", cantidadPersonas, 20.5);
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



