package aed;

public class Agenda {
    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios recordatorios;
    // Ejercicio 16
    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();
    }
    // Ejercicio 17
    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String arreglo = "";
        arreglo += fechaActual.toString() + "\n";
        arreglo += "=====\n";
        for(int i = 0; i < recordatorios.longitud(); i++){
            Recordatorio recordatorio = recordatorios.obtener(i);
            arreglo += recordatorio.toString() + "\n";
        };
        
        return arreglo;
    }

    public void incrementarDia() {
        // Implementar
    }

    public Fecha fechaActual() {
        Agenda agenda = new Agenda(fechaActual);
        Fecha fechaAgenda = agenda.fechaActual;
        Fecha fechaActual = new Fecha(fechaAgenda);
        return fechaActual;
    }

}
