package EjerciciosComplementariosLevel1;
import java.util.*;

public class Ejercicio8 {
    
    public static String mensaje(String nombre, String edad, String direccion, String ciudad) {
        return (ciudad + " - " + direccion + " - " + edad + " - " + nombre);
    } 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        String edad = scan.nextLine();
        String direccion = scan.nextLine();
        String ciudad = scan.nextLine();

        System.out.println(mensaje(nombre, edad, direccion, ciudad));
        scan.close();
    }
}
