public class LanzaderaImperial extends Nave {
    public LanzaderaImperial(int cantidad) {
        super("Lanzadera Imperial", 20, 30, cantidad);
    }

    @Override
    public double calcularConsumo(double parsecs) {
        return consumo * parsecs;
    }
}
