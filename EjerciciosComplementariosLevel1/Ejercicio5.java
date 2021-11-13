package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio5 {
    public static int sumasSucesivas(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a + "x" + b + " = " + sumasSucesivas(a, b));
        scan.close();
    }
}
