
public class Supremacy extends Nave {

    private int cantidadNaves;
    private int capacidadCarga;

    public Supremacy(int cantidadPersonas, int cantidadNaves, int capacidadCarga) {
        super("Supremacy", cantidadPersonas, 30.0);
        this.cantidadNaves = cantidadNaves;
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public double calcularConsumoTotalCombustible(double parsecs) {
        double consumoTotal = cantidadNaves * parsecs * consumoCombustible;
        double aumentoConsumo = (cantidadNaves * capacidadCarga) * 0.1;
        return consumoTotal + aumentoConsumo;
    }
}
