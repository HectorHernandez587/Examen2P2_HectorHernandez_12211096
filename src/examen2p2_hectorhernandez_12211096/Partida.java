
package examen2p2_hectorhernandez_12211096;

/**
 *
 * @author Hector
 */
public class Partida {
    private int[] estado_banana;
    private int[] estado_manzana;
    private String instrucciones;

    public Partida() {
    }

    public Partida(int[] estado_banana, int[] estado_manzana, String instrucciones) {
        this.estado_banana = estado_banana;
        this.estado_manzana = estado_manzana;
        this.instrucciones = instrucciones;
    }

    public int[] getEstado_banana() {
        return estado_banana;
    }

    public void setEstado_banana(int[] estado_banana) {
        this.estado_banana = estado_banana;
    }

    public int[] getEstado_manzana() {
        return estado_manzana;
    }

    public void setEstado_manzana(int[] estado_manzana) {
        this.estado_manzana = estado_manzana;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    @Override
    public String toString() {
        return "Partida{" + "estado_banana=" + estado_banana + ", estado_manzana=" + estado_manzana + ", instrucciones=" + instrucciones + '}';
    }

    
    
    
    
}
