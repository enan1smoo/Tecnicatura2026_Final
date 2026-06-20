
import java.util.Scanner;

/* Ejercicio: Sistema de calificaciones con if else, como tarea hacerlo tambien
con la sentencia de control Switch*/
public class EjerSisCalif {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del 1 a 10: ");
        
        var nota = Integer.parseInt(entrada.nextLine());
        /*
        if (nota >= 9 && nota <= 10){
            System.out.println("Su calificacion es: A");
        }
        else if (nota >= 8 && nota <= 9){
            System.out.println("Su calificacion es: B");
        }
        else if (nota >= 7 && nota <= 8){
            System.out.println("Su calificacion es: C");
        }
        else if (nota >= 6 && nota <=7 ){
            System.out.println("Su calificacion es: D");
        }
        else if (nota >= 0 && nota < 6){
            System.out.println("Su calificacion es: F");
        }
        else {
            System.out.println("Fuera de rango");
        }
        */
        
        //Ahora con la sentencia Switch
        switch(nota){
            case 9: case 10:
                System.out.println("Su calificación es: A");
                break;
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 7:
                System.out.println("Su calificación es: C");
                break;
            case 6:
                System.out.println("Su calificación es: D");
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("Su calificación es: F");
                break;
            default:
                System.out.println("Fuera de rango");
        }
    }
}
