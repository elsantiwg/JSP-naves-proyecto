public abstract class Nave {
    protected String tipo;
    protected int capacidadPersonas;
    protected double consumoCombustible;

    public Nave(String tipo, int capacidadPersonas, double consumoCombustible) {
        this.tipo = tipo;
        this.capacidadPersonas = capacidadPersonas;
        this.consumoCombustible = consumoCombustible;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public abstract double calcularConsumoTotalCombustible(double parsecs);
}
