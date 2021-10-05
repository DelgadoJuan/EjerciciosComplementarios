package Level2;
import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();

        ciudades.add("Ciudad Autónoma de Buenos Aires");
        ciudades.add("Rosario");
        ciudades.add("Resistencia");

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i + 1) + " - " + ciudades.get(i));
        }
    }
}
