package gestionconflictos;

public class Conflicto {

    private String nombre;
    private String fechaInicio;
    private String estadoActual;

    public Conflicto() {
    }

    public Conflicto(String nombre, String fechaInicio, String estadoActual) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estadoActual = estadoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String datos() {
        return "Conflicto: " + nombre
                + " | Fecha Inicio: " + fechaInicio
                + " | Estado Actual: " + estadoActual;
    }
}
