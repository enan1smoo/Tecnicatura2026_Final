var nombre = "Axel";
var apellido = " Navarrete";
var nombreCompleto = nombre+' '+apellido; // Primera concatenacion
console.log(nombreCompleto);

var nombreCompleto2 = "Tobias"+" "+"Avila"; // Segunda concatenacion
console.log(nombreCompleto2);

var juntos = nombre + 223; // Lee de izq a der siguiendo la cadena, lee el numero como tipo str 
console.log(juntos);
juntos = nombre + 78 + 17; // Aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = 78 + 17 + nombre; // Aqui primero se los trata como tipo int y luego como str, por eso hay una suma al inicio
console.log(juntos);

nombre += apellido; // Tercera Concatenacion usando el operador simplificado
console.log(nombre);
