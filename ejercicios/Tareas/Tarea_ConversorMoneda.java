package feature.Tareas;

import java.util.Scanner;

public class Tarea_ConversorMoneda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tasas de conversión (1 Sol equivale a...)
        double[] tasas = {0.27, 0.24, 42.0, 22.62}; // Dólares, Euros, Yenes, Rublos
        String[] nombresMonedas = {"Dólares", "Euros", "Yenes", "Rublos"};

        System.out.println("=== Bienvenido al Conversor de Monedas ===");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Soles a Dólares");
            System.out.println("2. Soles a Euros");
            System.out.println("3. Soles a Yenes");
            System.out.println("4. Soles a Rublos");
            System.out.println("5. Calculadora");
            System.out.println("Escriba 'salir' para terminar.");
            System.out.print("Opción: ");

            String opcion = sc.next().toLowerCase();

            // Salir del programa
            if (opcion.equals("salir")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Validación de número
            int opcionNum;
            try {
                opcionNum = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido o 'salir'.");
                continue;
            }

            switch (opcionNum) {
                case 1, 2, 3, 4 -> {
                    System.out.print("Ingrese el monto en soles: ");
                    while (!sc.hasNextDouble()) { // Validación que sea número
                        System.out.println("Error: Debe ingresar un valor numérico.");
                        sc.next();
                    }
                    double soles = sc.nextDouble();
                    double conversion = soles * tasas[opcionNum - 1];
                    System.out.println(soles + " soles equivalen a " + conversion + " " + nombresMonedas[opcionNum - 1]);
                }
                case 5 -> {
                    // Calculadora
                    System.out.println("\n--- Calculadora ---");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    System.out.print("Opción: ");

                    int operacion;
                    try {
                        operacion = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error: Debe ingresar un número.");
                        sc.next();
                        continue;
                    }

                    System.out.print("Ingrese el primer número: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Error: Debe ingresar un número.");
                        sc.next();
                    }
                    double num1 = sc.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Error: Debe ingresar un número.");
                        sc.next();
                    }
                    double num2 = sc.nextDouble();

                    switch (operacion) {
                        case 1 -> System.out.println("Resultado: " + (num1 + num2));
                        case 2 -> System.out.println("Resultado: " + (num1 - num2));
                        case 3 -> System.out.println("Resultado: " + (num1 * num2));
                        case 4 -> {
                            if (num2 == 0) {
                                System.out.println("No se puede dividir entre cero.");
                            } else {
                                System.out.println("Resultado: " + (num1 / num2));
                            }
                        }
                        default -> System.out.println("Opción inválida en calculadora.");
                    }
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        sc.close();
        //Prueba para commit
    }
}
