/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 	5/10, 10/12, 15/14, 20/16, 25/18,30/20
 */
import java.util.Scanner;
public class Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerador=5, denominador=10, cont=0;
        while (cont < 6){
            System.out.print(numerador + "/" + denominador + ", ");
            numerador+=5;
            denominador +=2;
            cont++;

        }
    }
}
/**
 *
 */