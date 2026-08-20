
import java.util.Scanner;
// Ejercicio: Calcular la estacion del año en la que se encuentra
public class EjerEstacionesDelAño {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un mes del año: ");
        
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion Desconocida";
        
        if (mes == 1 || mes == 2 || mes == 3){
            estacion = "verano";
        }
        else if (mes == 4 || mes == 5 || mes == 6){
            estacion = "Otoño";
        }
        else if (mes == 7 || mes == 8 || mes == 9){
            estacion = "Invierno";
        }
        else if (mes == 10 || mes == 11 || mes == 12){
            estacion = "Primavera";
        }
        
        System.out.println("estacion = " + estacion);
    }
}
