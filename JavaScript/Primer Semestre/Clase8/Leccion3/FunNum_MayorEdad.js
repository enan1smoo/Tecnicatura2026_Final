// Convertir String a Number
let miNumero = "20"; // Es una cadena
console.log(typeof miNumero);

let edad = Number(miNumero); // Esta es una fucion
console.log(typeof edad);

// Ejercicio: Es mayor de edad?
if (edad >= 18){
    console.log("Usted puede votar");
}
else{
    console.log("Usted es muy joven para votar");
}
// Ejercicio simplificado con el operador ternario
let resultado = edad >= 18 ? "Usted puede votar" : "Usted es muy joven para votar";
console.log(resultado);