package Level1;
import java.util.*;

public class ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra=scan.nextLine();
        System.out.println(upperCase(palabra));
        scan.close();
    }

    public static String upperCase(String palabra) {
        String palabraMayus = "";
        for (int i = 0; i< palabra.length(); i++) {
            char aChar = palabra.charAt(i);
            if (aChar>=91 && aChar<=122) {
                aChar = (char)((aChar -32)); 
            }
            palabraMayus += aChar;
        }
        return palabraMayus;
    }
}
