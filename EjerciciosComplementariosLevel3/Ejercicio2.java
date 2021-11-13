package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> numerosAlCuadrado = listaCuadrado(numeros);
        System.out.println(numerosAlCuadrado);
    }

    public static List<Integer> listaCuadrado(List<Integer> lista) {
        lista = lista.stream()
            .map(numero -> numero * numero)
            .collect(Collectors.toList());
        return lista;
    }
}
