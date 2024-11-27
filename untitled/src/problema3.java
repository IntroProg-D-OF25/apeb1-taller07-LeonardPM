/**
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 *
 *
 */

import java.util.Scanner;
public class problema3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre="", my="";
        double costDia, valorCancelar;
        int cont = 1, dias;
        while (cont <= 5){
            System.out.println("Igrese su nombre, dias trabajados y el costo por dia de trabajo");
            nombre = teclado.next();
            dias = teclado.nextInt();
            costDia = teclado.nextDouble();
            valorCancelar = dias*costDia;
            my += nombre + "\t\t\t\t\t" + dias + "\t\t\t\t" + costDia + "\t\t\t\t\t\t" + valorCancelar + "\n";
            cont++;

        }
        System.out.print("NOMBRE\t\tDIAS TRABAJADOS\t\t COSTO DEL DIA\t\t TOTAL A CANCELAR\n");
        System.out.println(my);

    }
    }
/**
 * NOMBRE		DIAS TRABAJADOS		 COSTO DEL DIA		 TOTAL A CANCELAR
 * juan					10				2.5						25.0
 * jose					10				2.5						25.0
 * josh					11				3.5						38.5
 * omar					8				3.5						28.0
 * rosa					5				3.0						15.0
 */

