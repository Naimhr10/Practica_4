import java.util.Scanner;
/*
 * Instituto Tecnologico de Pachuca
 * Naim Hernandez Revilla
 * Sistemas computacionales
 * Fundamentos de Programacion
 * 1er Semestre
 * Practica 4 ejercicio 5
 * Operaciones Matemmaticas
 * */
public class Operaciones_Matematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numero;
        int suma;
        do {
            System.out.println("Bienvenido al menu de operaciones");
            System.out.println("Selecciona la opcion: ");
            System.out.println("1) Calcular el cuadrado de un numero");
            System.out.println("2) Calcular el cubo de un numero");
            System.out.println("3) Determinar si un numero es par o impar");
            System.out.println("4) Calcular la suma desde 1 hasta un numero");
            System.out.println("5) Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero: ");
                    numero = scanner.nextInt();
                    System.out.println("El cuadrado de " + numero + " es: " + (numero * numero));
                    break;
                case 2:
                    System.out.println("Ingresa un numero: ");
                    numero = scanner.nextInt();
                    System.out.println("El cubo de " + numero + " es: " + (numero * numero * numero));
                    break;
                case 3:
                    System.out.println("Ingresa un numero: ");
                    numero = scanner.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("El numero " + numero + " es par");
                    } else {
                        System.out.println("El numero " + numero + " es impar");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa un numero positivo: ");
                    numero = scanner.nextInt();
                    if (numero > 0) {
                        suma = 0;
                        for (int i = 1; i <= numero; i++) {
                            suma = suma + i;
                        }
                        System.out.println("La suma de 1 hasta " + numero + " es: " + suma);
                    } else {
                        System.out.println("El numero debe ser positivo");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa, hasta luego");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intenta de nuevo");
                    break;
            }
        } while (opcion != 5);
    }
}