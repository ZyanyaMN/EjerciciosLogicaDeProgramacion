
/*Solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que 
los números son iguales.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
Entradas: 
4, 4, 2.
Salida:
4, 4, 2.
2, 4, 4.
Entradas: 
4, 2, 4.
Salida:
4, 4, 2.
2, 4, 4.
Entradas: 
2, 4, 4.
Salida:
4, 4, 2.
2, 4, 4.
Pruébalo con las combinaciones de números que se te ocurran */



let numUno = parseInt(prompt("Introduce el primer número entero")); //Solicito primer número parseint para cambiar valor ingresado a numero
let numDos = parseInt(prompt("Introduce el segundo número entero")); //Solicito segundo número parseint para cambiar valor ingresado a numero
let numTres = parseInt(prompt("Introduce el tercer número entero")); //Solicito tercer número parseint para cambiar valor ingresado a numero

//Guardar mis tres números en un vector 
let vectorNum = [numUno, numDos, numTres];

//Ordenar mis valores de mayor a menor
let mayorMenor = vectorNum.sort((a, b) => b - a );//Función flecha que ocupa sort para ordenar 
console.log(`Los números ordenados de mayor a menor son: ${mayorMenor}`); //Imprimo resultados

//Ordenar mis valores de menor a mayor
let menorMayor = vectorNum.sort((a, b) => a - b );//Función flecha que ocupa sort para ordenar 
console.log(`Los número ordenados de menor a mayor son: ${menorMayor}`); //Imprimo resultados

//Detectar números iguales 
for(i=0; i<vectorNum.length; i++){
    if (vectorNum[i] === vectorNum[i+1]){
        console.log(`El número ${vectorNum[i]} y el número ${vectorNum[i+1]} son iguales`);
    }
}