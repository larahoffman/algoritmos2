package aed;

public class Fecha {
    private int dia;
    private int mes;
    // Ejercicio 1
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
    // Ejercicio 2
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
    // Ejercicio 3
    public void incrementarDia() {
        int diaObjeto = this.dia;
        int mesObjeto = this.mes;
        int cantidadDias = diasEnMes(mesObjeto);

        switch (cantidadDias) {
            case 31:
                if(mesObjeto == 1){
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 2;  
                    }
                }
                if(mesObjeto == 3){
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 4;  
                    }
                }
                if (mesObjeto == 5) {
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 6;  
                    }
                }
                if (mesObjeto == 7) {
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 8;
                    }
                }
                if (mesObjeto == 8) {
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 9;  
                    }
                }
                if (mesObjeto == 10) {
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 11;  
                    }
                }
                if (mesObjeto == 12) {
                    if(diaObjeto < 31){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 1;  
                    }
                }
                break;
            case 28:
                if(diaObjeto < 28){
                    this.dia += 1;
                }else{
                    this.dia = 1;
                    this.mes = 3;
                }
                break;
            case 30:
                if (mesObjeto == 4) {
                    if(diaObjeto < 30){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 5;  
                    }
                }
                if (mesObjeto == 6) {
                    if(diaObjeto < 30){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 7;  
                    }
                }
                if (mesObjeto == 9) {
                    if(diaObjeto < 30){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 10;  
                    }
                }
                if (mesObjeto == 11) {
                    if(diaObjeto < 30){
                        this.dia += 1;
                    }
                    else{
                        this.dia = 1;
                        this.mes = 12;
                    }
                }
                break;  
        }
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
