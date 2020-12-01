package complementarios.level_1;
import java.util.*;
/* Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada. */
public class ej09 {

    static int cantVecesLetra(String palabra, char letra) 
    {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) 
        {
            if(palabra.charAt(i) == letra) 
            {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nIngrese una palabra: ");
        String palabra = scan.nextLine();
        System.out.print("Ingrese una letra de " +palabra+ " para determinar la cantidad de veces que se repite: ");
        char letra = scan.next().charAt(0);
        scan.close();
        System.out.printf("La %c en '%s' se repite %d veces %n", letra, palabra, cantVecesLetra(palabra, letra));
        
    }
    
}
