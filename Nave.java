public abstract class Nave {
    protected String tipo;
    protected int capacidad;
    protected double consumo;
    protected int cantidad;

    public Nave(String tipo, int capacidad, double consumo, int cantidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.cantidad = cantidad;
    }

    public abstract double calcularConsumo(double parsecs);

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public int getCantidad() {
        return cantidad;
    }
}
