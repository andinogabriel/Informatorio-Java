package complementarios.level_1;
import java.util.*;
/* Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías). */
public class ej06 {

    static int sucesivaMultiplicacion(int n1, int n2) 
    {
        int potencia = 1;
        for (int i = 0; i < n2; i++) 
        {
            potencia *= n1;
        }
        return potencia;
    }

    public static void main(String[] args) {
        int n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese el numero a determinar la potencia: ");
        n1 = scan.nextInt();
        System.out.print("Ingrese la potencia: ");
        n2 = scan.nextInt();
        scan.close();
        System.out.println(n1 + " ^ " + n2 + " = "+sucesivaMultiplicacion(n1, n2));
    }
}
