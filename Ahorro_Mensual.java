/*
 * Instituto Tecnologico de Pachuca
 * Naim Hernandez Revilla
 * Sistemas computacionales
 * Fundamentos de Programacion
 * 1er Semestre
 * Practica 4 ejercicio 2
 * Practica 4
 * Ahorro Mensual
 * */
import java.util.Scanner;

public class Ahorro_Mensual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MESE_SEIS = 6;
        final int MESES_DOCE = 12;
        final int MESES = 24;
        int mes = 0;
        int dineroInicial = 0;
        int meta = 0;
        int ahorroMensual = 0;
        int mesesMeta = 0;
        double total = 0;
        double faltante = 0;
        double interes = 0;
        double interesTotal = 0;
        int opcion = 0;
        System.out.println("Hola Bienvenido");
        do {
            System.out.println("Ingresa una opcion de simulacion : ");
            System.out.println("1)-6 Meses ");
            System.out.println("2)-12 Meses");
            System.out.println("3)-24 Meses ");
            System.out.println("4)-Mostrar resumen");
            System.out.println("5)-Salir");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Ingresa una cantidad inicial de dinero: ");
                dineroInicial = scanner.nextInt();
                while (dineroInicial <= 0) {
                    System.out.println("Debe ser positivo, ingresa de nuevo: ");
                    dineroInicial = scanner.nextInt();
                }
                System.out.println("Ingresa una meta de ahorro: ");
                meta = scanner.nextInt();
                while (meta <= 0) {
                    System.out.println("Debe ser positivo, ingresa de nuevo: ");
                    meta = scanner.nextInt();
                }
                System.out.println("Ingresa una cantidad fija de ahorro mensual: ");
                ahorroMensual = scanner.nextInt();
                while (ahorroMensual <= 0) {
                    System.out.println("Debe ser positivo, ingresa de nuevo: ");
                    ahorroMensual = scanner.nextInt();
                }
            }
            switch (opcion) {
                case 1:
                    mes = 0;
                    total = dineroInicial;
                    interesTotal = 0;
                    mesesMeta = 0;
                    for (int i = 0; i < MESE_SEIS; i++) {
                        mes++;
                        total = total + ahorroMensual;
                        interes = total * 0.01;
                        total = total + interes;
                        interesTotal = interesTotal + interes;
                        System.out.println("Cantidad de dinero ahorrado en mes " + mes + ": " + total);
                        if (total >= meta) {
                            System.out.println("Cumpliste la meta en este mes");
                            if (mesesMeta == 0) {
                                mesesMeta = mes;
                            }
                        } else {
                            faltante = meta - total;
                            System.out.println("Esfuerzate mas, te falto $" + faltante);
                        }
                    }
                    System.out.println("Saldo final: $" + total);
                    System.out.println("Intereses generados: $" + interesTotal);
                    if (mesesMeta > 0) {
                        System.out.println("Meta alcanzada en " + mesesMeta + " meses");
                    } else {
                        System.out.println("No se alcanzo la meta");
                    }
                    break;
                case 2:
                    mes = 0;
                    total = dineroInicial;
                    interesTotal = 0;
                    mesesMeta = 0;
                    for (int i = 0; i < MESES_DOCE; i++) {
                        mes++;
                        total = total + ahorroMensual;
                        interes = total * 0.01;
                        total = total + interes;
                        interesTotal = interesTotal + interes;
                        System.out.println("Cantidad de dinero ahorrado en mes " + mes + ": " + total);
                        if (total >= meta) {
                            System.out.println("Cumpliste la meta en este mes");
                            if (mesesMeta == 0) {
                                mesesMeta = mes;
                            }
                        } else {
                            faltante = meta - total;
                            System.out.println("Esfuerzate mas, te falto $" + faltante);
                        }
                    }
                    System.out.println("Saldo final: $" + total);
                    System.out.println("Intereses generados: $" + interesTotal);
                    if (mesesMeta > 0) {
                        System.out.println("Meta alcanzada en " + mesesMeta + " meses");
                    } else {
                        System.out.println("No se alcanzo la meta");
                    }
                    break;
                case 3:
                    mes = 0;
                    total = dineroInicial;
                    interesTotal = 0;
                    mesesMeta = 0;
                    for (int i = 0; i < MESES; i++) {
                        mes++;
                        total = total + ahorroMensual;
                        interes = total * 0.01;
                        total = total + interes;
                        interesTotal = interesTotal + interes;
                        System.out.println("Cantidad de dinero ahorrado en mes " + mes + ": " + total);
                        if (total >= meta) {
                            System.out.println("Cumpliste la meta en este mes");
                            if (mesesMeta == 0) {
                                mesesMeta = mes;
                            }
                        } else {
                            faltante = meta - total;
                            System.out.println("Esfuerzate mas, te falto $" + faltante);
                        }
                    }
                    System.out.println("Saldo final: $" + total);
                    System.out.println("Intereses generados: $" + interesTotal);
                    if (mesesMeta > 0) {
                        System.out.println("Meta alcanzada en " + mesesMeta + " meses");
                    } else {
                        System.out.println("No se alcanzo la meta");
                    }
                    break;
                case 4:
                    System.out.println("Resumen : ");
                    System.out.println("Dinero inicial: $" + dineroInicial);
                    System.out.println("Meta: $" + meta);
                    System.out.println("Ahorro mensual: $" + ahorroMensual);
                    System.out.println("Saldo final: $" + total);
                    System.out.println("Intereses generados: $" + interesTotal);
                    if (mesesMeta > 0) {
                        System.out.println("Meta alcanzada en " + mesesMeta + " meses");
                    } else {
                        System.out.println("No se alcanzo la meta");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        } while (opcion != 5);
    }
}