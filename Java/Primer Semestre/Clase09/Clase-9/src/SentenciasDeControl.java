
import java.util.Scanner;
// Sentencias de control
public class SentenciasDeControl {
    public static void main(String[] args) {
        
        /*
        //Sentencia If Else
        var condicion = true;
        
        if(condicion){
            System.out.println("Condicion Verdadera"); // Condicional Simple
        }
        else{
            System.out.println("Condicion Falsa"); // Condicional Doble
        }
        */
        
        //Sentencia Switch
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 4");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
