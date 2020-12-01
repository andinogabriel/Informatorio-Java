package complementarios.level_2;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class ej06 
{
    
    public static class Empleado 
    {
        private String apellido;
        private String nombre;
        private Integer dni;
        private float horasTrabajadas;
        private float valorPorHora;

        public Empleado(String apellido, String nombre, Integer dni, float horasTrabajadas, float valorPorHora) 
        {
            this.apellido = apellido;
            this.nombre = nombre;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }

        public float getHorasTrabajadas() 
        {
            return horasTrabajadas;
        }
        public float getValorPorHora() 
        {
            return valorPorHora;
        }
        public void setValorPorHora(float valorPorHora) 
        {
            this.valorPorHora = valorPorHora;
        }
        public void setHorasTrabajadas(float horasTrabajadas) 
        {
            this.horasTrabajadas = horasTrabajadas;
        }

        public float calculateSalary() 
        {
            return getValorPorHora() * getHorasTrabajadas();
        }

        @Override
        public String toString() 
        {
            return apellido + " " + nombre + " - DNI: " + dni + " - Sueldo: $" + calculateSalary();
        }
    } 

    private static Scanner scan = new Scanner(System.in);

    static void addEmployee(Set<Empleado> empleados) 
    {
        scan.nextLine();
        System.out.print("\nIngrese el apellido del empleado: ");
        String apellido = scan.nextLine();
        System.out.printf("Ingrese el nombre de %s: ", apellido);
        String nombre = scan.nextLine();

        Integer dni;
        do {
            try {
                System.out.printf("Ingrese el DNI de %s %s: ", apellido, nombre);
                dni = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un DNI valido.");
                scan.nextLine();
            }
        } while(true);

        float horasTrabajadas;
        do {
            try {
                System.out.printf("Ingrese las horas trabajadas de %s %s: ", apellido, nombre);
                horasTrabajadas = scan.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un horario valido.");
                scan.nextLine();
            }
        } while(true);

        float valorPorHora;
        do {
            try {
                System.out.printf("Ingrese el valor hora de %s %s: ", apellido, nombre);
                valorPorHora = scan.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un valor de hora valido.");
                scan.nextLine();
            }
        } while(true);

        Empleado emp = new Empleado(apellido, nombre, dni, horasTrabajadas, valorPorHora);
        empleados.add(emp);
    }

    static void setEmployees(Set<Empleado> empleados, HashMap<Integer, Float> empleadosMap) 
    {
        empleados.forEach(emp -> {empleadosMap.put(emp.dni, emp.calculateSalary());});
    }

    public static void main(String[] args) 
    {
        Set<Empleado> empleados = new HashSet<>();
        HashMap<Integer, Float> empleadosMap = new HashMap<Integer, Float>();
        
        boolean error = true;
        int n = 0;
        do {
            try {
                System.out.print("\nIngrese la cantidad de empleados a registar: ");
                n = scan.nextInt();
                if(n > 0) {
                    error = false;
                } else {
                    System.out.println("Debe ingresar una cantidad positiva de empleados.");
                }
            } catch(Exception e) {
                System.out.println("Error. Debe ingresar un numero entero");
                scan.nextLine();  
            }
        } while(error);

        for (int i = 0; i < n; i++) 
        {
            addEmployee(empleados);
        }
        scan.close();

        setEmployees(empleados, empleadosMap);
        System.out.println("\n-------Lista de Empleados-------");
        empleadosMap.forEach((K,V) -> System.out.println("DNI: " + K + " - Sueldo: $" + V));

    }
}
