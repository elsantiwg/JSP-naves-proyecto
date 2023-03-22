public class AtAt extends Nave {
    public AtAt(int cantidad) {
        super("AT-AT", 40, 20, cantidad);
    }

    @Override
    public double calcularConsumo(double parsecs) {
        return consumo * parsecs * 0.75;
    }
}

