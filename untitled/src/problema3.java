
import java.util.Scanner;
public class problema3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double costDia, cont = 1,dias, valorCancelar;
        while (cont <= 5) {
            System.out.print("DAME NOMBRE, DIAS TRABAJADOS Y COSTO DEL DIA DE TRABAJO: ");
            nombre= teclado.next();
            costDia = teclado.nextInt();
            dias = teclado.nextDouble();
            cont++;
           valorCancelar= costDia* dias;



        }
    }
}
