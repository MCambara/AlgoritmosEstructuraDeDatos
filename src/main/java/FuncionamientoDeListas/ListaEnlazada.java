package FuncionamientoDeListas;

public class ListaEnlazada<T> {

    private Nodo<T> cabeza; // Referencia al primer nodo
    private Nodo<T> cola;   // Referencia al último nodo

    // Constructor
    public ListaEnlazada() {
        cabeza = null;
        cola = null;
    }

    // Método para agregar un nuevo elemento al final de la lista
    public void agregar(T dato) {
        Elementos<T> nuevoElemento = new Elementos<>(dato);  // Crear un nuevo elemento
        Nodo<T> nuevoNodo = new Nodo<>(nuevoElemento);  // Crear un nuevo nodo con el elemento

        if (cola == null) {  // Si la lista está vacía, el nuevo nodo es tanto cabeza como cola
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {  // Si la lista no está vacía, agregar el nuevo nodo al final
            cola.siguiente = nuevoNodo;  // El nodo anterior apunta al nuevo nodo
            cola = nuevoNodo;  // Actualizamos la cola para que apunte al nuevo nodo
        }
    }

    // Método para eliminar el primer elemento de la lista
    public void eliminar() {
        if (estaVacia()) {  // Si la lista está vacía, no hacemos nada
            System.out.println("La lista está vacía.");
            return;
        }

        cabeza = cabeza.siguiente;  // El primer nodo se elimina, la cabeza apunta al siguiente nodo

        if (cabeza == null) {  // Si la lista se quedó vacía después de eliminar, la cola también debe ser null
            cola = null;
        }
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;  // Si la cabeza es null, la lista está vacía
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.elemento.dato + " ");  // Imprimir el dato del nodo actual
            actual = actual.siguiente;  // Mover al siguiente nodo
        }
        System.out.println();  // Nueva línea al final de la lista
    }

    // Método para obtener el primer elemento de la lista
    public T obtenerPrimero() {
        if (estaVacia()) {
            return null;  // Si la lista está vacía, no hay primer elemento
        }
        return cabeza.elemento.dato;  // Devolver el dato del primer nodo
    }

    // Método para obtener el último elemento de la lista
    public T obtenerUltimo() {
        if (estaVacia()) {
            return null;  // Si la lista está vacía, no hay último elemento
        }
        return cola.elemento.dato;  // Devolver el dato del último nodo
    }

}
