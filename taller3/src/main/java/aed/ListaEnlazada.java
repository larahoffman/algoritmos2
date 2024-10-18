package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;

    private class Nodo<T> {
        T dato;
        Nodo<T> anterior;
        Nodo<T> siguiente;

        Nodo(T d) {
            dato = d;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    public ListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public int longitud() {
        return tamanio;
    }

    public void agregarAdelante(T elem) {
        Nodo<T> nuevo = new Nodo<T>(elem);
        if(primero == null){ // caso lista vacía
            primero = nuevo;
            ultimo = nuevo;
        }else{
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
    }
    // falta testear
    public void agregarAtras(T elem) {
	Nodo<T> nuevo = new Nodo<T>(elem);
	    if(primero == null){ // caso lista vacía
		primero = nuevo;
		ultimo = nuevo;
	    }else{
		ultimo.siguiente = nuevo;
		nuevo.anterior = ultimo;
		ultimo = nuevo;
	    }
	}

    public T obtener(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void eliminar(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
