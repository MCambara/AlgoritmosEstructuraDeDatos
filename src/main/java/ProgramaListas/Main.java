package ProgramaListas;

import FuncionamientoDeListas.ListaEnlazada;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear una lista enlazada de tipo Integer
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        Scanner scanner = new Scanner(System.in);

        // Crear la lista desde el teclado
        System.out.println("Por que da error?");
        System.out.println("Ingresa números para agregar a la lista (Ingresa -1 para terminar):");
        int valor;
        while ((valor = scanner.nextInt()) != -1) {
            lista.agregar(valor);  // Agregar el número a la lista
        }

        // Imprimir la lista resultante
        System.out.println("Lista enlazada después de agregar elementos:");
        lista.imprimirLista();

        // Opciones adicionales
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Eliminar el primer elemento");
            System.out.println("2. Verificar si la lista está vacía");
            System.out.println("3. Ver el primer elemento");
            System.out.println("4. Ver el último elemento");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    lista.eliminar();  // Eliminar el primer elemento
                    System.out.println("Primer elemento eliminado.");
                    break;

                case 2:
                    System.out.println("¿La lista está vacía? " + lista.estaVacia());
                    break;

                case 3:
                    Integer primero = lista.obtenerPrimero();
                    System.out.println("Primer elemento: " + (primero != null ? primero : "Lista vacía"));
                    break;

                case 4:
                    Integer ultimo = lista.obtenerUltimo();
                    System.out.println("Último elemento: " + (ultimo != null ? ultimo : "Lista vacía"));
                    break;

                case 5:
                    System.out.println("Lista enlazada actual:");
                    lista.imprimirLista();  // Imprimir la lista
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;  // Termina el programa

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        
    }
}
