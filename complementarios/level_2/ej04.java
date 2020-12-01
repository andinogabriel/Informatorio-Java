package complementarios.level_2;
import java.util.*;
import java.util.ArrayList;

/* Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos. */ 
public class ej04 
{

    private static Scanner scan = new Scanner(System.in);

    static void AddStudents(ArrayList<String> students) 
    {
        System.out.println("");
        for (int i = 0; i < 12; i++) 
        {
            System.out.printf("Ingrese el %dº alumno: ", i+1);
            String student = scan.nextLine();
            students.add(student);
        }
        scan.close();
    }
 
    static void showCourses(ArrayList<String> students) 
    {
        int n = students.size();
        int j = 1;
        for (int i = 0; i < n; i+=4) 
        {
            System.out.printf("\nAlumnos del %dº curso\n", j);
            System.out.println(students.subList(i, i+4));
            j++;
        }
    }

    public static void main(String[] args) 
    {
        ArrayList<String> students = new ArrayList<String>();
        AddStudents(students);
        showCourses(students);
    }
}
