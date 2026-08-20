package PalabraBreakYContinue;

public class BreakYContinue {
    public static void main(String[] args) {
        
        // Palabra BREAK
        for(var contador = 0; contador < 7; contador++){
            if(contador % 2 == 0){
                System.out.println("contador = " + contador);   
                break;
            }
        }
        
        // Palabra CONTINUE
        for(var contador = 0; contador < 7; contador++){
            if(contador % 2 != 0){
                continue; // Vamos a la siguiente iteracion
            }
            System.out.println("contador = " + contador);   
        }
    }
}            
