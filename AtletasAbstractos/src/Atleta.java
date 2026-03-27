public abstract class Atleta implements Evaluable {

    private String nombre;
    private int edad;
    private double horasEntrenamiento;

    public Atleta(String nombre, int edad, double horasEntrenamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public void mostrarDatos() {
        System.out.println("========================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad : " + edad + " años");
        System.out.println("Horas de entrenamiento: " + horasEntrenamiento);
        System.out.println("Rendimiento : " );
        System.out.println("Nivel : " + clasificarNivel());
        System.out.println("Bono: " + String.format("%.0f", calcularBono()));
        System.out.println("========================================");
    }

    public abstract double calcularRendimiento();

    public String getNombre() {
        return nombre;
    }
}
