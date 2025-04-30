package Ejercicio4.src;

//Se crea la calse Ciclista
public class Ciclista {
    //Se declaran los atributos
    public String nombre;
    public int edad, kilometros;

    //Constructor para inicializar los atributos
    public Ciclista(String nombre, int edad, int kilometros){
        this.nombre=nombre;
        this.edad=edad;
        this.kilometros=kilometros;
    }

    //Metodo para mostrar la informacion del ciclista
    public void mostrarInfo(){
        System.out.println("\nNombre: "+nombre+"\nEdad:"+edad+"\nKm recorridos: "+kilometros+"\n");
    }

    //Metodo para actualizar los km recorridos del ciclista
    public void actualizaKm(int km_actualizado){
        this.kilometros += km_actualizado;
    }

    //Metodo para calcular el promedio de kilometros recorridos por mes
    public double promedioMensual (){
        return kilometros / 12.0;
    }

}