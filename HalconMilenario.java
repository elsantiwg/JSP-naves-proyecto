public class HalconMilenario extends NaveEspacial {
    private int velocidadMaxima;
    
    public HalconMilenario(int capacidadTransporte, int consumoCombustible, int cantidadNaves, int velocidadMaxima) {
        super("Carguero ligero corelliano", capacidadTransporte, consumoCombustible, cantidadNaves);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}