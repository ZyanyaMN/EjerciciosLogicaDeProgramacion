import java.util.HashMap; //importo hasmap
import java.util.Random; //importo random
import java.util.Scanner; //importo scanner

public class Diccionario {
	public static void main(String[] args) {
        // Uso el mismo diccionario que en ejercicio 9
        HashMap<String, String> diccionario = new HashMap<>(); //utilizo hasmap llave-valor--> palabra en español-palabra en inglés
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("hermano", "brother");
        diccionario.put("hermana", "sister");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("amigo", "friend");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("rojo", "red");
        diccionario.put("morado", "purple");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");
        diccionario.put("azul", "blue");
        diccionario.put("naranja", "orange");
        diccionario.put("leer", "read");
        diccionario.put("escribir", "write");
        diccionario.put("comer", "eat");
        diccionario.put("dormir", "sleep");
        diccionario.put("correr", "run");

        //voy a traer cinco palabras aleatorias de diccionario con una función
        String[] palabrasAleatorias = seleccionarPalabrasAlAzar(diccionario, 5); //las guardo en un arreglo
        //inicializo scanner
        Scanner scanner = new Scanner(System.in); 
        int respuestasCorrectas = 0; //variable para contar respuestas correctas
        int respuestasIncorrectas = 0; //variable para conntar respuestas incorrectas
        //Envio mensaje de inicio de programa
        System.out.println("¡Juega a traducir palabras al inglés!");
        
        //creo un ciclo que me va a desplegar las cinco palabras
        for (String palabraEspañol : palabrasAleatorias) {
            System.out.print("Traduce la palabra '" + palabraEspañol + "' al inglés: "); //doy la palabra aleatoria y pido traducción
            String respuestaUsuario = scanner.nextLine(); //guardo la respuesta ingresada
            String traduccionCorrecta = diccionario.get(palabraEspañol); //obtengo la traducción de mi diccionario

            if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) { //si hay respuesta y es igual que la traducción correcta
                System.out.println("¡Correcto!"); //envio mensaje
                respuestasCorrectas++; //imcremento variable de respuestas correctas
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta); //si no es correcta, despliego la traducción correcta
                respuestasIncorrectas++;//incremento variable de respuestas incorrectas
            }
        }
        //Acaba el juego y muestro cantidad de respuestas correctas y cantidad de respuestas incorrectas
        System.out.println("Juego terminado. Respuestas correctas: " + respuestasCorrectas + ", Respuestas incorrectas: " + respuestasIncorrectas);
        
        scanner.close(); //cierro scanner
	}

    //Creo mi función para obtener las cinco palabras al azar
    public static String[] seleccionarPalabrasAlAzar(HashMap<String, String> diccionario, int cantidadDePalabras) { //ingreso mi dicionario y la cantidad de palabras
        Random random = new Random(); //inicializo mi aleatorio
        String[] palabrasAleatorias = new String[cantidadDePalabras]; //creo un string de longitud tantas palabras sean necesarias
        Object[] palabras = diccionario.keySet().toArray(); //creo un array de objetos con las llaves de mi hasmap 

        for (int i = 0; i < cantidadDePalabras; i++) { //creo bucle para obtener palabras 
            palabrasAleatorias[i] = (String) palabras[random.nextInt(palabras.length)]; //guardo en mi array
        }

        return palabrasAleatorias; //devuelvo array con las palabras 
    }
    
}
