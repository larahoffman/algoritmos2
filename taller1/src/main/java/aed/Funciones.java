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
        int i = 0;
        boolean resultado = false;
        if(s1.length() > s2.length()){
            return false;
        }
        while(i < s1.length()){
            char caracterS1 = s1.charAt(i);
            char caracterS2 = s2.charAt(i);
            
            if(caracterS1 == caracterS2){
                resultado = true;
            }else{
                resultado = false;
            }
            i += 1;
        }
        return resultado;
    }

    boolean esSufijo(String s1, String s2) {
        int i = 0;
        boolean resultado = false;
        String reversoS1 = reverso(s1);
        String reversoS2 = reverso(s2);
        String auxiliarS1 = "";
        String auxiliarS2 = "";

        if(s1.length() > s2.length()){
            return false;
        }
        while(i < s1.length()){
            char caracterS1 = reversoS1.charAt(i);
            char caracterS2 = reversoS2.charAt(i);

            auxiliarS1 += caracterS1;
            auxiliarS2 += caracterS2;
            
            i += 1;
        }
        if(esPrefijo(auxiliarS1, auxiliarS2)){
            resultado = true;
        }
        return resultado;
    }

    String reverso(String str){
        int i = str.length() - 1;
        String nuevoStr = "";

        while(i >= 0){
            nuevoStr += str.charAt(i);
            i--;
        }
        return nuevoStr;
    }
}
