import java.util.HashMap; //Importo hasmap
import java.util.Scanner; //importo scanner
public class Diccionario {
	public static void main(String[] args) {
	        //Con hasmap creo el mini diccionario (llave-valor)
		HashMap<String, String> diccionario = new HashMap<>();
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
	        
	        Scanner scanner = new Scanner(System.in); //inicializo escaner
	        
	        while (true) { //mientras sea true (no detecte break se ejecuta progrma 
	            System.out.print("Ingrese una palabra en español (o 'salir' para terminar): "); //solicito ingreos
	            String palabraEspañol = scanner.nextLine(); //guardo mi palabra

	            if (palabraEspañol.equals("salir")) { //si ponen salir se acaba el programa
	                break;
	            }

	            String traduccion = diccionario.get(palabraEspañol); //obtengo de mi diccionario la palabra en inglés
	            if (traduccion != null) { //si se encuentra la llave-valor nos da el resultado
	                System.out.println("Traducción al inglés: " + traduccion); //imprimo palabra en inglés
	            } else { //si no se encusnetra la palabra imprimo:
	                System.out.println("La palabra no se encuentra en el diccionario.");
	            }
	        }
	        
	        scanner.close();//cierro scanner
	  }
}

