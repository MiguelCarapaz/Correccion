package Videojuegos;
public class JuegoDeAventura extends JuegoDeAccion {
    private int misiones;
    public JuegoDeAventura(String nombre, String desarrollador, String genero, String arma, int misiones) {
        super(nombre, desarrollador, genero, arma);
        this.misiones = misiones;
    }
    public int getMisiones() {
        return misiones;
    }
    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }
}