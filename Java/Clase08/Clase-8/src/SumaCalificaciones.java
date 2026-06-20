
import java.util.Scanner;
// Ejercicio: Hacer un programa que calcule e imprima la suma de tres calificaciones
//Pedir las calificaciones al usuario
public class SumaCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, suma;

        // Guardamos notas
        System.out.println("Digite las tres calificaciones: ");

        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());

        suma = nota1 + nota2 + nota3;

        System.out.println("\nLa suma es: " + suma);
    }
}
