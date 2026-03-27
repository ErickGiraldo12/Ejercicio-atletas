public class Voleibolista extends Atleta implements Evaluable {

    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    @Override
    public double calcularRendimiento() {
        return (saquesEfectivos * 2) + (bloqueos * 3);
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
            case "Basico":    return 50000;
            case "Competente": return 150000;
            case "Elite":     return 300000;
            default:     return 0;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("--- Voleibolista ---");
        System.out.println("Saques efectivos: " + saquesEfectivos);
        System.out.println("Bloqueos: " + bloqueos);
        super.mostrarDatos();
    }
}
