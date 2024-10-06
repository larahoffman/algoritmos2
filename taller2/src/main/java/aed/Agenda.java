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
    public static void main(String[] args) {
        // Crear una fecha inicial para la agenda
        Fecha fechaInicial = new Fecha(10, 10);

        // Crear la agenda con la fecha inicial
        Agenda miAgenda = new Agenda(fechaInicial);

        // Crear algunos recordatorios
        Recordatorio recordatorio1 = new Recordatorio("Reunión con equipo", new Fecha(12, 10), new Horario(9, 30));
        Recordatorio recordatorio2 = new Recordatorio("Cita médica", new Fecha(15, 10), new Horario(16, 45));
        Recordatorio recordatorio3 = new Recordatorio("Entregar informe", new Fecha(20, 10), new Horario(11, 0));

        miAgenda.agregarRecordatorio(recordatorio1);
        miAgenda.agregarRecordatorio(recordatorio2);
        miAgenda.agregarRecordatorio(recordatorio3);

        System.out.println(miAgenda);
    }
}
