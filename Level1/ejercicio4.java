package Level1;
import java.util.*;

public class ejercicio4 {
    
    public static int factorial(int fac, int num) {
        while (num != 0) {
            fac = fac * num;
            num--;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int fac = 1;
        

        System.out.println("El factorial de " + numero + " es " + factorial(fac, numero));
        scan.close();
    }

}
