package gestionconflictos;

public class Sistema {

    private Evento[] eventos;
    private Conflicto[] conflictos;
    private int contEventos;
    private int contConflictos;

    public Sistema(int capacidadEventos, int capacidadConflictos) {
        eventos = new Evento[capacidadEventos];
        conflictos = new Conflicto[capacidadConflictos];
        contEventos = 0;
        contConflictos = 0;
    }

    // ------------------ EVENTOS ------------------
    public void agregarEvento(Evento e) {
        if (contEventos < eventos.length) {
            eventos[contEventos] = e;
            contEventos++;
        } else {
            System.out.println("No hay espacio para mas eventos.");
        }
    }

    public void mostrarEventos() {
        if (contEventos == 0) {
            System.out.println("No hay eventos registrados.");
        }
        for (int i = 0; i < contEventos; i++) {
            System.out.println(eventos[i].datos());
        }
    }

    // ------------------ CONFLICTOS ------------------
    public void agregarConflicto(Conflicto c) {
        if (contConflictos < conflictos.length) {
            conflictos[contConflictos] = c;
            contConflictos++;
        } else {
            System.out.println("No hay espacio para mas conflictos.");
        }
    }

    public void mostrarConflictos() {
        if (contConflictos == 0) {
            System.out.println("No hay conflictos registrados.");
        }
        for (int i = 0; i < contConflictos; i++) {
            System.out.println(conflictos[i].datos());
        }
    }
}
