/* Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta
que se introduzca un numero negativo.
Sin la Clase Scanner y con el JOptionPane
*/
package Ejer1NumeroYSuCuadrado;

import javax.swing.JOptionPane;

public class SinClaseScanner {
    public static void main(String[] args) {
        
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("El programa finalizo por ingresar un numero negativo");
    }
}
