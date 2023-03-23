public class Nave {
    protected String tipo;
    protected int capacidad;
    protected double consumo;
    protected int cantidad;

    // Constructor que recibe los datos desde un JSP
    public Nave(String tipo, int capacidad, double consumo, int cantidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.cantidad = cantidad;
    }

    // Métodos getters y setters para acceder a los atributos desde otras clases
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getCantidad (){
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para calcular el combustible necesario de esta nave en base a una distancia en Parsecs
    public double calcularConsumo(double distanciaTotalParsecs) {
        double combustibleNecesario = this.consumo * distanciaTotalParsecs * this.cantidad;
        return combustibleNecesario;
    }

    // Método para calcular el combustible necesario para un Supremacy en base a una distancia en Parsecs y la cantidad de naves que carga
    public double calcularConsumoSupremacy(double distanciaTotalParsecs, int cantidadNavesCargadas) {
        double combustibleNecesario = this.consumo * distanciaTotalParsecs * (this.cantidad + (0.1 * cantidadNavesCargadas));
        return combustibleNecesario;
    }

    // Método para calcular el combustible necesario para un At-At en base a una distancia en Parsecs
    public double calcularConsumoAtAt(double distanciaTotalParsecs) {
        double combustibleNecesario = this.consumo * distanciaTotalParsecs * this.cantidad * 0.75;
        return combustibleNecesario;
    }
}
