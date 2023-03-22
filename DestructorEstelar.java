public class DestructorEstelar extends Nave {

    private int cantidadNaves;

    public DestructorEstelar(int cantidadPersonas, int cantidadNaves) {
        super("Destructor Estelar", cantidadPersonas, 60.0);
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