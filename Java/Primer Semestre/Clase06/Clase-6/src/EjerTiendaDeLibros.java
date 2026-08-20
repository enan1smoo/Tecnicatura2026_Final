// Tienda de libros


import java.util.Scanner;

public class EjerTiendaDeLibros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        
        System.out.println("Ingrese el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el precio del Libro "+ nombreLibro +": ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Confirme si el envio es gratuito: ");
        boolean envioGratis = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+ " ID#"+ idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio gratuito del libro es: "+ envioGratis);
    }
}
