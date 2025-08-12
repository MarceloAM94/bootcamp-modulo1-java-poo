package feature.Clase_Bucles;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Ejemplo 1");
        System.out.println("=======================");

        //Imprimir los numeros del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("=======================");
        System.out.println("Ejemplo 2");
        System.out.println("=======================");

        //Tabla de multiplicar del 12
        Scanner sc = new Scanner(System.in);
        System.out.println("Table de multiplicar");
        System.out.println("Ingrese el numero para generar la tabla");
        int tablaMultiplicacion = sc.nextInt();
        System.out.println("============================");
        for (int i=1; i <= 12; i++){
            System.out.println(tablaMultiplicacion +" por " + i + " es igual a = " +i * tablaMultiplicacion);
        }
        System.out.println("============================");

//        System.out.println("=======================");
//        System.out.println("Ejemplo 3");
//        System.out.println("=======================");
//
//        //Cuenta regresiva de 30 a 0
//        for (int i = 30; i>=1; i--){
//            System.out.println("Cuenta regresiva en: " + i);
//        }

        System.out.println("=======================");
        System.out.println("Ejemplo 4");
        System.out.println("=======================");

        //Tablas de multiplicar apiladas
        for (int x = 1; x <= 5; x++){
            System.out.print("tabla de "+x+"\t");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print(i + " x " + j + " = " + (i * j)+"\t");
            }
            System.out.println(i);
        }

    }
}
