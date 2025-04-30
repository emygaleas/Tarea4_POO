public class Jugador { //Se declara la clase juador
    //Se declaran los atributos
    public String nombre, posicion;
    public int numero_jugador;

    //Constructor para inicializar los atributos
    public Jugador(String nombre, String posicion, int numero_jugador){
        //Se inicializan los atributos
        this.nombre=nombre;
        this.posicion=posicion;
        this.numero_jugador=numero_jugador;
    }

    //Se crea un metodo para mostrar la informacion
    public void mostrarInfo(){
        System.out.println("\nNombre: "+nombre+"\nPosicion: "+posicion+"\nNumero: "+ numero_jugador+"\n");
    }

    //Metodo para actualizar la posicion jugador
    public void actualizarInfo(String nueva_posicion){
        this.posicion=nueva_posicion;
    }
}
