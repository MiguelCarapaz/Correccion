package Grupos_Musicales;
public class Orquesta extends Banda {
    private String director;
    public Orquesta(String nombre, String genero, int miembros, String director) {
        super(nombre, genero, miembros);
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
    public void setConductor(String director) {
        this.director = director;
    }
}
