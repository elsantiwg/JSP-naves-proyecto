public class AtAt extends Nave {
    public AtAt(int cantidad) {
        super("At-At", 40, 18.0, cantidad);
    }

    @Override
    public double calcularCombustible(double parsecs) {
        return cantidad * (consumo - 4.5) * parsecs;
    }
}