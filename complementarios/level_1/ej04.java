package complementarios.level_1;
import java.util.*;
/* Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías. */
public class ej04 {

    public static int factorial(int num) 
    {
        int factorial = 1;
        for(int i = 1; i <= num; i++) 
        {
            factorial = factorial * i; 
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese el numero a sacar el factorial: ");
        int num = scan.nextInt();
        scan.close();
        System.out.print("\nEl factorial de "+num+" es: "+factorial(num)+"\n");
    }
}
