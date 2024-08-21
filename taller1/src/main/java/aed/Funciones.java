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
        boolean resultado = (primo(n) == 2);
        return resultado;
    }
    int primo(int n){
        int i = 1;
        int suma = 0;
        while(i <= n){
            if(divideA(i,n)){
                suma += 1;
            }
            i += 1;
        }
        return suma;
        
    }

    int sumatoria(int[] numeros) {
        int i = 0;
        int sumaElementos = 0;
        while(i < numeros.length){
            sumaElementos += numeros[i];
            i += 1;
        }
        return sumaElementos;
    }

    int busqueda(int[] numeros, int buscado) {
        int i = 0;
        while(i < numeros.length){
            if(buscado == numeros[i]){
                int posicion = i;
                return posicion;
            }
            i += 1;
        }
        return 0; // ni debería ser necesario, por el requiere
    }

    boolean tienePrimo(int[] numeros) {
        int i = 0;
        while(i < numeros.length){
            int elemento = numeros[i];
            if(esPrimo(elemento)){
                return true;
            }
            i += 1;
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        int i = 0;
        while(i < numeros.length){
            int elemento = numeros[i];
            if(!(esPar(elemento))){
                return false;
            }
            i += 1;
        }
        return true;
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
