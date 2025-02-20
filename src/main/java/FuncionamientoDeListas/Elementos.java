package FuncionamientoDeListas;


public class Elementos<T> {
    T dato;  // Almacena el dato de tipo Generico
    Elementos<T> siguiente;  // Apunta al siguiente elemento

    // Constructor para inicializar el dato y el siguiente elemento como null
    public Elementos(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
