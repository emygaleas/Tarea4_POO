package Ejercicio1;
//declarar atributos
public class Curso {
    public String nombre;
    public String codigo;
    public int creditos;

    //crear metodo constructor
    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    //crear metodo para mostrar info
    public void mostrarInfo(){
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Código del curso: " + codigo);
        System.out.println("El curso otorga: " + creditos + " créditos.");
    }

    //crear metodo para actualizar creditos
    public void actualizarCreditos(int nuevosCreditos){
        this.creditos = nuevosCreditos;
        System.out.println("El número de créditos se ha actualizado a: " + nuevosCreditos);
    }
}
