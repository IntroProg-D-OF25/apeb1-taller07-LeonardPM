/**
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
public class problema_7 {
    public static void main(String[] args) {
        int i = 1;
        double sumatoria = 0, termino= 1; // Variable para almacenar la sumatoria

        System.out.print("Sumatoria: ");
        while (i <= 10) {

            if (i == 1) {
                System.out.print("-(1/1)" );
            } else if (i % 2 == 0){
                System.out.print("+(1/" + i + ")" );
                sumatoria += termino;
            }else {
                System.out.print("-(1/" + i + ")");
            }

            i++;
        }

                // Imprimir el resultado de la sumatoria
            }
        }



