import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class CasoCorrupcion {

    private String nombreCaso;
    private LocalDate fechaInicio;
    private String estado;
    private String detalle;

    private ArrayList<Persona> personas;

    public CasoCorrupcion(String nombreCaso, String detalle) {
        this.nombreCaso = nombreCaso;
        this.detalle = detalle;
        this.fechaInicio = LocalDate.now();
        this.estado = "Iniciado";
        this.personas = new ArrayList<>();
    }

    // Agregar persona
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // Mostrar personas
    public void mostrarPersonas() {
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Rol: " + p.getNivelImplicacion());
            System.out.println("--------------------");
        }
    }

    // Actualizar estado automáticamente
    public void actualizarEstado() {

        long dias = ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());

        if (dias > 14) {
            estado = "Urgente";
        } else if (dias > 7) {
            estado = "Alerta";
        }

        System.out.println("Estado actual: " + estado);
    }

    // MAIN
    public static void main(String[] args) {

        CasoCorrupcion caso = new CasoCorrupcion(
                "Caso Corrupcion Publica",
                "Investigacion de irregularidades"
        );

        Persona p1 = new Persona("Carlos Ruiz", 50, "Funcionario",
                "Acusado", 0.8, 10000);

        Persona p2 = new Persona("Ana Torres", 35, "Contadora",
                "Testigo", 0, 0);

        caso.agregarPersona(p1);
        caso.agregarPersona(p2);

        caso.mostrarPersonas();

        // Simular confesión
        p1.confesar();
        p1.reduccionPena();
        p1.solicitarFianza();

        // Verificar estado
        caso.actualizarEstado();
    }
}