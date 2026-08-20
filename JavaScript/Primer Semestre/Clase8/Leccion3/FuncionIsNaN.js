// Funcion isNaN (is Not a Number)

let miNumero = "20x"; // Ingresando una letra, ponemos a prueba la funcion isNan
console.log(typeof miNumero);

let edad = Number(miNumero);
console.log(typeof edad);

if (isNaN(edad)){
    console.log("Esta variable NO contiene solo numeros");
}
else{
    if (edad >= 18){
        console.log("Usted puede votar");
    }
    else{
        console.log("Usted es muy joven para votar");
    }
}