package Comidas;
public class Occidental extends Comida {
    private String estiloCocina;

    public Occidental(String nombre, String paisOrigen, String tipoCocina, String estiloCocina) {
        super(nombre, paisOrigen, tipoCocina);
        this.estiloCocina = estiloCocina;
        }
    public String getEstiloCocina() {
        return estiloCocina;
        }
    public void setEstiloCocina(String estiloCocina) {
        this.estiloCocina = estiloCocina;
    }
}