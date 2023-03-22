public class Supremacy extends Nave {
    private int navesCargadas;

    public Supremacy(int cantidad, int navesCargadas) {
        super("Supremacy", 300, 50, cantidad);
        this.navesCargadas = navesCargadas;
    }

    @Override
    public double calcularConsumo(double parsecs) {
        double consumoTotal = consumo * parsecs;
        consumoTotal += (consumoTotal * 0.1 * navesCargadas);
        return consumoTotal;
    }
}

