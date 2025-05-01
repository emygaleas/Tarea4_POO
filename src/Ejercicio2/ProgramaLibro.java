package Ejercicio2;
import java.util.Scanner;

public class ProgramaLibro {
    public static void main(String[] args) {
        // Se añade el scanner para leer informacion ingresada por teclado
        Scanner scanner = new Scanner(System.in);
        // Se crea un arreglo
        Libro[] libros = new Libro[2]; // Se limita para uso de dos libros

        // Se realiza un bucle para añadir informacion de los libros
        System.out.println("\n---------INGRESE LA INFORMACION-------");
        for (int i = 0; i < libros.length; i++) {
            System.out.println("\nLIBRO " + (i + 1));
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Año de publicacion: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpieza de buffer
            libros[i] = new Libro(titulo, autor, anio);
        }

        // Se muestra la informacion ingresados por primera por uso de un bucle
        System.out.println("\n-------INFORMACION ORIGINAL--------");
        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarInformacion();
        }

        // Se actualiza el año de publicacion de los libros del arreglo mediante un bucle
        System.out.println("\n------ACTUALICE EL AÑO DE PUBLICACION DE LOS LIBROS------");
        for (int i = 0; i < libros.length; i++) {
            System.out.println("\nLIBRO " + (i + 1));
            System.out.print("Nuevo año de publicacion: ");
            int nuevoAnio = scanner.nextInt();
            scanner.nextLine(); // limpieza de buffer
            libros[i].establecerAnio(nuevoAnio);
        }

        // Se muestra la informacion actualizada de los libros ingresados en el arreglo
        System.out.println("\n------INFORMACION ACTUALIZADA------");
        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarInformacion();
        }
    }
}