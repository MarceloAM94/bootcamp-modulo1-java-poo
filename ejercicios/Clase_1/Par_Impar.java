package feature.Clase_1;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR");
        } else {
            System.out.println("El número " + num + " es IMPAR");
        }
        sc.close();
    }
}

