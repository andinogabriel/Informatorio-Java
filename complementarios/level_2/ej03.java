package complementarios.level_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
/* Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir. */
public class ej03 {
    

    //Mostrar los valores de las cartas en orden decreciente
    static void showValuesInReverseOrder(ArrayList<Integer> values) 
    {
        Collections.reverse(values);
        System.out.println("\nValores de cartas de la baraja francesa en orden decreciente");
        System.out.print(values.toString() + "\n");
    }

    //Mostrar los valores de las cartas en orden desordenado (barajado)
    static void showValuesInShuffledOrder(ArrayList<Integer> values) 
    {
        Collections.shuffle(values);
        System.out.println("\nValores de cartas de la baraja francesa desordenados");
        System.out.print(values.toString() + "\n");
    }

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8, 9, 10, 11, 12, 13, 14));
        System.out.println("\nValores de cartas de la baraja francesa en orden creciente");
        System.out.println(values.toString());
        showValuesInReverseOrder(values);
        showValuesInShuffledOrder(values);
    }
}
