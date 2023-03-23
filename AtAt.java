public class AtAt extends NaveEspacial {
    private int altura;
    
    public AtAt(int capacidadTransporte, int consumoCombustible, int cantidadNaves, int altura) {
        super("Transporte blindado todo terreno", capacidadTransporte, consumoCombustible, cantidadNaves);
        this.altura = altura;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
}