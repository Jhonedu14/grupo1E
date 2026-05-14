public class Persona {

    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion; // Acusado, Testigo, Victima
    private boolean confeso;

    private double sentencia; // en años
    private double danoEconomico;

    public Persona(String nombre, int edad, String ocupacion,
                   String nivelImplicacion, double sentencia, double danoEconomico) {

        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.sentencia = sentencia;
        this.danoEconomico = danoEconomico;
        this.confeso = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    public double getSentencia() {
        return sentencia;
    }

    public double getDanoEconomico() {
        return danoEconomico;
    }

    public boolean isConfeso() {
        return confeso;
    }

    public void confesar() {
        if (nivelImplicacion.equals("Acusado")) {
            confeso = true;
            System.out.println(nombre + " ha confesado.");
        }
    }

    public void reduccionPena() {
        if (nivelImplicacion.equals("Acusado") && confeso) {
            sentencia = sentencia / 2; // ejemplo: reduce a la mitad
            System.out.println("Reducción de pena aplicada.");
        }
    }

    public void solicitarFianza() {
        if (nivelImplicacion.equals("Acusado") && sentencia < 1 && confeso) {

            double fianzaMaxima = danoEconomico * 0.5;

            System.out.println("Puede pagar fianza.");
            System.out.println("Fianza máxima permitida: " + fianzaMaxima);
        }
    }
}