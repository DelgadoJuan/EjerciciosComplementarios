package Level2.ejercicio6;
import java.util.*;

public class ejercicio6 {
    
    public static void main(String[] args) {
        Empleados emp1 = new Empleados("Juan Delgado", 43348071, 20, 1000);
        Empleados emp2 = new Empleados("Fernando Paz", 40234556, 2, 20);
        Empleados emp3 = new Empleados("Iara Acevedo", 42344556, 1, 15);
        Empleados emp4 = new Empleados("Fabricio Perelli", 35233445, 23, 2000);

        Set<Empleados> empleados = new HashSet<>();
        Map<Integer, Integer> empleados_dicc = new HashMap<>();

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

        for (Empleados empleado: empleados) {
            empleados_dicc.put(empleado.dni, empleado.horas_trabajadas * empleado.valorphora);
        }

        System.out.println(empleados);
        for (Map.Entry<Integer, Integer> empleado: empleados_dicc.entrySet()) {
            System.out.println("DNI: " + empleado.getKey() + "\n" + "Sueldo: $" + empleado.getValue() + "\n");
        }
    }
}
