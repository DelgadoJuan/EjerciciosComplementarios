package EjerciciosComplementariosLevel3.Ejercicio5;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.Period;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Perez", "Jorge", LocalDate.parse("1999-12-12")),
                                       new Alumno("Delgado", "Juan", LocalDate.of(2001, 5, 24)),
                                       new Alumno("Paz", "Fernando", LocalDate.of(1998, 2, 2)),
                                       new Alumno("Acevedo", "Iara", LocalDate.of(2000, 8, 14)),
                                       new Alumno("Perelli", "Fabricio", LocalDate.of(1992, 10, 4)));
                                    
        LocalDate now = LocalDate.now();

        Map<String, Integer> alumnosMap = new HashMap<>();
        alumnos.stream()
            .forEach(alumno -> alumnosMap.put(alumno.getApellido() + " " + alumno.getNombre(), Period.between(alumno.getFechaDeNacimiento(), now).getYears()));

        System.out.println(alumnosMap);
    }
}
