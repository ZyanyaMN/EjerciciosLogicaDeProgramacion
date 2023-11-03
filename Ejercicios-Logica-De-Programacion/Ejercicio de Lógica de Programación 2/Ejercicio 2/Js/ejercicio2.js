/*
Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
Debe imprimir ambos resultados por consola o por el DOM.
Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
45.
Grados Kelvin: 318.15
Grados Fahrenheit: 113. 
 14.
Grados Kelvin: 287.15
Grados Fahrenheit: 57.2. 
Entrada: 
Salida
Entrada:
Salida
*/

// °F = (°C × 9/5) + 32
// K = °C + 273.15
function conversionTemperaturas (){
    let gradosCelsius = parseInt(prompt("Ingrese temperatura en Celsius")); //Solicito ingreso de grados en celsius

    if ((gradosCelsius/1) ==gradosCelsius){
        let gradosFarenheit = ((gradosCelsius * (9/5)) + 32); //Convierto a farenheit
        let temperaturaKelvin = (gradosCelsius + 273.15); //Convierto a Kelvin

        //Imprimo en consola
        console.log(`${gradosCelsius} grados Celsius son: `);
        console.log(`Grados Farenheit: ${gradosFarenheit}`);
        console.log(`Kelvin: ${temperaturaKelvin}`);
    } else{
        alert("Error, ingrese un valor numérico");
        conversionTemperaturas();
    }
}

conversionTemperaturas();

