public class DestructorEstelar extends Nave {
    public DestructorEstelar(int cantidad) {
        super("Destructor Estelar", 50, 25.0, cantidad);
    }

    @Override
    public double calcularCombustible(double parsecs) {
        return cantidad * consumo * parsecs;
    }
}