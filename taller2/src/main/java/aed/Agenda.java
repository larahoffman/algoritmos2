package aed;

public class Agenda {
    private Fecha fecha;
    private ArregloRedimensionableDeRecordatorios recordatorios;
    // Ejercicio 16
    public Agenda(Fecha fechaActual) {
        this.fecha = new Fecha(fechaActual);
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        // Implementar
    }

    @Override
    public String toString() {
        // Implementar
        return "";
    }

    public void incrementarDia() {
        // Implementar
    }

    public Fecha fechaActual() {
        Agenda agenda = new Agenda(fecha);
        Fecha fechaAgenda = agenda.fecha;
        Fecha fechaActual = new Fecha(fechaAgenda);
        return fechaActual;
    }

}
