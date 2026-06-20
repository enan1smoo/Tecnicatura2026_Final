
import java.util.Scanner;

// Ejercicio: Calcular el salario de un empleado
public class EjerCalcSalario {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int horasSemana;
        float salario;
        float salarioTotal;
        
        
        System.out.println("Cuantas horas trabajo esta semana?");
        horasSemana = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Cual es su salario x hora?");
        salario = Float.parseFloat(entrada.nextLine());
        
        salarioTotal = horasSemana * salario;
        System.out.println("salarioTotal = $" + salarioTotal);
        
    }
    
}
