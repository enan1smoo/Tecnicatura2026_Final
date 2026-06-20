
import java.util.Scanner;

/*Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.*/
public class EjerHorasSemanasDias {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad total de horas: ");
        
        int horasTotales = entrada.nextInt();
        
        int semanas = horasTotales / 168; // 1 semana = 168 horas
        int restoHoras = horasTotales % 168;
        
        int dias = restoHoras / 24;
        int horas = restoHoras  % 24;
        
        System.out.println("Semanas = " + semanas);
        System.out.println("Dias = " + dias);
        System.out.println("Horas = " + horas);
    }
}
