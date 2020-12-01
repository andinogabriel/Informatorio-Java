package complementarios.level_2;
import java.util.*;
public class ej07 {

    static String[] fizzBuzz(int n1, int n2) 
    {
        String[] arrayFizzBuzz = new String[n2-n1];
        int n = arrayFizzBuzz.length;

        for (int i = 0; i < n; i++)
        {
            if(n1 % 2 == 0 && n1 % 3 == 0) 
            {
                arrayFizzBuzz[i] = "FizzBuzz";
            } else if (n1 % 2 == 0) 
            {
                arrayFizzBuzz[i] = "Fizz";
            } else if (n1 % 3 == 0)
            {
                arrayFizzBuzz[i] = "Buzz";
            } else 
            {
                arrayFizzBuzz[i] = Integer.toString(n1);
            }
            n1++;
        }
        return arrayFizzBuzz;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        boolean error = true;
        do {
            try 
            {
                System.out.print("\nIngrese de donde comenzara el array: ");
                n1 = scan.nextInt();
                scan.nextLine();
                do {
                    System.out.print("Ingrese de donde finalizara el array: ");
                    n2 = scan.nextInt();
                    scan.nextLine();
                    if(n2 < n1) 
                    {
                        System.out.printf("\nDebe ingresar un numero mayor a %d\n", n1);
                    }
                } while(n2 < n1);
                error = false;
            } 
            catch (Exception e) 
            {
                System.out.print("Error. debe ingresar numeros enteros.\n");
                scan.nextLine();
            }
        } while(error);

        scan.close();
        System.out.println(Arrays.toString(fizzBuzz(n1, n2)));
    }
}
