package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] recordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        recordatorios = new Recordatorio[0];
    }
    // Ejercicio 11
    public int longitud() {
        return recordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        recordatorios = agregarRecordatorio(recordatorios, i);
    }

    public Recordatorio[] agregarRecordatorio(Recordatorio[] recordatorios, Recordatorio recordatorio){
        int longitudRecordatorios = recordatorios.length;
        Recordatorio[] nuevoArrayRecordatorios = new Recordatorio[longitudRecordatorios + 1];

        for(int i = 0; i < longitudRecordatorios; i ++){
            nuevoArrayRecordatorios[i] = recordatorios[i];
        }

        int longitudNuevoArrayRecordatorios = nuevoArrayRecordatorios.length;
        nuevoArrayRecordatorios[longitudNuevoArrayRecordatorios - 1] = recordatorio;

        return nuevoArrayRecordatorios;
    }

    public Recordatorio obtener(int i) {
        return recordatorios[i];
    }
    // Ejercicio 12
    public void quitarAtras() {
        Recordatorio[] nuevoArrayRecordatorios = new Recordatorio[recordatorios.length - 1];
        for(int i = 0; i < nuevoArrayRecordatorios.length; i++){
            nuevoArrayRecordatorios[i] = recordatorios[i];
        }
        recordatorios = nuevoArrayRecordatorios;
    }
    // Ejercicio 13
    public void modificarPosicion(int indice, Recordatorio valor) {
        recordatorios[indice] = valor; //aca no estoy validando que el indice pasado este en rango, deberia?
    }
    // Ejercicio 14
    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        int longitudVector = vector.recordatorios.length;
        this.recordatorios = new Recordatorio[longitudVector];

        for(int i = 0; i < longitudVector; i++){
            this.recordatorios[i] = vector.recordatorios[i];
        }
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
