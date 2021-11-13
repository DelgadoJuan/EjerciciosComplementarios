package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("informatorio");
        palabras.add("");
        System.out.println(filtro(palabras));
    }

    public static List<String> filtro(List<String> lista) {
        lista = lista.stream()
            .filter(palabra -> Objects.nonNull(palabra) && !palabra.isBlank())
            .collect(Collectors.toList());
        return lista;
    }
}
