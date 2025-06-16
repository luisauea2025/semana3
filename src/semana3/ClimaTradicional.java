package semana3;

import java.util.Scanner;

public class ClimaTradicional {

    // Función que permite ingresar temperaturas por cada día de la semana, usando Scanner pasado como parámetro
    public static double[] ingresarTemperaturas(Scanner scanner) {
        double[] temperaturas = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        return temperaturas;
    }

    // Función que calcula el promedio semanal de las temperaturas
    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;

        for (double temp : temperaturas) {
            suma += temp;
        }

        return suma / temperaturas.length;
    }

    // Método principal del programa
    public static void main(String[] args) {
        System.out.println("=== PROMEDIO SEMANAL DEL CLIMA (TRADICIONAL) ===");

        try (Scanner scanner = new Scanner(System.in)) {
            // Ingreso de temperaturas
            double[] temperaturas = ingresarTemperaturas(scanner);

            // Cálculo del promedio
            double promedio = calcularPromedio(temperaturas);

            // Mostrar resultado
            System.out.println("El promedio semanal de temperatura es: " + promedio + " °C");
        }  // Aquí el scanner se cierra automáticamente
    }
}