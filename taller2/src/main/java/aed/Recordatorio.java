package aed;

public class Recordatorio {

    private String mensaje;
    private Fecha fecha;
    private Horario horario; 
    // Ejercicio 8
    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha);
        this.horario = horario;
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return new Fecha(this.fecha);
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        String recordatorio = "";
        recordatorio = this.mensaje + " @ " + this.fecha + " " + this.horario;
        return recordatorio;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otroEsNull = (otro == null);

        if(otroEsNull){
            return false;
        }else if(otro.getClass() != this.getClass()){
            return false;
        }else{
            Recordatorio otroRecordatorio = (Recordatorio) otro; //casting
            return this.mensaje == otroRecordatorio.mensaje && this.fecha == otroRecordatorio.fecha && this.horario == otroRecordatorio.horario;            
        }
    }

}
