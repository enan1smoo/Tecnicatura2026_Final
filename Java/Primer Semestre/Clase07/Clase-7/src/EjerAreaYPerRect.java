
import java.util.Scanner;

// Ejercicio: Sacar el area y el perimetro de un rectangulo
public class EjerAreaYPerRect {
    public static void main(String[] args) {
        float alto;
        float largo;
        float perimetro;
        float area;
        
        System.out.println("Ingrese el alto del rectangulo");
        Scanner entradaA = new Scanner(System.in);

        alto = Float.parseFloat(entradaA.nextLine());
        
        System.out.println("Ingrese el largo del rectangulo");
        Scanner entradaL = new Scanner(System.in);
    
        largo = Float.parseFloat(entradaL.nextLine());
        
        
        perimetro = 2 * (alto + largo);
        System.out.println("perimetro = " + perimetro);
        area = alto * largo;
        System.out.println("area = " + area);
    }
}
