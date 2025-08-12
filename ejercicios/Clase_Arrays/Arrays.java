package feature.Clase_Arrays;

public class Arrays {
    public static void main(String[] args) {
        //Arreglos en Java solo permiten un solo tipo de dato
        //El tamaño es fijo

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Elementos de la array:");
        System.out.println("El tamaño de la lista es " + numeros.length);
        for (int i = 0; i<numeros.length; i++) {
            System.out.println("El indice es " + i + " Y su valor es " + numeros[i]);
        }

        // For each
        String[] frutas = {"Manzana", "Naranja", "Pera", "Mandarina"};

        for (String fruta : frutas) {
            System.out.println("La fruta es " + fruta);
        }

        //Buscar el promedio de una lista
        double[] notasBootcamp = {12.5, 15.8, 19, 11.2, 14.5, 8, 20, 13.5, 12};
        //Calcular el total de las notas
        double total=0;
        for (double valor : notasBootcamp) {
            total += valor;
        }

        double promedio = total/notasBootcamp.length;
        System.out.println("El promedio es " + promedio);
    }
}
