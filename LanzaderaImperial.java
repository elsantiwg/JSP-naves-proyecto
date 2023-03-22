public class LanzaderaImperial extends Nave {
    public LanzaderaImperial(int cantidad) {
        super("Lanzadera Imperial", 8, 6.5, cantidad);
    }

    @Override
    public double calcularCombustible(double parsecs) {
        return cantidad * consumo * parsecs;
    }
}