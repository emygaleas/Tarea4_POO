package Ejercicio2;

public class Libro {
    // Se declaran los atributos
    String titulo, autor;
    int anioPublicacion;

    // Constructor para ingresar valores
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Metodo para mostrar la informacion del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicación: " + this.anioPublicacion);
    }

    // Metodo para actualizar informacion del libro
    public void establecerAnio(int nuevoAnio) {
        if (nuevoAnio > 0) {
            this.anioPublicacion = nuevoAnio;
            System.out.println("Año de publicación actualizado para " + this.titulo + ".");
        } else {
            System.out.println("El año de publicación es incorrecto.");
        }
    }
}