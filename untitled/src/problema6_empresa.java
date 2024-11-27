/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas:
 * por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */

import java.util.Scanner;

public class problema6_empresa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, todo="";
        int tipoCliente=0, cont=1;
        double precio=0;
        while (cont<=2){
            System.out.print("Igrese su nombre: ");
            nombre = teclado.next();
            System.out.print("Ingrese que tipo de cliente es (1 o 2): ");
            tipoCliente = teclado.nextInt();
            System.out.println("Ingresa el precio de la computadora");
            precio = teclado.nextDouble();
            if (tipoCliente == 1){
                precio = precio * 0.90;
            } else if (tipoCliente==2) {
                precio = precio * 0.80;
            }else
                System.out.println("No hay descuento");

            todo += nombre + "\t\t\t\t" + tipoCliente + "\t\t\t\t" + precio + "\n";

            cont++;

        }
        System.out.println("NOMBRE\t\tTIPO DE CLIENTE\t\tPRECIO FINAL");
        System.out.println(todo);
    }
}
/**
 * Igrese su nombre: jose 2 900
 * Ingrese que tipo de cliente es (1 o 2): Ingresa el precio de la computadora
 * Igrese su nombre: juan 1 800
 * Ingrese que tipo de cliente es (1 o 2): Ingresa el precio de la computadora
 *
 * NOMBRE		TIPO DE CLIENTE		PRECIO FINAL
 * jose				2				720.0
 * juan				1				720.0
 */