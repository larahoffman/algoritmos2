package aed;

public class Fecha {
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    // public Fecha(Fecha fecha) {
    //     // Implementar
    // }

    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes;
    }

    public String toString() {
        String fechaComoTexto = "";
        fechaComoTexto = "" + this.dia + "/" + this.mes + "";
        return fechaComoTexto;
    }

    @Override
    public boolean equals(Object otra) {
        // Implementar
        return true;
    }

    public void incrementarDia() {
        // Implementar
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}