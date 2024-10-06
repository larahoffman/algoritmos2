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
            if(recordatorio.fecha().equals(fechaActual)){
                arreglo += recordatorio.toString() + "\n";   
            }
        };
        return arreglo;
    }

    // Ejercicio 18
    public void incrementarDia() {
        fechaActual.incrementarDia();
    }

    // Ej 16
    public Fecha fechaActual() {
        Agenda agenda = new Agenda(fechaActual);
        Fecha fechaAgenda = agenda.fechaActual;
        Fecha fechaActual = new Fecha(fechaAgenda);
        return fechaActual;
    }
}
