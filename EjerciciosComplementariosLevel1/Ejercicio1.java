package EjerciciosComplementariosLevel1;

import java.io.IOException;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in, "UTF-8")){
            String nombre = scan.nextLine();
            saludar(nombre);
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }

    public static void saludar(String nombre) throws IOException {
        System.out.println("HOLA " + nombre);
    }
}