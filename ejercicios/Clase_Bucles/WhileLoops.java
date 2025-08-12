package feature.Clase_Bucles;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            //Imprimir los 10 primeros numeros
            System.out.println("Menu de patrones de Estrellas");
            System.out.println("=============================");
            System.out.println("1. Triangulo Equilatero");
            System.out.println("2. Triangulo Equilatero Inverso");
            System.out.println("3. Piramide");
            System.out.println("4. Salir de programaL");

            int option;

            System.out.println("Elija la opcion que desee");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Triangulo Equilatero");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Triangulo Equilatero Inverso");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }

    }
}
