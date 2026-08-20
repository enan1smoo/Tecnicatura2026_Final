// Ejercicio: Hora del dia

let hora = 12;

if (hora >= 6 && hora < 12) {
    console.log("Buenos días");
} else if (hora >= 12 && hora < 18) {
    console.log("Buenas tardes");
} else if ((hora >= 18 && hora <= 23) || (hora >= 0 && hora < 6)) {
    console.log("Buenas noches");
} else {
    console.log("Hora inválida");
}