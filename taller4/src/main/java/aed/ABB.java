package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    // Agregar atributos privados del Conjunto
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
        throw new UnsupportedOperationException("No implementada aun");
    }

    public T minimo(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public T maximo(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void insertar(T elem){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public boolean pertenece(T elem){
        throw new UnsupportedOperationException("No implementada aun");
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
