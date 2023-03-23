public class DestructorEstelar extends NaveEspacial {
    private int armamento;
    
    public DestructorEstelar(int capacidadTransporte, int consumoCombustible, int cantidadNaves, int armamento) {
        super("Crucero estelar", capacidadTransporte, consumoCombustible, cantidadNaves);
        this.armamento = armamento;
    }
    
    public int getArmamento() {
        return armamento;
    }
    
    public void setArmamento(int armamento) {
        this.armamento = armamento;
    }
}