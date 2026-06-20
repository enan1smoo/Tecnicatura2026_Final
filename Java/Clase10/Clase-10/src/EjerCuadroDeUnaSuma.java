
import java.util.Scanner;
/*Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow*/
public class EjerCuadroDeUnaSuma {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el valor de a: ");
        double a = entrada.nextDouble();
        
        System.out.println("Digite el valor de b: ");
        double b = entrada.nextDouble();
        
        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);
        
        System.out.println("El cuadrado de la suma es = " + resultado);
    }
    
}
