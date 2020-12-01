package complementarios.level_1;
import java.util.*;
/* Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido} */ 
public class ej08 {

    static void datosPersonales(String ciudad, String direccion, int edad, String nombre, String apellido) 
    {
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre + " " + apellido);
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese su apellido: ");
        String apellido = scan.nextLine();
        System.out.print("Ingrese el nombre de " + apellido + ": ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese la ciudad de " + apellido + " " +nombre + ": ");
        String ciudad = scan.nextLine();
        System.out.print("Ingrese la dirección de " + apellido + " " +nombre + ": ");
        String direccion = scan.nextLine();
        System.out.print("Ingrese la edad de " + apellido + " " +nombre + ": ");
        int edad = scan.nextInt();
        scan.close();
        datosPersonales(ciudad, direccion, edad, nombre, apellido); 
        System.out.print("\n\n");
    }
    
}
