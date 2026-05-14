package gestionconflictos;

import java.util.Scanner;

public class GestionConflictos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema(20, 20);

        int opcion;

        do {
            System.out.println("\n===== MENU SISTEMA DE CONFLICTOS =====");
            System.out.println("1. Agregar Conflicto");
            System.out.println("2. Mostrar Conflictos");
            System.out.println("3. Agregar Evento");
            System.out.println("4. Mostrar Eventos");
            System.out.println("5. Salir");
            System.out.print("Ingrese opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("=== NUEVO CONFLICTO ===");
                    System.out.print("Nombre: ");
                    String cn = sc.nextLine();
                    System.out.print("Fecha inicio: ");
                    String cf = sc.nextLine();
                    System.out.print("Estado actual: ");
                    String ce = sc.nextLine();

                    Conflicto c = new Conflicto(cn, cf, ce);
                    sistema.agregarConflicto(c);
                    break;

                case 2:
                    System.out.println("=== LISTA DE CONFLICTOS ===");
                    sistema.mostrarConflictos();
                    break;

                case 3:
                    System.out.println("=== NUEVO EVENTO ===");
                    System.out.print("Nombre: ");
                    String en = sc.nextLine();
                    System.out.print("Lugar: ");
                    String el = sc.nextLine();
                    System.out.print("Fecha: ");
                    String ef = sc.nextLine();
                    System.out.print("Descripcion: ");
                    String ed = sc.nextLine();

                    Evento e = new Evento(en, el, ef, ed);
                    sistema.agregarEvento(e);
                    break;

                case 4:
                    System.out.println("=== LISTA DE EVENTOS ===");
                    sistema.mostrarEventos();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 5);

    }
}
