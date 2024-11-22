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
        String nombreEstudiantes, estado;
        double promedio, cont=1;
        while (cont<=4){
            System.out.print("DAME NOMBRE Y PROMEDIO \n");
            nombreEstudiantes = teclado.next();
            promedio = teclado.nextInt();
            if (promedio>=7)
                estado = "Aprobado";
            else
                estado = "Reprobado";
            System.out.println("NOMBRE\t\tPROMEDIO\tESTADO\t");
            System.out.println(nombreEstudiantes + "\t\t\t" + promedio + "\t\t" + estado);
            cont++;
        }
    }
}
