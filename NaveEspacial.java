public abstract class NaveEspacial {
    private String tipo;
    private int capacidadTransporte;
    private int consumoCombustible;
    private int cantidadNaves;
    
    public NaveEspacial(String tipo, int capacidadTransporte, int consumoCombustible, int cantidadNaves) {
        this.tipo = tipo;
        this.capacidadTransporte = capacidadTransporte;
        this.consumoCombustible = consumoCombustible;
        this.cantidadNaves = cantidadNaves;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCapacidadTransporte() {
        return capacidadTransporte;
    }
    
    public void setCapacidadTransporte(int capacidadTransporte) {
        this.capacidadTransporte = capacidadTransporte;
    }
    
    public int getConsumoCombustible() {
        return consumoCombustible;
    }
    
    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }
    
    public int getCantidadNaves() {
        return cantidadNaves;
    }
    
    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }
}
