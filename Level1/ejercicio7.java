package Level1;
import java.util.*;

public class ejercicio7 {
    
    public static String convertirMayuscula(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char l = frase.charAt(i);
            switch(l) {
                case 'a':
                    resultado += "A";
                    break;
                case 'b':
                    resultado += "B";
                    break;
                case 'c':
                    resultado += "C";
                    break;
                case 'd':
                    resultado += "D";
                    break;
                case 'e':
                    resultado += "E";
                    break;
                case 'f':
                    resultado += "F";
                    break;
                case 'g':
                    resultado += "G";
                    break;
                case 'h':
                    resultado += "H";
                    break;
                case 'i':
                    resultado += "I";
                    break;
                case 'j':
                    resultado += "J";
                    break;
                case 'k':
                    resultado += "K";
                    break;
                case 'l':
                    resultado += "L";
                    break;
                case 'm':
                    resultado += "M";
                    break;
                case 'n':
                    resultado += "N";
                    break;
                case 'ñ':
                    resultado += "Ñ";
                    break;
                case 'o':
                    resultado += "O";
                    break;
                case 'p':
                    resultado += "P";
                    break;
                case 'q':
                    resultado += "Q";
                    break;
                case 'r':
                    resultado += "R";
                    break;
                case 's':
                    resultado += "S";
                    break;
                case 't':
                    resultado += "T";
                    break;
                case 'u':
                    resultado += "U";
                    break;
                case 'v':
                    resultado += "V";
                    break;
                case 'w':
                    resultado += "W";
                    break;
                case 'x':
                    resultado += "X";
                    break;
                case 'y':
                    resultado += "Y";
                    break;
                case 'z':
                    resultado += "Z";
                    break;
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        
        System.out.println(convertirMayuscula(frase));
        scan.close();
    }
}
