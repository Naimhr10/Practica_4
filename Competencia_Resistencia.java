/*
 * Instituto Tecnologico de Pachuca
 * Naim Hernandez Revilla
 * Sistemas computacionales
 * Fundamentos de Programacion
 * 1er Semestre
 * Practica 4 ejercicio 4
 * Carrera de resistencia
 * */
import java.util.Scanner;

public class Competencia_Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCorredores;
        int numParticipante;
        int opcion;
        int otra;
        int rondas = 5;
        int rendimientoBajo = 0;
        int rendimientoMedio = 0;
        int rendimientoAlto = 0;
        double km;
        double total;
        double mayorDistancia = 0;
        int mayorParticipante = 0;
        String reporte = "";
        do {
            System.out.println("Bienvenido a la carrera");
            System.out.println("Introduce el numero de corredores: ");
            numCorredores = scanner.nextInt();
            while (numCorredores <= 0) {
                System.out.println("Debe ser mayor a 0. Intenta de nuevo: ");
                numCorredores = scanner.nextInt();
            }
            for (int i = 0; i < numCorredores; i++) {
                System.out.println("Ingresa el numero del participante");
                numParticipante = scanner.nextInt();
                total = 0;
                for (int r = 1; r <= rondas; r++) {
                    System.out.println("Participante " + numParticipante + " - Ronda " + r + ": km recorridos");
                    km = scanner.nextDouble();
                    while (km < 0) {
                        System.out.println("La distancia debe ser mayor o igual a 0. Intenta de nuevo: ");
                        km = scanner.nextDouble();
                    }
                    total = total + km;
                    if (km < 2) {
                        rendimientoBajo++;
                    } else if (km <= 4) {
                        rendimientoMedio++;
                    } else {
                        rendimientoAlto++;
                    }
                }
                reporte = reporte + "Participante " + numParticipante + " * Total: " + total
                        + " km  *Promedio: " + (total / rondas) + " km\n";
                if (total > mayorDistancia) {
                    mayorDistancia = total;
                    mayorParticipante = numParticipante;
                }
            }
            do {
                System.out.println("Selecciona la estadistica: ");
                System.out.println("1) Distancia total y promedio por participante");
                System.out.println("2) Rondas por categoria de rendimiento");
                System.out.println("3) Participante con mayor distancia acumulada");
                System.out.println("4) Terminar consulta");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println(reporte);
                        break;
                    case 2:
                        System.out.println("Rondas con rendimiento bajo: " + rendimientoBajo);
                        System.out.println("Rondas con rendimiento medio: " + rendimientoMedio);
                        System.out.println("Rondas con rendimiento alto: " + rendimientoAlto);
                        break;
                    case 3:
                        System.out.println("Mayor distancia acumulada: participante "
                                + mayorParticipante + " con " + mayorDistancia + " km");
                        break;
                    case 4:
                        System.out.println("Fin de las estadisticas");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            } while (opcion != 4);
            System.out.println("Registrar otra competencia? 1) Si  2) No");
            otra = scanner.nextInt();
        } while (otra == 1);
        System.out.println("Saliendo...");
    }
}
