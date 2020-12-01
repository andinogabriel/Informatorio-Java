package complementarios.level_1;
import java.util.*;
/* Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números. */
public class ej02 {

    public static void sumarNumeros(int num1, int num2) 
    {
        int suma = num1+num2;
        System.out.println("\n"+num1+" + "+num2+" = "+suma);
    }

    public static void restarNumeros(int num1, int num2) 
    {
        int resta = num1 - num2;
        System.out.println("\n"+num1+" - "+num2+" = "+resta);
    }

    public static void multiplicarNumeros(int num1, int num2) 
    {
        int multiplicacion = num1 * num2;
        System.out.println("\n"+num1+" × "+num2+" = "+multiplicacion);
    }

    public static void dividirNumeros(int num1, int num2) 
    {
        if(num2 != 0) 
        {
            int division = num1 / num2;
            System.out.println("\n"+num1+" / "+num2+" = "+division);
        } 
        else 
        {
            System.out.println("\nNo se puede divir por 0.");
        }
    }

    public static void moduloNumeros(int num1, int num2) 
    {
        int modulo = num1 % num2;
        System.out.println("\n"+num1+" % "+num2+" = "+modulo);
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngrese el primer numero: ");
        int n1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = scan.nextInt();
        scan.close();
        System.out.println("\nOperaciones Aritméticas con "+n1 +" y "+n2);
        sumarNumeros(n1, n2);
        restarNumeros(n1, n2);
        multiplicarNumeros(n1, n2);
        dividirNumeros(n1, n2);
        moduloNumeros(n1, n2);
    }
    
}
