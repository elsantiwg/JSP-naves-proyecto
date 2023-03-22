public class Supremacy extends Nave {
    private int navesTransportadas;

    public Supremacy(int cantidad, int navesTransportadas) {
        super("Supremacy", 20000, 100.0, cantidad);
        this.navesTransportadas = navesTransportadas;
    }

    @Override
    public double calcularCombustible(double parsecs) {
        return cantidad * (consumo + (0.1 * navesTransportadas)) * parsecs;
    }
}