package feature;

import java.util.Scanner;

public class ConditionalExercise {
    public static void main(String[] args) {
        //1. Pide al usuario dos números y una operación (`+`, , , `/`).
        //2. Usa un **`switch`** para decidir qué operación realizar.
        //3. Antes de dividir, usa un **`if-else`** para verificar que el divisor no sea 0.
        //4. Usa el **operador ternario** para mostrar si el resultado es positivo o negativo.
        //5. No utilizar bucles (IMPORTANTE)

        System.out.println("Calculadora");
        System.out.println("***********");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();


        //Selecciona la operacion
        System.out.println("Seleccione la operacion a realizar (1 - 2 - 3 - 4)");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int operacion  = sc.nextInt();
        switch (operacion){
            case 1:
                int suma = num1+num2;
                System.out.println("La suma de " + num1 + " y " + num2 + " es= " + suma);
                break;
            case 2:
                int resta = num1-num2;
                System.out.println("La resta de " + num1 + " y " + num2 + " es= " + resta);
                break;
            case 3:
                int multiplicacion = num1*num2;
                System.out.println("La multiplicacion de  " + num1 + " y " + num2 + " es= " + multiplicacion);
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("El divisor es 0, no se puede realizar");
                }else {
                    double division = (double) num1 /num2;
                    System.out.println("La division de  " + num1 + " y " + num2 + " es= " + division);
                }
                break;
        }
        sc.close();
    }
}
