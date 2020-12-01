package complementarios.level_1;
import java.util.*;
/* Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías). */
public class ej05 {

    static int sucesivaSuma(int n1, int n2) 
    {
        int multiplicacion = 0;
        for (int i = 0; i < n2; i++) 
        {
            multiplicacion += n1;
        }
        return multiplicacion;
    }
    public static void main(String[] args) {
        int n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese el numero a multiplicar: ");
        n1 = scan.nextInt();
        System.out.print("Ingrese por cuanto va a multiplicar: ");
        n2 = scan.nextInt();
        scan.close();
        System.out.println(n1 + " × " + n2 + " = "+sucesivaSuma(n1, n2));
        
    }
}
