package Videojuegos;

public class Juego {
    private String nombre, desarrollador, genero;

    public Juego(String nombre, String desarrollador, String genero) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}