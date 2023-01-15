package Comidas;
public class Main {
    public static void main(String[] args) {
        ComidaJaponesa[] comidas = new ComidaJaponesa[1];
        comidas[0] = new ComidaJaponesa("Tonkatsu", "Japon", "Occidental", "Japones", "Tonkatsu");

        for (ComidaJaponesa comida : comidas) {
            System.out.println("Nombre: " + comida.getNombre());
            System.out.println("País de origen: " + comida.getPaisOrigen());
            System.out.println("Tipo de cocina: " + comida.getTipoCocina());
            System.out.println("Estilo de cocina: " + comida.getEstiloCocina());
            System.out.println("Plato típico: " + comida.getPlatoTipico());
            System.out.println();
        }
    }
}