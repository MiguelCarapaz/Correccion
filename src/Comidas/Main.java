package Grupos_Musicales;
public class Main {
    public static void main(String[] args) {
        GrupoMusical[] grupos = new GrupoMusical[2];
        grupos[0] = new Banda("Hatsune Miku", "J-pop", 1);
        grupos[1] = new Orquesta("Yoasobi", "J-pop", 2, "Mamoru Hosoda's");

        for (GrupoMusical group : grupos) {
            System.out.println("Nombre: " + group.getNombre());
            System.out.println("Genero: " + group.getGenero());
            if (group instanceof Banda) {
                System.out.println("Miembros: " + ((Banda) group).getMiembros());
            }
            if (group instanceof Orquesta) {
                System.out.println("Director: " + ((Orquesta) group).getDirector());
            }
            System.out.println();
        }
    }
}
