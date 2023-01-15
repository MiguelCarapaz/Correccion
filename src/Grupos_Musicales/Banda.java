package Grupos_Musicales;
public class Banda extends GrupoMusical{
    private int miembros;
    public Banda(String nombre, String genero, int miembros) {
        super(nombre, genero);
        this.miembros = miembros;
    }
    public int getMiembros() {
        return miembros;
    }
    public void setMembers(int miembros) {
        this.miembros = miembros;
    }
}