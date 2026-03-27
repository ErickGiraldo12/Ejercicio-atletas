public class Main {

    public static void main(String[] args) {

        Ciclista c1 = new Ciclista("Carlos Perez", 28, 20.0, 180.0, 2.5);
        Boxeador b1 = new Boxeador("Luis Mora", 25, 15.0, 60, 8);
        Voleibolista v1 = new Voleibolista("Ana Torres", 22, 18.0, 15, 12);


        c1.mostrarDatos();
        b1.mostrarDatos();
        v1.mostrarDatos();

    }
}
