package Ejercicio1;

public class Curso {
    public String nombre;
    public String codigo;
    public int creditos;

    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void mostrarInfo(){
        System.out.println("\nMostrando información del curso...");
        System.out.printf("----------------------------------------------------");
        System.out.println("\nNombre del curso: " + nombre);
        System.out.println("Código del curso: " + codigo);
        System.out.println("El curso otorga: " + creditos + " créditos.");
        System.out.printf("----------------------------------------------------");
    }

    public void actualizarCreditos(int nuevosCreditos){
        this.creditos = nuevosCreditos;
        System.out.println("El número de créditos se ha actualizado a: " + nuevosCreditos);
    }
}
