package Grupos_Musicales;
public class GrupoMusical {
    private String nombre,genero;
    public GrupoMusical(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenre(String genero) {
        this.genero = genero;
    }
}
