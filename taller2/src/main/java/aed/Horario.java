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

    @Override
    public String toString() {
        // Implementar
        return "";
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        return true;
    }

}
