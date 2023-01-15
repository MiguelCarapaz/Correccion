package Comidas;
public class ComidaJaponesa extends Occidental{
    private String platoTipico;

    public ComidaJaponesa(String nombre, String paisOrigen,
                          String tipoCocina, String estiloCocina, String platoTipico) {
        super(nombre, paisOrigen, tipoCocina, estiloCocina);
        this.platoTipico = platoTipico;
    }
    public String getPlatoTipico() {
        return platoTipico;
    }
    public void setPlatoTipico(String platoTipico) {
        this.platoTipico = platoTipico;
    }
}
