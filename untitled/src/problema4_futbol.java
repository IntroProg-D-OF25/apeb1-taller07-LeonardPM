/**
 *Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador - Posición en el campo de juego - Edad - Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Arquero 32 1.95 si
 * 2. Xavier Defensa 24 1.85 si
 * 3. Moisés Mediocentro 19 1.88 si
 * 4. Ángel Delantero 32 1.75 si
 * 5. Michael Delantero 27 1.93 n
 * Promedio de edades: 26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class problema4_futbol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String posicion="", nombre="", seguir, salida="";
    double promedioEdad=0, estatura=0, totalPro=0,promedioEs=0;
    int cont=1, n=1, nJugadores;
       while (cont<=n) {
           System.out.println("ingrese su nombre" );
           nombre= teclado.next();
           System.out.println("ingrese su posicion");
           posicion= teclado.next();
           System.out.println("ingrese su edad");
           promedioEdad = teclado.nextDouble();
           System.out.println("ingrese su estatura");
           estatura = teclado.nextDouble();

           System.out.println("Quieres agregar otro jugador");
           seguir = teclado.next();

           if (seguir.equals("si")){
              n++;
           }
           totalPro+= promedioEdad;
           promedioEs+= estatura;
           cont++;

       salida += nombre + "-" + posicion + "-" + promedioEdad + "-" + estatura + "\n";
      }
           promedioEs/= n;
           totalPro/= n;
        System.out.println(salida);
        System.out.println(promedioEs);
        System.out.println(totalPro);
    }
}

/*
 * ingrese su nombre
 * Alexander Arquero 32 1.95 si
 * Xavier Defensa 24 1.85 si
 * Moisés Mediocentro 19 1.88 si
 * Ángel Delantero 32 1.75 si
 * Michael Delantero 27 1.93 ningrese su posicion
 * ingrese su edad
 * ingrese su estatura
 * Quieres agregar otro jugador
 * ingrese su nombre
 * ingrese su posicion
 * ingrese su edad
 * ingrese su estatura
 * Quieres agregar otro jugador
 * ingrese su nombre
 * ingrese su posicion
 * ingrese su edad
 * ingrese su estatura
 * Quieres agregar otro jugador
 * ingrese su nombre
 * ingrese su posicion
 * ingrese su edad
 * ingrese su estatura
 * Quieres agregar otro jugador
 * ingrese su nombre
 * ingrese su posicion
 * ingrese su edad
 * ingrese su estatura
 * Quieres agregar otro jugador
 * no
 * Alexander-Arquero-32.0-1.95
 * Xavier-Defensa-24.0-1.85
 * Moisés-Mediocentro-19.0-1.88
 * Ángel-Delantero-32.0-1.75
 * Michael-Delantero-27.0-1.93
 *
 * 1.8719999999999999
 * 26.8
 *
 * Process finished with exit code 0
 */