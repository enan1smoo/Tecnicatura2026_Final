
import java.util.Scanner;
/*Ejercicio 2: En un almacen se hace un 20% de descuento a los clientes cuya
compra supere los $100. ¿Cual sera la cantidad que pagara una persona
por su compra?
 */
public class EjerAlmacen {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float compra;
        double descuento, precioFinal;
        System.out.println("Digite la cantidad a pagar");
        compra = Integer.parseInt(entrada.nextLine());
        
        if(compra>100){
            descuento = (compra*0.2);
        }
        else{
            descuento = 0;
        }
        precioFinal = (compra-descuento);
        System.out.println("El precio a pagar es: "+ precioFinal);
    }
    
}
