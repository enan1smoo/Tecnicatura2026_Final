/* Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar
cuantos numeros se han introducido.

Con la clase "Scanner"
*/
package ObjetosPOO;

import java.util.Scanner;

public class Ejer4Ciclos_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int contador = 0;
        
        System.out.println("Digite un número: ");
        numero =  Integer.parseInt(entrada.nextLine());
      while(numero >= 0){
           contador++;
          
          System.out.println("Digite otro número: ");
          numero = Integer.parseInt(entrada.nextLine());
      }
        System.out.println("Se han introcido "+contador+" números");
    }
}
