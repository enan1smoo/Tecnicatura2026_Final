
import java.util.Scanner;
/*Ejercicio: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee
Guillermo. Juan tiene la mitad de lo que posee Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen
entre los tres.
*/
public class EjerGuilleLuisJuan {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());
        
        luis = guillermo / 2;
        juan = (luis + guillermo)/2;
        total = luis + guillermo + juan;
        System.out.println("\nEl dinero de Luis es: US$"+luis);
        System.out.println("El dinero de Juan es: US$"+juan);
        System.out.println("El total del dinero entre los 3 es: US$"+total);
        
    }
}
