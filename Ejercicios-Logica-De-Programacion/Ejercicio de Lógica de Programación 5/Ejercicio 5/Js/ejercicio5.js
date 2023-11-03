/*
Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.

*/

// Función para verificar que es número mi valor ingresado y si está dentro del rango de 1 a 100
function esNumero() {
    let intentos = [];
    let numeroSecreto = 78; // Determino mi número secreto

    while (true) {
        let numero = parseInt(prompt("¡Adivine el número secreto! Ingrese un número del 1 al 100 "));//solicito ingreso del número

        if ((numero/1) == numero && numero >= 1 && numero <= 100) { //Si se cumple que sea número y en el rango del 1 al 100 pasa
            intentos.push(numero);

            if (numero === numeroSecreto) { //Si adivino me despliega los números ingresados anteriormente y acaba el programa
                console.log(`Felicidades, adivinaste el número secreto: ${numero}\nSolo te tomó ${intentos.length} intentos`);
                console.log(`Los números ingresados fueron: ${intentos}`);
                break;
            } else { //si no adivino me despliega en consola y se ejecuta de nuevo el programa
                console.log("El número secreto es incorrecto, vuelve a intentarlo");
            }
        } else {
            alert("Error, ingrese un valor numérico del 1 al 100"); //si no cumple con los parámetros de ingreso me marca manda una alerta y se ejecuta nuevamente le programa
        }
    }
}

esNumero(); 
