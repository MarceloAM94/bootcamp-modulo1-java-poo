package feature.Clase_1;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        System.out.println("Clasificador de Edad");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad >= 65){
            System.out.println("Usted es un adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Usted es un adulto");
        } else if (edad >= 13) {
            System.out.println("Usted es un adolescente");
        }else{
            System.out.println("Usted es un niño");
        }
    }
}
