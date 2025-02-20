package FuncionamientoDeListas;

public class Nodo<T> {
    Elementos<T> elemento;  // Almacena el Elemento, que es genérico
    Nodo<T> siguiente;  // Apunta al siguiente Nodo

    // Constructor para inicializar el Nodo con un Elemento
    public Nodo(Elementos<T> elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
}
