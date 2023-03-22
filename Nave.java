public abstract class Nave {
    protected String tipo;
    protected int personas;
    protected double consumo;
    protected int cantidad;

    public Nave(String tipo, int personas, double consumo, int cantidad) {
        this.tipo = tipo;
        this.personas = personas;
        this.consumo = consumo;
        this.cantidad = cantidad;
    }

    public abstract double calcularCombustible(double parsecs);
}

