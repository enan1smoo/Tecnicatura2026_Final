
import java.util.Scanner;

//Ejercicio: Detalles de un Libro
public class Ejer_DetallesLibro {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombredel libro: ");
        var nombreLibro = entrada.nextLine();
        System.out.println("Ingrese el Autor del libro: ");
        var nombreAutor = entrada.nextLine();
        System.out.println("El libro: "+ nombreLibro +" "+"fue escrito por: "+ nombreAutor);
        
    }
    
}
