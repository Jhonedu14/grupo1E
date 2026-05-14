/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg2_estudianteejecutor;

/**
 *
 * @author PC
 */
public class Problema2_Estudiante {
    private String nombre;
    private int edad;
    private Problema2_Materia materia;

    public Problema2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void vincularMateria(Problema2_Materia materia) {
        this.materia = materia;
    }

    public String verificarAprobacion() {
        double total = materia.sumarCalificaciones();
        
        if (total >= 7.0) {
            return "Aprobado";
        } else {
            return "Debera rendir un examen de recuperacion sobre 3.5/10 pts. agregado al 60% acumulado de los componentes ACD, APE y AA.";
        }
    }

    public String obtenerDatosEstudiante() {
        return "Nombre del estudiante: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               materia.obtenerDatosMateria() + "\n" +
               "Estado: " + verificarAprobacion();
    }
}