// Ampliando el uso de var, let y const

/* 
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
un error es que se sobreescribe
*/

var nombre = "Axel";
nombre = "Tobias";
console.log(nombre);

function saludar(){
    var nombre3 = "Benicio";
    console.log(nombre3);
}
//console.log(nombre3); // Aqui no lee el dato en la funcion

if(true){
    var edad = 20;
    console.log(edad);
}
console.log(edad); // En la funcion "function" funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una función
*/

function saludar2(){
    let nombre2 = "Axel";
    console.log(nombre2);
}
//console.log(nombre2); // Aqui no lee el dato de la función


if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);


/*
const se utiliza para valores cosntantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); // solo se ejecuta el console anterior
