package Ejercicio4.src;

import java.util.Scanner;

public class ProgramaCiclista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear un arreglo de 3 objetos Ciclistas
        Ciclista[] ciclistas=new Ciclista[3];

        // Bucle para ingresar los datos de 3 ciclistas por teclado
        for (int i = 0; i < 3; i++) {
            System.out.println("\nIngrese los datos del ciclista " + (i + 1) + ": ");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine(); //Leer el nombre del ciclista

            System.out.print("Edad: ");
            int edad = sc.nextInt(); //Leer la edad del ciclista

            System.out.print("Kilometros recorridos: ");
            int kilometros = sc.nextInt(); //Leer los kilometros recorridos

            sc.nextLine(); // limpiar buffer

            // Crear un objeto ciclista con los datos ingresados y almacenarlo en el arreglo
            ciclistas[i] = new Ciclista(nombre, edad, kilometros);
        }

        // Variable para controlar el menú (se inicializa distinta de 3 para entrar al bucle)
        int opcion = 1;
        //Menú principal cuando la opción sea distinta de 3

        while (opcion != 4) {

            System.out.println("\n---------------- MENÚ ----------------\n1.Mostrar Información de los ciclistas.\n2.Actualizar los kilometros recorridos.\n3. Calcular el promedio de kilómetros recorridos por mes.\n4. Salir ");
            System.out.printf("Opción: ");
            opcion = sc.nextInt(); //leer la opción elegida por el usuario

            switch (opcion){
                case 1:
                    System.out.println("---------- MOSTRANDO INFORMACIÓN DE CILCISTAS ----------");
                    for (Ciclista c : ciclistas) {
                        System.out.println("--------------------------------------------------------");
                        c.mostrarInfo(); //llamar al metodo para mostrar la info de los cursos
                        System.out.println("--------------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el número del ciclista (1-3): ");
                    int num = sc.nextInt(); //leer el número de ciclista
                    if (num >= 1 && num<=3) { //verificar que la opción digitada esté en el rando de 1-3
                        System.out.print("Ingrese los kilómetros nuevos a añadir: ");
                        int km_actualizado = sc.nextInt();
                        ciclistas[num-1].actualizaKm(km_actualizado); //se escribe num-1, porque en un arreglo las posiciones son diferentes (comienzan en 0)
                    }else{
                        System.out.println("Número inválido.");
                    }
                    break;
                case 3:
                    System.out.println("---------- PROMEDIO MENSUAL DE KILÓMETROSS RECORRIDOS ----------");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ciclista " + (i+1) + ": " + ciclistas[i].promedioMensual());
                    }
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese un número válido.");
            }

        }

    }
}
