package EjerciciosComplementariosLevel1;
import java.math.BigInteger;
import java.util.*;

public class Ejercicio4 {

    public static BigInteger factorial(BigInteger numero) {
        if (numero.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return (numero.multiply(factorial(numero.subtract(BigInteger.ONE))));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero:");
        BigInteger numero = scan.nextBigInteger();

        System.out.println("El factorial de " + numero + " es " + factorial(numero));
        scan.close();
    }
}
