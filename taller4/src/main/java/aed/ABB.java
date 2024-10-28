package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    private Nodo raiz; 
    private int cardinal;

    private class Nodo {
        Nodo izquierdo;
        Nodo derecho;
        Nodo padre;
        T dato; 

        public Nodo(T d){
            this.dato = d; 
        }
    }

    public ABB() {
        this.raiz = null; 
    }

    public int cardinal() {
        return this.cardinal; 
    }

    public T minimo(){
        T resultado = minimoAux(this.raiz);
        return resultado;
    }

    public T minimoAux(Nodo arbol){
        if(arbol.izquierdo == null){
            return arbol.dato;
        }
        return minimoAux(arbol.izquierdo);
    }

    public T maximo(){
       T resultado = maximoAux(this.raiz);
       return resultado;
    }

    public T maximoAux(Nodo arbol){
        if(arbol.derecho == null){
            return arbol.dato;
        }
        return maximoAux(arbol.derecho);
    }

    public Nodo buscarNodoSiguiente(Nodo arbol) {
        if (arbol == null){
            return null;
        }
        if (arbol.derecho != null){
            return buscarNodoConMinimo(arbol.derecho);
        }
        return buscarSiguienteNodoPadre(arbol);
    }
    public Nodo buscarNodoConMinimo(Nodo arbol){
        if(arbol == null){
            return null;
        }
        if(arbol.izquierdo == null){
            return arbol;
        }else{
            return buscarNodoConMinimo(arbol.izquierdo);
        }
    } 
    private Nodo buscarSiguienteNodoPadre(Nodo arbol) {
        Nodo nodoPadre = arbol.padre;
        if (arbol == null || nodoPadre == null || arbol == nodoPadre.izquierdo){
            return nodoPadre;
        }
        return buscarSiguienteNodoPadre(nodoPadre);
    }

    public void insertar(T elem){
        Nodo nodoActual = this.raiz;
        Nodo nuevoNodo = new Nodo(elem);

        if(this.pertenece(elem)){
            return;
        }
       
        if(nodoActual == null){
            this.raiz = nuevoNodo; 
            this.cardinal += 1;
            return; 
        }
        this.insertarAux(nuevoNodo, nodoActual);
    }
    public void insertarAux(Nodo nuevoNodo, Nodo arbol){
        if(arbol == null){
            return;
        } 
        if(nuevoNodo.dato.compareTo(arbol.dato) > 0){
            if(arbol.derecho == null){
                arbol.derecho = insertarNodo(nuevoNodo, arbol, arbol.derecho);
            }else{
                insertarAux(nuevoNodo, arbol.derecho);
            }
        }else{
            if(arbol.izquierdo == null){
                arbol.izquierdo = insertarNodo(nuevoNodo, arbol, arbol.izquierdo);
            }else{
                insertarAux(nuevoNodo, arbol.izquierdo);
            }
        }
    }
    public Nodo insertarNodo(Nodo nuevoNodo, Nodo arbol, Nodo otroArbol){
        otroArbol = nuevoNodo;
        nuevoNodo.padre = arbol;
        this.cardinal += 1;
        return nuevoNodo;
    }

    public boolean pertenece(T elem){
        Nodo nodo = this.raiz;
        return busquedaRecursiva(elem, nodo); 
    }
    public boolean busquedaRecursiva(T elem, Nodo arbol){
        if(arbol == null){
            return false;
        }
        if(elem.compareTo(arbol.dato) == 0){
            return true;
        }else if(elem.compareTo(arbol.dato) < 0){
            return busquedaRecursiva(elem, arbol.izquierdo);
        }else{
            return busquedaRecursiva(elem, arbol.derecho);
        }
    }

    public void eliminar(T elem){
        Nodo nodoActual = this.raiz;
        Nodo padre = null;

        if (elem.compareTo(nodoActual.dato) == 0 && nodoActual.derecho == null && nodoActual.izquierdo == null) {
            this.raiz = null;
            this.cardinal -= 1;
            return;
        }

        eliminarAux(elem, padre, nodoActual);
    }

    public void eliminarAux(T elem, Nodo padre, Nodo arbol){
        if(arbol == null){
            return;
        }
        if(elem.compareTo(arbol.dato) > 0){
            eliminarAux(elem, arbol, arbol.derecho);
        }else if(elem.compareTo(arbol.dato) < 0){
            eliminarAux(elem, arbol, arbol.izquierdo);
        } else {
            if(arbol.derecho == null || arbol.izquierdo == null){
                Nodo hijo;
                if (arbol.izquierdo != null) {
                    hijo = arbol.izquierdo;
                } else {
                    hijo = arbol.derecho;
                }
                if (padre == null) {
                    this.raiz = hijo;
                } else if (padre.izquierdo == arbol) {
                    padre.izquierdo = hijo;
                } else {
                    padre.derecho = hijo;
                }
                this.cardinal--;
            }else{
                Nodo nodoActual = arbol;
                Nodo predecesor = nodoActual.izquierdo;

                while(predecesor.derecho != null){
                    nodoActual = predecesor;
                    predecesor = predecesor.derecho;
                }
                arbol.dato = predecesor.dato;
                
                if(nodoActual != arbol){
                    nodoActual.derecho = predecesor.izquierdo; 
                }else{
                    nodoActual.izquierdo = predecesor.izquierdo;
                }
                this.cardinal--;
            }
        }
        return;
    }

    public String toString(){
        Iterador<T> iterador = new ABB_Iterador();
        StringBuilder elementos = new StringBuilder();
        elementos.append("{");
        while(iterador.haySiguiente()){
            elementos.append(iterador.siguiente());
            if(iterador.haySiguiente()){
                elementos.append(",");
            }
        }
        elementos.append("}");
        return elementos.toString();
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;

        public ABB_Iterador(){
            this._actual = buscarNodoConMinimo(raiz);
        }

        public boolean haySiguiente() {            
            return this._actual != null; 
        }
    
        public T siguiente() {
            Nodo nodoActualAnterior = this._actual;
            Nodo siguiente = buscarNodoSiguiente(this._actual);
            this._actual = siguiente;
            
            return nodoActualAnterior.dato;
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
