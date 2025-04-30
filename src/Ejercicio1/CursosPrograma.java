package Ejercicio1;
import java.util.Scanner;

public class CursosPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear un arreglo de 3 objetos Curso
        Curso[] cursos=new Curso[3];

        // Bucle para ingresar los datos de 3 cursos por teclado
        for (int i = 0; i < 3; i++) {
            System.out.println("\nIngrese los datos del curso " + (i + 1) + ": ");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine(); //Leer el nombre del curso

            System.out.print("Código: ");
            String codigo = sc.nextLine(); //Leer el código del curso

            System.out.print("Créditos: ");
            int creditos = sc.nextInt(); //Leer los créditos del curso

            sc.nextLine(); // limpiar buffer
            // Crear un nuevo curso con los datos ingresados y almacenarlo en el arreglo
            cursos[i] = new Curso(nombre, codigo, creditos);
        }

        // Variable para controlar el menú (se inicializa distinta de 3 para entrar al bucle)
        int opcion = 1;
        //Menú principal cuando la opción sea distinta de 3
        while (opcion != 3) {

            System.out.println("\nDigite el número de opción que desee realizar \n1.Mostrar Información de los cursos.\n2.Actualizar los créditos que otorga un curso.\n3. Salir. ");
            System.out.printf("Opción: ");
            opcion = sc.nextInt(); //leer la opción elegida por el usuario

            switch (opcion){
                case 1:
                    System.out.println("\nMostrando información de los cursos disponibles...");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("----------------------------------------------------");
                        cursos[i].mostrarInfo(); //llamar al metodo para mostrar la info de los cursos
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el número del curso (1-3): ");
                    int num = sc.nextInt(); //leer el número de curso
                    if (num >= 1 && num<=3) { //verificar que la opción digitada esté en el rando de 1-3
                        System.out.print("Escriba los créditos que otorga el curso: ");
                        int nuevosCreditos = sc.nextInt();
                        cursos[num-1].actualizarCreditos(nuevosCreditos); //se escribe num-1, porque en un arreglo las posiciones son diferentes (comienzan en 0)
                    }else{
                        System.out.println("Número inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese un número válido.");
            }

        }
    }
}
