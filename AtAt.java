public class AtAt extends Nave {
    public AtAt(int capacidad, double consumo, int cantidad) {
        super("At-At", capacidad, consumo, cantidad);
    }

    @Override
    public double calcularConsumo(double distanciaTotalParsecs) {
        double combustibleNecesario = this.consumo * distanciaTotalParsecs * this.cantidad * 0.75 * 0.75;
        return combustibleNecesario;
    }
}