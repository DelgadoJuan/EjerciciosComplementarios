package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println("El numero de palabras que comienzan con la letra 'b' es: " + contarPalabrasConB(palabras));
    }

    public static Long contarPalabrasConB(List<String> lista) {
        Long palabras = lista.stream()
            .filter(palabra -> palabra.startsWith("B") || palabra.startsWith("b"))
            .count();
        return palabras;
    }
}
