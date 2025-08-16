package feature.CollectionsExercise;
import java.util.*;

public class CollectionsList {
    public static void main(String[] args) {
//        Collection<Integer> numeros = new ArrayList();
//
//        for (int i = 1; i <= 5; i++) {
//            numeros.add(i);
//        }
//
//        if (numeros.contains(3)) {
//            System.out.println("La coleccion contiene el numero 3");
//        } else {
//            System.out.println("La coleccion no contiene el numero 3");
//        }

        //Sistema de calificaciones usando una List
        List<Double> notas = new ArrayList<Double>();
        notas.add(17.5);
        notas.add(13.0);
        notas.add(19.5);
        notas.add(11.0);
        notas.add(16.2);

        //Calcular promedio
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }

        double promedio  = suma / notas.size();
        System.out.println("Su promedio es "+ promedio);

        //Min y max
        double min = Collections.min(notas);
        double max = Collections.max(notas);
        System.out.println("La nota mas baja es "+ min + ", y la mas baja es " + max);

        Set<String> paises = new HashSet<String>();
        paises.add("Peru");
        paises.add("Brazil");
        paises.add("Argentina");
        paises.add("Ecuador");
        paises.add("Italia");

        for (String pais : paises){
            System.out.println(pais);
        }

        Map<String, Integer> edades = new HashMap<>();
            edades.put("Marcelo", 21);
            edades.put("Juanito", 22);
            edades.put("Aquarias", 23);
            edades.put("Guadeloupa", 24);
        System.out.println("La edad de Marcelo es: " + edades.get("Marcelo"));
        System.out.println("La persona Juanito existe en la lista? " + edades.containsKey("Juanito"));

        edades.forEach((clave, valor) -> System.out.println(clave + " Tiene " +  valor));

        //Queue
        Queue<Integer> q1 = new ArrayDeque<>();

    }
}
