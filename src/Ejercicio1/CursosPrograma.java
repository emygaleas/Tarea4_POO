package Ejercicio1;
import java.util.Scanner;

public class CursosPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso1 = new Curso("Programación I", "INF101",5);

        int opcion = 1;
        while (opcion != 3) {

            System.out.println("\nDigite el número de opción que desee realizar \n1.Mostrar Información del Curso.\n2.Actualizar los créditos que otorga el curso.\n3. Salir. ");
            System.out.printf("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    curso1.mostrarInfo();
                    break;
                case 2:
                    System.out.println("Escriba los créditos que otorga el curso: ");
                    int nuevosCreditos = sc.nextInt();
                    curso1.actualizarCreditos(nuevosCreditos);1
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
