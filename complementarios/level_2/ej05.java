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
            System.out.print("Ingrese las horas trabajads del " + dias[i] + ": ");
            Float hour = scan.nextFloat();
            hours.add(hour);
        }
    }

    static void valuePerHour(ArrayList<Float> values) 
    {
        System.out.println("\n--------Valor de hora por día--------");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Ingrese el valor de hora del " + dias[i] + ": ");
            Float value = scan.nextFloat();
            values.add(value);
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
        Float payment = 0F;
        for (Float pay : payments) 
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
