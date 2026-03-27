public class Boxeador extends Atleta implements Evaluable {

    private int golpesAcertados;
    private int peleasGanadas;

    public Boxeador(String nombre, int edad, double horasEntrenamiento, int golpesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.golpesAcertados = golpesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    @Override
    public double calcularRendimiento() {
        return (golpesAcertados * 0.5) + (peleasGanadas * 10);
    }

    @Override
    public String clasificarNivel() {
        double rendimiento = calcularRendimiento();
        if (rendimiento < 30) {
            return "Basico";
        } else if (rendimiento <= 70) {
            return "Competente";
        } else {
            return "Elite";
        }
    }

    @Override
    public double calcularBono() {
        String nivel = clasificarNivel();
        switch (nivel) {
            case "Basico":     return 50000;
            case "Competente": return 150000;
            case "Elite":      return 300000;
            default:           return 0;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("--- Boxeador ---");
        System.out.println("Golpes acertados: " + golpesAcertados);
        System.out.println("Peleas ganadas  : " + peleasGanadas);
        super.mostrarDatos();
    }
}
