package feature.Clase_1;

import java.util.Scanner;

public class Conversor_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperatura = sc.nextDouble();

        double fahrenheit = (temperatura * 1.8) + 32;
        double kelvin = temperatura + 273.15;

        System.out.println("Seleccione la conversión: (fahrenheit / kelvin / ambas)");
        String conversion = sc.next().toLowerCase();

        switch (conversion) {
            case "fahrenheit":
                System.out.println(temperatura + "°C = " + fahrenheit + "°F");
                break;
            case "kelvin":
                System.out.println(temperatura + "°C = " + kelvin + " K");
                break;
            case "ambas":
                System.out.println(temperatura + "°C = " + fahrenheit + "°F");
                System.out.println(temperatura + "°C = " + kelvin + " K");
                break;
            default:
                System.out.println("Opción no válida. Escriba 'fahrenheit', 'kelvin' o 'ambas'.");
        }

        sc.close();
    }
}
