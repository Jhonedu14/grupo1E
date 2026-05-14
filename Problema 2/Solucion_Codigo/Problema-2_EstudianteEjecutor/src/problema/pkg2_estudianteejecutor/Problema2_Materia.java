/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg2_estudianteejecutor;

/**
 *
 * @author PC
 */
public class Problema2_Materia {
    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Problema2_Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double sumarCalificaciones() {
        return acd + ape + aa;
    }

    public String obtenerDatosMateria() {
        return "Materia: " + nombre + " | ACD: " + acd + " | APE: " + ape + " | AA: " + aa + " | Total: " + sumarCalificaciones() + "/10";
    }
}