
package problema.pkg3_empresa;


import java.util.Scanner;

public class Problema3_EmpresaEjecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la Empresa: ");
        String nombreEmpresa = entrada.nextLine();

        System.out.print("Ingrese el RUC de la Empresa: ");
        String ruc = entrada.nextLine();

        System.out.print("Ingrese la direccion de la Empresa: ");
        String direccion = entrada.nextLine();

        Problema3_Empresa empresa = new Problema3_Empresa(nombreEmpresa, ruc, direccion);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Registro del Departamento " + i + " ---");
            System.out.print("Ingrese el nombre del departamento: ");
            String nombreDepto = entrada.nextLine();

            System.out.print("Ingrese el numero de empleados: ");
            int empleados = entrada.nextInt();

            System.out.print("Ingrese la produccion anual: ");
            double produccion = entrada.nextDouble();
            entrada.nextLine(); 

            Problema3_Departamento depto = new Problema3_Departamento(nombreDepto, empleados, produccion);
            empresa.agregarDepartamento(depto);
        }

        System.out.println("\n==========================================");
        System.out.println("REPORTE FINAL DE LA EMPRESA Y DEPARTAMENTOS");
        System.out.println("==========================================");
        System.out.println(empresa.obtenerDatosEmpresa());

    }
}