package complementarios.level_2;
import java.util.*;
import java.util.ArrayList;
/* Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición). */
public class ej02 {

    private static Scanner scan = new Scanner(System.in);

    static void addNumbers(ArrayList<Integer> numbers) 
    {
        System.out.println("\nAgregar elementos al array");
        for (int i = 0; i < 5; i++) 
        {
            System.out.printf("Ingrese el %dº numero: ", i+1);
            int number = scan.nextInt();
            numbers.add(number);
        }
    }

   
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        addNumbers(numbers);
        System.out.println("\n" + numbers.toString());
        System.out.print("\nIngrese un numero para agregarlo en la primera posicion: ");
        int n1 = scan.nextInt();
        numbers.add(0, n1);
        System.out.print("Ingrese un numero para agregarlo en la ultima posicion: ");
        int n2 = scan.nextInt();
        numbers.add(n2);
        System.out.println("\nArray con los elementos agregados al principio y final.");
        System.out.println(numbers.toString());
        scan.close();
    }
}
