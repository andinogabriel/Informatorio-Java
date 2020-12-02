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
    
    private static Scanner scan = new Scanner(System.in);

    static String datosPersonales() 
    {
        System.out.print("\nIngrese su apellido: ");
        String apellido = scan.nextLine();
        System.out.print("Ingrese el nombre de " + apellido + ": ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese la ciudad de " + apellido + " " +nombre + ": ");
        String ciudad = scan.nextLine();
        System.out.print("Ingrese la dirección de " + apellido + " " +nombre + ": ");
        String direccion = scan.nextLine();
        int edad = 0;
        boolean error = true;
        do {
            try {
                System.out.print("Ingrese la edad de " + apellido + " " +nombre + ": ");
                edad = scan.nextInt();
                if(edad < 0) {
                    System.out.println("\nIngrese una edad mayor que cero.");
                } else {
                    error = false;
                }
            } catch (Exception e) {
                System.out.println("\nError. Ingrese una edad valida.");
                scan.nextLine();
            }
        } while(error);
        scan.close();
        String mensaje = ciudad + " - " + direccion + " - " + edad + " - " + nombre + " " + apellido;
        return mensaje;
    }

    public static void main(String[] args) 
    {
        System.out.println("\n" + datosPersonales() + "\n");
    }
    
}
