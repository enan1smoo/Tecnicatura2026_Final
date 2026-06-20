
import java.util.Scanner;
/*Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante. 
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.*/
public class EjerCalifFinalEstudiante {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite la nota de participacion: ");
        double participacion = entrada.nextDouble();
        
        System.out.println("Digite la nota del primer parcial: ");
        double parcial1 = entrada.nextDouble();
        
        System.out.println("Digite la nota del segundo parcial: ");
        double parcial2 = entrada.nextDouble();
        
        System.out.println("Digite la nota del examen final: ");
        double examenFinal = entrada.nextDouble();
        
        double notaParticipacion = participacion * 0.10;
        double notaParcial1 = parcial1 * 0.25;
        double notaParcial2 = parcial2 * 0.25;
        double notaExamen = examenFinal * 0.40;
        
        double notaFinal = notaParticipacion + notaParcial1 + notaParcial2 + notaExamen;
        System.out.println("La calificacion final es: " + notaFinal);
        
    }
    
}
