package complementarios.level_2;
import java.util.*;
import java.util.ArrayList;
/* Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar. */
public class ej05 {

    private static Scanner scan = new Scanner(System.in);
    private static String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

    static void addHoursWorked(ArrayList<Float> hours) 
    {
        System.out.println("\n--------Horas trabajadas por día--------");
        for (int i = 0; i < 5; i++) 
        {
            boolean error = true;
            float hour;
            do {
                try {
                    System.out.print("Ingrese las horas trabajads del " + dias[i] + ": ");
                    hour = scan.nextFloat();
                    if(hour < 0) {
                        System.out.println("\nIngrese horas trabajadas mayores a cero.");
                    } else {
                        hours.add(hour);
                        error = false;
                    }
                } catch (Exception e) {
                    System.out.println("\nIngrese horas validas.");
                    scan.nextLine();
                }
            } while(error);
            
        }
    }

    static void valuePerHour(ArrayList<Float> values) 
    {
        System.out.println("\n--------Valor de hora por día--------");
        for (int i = 0; i < 5; i++) 
        {
            boolean error = true;
            float value;
            do {
                try {
                    System.out.print("Ingrese el valor de hora del " + dias[i] + ": ");
                    value = scan.nextFloat();
                    if(value < 0) {
                        System.out.println("\nIngrese valor de horas mayor a cero.");
                    } else {
                        values.add(value);
                        error = false;
                    }
                    
                } catch (Exception e) {
                    System.out.println("\nIngrese valor de horas valido.");
                    scan.nextLine();
                }
            } while(error);
            
        }
    }

    static void getPaymentPerDay(ArrayList<Float> payments, ArrayList<Float> hours, ArrayList<Float> values) 
    {
        for (int i = 0; i < 5; i++) 
        {
            payments.add(hours.get(i) * values.get(i));
        }
    }

    static Float getPaymentWeekly(ArrayList<Float> payments) 
    {
        float payment = 0F;
        for (float pay : payments) 
        {
            payment += pay;
        }
        return payment;
    }

    public static void main(String[] args) 
    {
        ArrayList<Float> hours = new ArrayList<Float>();
        ArrayList<Float> values = new ArrayList<Float>();
        ArrayList<Float> payments = new ArrayList<Float>();
        addHoursWorked(hours);
        valuePerHour(values);
        getPaymentPerDay(payments, hours, values);
        System.out.println("\nHoras semanales trabajadas");
        System.out.println(hours.toString());
        System.out.println("\nValor hora de trabajo por dia");
        System.out.println(values.toString());
        System.out.println("\nSueldo a cobrar por dia");
        System.out.println(payments.toString());
        Float payment = getPaymentWeekly(payments);
        System.out.printf("\nTotal final a cobrar por la semana $%.2f\n", payment);
    }
    
}
