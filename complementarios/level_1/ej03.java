package complementarios.level_1;
import java.util.*;

/* Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) */

public class ej03 {

    public static void secuenciaNumero(int num) 
    {
        System.out.println("");
        for(int i = 1; i <= num; i++) 
        {
            for(int j = 1; j <= i; j++) 
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese un numero entero para que imprima la secuencia de numeros: ");
        int num = scan.nextInt();
        scan.close();
        secuenciaNumero(num);
        
    }
}
