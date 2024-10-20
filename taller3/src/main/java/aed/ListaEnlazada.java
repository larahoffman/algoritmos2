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
        return this.tamanio;
    }

    public void agregarAdelante(T elem) {
        Nodo<T> nuevo = new Nodo<T>(elem);
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }else{
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
        tamanio++;
    }

    public void agregarAtras(T elem) {
        Nodo<T> nuevo = new Nodo<T>(elem);
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        tamanio++;
	}

	public T obtener(int i) {
	    Nodo<T> nodoActual = null;
        if (i < longitud() / 2) {
            nodoActual = primero;
            for (int j = 0; j < i; j++) {
                nodoActual = nodoActual.siguiente;
            }
        } else {
            nodoActual = ultimo;
            for (int j = longitud() - 1; j > i; j--) {
                nodoActual = nodoActual.anterior;
            }
        }
		return nodoActual.dato;
	}

	public Nodo<T> obtenerNodo(int i) {
		Nodo<T> nodoActual = null;
        if (i < longitud() / 2) {
            nodoActual = primero;
            for (int j = 0; j < i; j++) {
                nodoActual = nodoActual.siguiente;
            }
        } else {
            nodoActual = ultimo;
            for (int j = longitud() - 1; j > i; j--) {
                nodoActual = nodoActual.anterior;
            }
        }
        return nodoActual;
	}

	public void eliminar(int i) {
            Nodo<T> nodoActual = obtenerNodo(i);

            if (nodoActual == primero) {
                primero = nodoActual.siguiente;
                if (primero != null) {
                    primero.anterior = null;
                } else {
                    ultimo = null;
                }
            } 
            else if (nodoActual == ultimo) {
                ultimo = nodoActual.anterior;
                if (ultimo != null) {
                    ultimo.siguiente = null;
                }
            } 
            else { // a chequear, debe haber otra forma
                nodoActual.anterior.siguiente = nodoActual.siguiente;
                nodoActual.siguiente.anterior = nodoActual.anterior;
            }
        
            tamanio--;
        }

    public void modificarPosicion(int indice, T elem) {
        Nodo<T> nodoActual = obtenerNodo(indice);
        nodoActual.dato = elem;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        Nodo<T> nodoActual = lista.primero;
        while(nodoActual != null){
            this.agregarAtras(nodoActual.dato);
            nodoActual = nodoActual.siguiente;
        }
    }

    @Override
    public String toString() {
        StringBuilder elementos = new StringBuilder();
        elementos.append("[");
        Nodo<T> nodoActual = primero;

        for(int i = 0; i < longitud(); i++){
            elementos.append(nodoActual.dato);
            if(i < longitud() - 1){
                elementos.append(", ");
            }
            nodoActual = nodoActual.siguiente;
        }
        elementos.append("]");

        return elementos.toString();
    }

    private class ListaIterador implements Iterador<T> {
    	Nodo<T> nodoPrevio; 
        Nodo<T> nodoActual;  

        public ListaIterador(){
            this.nodoPrevio = null; 
            this.nodoActual = primero; 
        }

        public boolean haySiguiente() {
            return this.nodoActual != null; 
        }
        
        public boolean hayAnterior() {
            return this.nodoPrevio != null; 
        }

        public T siguiente() {
            Nodo<T> nodoTemporal = this.nodoActual;
            this.nodoPrevio = this.nodoActual;
            this.nodoActual = this.nodoActual.siguiente;

            return nodoTemporal.dato;
        }
        

        public T anterior() {
            Nodo<T> nodoTemporal = this.nodoPrevio;
            this.nodoActual = this.nodoPrevio;
            this.nodoPrevio = this.nodoPrevio.anterior;

            return nodoTemporal.dato;
        }
    }

    public Iterador<T> iterador() {
	    return new ListaIterador();
    }
}

