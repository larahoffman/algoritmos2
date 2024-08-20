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
    boolean divideA(int m, int n) {
        boolean resultado = (n % m == 0);
        return resultado;
    }
    boolean esPar(int n) {
        boolean resultado = divideA(2,n);
        return resultado;
    }
    boolean esBisiesto(int n) {
        boolean resultado;
        resultado = (divideA(4, n) && !(divideA(100, n)) || divideA(400, n));
        return resultado;
    }

    int factorialIterativo(int n) {
        int i = 1;
        int resultado = n;
        if(n == 0){
            resultado = 1;
        }else{
            while(i < n){
                resultado *= i;
                i += 1;
            }
        }
        return resultado;
    }

    int factorialRecursivo(int n) {
        boolean casoBase = (n == 0);
        if (casoBase) {
            return 1;
        }else{
            int factorialN = n * factorialRecursivo(n - 1);
            return factorialN;
        }
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
