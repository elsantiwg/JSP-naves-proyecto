public class HalconMilenario extends Nave {
    public HalconMilenario(int cantidad) {
        super("Halc�n Milenario", 6, 20, cantidad);
    }

    @Override
    public double calcularConsumo(double parsecs) {
        return consumo * parsecs;
    }
}


