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
        tamanio++;
    }

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
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        lista.agregarAdelante(42);
        lista.agregarAtras(3);


        // lista.agregarAlFinal(10);
        // lista.agregarAlFinal(20);
        // lista.agregarAlInicio(5);

        System.out.println(lista.longitud()); // Imprime: 5 10 20
        System.out.println(lista.obtener(1)); // Imprime: 20 10 5

        // lista.eliminar(10);
        // lista.mostrar(); // Imprime: 5 20
    }
}

