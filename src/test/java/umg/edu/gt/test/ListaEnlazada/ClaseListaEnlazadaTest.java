package umg.edu.gt.test.ListaEnlazada; 

import FuncionamientoDeListas.ListaEnlazada;  // Importar la clase ListaEnlazada
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClaseListaEnlazadaTest {

    private ListaEnlazada<Integer> lista;

    // Este método se ejecuta antes de cada prueba para inicializar 	a lista
    @BeforeEach
    public void setUp() {
        lista = new ListaEnlazada<>();
    }

    // Test para agregar elementos a la lista
    @Test
    public void testAgregar() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        // Comprobamos que la lista contiene los elementos correctos
        assertEquals(10, lista.obtenerPrimero());
        assertEquals(30, lista.obtenerUltimo());
    }

    // Test para verificar si la lista está vacía
    @Test
    public void testEstaVacia() {
        assertTrue(lista.estaVacia());  // La lista debería estar vacía inicialmente

        lista.agregar(10);
        assertFalse(lista.estaVacia());  // Después de agregar un elemento, no debería estar vacía
    }

    // Test para eliminar el primer elemento de la lista
    @Test
    public void testEliminar() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        lista.eliminar();  // Eliminar el primer elemento (10)

        assertEquals(20, lista.obtenerPrimero());  // El primer elemento debería ser ahora 20
        assertEquals(30, lista.obtenerUltimo());  // El último elemento sigue siendo 30
    }

    // Test para obtener el primer elemento de la lista
    @Test
    public void testObtenerPrimero() {
        assertNull(lista.obtenerPrimero());  // La lista está vacía, así que debería devolver null

        lista.agregar(10);
        assertEquals(10, lista.obtenerPrimero());  // El primer elemento debería ser 10
    }

    // Test para obtener el último elemento de la lista
    @Test
    public void testObtenerUltimo() {
        assertNull(lista.obtenerUltimo());  // La lista está vacía, así que debería devolver null

        lista.agregar(10);
        lista.agregar(20);
        assertEquals(20, lista.obtenerUltimo());  // El último elemento debería ser 20
    }

    // Test para imprimir la lista
    @Test
    public void testImprimirLista() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        // Aquí no podemos usar una aserción directa ya que el método imprime la lista,
        // pero podemos verificar que no lanza excepciones al llamar al método.
        assertDoesNotThrow(() -> lista.imprimirLista());
    }
}
