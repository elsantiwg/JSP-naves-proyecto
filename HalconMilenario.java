public class HalconMilenario extends Nave {
    public HalconMilenario(int cantidad) {
        super("Halcón Milenario", 6, 5.5, cantidad);
    }

    @Override
    public double calcularCombustible(double parsecs) {
        return cantidad * consumo * parsecs;
    }
}