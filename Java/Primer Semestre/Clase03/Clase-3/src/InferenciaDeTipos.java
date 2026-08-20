
import java.util.Scanner;

public class InferenciaDeTipos {

    public static void main(String[] args) {
        /*
        //Var - Inferencia de tipos en Java
        var miVariableEntera = 10;
        var miVariableCadena = "Sigo estudiando";
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("miVariableCadena = " + miVariableCadena);
        //soutv + tab se mostrara todo lo de arriba (linea 7)
        // Para ejecutar Shift + F6 para ejecutar

        //Reglas para definir una variable en Java
        var miVariableEjemplo = 23;

        //Ejercicio concatenacion
        var usuario = "Axel";
        var titulo = "Tecnico";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        
        var a = 11;
        var b = 12;
        System.out.println(usuario + (a + b));
        
        //Ejercicio: Caracteres Especiales en Java
        var nombre = "Tobias";
        System.out.println("\nNueva linea: \n " + nombre); // Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // Tabulador: un espacio para centrar
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b" + nombre); // Caracter de Retroceso
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas Dobles: \""+ nombre +"\"");
        */
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine(); // Este es el metodo que mas se va a utilizar
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
        
    }
}
