package aed;

class Funciones {
    int cuadrado(int x) {
        int cuadrado = x * x;
        return cuadrado;
    }

    double distancia(double x, double y) {
        double distancia;
        double cuadradoX = x * x;
        double cuadradoY = y * y;
        distancia = Math.sqrt((cuadradoX) + (cuadradoY));
        
        return distancia;
    }

    boolean esPar(int n) {
        boolean resultado = (n % 2 == 0);
        return resultado;
    } // debería hacer divideA()?

    boolean esBisiesto(int n) {
        // COMPLETAR
        return false;
    }

    int factorialIterativo(int n) {
        // COMPLETAR
        return 0;
    }

    int factorialRecursivo(int n) {
        // COMPLETAR
        return 0;
    }

    boolean esPrimo(int n) {
        // COMPLETAR
        return false;
    }

    int sumatoria(int[] numeros) {
        // COMPLETAR
        return 0;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
