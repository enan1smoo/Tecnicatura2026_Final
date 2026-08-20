
import java.util.Scanner;
/*Ejercicio 3: Leer 2 numeros; si son iguales que los multiplique, si el primero
es mayor que el segundo que los reste y si no, que los sume
 */
public class NumIgualesOMayor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float num1, num2, resultado;
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(entrada.nextLine());
        
        if(num1 == num2){
            resultado = num1*num2;
        }
        else{
            if(num1 > num2){
                resultado = num1 - num2;
            }
            else{
                resultado = num1 + num2;
            }
        }
        System.out.println("El resultado es:"+ resultado);
        
    }
}
