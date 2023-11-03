/*

Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente:
Entrada: 3
Salida: 0, 1, 1
Entrada: 10 
Salida: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
// Serie matemática que comienza con los números 0 y 1
//luego cada número subsiguiente en la secuencia es la suma de los dos números anteriores

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,... 


//Función para verificar que es número mi valor ingresado
function esNumero (){
    let numero = parseInt(prompt("Ingrese un número para imprimir serie fibonacci")); //Solicito ingreso de un número
    if ((numero/1) == numero){ //Verifico que sea un entero
        resultado = serieFibonnacci(numero);
        console.log(`La serie Fibonnaci ${numero} es: ${resultado}`);
    } else {
        alert("Error, ingrese un valor numérico");
        esNumero();
    }
}

function serieFibonnacci(numero){
   let vectorFibonnacci=[0,1]; //Creo un vector para guardar los números de la sumatoria
    for (i = 2; i<numero; i++){ //Empieza en la posición dos porque siempre comienza con 0 y 1
        vectorFibonnacci[i] = vectorFibonnacci[i - 1]+vectorFibonnacci[i - 2]; //Sumatoria de los dos números anteriores
    }
    return vectorFibonnacci;
}

esNumero();