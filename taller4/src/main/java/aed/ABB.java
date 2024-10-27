package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    private Nodo raiz;
    private int cardinal;
    private int altura;

    private class Nodo {
        T dato;
        Nodo izquierdo;
        Nodo derecho;
        Nodo padre;

        public Nodo(T d){
            this.dato = d;
            this.izquierdo = null;
            this.derecho = null;
            this.padre = null;
        }
    }

    public ABB() {
        this.raiz = null;
        this.cardinal = 0;
        this.altura = 0;
    }

    public int cardinal() {
        return this.cardinal;
    }

    public T minimo(){
        T menor = this.raiz.dato;
        while(raiz.izquierdo != null){
            menor = raiz.izquierdo.dato;
            this.raiz = raiz.izquierdo;
        }
        return menor;
    }

    public T maximo(){
        Nodo nodoActual = raiz;
        while(nodoActual.derecho != null){
            nodoActual = nodoActual.derecho;
        }
        return nodoActual.dato;
    }

    public void insertar(T elem){
        raiz = insertarAux(raiz, elem);
    }

    public Nodo insertarAux(Nodo raiz, T elem){
        if(raiz == null){
            raiz = new Nodo(elem);
            cardinal++;
            return raiz;
        }
        if(elem.compareTo(raiz.dato) < 0){
            raiz.izquierdo = insertarAux(raiz.izquierdo, elem);
        }
        if(elem.compareTo(raiz.dato) > 0){
            raiz.derecho = insertarAux(raiz.derecho, elem);
        }
        return raiz;
    }

    public boolean pertenece(T elem){
        boolean valor = perteneceAux(raiz, elem);
        return valor;
    }
    public boolean perteneceAux(Nodo raiz, T elem){
        if(raiz == null){
            return false;
        }
        if(elem.compareTo(raiz.dato) == 0){
            return true;
        }
        boolean resultado;
        if(elem.compareTo(raiz.dato) < 0){
            resultado = perteneceAux(raiz.izquierdo, elem);
        }else{
            resultado = perteneceAux(raiz.derecho, elem);
        }
        return resultado;
    }

    public void eliminar(T elem){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public String toString(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;

        public boolean haySiguiente() {            
            throw new UnsupportedOperationException("No implementada aun");
        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
