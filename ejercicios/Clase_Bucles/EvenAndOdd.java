package feature.Clase_Bucles;

import java.util.Scanner;

//Crea un programa que pida números al usuario hasta que ingrese 0.
//Cada vez que ingrese un número, debe clasificarlo como par o impar.
//Al final, mostrar cuántos números pares y cuántos impares ingresó.
public class EvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Contador de numeros pares e impares");
        System.out.println("===================================");

        int contadorPares=0;
        int contadorImpares=0;
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero (0 para terminar)");
        numeroIngresado = sc.nextInt();
        while(numeroIngresado != 0){
            if(numeroIngresado%2==0){
                System.out.println("Este numero es par");
                contadorPares++;
            } else{
                System.out.println("Este numero es impar");
                contadorImpares++;
            }
            System.out.println("Ingrese otro numero para continuar (0 para terminar)");
            numeroIngresado = sc.nextInt();
        }
        System.out.println("Contador de numeros pares " +  contadorPares);
        System.out.println("Contador de numeros impares " +  contadorImpares);

        sc.close();
    }
}
