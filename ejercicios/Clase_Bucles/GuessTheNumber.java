package feature.Clase_Bucles;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100)+1;
        System.out.println("Bienvenido a GuessTheNumber!!!");
        System.out.println("Adivine el numero");
        int numeroAdivinado = sc.nextInt();
        int intentos = 0;

        while (numeroAdivinado != numeroSecreto) {
            if (numeroAdivinado < numeroSecreto) {
                System.out.println("El numero secreto es mayor que " +  numeroAdivinado);
            }else {
                System.out.println("El numero secreto es menor que " +  numeroAdivinado);
            }
            System.out.println("Intente con otro numero");
            numeroAdivinado = sc.nextInt();
            intentos++;
        }

        System.out.println("Felicidades acertaste al numero!");
        System.out.println("El numero secreto era "+ numeroSecreto);
        System.out.println("Te tomo " + intentos + " intentos adivinar el numero");
        sc.close();
    }
}
