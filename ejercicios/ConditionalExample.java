package feature;

import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        System.out.println("Ejemplos usando condicionales");
        System.out.println("==============================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota :");
        int nota = sc.nextInt();
        //Verificar estadp de nota. nota entre 0-10 = desaprobado, 11-13=aprobado, 14-16 muy bien, 17-20 excelente
        //If - else if - else

        if (nota >= 16){
            System.out.println("Estas aprobado con exelencia con AD");
        }else if(nota >=13){
            System.out.println("Estas muy bien con A");
        }else if(nota >=11){
            System.out.println("Estas aprobado con B");
        }else {
            System.out.println("Estas desaprobado con C");
        }

        //Comprobar la mayoria de edad de una persona
        System.out.println("=========================");
        System.out.println("Ejemplo para comprobar edad");
        int edad = sc.nextInt();
        String esMayorDeEdad = edad >=18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println("El resultado es: "+ esMayorDeEdad);

        //Ejemplo con switch para comprobar el dia de la semana
        System.out.println("=========================");
        System.out.println("Ejemplo para comprobar el dia de la semana");
        System.out.println("Ingrese el numero del dia de la semana");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ingrese un numero valido");
        }

        System.out.println("Se salio del programa");

        //Calculadora de descuento con evaluacion de cliente
        //Calcula el precio final con descuento
        //Determina si el cliente es VIP o Normal usando ternario
        //Muestra mensajes diferentes segun el precio final usando if else
        //Si es VIP el descuento debe ser del 20% si es descuento normal debe ser 5%
        //Mostrar el precio final con el descuento aplicado

        System.out.println("Calculadora de descuento para clientes");
        System.out.println("**************************************");
        System.out.println("Ingrese su mongo a pagar: ");
        double montoPagar = sc.nextDouble();
        double descuento;
        System.out.println("Usted es cliente VIP (true/false)");
        boolean esVIP = sc.nextBoolean();
        descuento = (esVIP) ? 0.2 : 0.05;
        double montoFinal = montoPagar - (montoPagar * descuento);
        if (esVIP){
            System.out.println("Su monto a pagar por ser VIP es: " + montoFinal);
        }else{
            System.out.println("Su monto a pagar como cliente normal es: "+ montoFinal);
        }
        System.out.println("Gracias.");

        sc.close();
    }
}
