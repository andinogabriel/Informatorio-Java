package complementarios.level_2;
import java.util.*;
import java.util.ArrayList;
/* Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking */ 

public class ej01 {

    static void cargarCiudades(ArrayList<String> ciudades) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        for (int i = 0; i < 3; i++) 
        {
            System.out.printf("Ingrese la %dº ciudad: ", i+1);
            String ciudad = scan.nextLine();
            ciudades.add(ciudad);
        }
        scan.close();
    }

    static void mostrarCiudades(ArrayList<String> ciudades) 
    {
        int n = ciudades.size();
        for (int i = 0; i < n; i++) 
        {
            System.out.printf("\n#%d - %s", i+1, ciudades.get(i));
        }
        System.out.println("");
    }
  
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();
        cargarCiudades(ciudades);
        mostrarCiudades(ciudades);
    }
    
}
