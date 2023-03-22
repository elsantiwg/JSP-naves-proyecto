public class DestructorEstelar extends Nave {
    public DestructorEstelar(int cantidad) {
        super("Destructor Estelar", 80, 120, cantidad);
    }

    @Override
    public double calcularConsumo(double parsecs) {
        return consumo * parsecs;
    }
}
