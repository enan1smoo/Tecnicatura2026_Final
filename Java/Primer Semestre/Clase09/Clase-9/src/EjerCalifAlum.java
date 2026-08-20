
import java.util.Scanner;
/*Ejercicio 1: Determinar si un alumno aprueba o reprueba un curso, sabiendo que
aprobara si su promedio de tres calificaciones es mayor o igual a 70
reprueba caso contrario.
 */
public class EjerCalifAlum {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese la primer calificacion: ");
        nota1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la segunda calificacion: ");
        nota2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la tercer calificacion: ");
        nota3 = Integer.parseInt(entrada.nextLine());
        
        promedio = (nota1 + nota2 + nota3)/3;
        if(promedio >= 70){
            System.out.println("El alumno aprobo con: "+ promedio);
        }
        else{
            System.out.println("El alumno reprobo con: "+ promedio);
        }
    }
}
