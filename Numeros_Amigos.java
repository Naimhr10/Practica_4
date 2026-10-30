/*
 * Instituto Tecnologico de Pachuca
 * Naim Hernandez Revilla
 * Sistemas computacionales
 * Fundamentos de Programacion
 * 1er Semestre
 * Practica 4 ejercicio 3
 * Analisis Numeros amigos
 * */
import java.util.Scanner;

public class Numeros_Amigos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;
        int suma1 = 0;
        int suma2 = 0;

        System.out.print("Ingresa el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1 > 0) {

            if (numero2 > 0) {

                // Calcular los divisores del primer numero
                for (int i = 1; i < numero1; i++) {

                    if (numero1 % i == 0) {
                        suma1 = suma1 + i;
                    }

                }

                // Calcular los divisores del segundo numero
                for (int i = 1; i < numero2; i++) {

                    if (numero2 % i == 0) {
                        suma2 = suma2 + i;
                    }

                }

                System.out.println("Suma de divisores del primer numero: " + suma1);
                System.out.println("Suma de divisores del segundo numero: " + suma2);

                // Comprobar si son numeros amigos
                if (numero1 == numero2) {

                    System.out.println("No son numeros amigos");

                } else {

                    if (suma1 == numero2) {

                        if (suma2 == numero1) {

                            System.out.println("Son numeros amigos");

                        } else {

                            System.out.println("No son numeros amigos");

                        }

                    } else {

                        System.out.println("No son numeros amigos");

                    }

                }

            } else {

                System.out.println("El segundo numero no es valido");

            }

        } else {

            System.out.println("El primer numero no es valido");

        }
    }
}
