package Comidas;
public class Comida {
    private String nombre;
    private String paisOrigen;
    private String tipoCocina;

    public Comida(String nombre, String paisOrigen, String tipoCocina) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.tipoCocina = tipoCocina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }
}
