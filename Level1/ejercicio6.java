package Level1;
import java.util.*;

public class ejercicio6 {
    
    public static int potencia(int a, int b) {
        int resultado = a;
        for (int i = 1; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a + "**" + b + " = " + potencia(a, b));
        scan.close();
    }
}
