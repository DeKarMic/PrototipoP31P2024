/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author dekar
 */
public class Baseball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Liga baseball");

            // Ingresar los nombres de los equipos 
            System.out.println("Ingrese los nombres de los 5 equipos:");
            String[] equipos = new String[5];
            for (int i = 0; i < equipos.length; i++) {
                System.out.print("Equipo " + (i + 1) + ": ");
                equipos[i] = scanner.nextLine();
            }

            // Mostrar los nombres de los equipos ingresados
            System.out.println("\nLos nombres de los equipos son:");
            for (int i = 0; i < equipos.length; i++) {
                System.out.println("Equipo " + (i + 1) + ": " + equipos[i]);
            }

            // Generar marcadores
            int[][] marcadores = new int[5][5];
            System.out.println("\nMARCADOR:");

            for (int i = 0; i < equipos.length; i++) {
                for (int j = i + 1; j < equipos.length; j++) {
                    int puntosEquipo1 = random.nextInt(11);
                    int puntosEquipo2 = random.nextInt(11);
                    marcadores[i][j] = puntosEquipo1;
                    marcadores[j][i] = puntosEquipo2;
                    System.out.println(equipos[i] + " " + puntosEquipo1 + " - " + puntosEquipo2 + " " + equipos[j]);
                }
            }

            // Crear una matriz para almacenar la puntuación de cada equipo 
            int[][] puntuacion = new int[equipos.length][3];  

            // Simular algunos resultados de partidos
            simularResultados(equipos, puntuacion, 50);

            // Mostrar la tabla de puntuación
            mostrarTabla(equipos, puntuacion);

            // Determinar al campeón
            String campeon = determinarCampeon(equipos, puntuacion);
            System.out.println("\n¡El campeón de la liga es: " + campeon + "!");

            // Preguntar si el usuario quiere iniciar 
            System.out.print("\n¿Desea iniciar una nueva liga? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break; // Salir del bucle si la respuesta no es "s"
            }
        }

        System.out.println("¡BUENA LIGA!");
        scanner.close();
    }

    private static void simularResultados(String[] equipos, int[][] puntuacion, int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void mostrarTabla(String[] equipos, int[][] puntuacion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static String determinarCampeon(String[] equipos, int[][] puntuacion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
