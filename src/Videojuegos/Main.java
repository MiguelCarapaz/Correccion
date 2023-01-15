package Videojuegos;
public class Main {
    public static void main(String[] args) {
        Juego[] juegos = new Juego[3];
        juegos[0] = new Juego("Super Mario Bros", "Nintendo", "Plataformas");
        juegos[1] = new JuegoDeAccion("Call of Duty", "Activision", "Acción", "AK-47");
        juegos[2] = new JuegoDeAventura("The Legend of Zelda", "Nintendo", "Aventura", "Espada Maestra", 8);
        for (Juego juego : juegos) {
            System.out.println("Nombre: " + juego.getNombre());
            System.out.println("Desarrollador: " + juego.getDesarrollador());
            System.out.println("Genero: " + juego.getGenero());
            if (juego instanceof JuegoDeAccion) {
                System.out.println("Arma: " + ((JuegoDeAccion) juego).getArma());
            }
            if (juego instanceof JuegoDeAventura) {
                System.out.println("Misiones: " + ((JuegoDeAventura) juego).getMisiones());
            }
            System.out.println();
        }
    }
}
