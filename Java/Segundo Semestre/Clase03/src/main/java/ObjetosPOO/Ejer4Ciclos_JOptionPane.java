/* Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar
cuantos numeros se han introducido.

Con la clase "JOptionPane"
 */
package ObjetosPOO;

import javax.swing.JOptionPane;

public class Ejer4Ciclos_JOptionPane {
    public static void main(String[] args) {
         
      int numero;
      int contador = 0;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
      while(numero >= 0){
          
          contador++;
          
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
      }
        JOptionPane.showMessageDialog(null, "Se han introducido "+contador+" números"); 
    }
}
