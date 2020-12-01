package complementarios.level_1;
import java.util.*;
/* Realizar un Programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase(). */ 
public class ej07 {

    static String convertirMayuscula(String palabra)
    { 
        char[] minusculas = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] mayusculas = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int posicion = 0;
        String palabra_mayuscula = "";

        for (int i = 0; i < palabra.length(); i++) 
        {
            for (int j = 0; j < minusculas.length; j++) 
            {
                if(palabra.charAt(i) == minusculas[j]) 
                {
                    posicion = j;  
                    break;
                }
            } 
            palabra_mayuscula += mayusculas[posicion];
        }
        return palabra_mayuscula;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese la palabra a convertir a mayuscula: ");
        String palabra = scan.nextLine();
        scan.close();
        System.out.print(palabra + " en mayuscula es: "+convertirMayuscula(palabra)+"\n");
    }
}
