// Ejercicio: Calcualar la Estacion del año
let mes = 7;

if (mes == 12 || mes == 1 || mes == 2) {
    console.log("Verano");
} else if (mes >= 3 && mes <= 5) {
    console.log("Otoño");
} else if (mes >= 6 && mes <= 8) {
    console.log("Invierno");
} else if (mes >= 9 && mes <= 11) {
    console.log("Primavera");
} else {
    console.log("Mes inválido");
}



//Estructura Switch
switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+estacion)