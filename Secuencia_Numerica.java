/*
* Instituto Tecnologico de Pachuca
* Naim Hernandez Revilla
* Sistemas computacionales
* Fundamentos de Programacion
* 1er Semestre
* Practica 4 ejercicio 1
* Secuencia Numerica
* */
import java.util.Scanner;

public class Secuencia_Numerica {
    public static void main(String[] args) {
        final int DIV_CUATRO = 4;
        final int DIV_TRES = 3;
        final int DIV_CINCO = 5;
        int numeroPositivo = 0;
        int sumaDivCuatro=0;
        int divTres=0;
        int contadorAmbos =0;
        int contPares = 0;
        int contImpares = 0;
        int contCinco = 0;
        int opcionStats;
        int opcion=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Bienvenido****");
        System.out.println("1)Secuencia numerica 2)Estadisticas 3)Salir ");
        opcion = scanner.nextInt();
        do{
            switch (opcion){
                case 1:
                    sumaDivCuatro = 0;
                    divTres = 0;
                    contadorAmbos = 0;
                    contPares = 0;
                    contImpares = 0;
                    contCinco = 0;
                    System.out.println("Digita un numero positivo ");
                    numeroPositivo = scanner.nextInt();
                    while (numeroPositivo <= 0) {
                        System.out.println("Error: debe ser positivo. Digita otro ");
                        numeroPositivo = scanner.nextInt();
                    }

                    for (int i = 1; i <= numeroPositivo; i++) {
                        if (i % DIV_CUATRO ==0){
                            sumaDivCuatro += i;
                        }
                        if (i % DIV_TRES ==0){
                            divTres++;
                        }
                        if (i % DIV_TRES==0 && i % DIV_CUATRO==0){
                            contadorAmbos++;
                        }
                        if (i % 2 == 0){
                            contPares++;
                        } else {
                            contImpares++;
                        }
                        if (i % DIV_CINCO == 0){
                            contCinco++;
                        }
                    }
                    System.out.println("tu numero es :"+numeroPositivo);
                    System.out.println("La suma de los numeros postivos divisbles entre 4 de 1 a "+numeroPositivo+" es de "+sumaDivCuatro);
                    System.out.println("Los numeros divisibles entre 3 son "+divTres);
                    System.out.println("Los numeros divisibles entre 3 y 4 son "+contadorAmbos);
                    System.out.println("1)Secuencia numerica 2)Estadisticas 3)Salir ");
                    opcion = scanner.nextInt();
                    break;
                case 2:
                    if (numeroPositivo == 0) {
                        System.out.println("Primero debes hacer la secuencia numerica");
                    } else {
                        System.out.println("Estadisticas de 1 a "+numeroPositivo);
                        System.out.println("1)Pares 2)Impares 3)Multiplos de 5");
                        opcionStats = scanner.nextInt();
                        switch (opcionStats){
                            case 1:
                                System.out.println("Numeros pares: "+contPares);
                                break;
                            case 2:
                                System.out.println("Numeros impares: "+contImpares);
                                break;
                            case 3:
                                System.out.println("Multiplos de 5: "+contCinco);
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }
                    System.out.println("1)Secuencia numerica 2)Estadisticas 3)Salir ");
                    opcion = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    System.out.println("1)Secuencia numerica 2)Estadisticas 3)Salir ");
                    opcion = scanner.nextInt();
                    break;
            }
        }while (opcion != 3);
    }
}
