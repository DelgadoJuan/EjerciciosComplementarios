package Level1;
import java.util.*;

public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        String num = "";

        for (int i = 1; i <= numero; i++){
            num = num + " " + i;
            System.out.println(num);
        }
        scan.close();
    }
}
