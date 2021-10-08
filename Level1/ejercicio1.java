package Level1;
import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();

        saludar(nombre);
        scan.close();
    }

    public static void saludar(String nombre) {
        System.out.println("HOLA " + nombre);
    }

}
