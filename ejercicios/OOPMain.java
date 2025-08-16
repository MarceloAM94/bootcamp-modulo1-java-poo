package feature;

import feature.models.Transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OOPMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crear pbjeto de transaction
        Transaction trans1 = new Transaction(2, "Transaccion 2", 24.90);
        trans1.setNombre("Transaccion Codigo");

        Transaction trans2 = new Transaction(
            2,
            "Transaccion 2",
            24.90,
            LocalDateTime.now(),
            "Yape",
            "Comida",
            "Steam"
        );

        System.out.println(trans1.getNombre());
        System.out.println(trans2.getFecha());

    }
}
