/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg3_empresa;

/**
 *
 * @author PC
 */
public class Problema3_Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private Problema3_Departamento[] departamentos;
    private int contadorDepartamentos;

    public Problema3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new Problema3_Departamento[3];
        this.contadorDepartamentos = 0;
    }

    public void agregarDepartamento(Problema3_Departamento departamento) {
        if (contadorDepartamentos < 3) {
            this.departamentos[contadorDepartamentos] = departamento;
            contadorDepartamentos++;
        }
    }

    public String obtenerDatosEmpresa() {
        String informacion = "Empresa: " + nombre + "\nRUC: " + ruc + "\nDireccion: " + direccion + "\n\n--- Lista de Departamentos ---\n";
        for (int i = 0; i < contadorDepartamentos; i++) {
            informacion += departamentos[i].obtenerDatosDepartamento() + "\n";
        }
        return informacion;
    }
}