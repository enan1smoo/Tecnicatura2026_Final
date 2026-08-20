package EtiquetasLabels;

public class Labels {
    public static void main(String[] args) {
        
        // Etiquetas (Labels)
        //Uso de las palabras BREAK y CONTINUE junto a las etiquetas (labels)
        //inicio:
        for(var contador = 0; contador < 7; contador++){
            if(contador % 2 == 0){
                System.out.println("contador = " + contador);   
                break;
            }
        }
        inicio:
        for(var contador = 0; contador < 7; contador++){
            if(contador % 2 != 0){
                continue inicio; // Vamos a la siguiente iteracion
            }
            System.out.println("contador = " + contador);   
        }
    }
}            
