public class Ciclista {
    public String nombre;
    public int edad, kilometros;

    public Ciclista(String nombre, int edad, int kilometros){
        this.nombre=nombre;
        this.edad=edad;
        this.kilometros=kilometros;
    }

    public void mostrarInfo(){
        System.out.println("\nNombre: "+nombre+"\nEdad:"+edad+"\nKm recorridos: "+kilometros+"\n");
    }

    public void actualizaKm(int km_actualizado){
        this.kilometros=km_actualizado;
    }

}
