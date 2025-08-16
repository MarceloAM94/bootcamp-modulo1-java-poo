package feature.CollectionsExercise;

import java.util.ArrayList;
import java.util.List;

public class CollectionsGuide {
    public static void main(String[] args) {
        List<String> lenguajes = new ArrayList<String>();
        lenguajes.add("Kotlin");
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C");
        lenguajes.add("C++");
        lenguajes.add("C#");

        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }

        System.out.println("El elemento Java existe? " +  lenguajes.contains("Java"));
        System.out.println("El elemento del indice 0 " +  lenguajes.get(1));
        lenguajes.set(3, "Ruby");

        System.out.println("Removiendo el ultimo lenguaje");
        lenguajes.remove(4);

        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
    }
}
