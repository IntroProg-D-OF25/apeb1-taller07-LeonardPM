/**
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el
 * nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 */

import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreEstudiantes="", estado="", tn="";
        double promedio=0, cont=1;
        while (cont<=4){
            System.out.println("DAME NOMBRE Y PROMEDIO");
            nombreEstudiantes = teclado.next();
            promedio = teclado.nextDouble();
            if (promedio>=7) {
                estado = "Aprobado";
            }else {
                estado = "Reprobado";
            }
            tn += nombreEstudiantes + "\t\t\t" + promedio + "\t\t\t\t" + estado+ "\n" ;

            cont++;
        }
        System.out.println("\nNOMBRE\t\tPROMEDIO\t\tESTADO\t\t\n");
        System.out.print(tn );
    }
}
/**
 * NOMBRE		PROMEDIO		ESTADO
 * LUIS		    6.0				Reprobado
 * JOSE		    8.0				Aprobado
 * JOSH		    9.0				Aprobado
 * JUAN		    7.0				Aprobado
 */