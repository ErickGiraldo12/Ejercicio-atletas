public class Ciclista extends Atleta implements Evaluable {

    private double kilometrosRecorridos;
    private double tiempoHoras;

    public Ciclista(String nombre, int edad, double horasEntrenamiento, double kilometrosRecorridos, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public double calcularRendimiento() {
        return kilometrosRecorridos / tiempoHoras;
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
        System.out.println("--- Ciclista ---");
        System.out.println("Kilometros recorridos: " + kilometrosRecorridos);
        System.out.println("Tiempo (horas)       : " + tiempoHoras);
        super.mostrarDatos();
    }
}
