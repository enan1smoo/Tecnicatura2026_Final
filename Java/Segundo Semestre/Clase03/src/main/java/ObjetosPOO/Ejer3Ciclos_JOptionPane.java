/* Ejercicio 3: Leer números hasta que se introduzca un cero 
Para cada uno indicar si es par o impar.

Con la clase "JOptionPane"
 */
package ObjetosPOO;

import javax.swing.JOptionPane;

public class Ejer3Ciclos_JOptionPane {
    public static void main(String[] args) {
        
      var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
      while(numero != 0){
          if(numero %2 == 0){
              JOptionPane.showMessageDialog(null, "El número "+numero+" es PAR");
          }
          else{
              JOptionPane.showMessageDialog(null, "El número "+numero+" es IMPAR");
          }
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
      }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa"); 
    }
}
