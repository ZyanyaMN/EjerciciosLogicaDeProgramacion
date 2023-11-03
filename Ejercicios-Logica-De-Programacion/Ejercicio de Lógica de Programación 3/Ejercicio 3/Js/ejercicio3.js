/*
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe calcular el factorial del número recibido utilizando recursión.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
5
120.
6
720.
Entrada: 
Salida:
Entrada: 
Salida: 
*/

//5! = 5 x 4 x 3 x 2 x 1 = 120

//Función para verificar que es número mi valor ingresado
function esNumero (){
    let numero = parseInt(prompt("Ingrese un número para calcular su factorial")); //Solicito ingreso de un número
    if ((numero/1) == numero){ //Verifico que sea un entero
        resultado = factorial(numero);
        console.log(`El factorial del número ${numero} es: ${resultado}`);
    } else {
        alert("Error, ingrese un valor numérico");
        esNumero();
    }
}

function factorial(numero){
    if (numero == 0){ //Si el número de ingreso es 0 se sabe su factorial es = 1
        return 1;
    } else{
        return numero * factorial (numero - 1); 
    }
}

esNumero();
