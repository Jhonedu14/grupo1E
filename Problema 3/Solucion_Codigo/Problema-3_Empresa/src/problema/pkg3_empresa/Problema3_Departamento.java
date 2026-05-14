
package problema.pkg3_empresa;

public class Problema3_Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;

    public Problema3_Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
    }

    public String calcularCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            return "A";
        } else if (numeroEmpleados > 10 && produccionAnual > 500000) {
            return "B";
        } else {
            return "C";
        }
    }

    public String obtenerDatosDepartamento() {
        return "Departamento: " + nombre + " | Empleados: " + numeroEmpleados + 
               " | Produccion Anual: $" + produccionAnual + " | Categoria Asignada: " + calcularCategoria();
    }
}
