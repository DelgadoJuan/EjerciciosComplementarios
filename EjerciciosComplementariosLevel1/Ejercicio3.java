package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        secuencia(numero);
        scan.close();
    }

    public static void secuencia(int numero) {
        String num = "";

        for (int i = 1; i <= numero; i++){
            num = num + i + " ";
            System.out.println(num);
        }
    }

}
