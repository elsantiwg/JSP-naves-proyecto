public class LanzaderaImperial extends NaveEspacial {
    private int capacidadCarga;
    
    public LanzaderaImperial(int capacidadTransporte, int consumoCombustible, int cantidadNaves, int capacidadCarga) {
        super("Lanzadera clase Lambda", capacidadTransporte, consumoCombustible, cantidadNaves);
        this.capacidadCarga = capacidadCarga;
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}