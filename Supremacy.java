public class Supremacy extends NaveEspacial {
    private int longitud;
    
    public Supremacy(int capacidadTransporte, int consumoCombustible, int cantidadNaves, int longitud) {
        super("Nave insignia clase Mega", capacidadTransporte, consumoCombustible, cantidadNaves);
        this.longitud = longitud;
    }
    
    public int getLongitud() {
        return longitud;
    }
    
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}