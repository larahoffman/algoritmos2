package aed;

public class Horario {
    private int hora;
    private int minutos;
    // Ejercicio 5
    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }
    // Ejercicio 6
    @Override
    public String toString() {
        String horarioComoTexto = "";
        horarioComoTexto = this.hora + ":" + this.minutos;
        return horarioComoTexto;
    }
    // Ejercicio 7
    @Override
    public boolean equals(Object otro) {
        boolean otroEsNull = (otro == null);

        if(otroEsNull){
            return false;
        }else if(otro.getClass() != this.getClass()){
            return false;
        }else{
            Horario otroHorario = (Horario) otro; //casting
            return this.hora == otroHorario.hora && this.minutos == otroHorario.minutos;            
        }
    }

}
