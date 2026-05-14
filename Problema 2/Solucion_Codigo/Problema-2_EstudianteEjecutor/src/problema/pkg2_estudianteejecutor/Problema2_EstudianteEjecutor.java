/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg2_estudianteejecutor;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Problema2_EstudianteEjecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = entrada.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = entrada.nextLine();

        System.out.print("Ingrese la calificacion ACD (sobre 3.5): ");
        double acd = entrada.nextDouble();

        System.out.print("Ingrese la calificacion APE (sobre 3.5): ");
        double ape = entrada.nextDouble();

        System.out.print("Ingrese la calificacion AA (sobre 3.0): ");
        double aa = entrada.nextDouble();

        Problema2_Estudiante estudiante = new Problema2_Estudiante(nombreEstudiante, edad);
        Problema2_Materia materia = new Problema2_Materia(nombreMateria, acd, ape, aa);

        estudiante.vincularMateria(materia);

        System.out.println("\n--- Datos Guardados ---");
        System.out.println(estudiante.obtenerDatosEstudiante());
    }
}