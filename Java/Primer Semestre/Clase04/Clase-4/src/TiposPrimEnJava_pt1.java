//Tipos primitivos en Java Parte 1
public class TiposPrimEnJava_pt1 {
    public static void main(String[] args) {
        
        byte numEntero = 10;
        System.out.println("numEntero = " + numEntero);
        System.out.println("Valor minimo Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo Byte: "+ Byte.MAX_VALUE);
        
        System.out.println(""); // Salto de linea
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
        
        System.out.println(""); // Salto de linea
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: "+ Integer.MAX_VALUE);
        
        System.out.println(""); // Salto de linea
        
        long numEnteroLong = 10;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: "+ Long.MIN_VALUE);
        
        System.out.println(""); // Salto de linea
        
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo del Float: "+ Float.MIN_VALUE);
        System.out.println("El valor maximo del Float: "+ Float.MAX_VALUE);
        
        System.out.println(""); // Salto de linea
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo del Double: "+ Double.MIN_VALUE);
        System.out.println("El valor maximo del Double: "+ Double.MAX_VALUE);
        
    }
}
