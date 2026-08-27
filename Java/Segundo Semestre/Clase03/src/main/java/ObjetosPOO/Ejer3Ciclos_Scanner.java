/* Ejercicio 3: Leer números hasta que se introduzca un cero 
Para cada uno indicar si es par o impar.

Con la clase "Scanner"
*/
package ObjetosPOO;

import java.util.Scanner;

public class Ejer3Ciclos_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un número: ");
      var numero =  Integer.parseInt(entrada.nextLine());
      while(numero != 0){
          if(numero %2 == 0){
              System.out.println("El número "+numero+" es PAR");
          }
          else{
              System.out.println("El número"+numero+" es IMPAR");
          }
          System.out.println("Digite otro número: ");
          numero = Integer.parseInt(entrada.nextLine());
      }
        System.out.println("El número "+numero+" finaliza el programa");
    }
}
