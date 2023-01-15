package Videojuegos;
public class JuegoDeAccion extends Juego {
    private String arma;

    public JuegoDeAccion(String nombre, String desarrollador, String genero, String arma) {
        super(nombre, desarrollador, genero);
        this.arma = arma;
    }
    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
}