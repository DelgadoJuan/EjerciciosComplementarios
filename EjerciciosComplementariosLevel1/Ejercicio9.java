package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio9 {
    public static int contar(String frase, char letra) {
        int c = 0;
        for (int i = 0; i < frase.length(); i++) {
            char l = frase.charAt(i);
            if (l == letra) {
                c += 1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        char letra = scan.nextLine().charAt(0);

        System.out.println("La letra '" + letra + "' aparece " + contar(frase, letra) + " veces.");
        scan.close();
    }
}
