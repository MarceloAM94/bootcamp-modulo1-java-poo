package feature.Clase_Bucles;

import java.util.Scanner;

public class AccumulatedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar la sumatoria");
        int numFinal =  sc.nextInt();
        int sumatoria = 0;

        for (int i = 1; i <= numFinal ; i++) {
            sumatoria += i;
        }

        System.out.println("La sumatoria es: " + sumatoria);
        sc.close();
    }
}
