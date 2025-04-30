import java.util.Scanner; //Se importa la clase Scanner para leer datos por teclado

public class Main {
    public static void main(String[] args) {
        //Se crea un objeto Scanner para leer los datos del usuario
        Scanner futbol= new Scanner(System.in);
        //Se declara un arreglo de objetos Jugador con tamaño 3
        Jugador[] jugadores=new Jugador[3];

        System.out.println("\n---------INGRESE LA INFORMACION-------");
        //Se usa el bucle for para leer los datos de los jugadores
        for (int i=0; i<=2; i++){
            System.out.println("\nJUGADOR "+(i+1)); //Se imprime el numero del jugador
            System.out.println("\nNombre: ");
            String nombre= futbol.nextLine(); //Se lee el nombre del jugador
            System.out.println("\nPosicion: ");
            String posicion=futbol.nextLine(); //Se lee la posicion del jugador
            System.out.println("\nNumero: ");
            int numero=futbol.nextInt(); //Se lee el numero del jugador
            futbol.nextLine(); //Forma para consumir el salto de linea
            jugadores[i]=new Jugador(nombre,posicion,numero); //Se crea un objeto Jugador y se guarda en el arreglo jugadores[]
        }

        System.out.println("\n-------INFORMACION ORIGINAL--------");
        //Bucle para usar el metodo mostrarInfo() tres veces y asi se presente la informacion de los tres jugadores
        for (int i=0; i<=2; i++){
            jugadores[i].mostrarInfo();
        }

        System.out.println("\n------ACTUALICE LA INFORMACION------");
        //Se usa el bucle for para actualizar la posicion de los jugadores
        for (int i=0; i<=2; i++){
            System.out.println("\nJUGADOR "+(i+1));
            System.out.println("\nPosicion: ");
            String nueva_posicion= futbol.nextLine(); //Se lee la posicion ingresada
            jugadores[i].actualizarInfo(nueva_posicion);//En cada iteracion se actualiza la posicion de cada jugador con el metodo actualizarInfo()
        }

        System.out.println("\n------INFORMACION ACTUALIZADA------");
        for (int i=0; i<=2; i++){
            jugadores[i].mostrarInfo();//Se vuelve a llamar al metodo mostrsrInfo() para mostrar la informacion acrualizada.
        }
    }
}