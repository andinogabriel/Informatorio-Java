package complementarios.level_1;
import java.util.*;
/* Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!” */
public class ej01 {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngrese su nombre: ");
        String nombre = scan.nextLine();
        scan.close();
        System.out.println("\nHOLA "+ nombre);
    }
   
}
