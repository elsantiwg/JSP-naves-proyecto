public class Supremacy extends Nave {
    public Supremacy(int capacidad, double consumo, int cantidad) {
        super("Supremacy", capacidad, consumo, cantidad);
    }

   
    public double calcularCombustibleNecesarioSupremacy(double distanciaTotalParsecs, int cantidadNavesCargadas) {
        double combustibleNecesario = this.consumo * distanciaTotalParsecs * (this.cantidad + (0.1 * cantidadNavesCargadas) + 1);
        return combustibleNecesario;
    }
}
