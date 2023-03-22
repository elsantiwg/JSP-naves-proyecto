public class HalconMilenario extends Nave {
    public HalconMilenario(int cantidad) {
        super("Halcón Milenario", 6, 20, cantidad);
    }

    @Override
    public double calcularConsumo(double parsecs) {
        return consumo * parsecs;
    }
}


