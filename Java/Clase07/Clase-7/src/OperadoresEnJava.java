//Operadores aritmeticos
public class OperadoresEnJava {
    public static void main(String[] args) {
        /*
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("Solucion de la resta = "+ solucion);
        
        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicacion = "+ solucion);
        
        solucion = num1 / num2;
        System.out.println("Solucion de la division = "+ solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("Resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la division
        System.out.println("solucion = "+ solucion); // 5/4
        
        //Numero par o impar
        if (num2 % 2 == 0)
            System.out.println("Es un numero PAR");
        else
            System.out.println("Es un numero IMPAR");
        */
        
        /*
        //Operadores de Asignacion
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; // Una operacion
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);
        
//      Hacerlo tambien con: -= ; *= ; /= ; %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 *= 6;
        System.out.println("varNum2 = " + varNum2);
        
        varNum3 /= 3;
        System.out.println("varNum2 = " + varNum2);
        
        varNum2 %= 6;
        System.out.println("varNum2 = " + varNum2);
        */
        
        /*
        //Operadores Unarios: Cambio de Signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); // El resultado sera un numero negativo
        
        //Operador de Negacion
        var varC = true; //Esta literal por default en Java es de tipo Boolean
        var varD = !varC; // Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de incremento: Preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); // Va a sumar uno
        
        //PostIncremento (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores de Decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //PostDecremento
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("varL = " + varL);
        */
        
        /*
        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum; //Los parentesis son opcionales
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Que onda";
        var cadenaB = "Que onda";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        // Para poder comparar el valor de dos cadenas, se hace lo sgte:
        var fVar = cadenaA.equals(cadenaB); //En este caso si esta haciendo la comparacion interna de las variables
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum > bNum; //> ; >= ; < ; <= ; == ; !=
        System.out.println("gVar = " + gVar);
        
        var gVar2 = aNum >= bNum;
        System.out.println("gVar2 = " + gVar2);
        
        var gVar3 = aNum < bNum;
        System.out.println("gVar3 = " + gVar3);
        
        var gVar4 = aNum <= bNum;
        System.out.println("gVar4 = " + gVar4);
        
        var gVar5 = aNum == bNum;
        System.out.println("gVar5 = " + gVar5);
        
        var gVar6 = aNum != bNum;
        System.out.println("gVar6 = " + gVar6);
        
        if(aNum % 2 == 0)
            System.out.println("El numero es PAR");
        else
            System.out.println("El numero es IMPAR");
        
        var edad = 20;
        var adulto = 18;
        if (edad >= 18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
        */
        
        /*
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        
        if(respuesta)
            System.out.println("Esta DENTRO del rango establecido");
        else
            System.out.println("Esta FUERA del rango establecido");
        */
        
        /*
        //Operador Ternario
        var resultadoT = (5 > 8)? "Verdadero" : "Falso";
        System.out.println("El resultado es = "+ resultadoT);
        
        //Ejercicio par o impar
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es PAR" : "Es IMPAR";
        System.out.println("resultadoT = " + resultadoT);
        */
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5*6)/3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4+5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}
