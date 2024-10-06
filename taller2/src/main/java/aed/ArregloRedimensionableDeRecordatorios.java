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

    public void quitarAtras() {
        Recordatorio[] nuevoArrayRecordatorios = new Recordatorio[recordatorios.length - 1];
        for(int i = 0; i < nuevoArrayRecordatorios.length; i++){
            nuevoArrayRecordatorios[i] = recordatorios[i];
        }
        recordatorios = nuevoArrayRecordatorios;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
