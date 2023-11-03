import java.util.Scanner; //Importo scanner

public class InvertirTexto {
	public static void main (String[]args) {
		
		//Se abre scanner 
		Scanner scanner = new Scanner (System.in);
		//Pido la palabra o frase 
		System.out.println("Ingrese una palabra o frase para revertir:");
		//Guardo info ingresada
		String ingreso = scanner.nextLine();
		//Llamo función 
		String textoInvertido = invertirTexto(ingreso);
		//Despliego resultado 
		System.out.println("Su texto al revés es: " + textoInvertido);
		//Por buenas prácticas cierro scanner
		scanner.close();
	}


	//Función para invertir texto 
	public static String invertirTexto(String texto) {
		//Se pasa el arreglo de texto a cadena de caracteres
		char[] caracteres = texto.toCharArray();
		//del lado izquierdo empiezo en 0
        int izquierda = 0;
        //del lado derecho empiezo en la longitud de caracteres menos 1
        int derecha = caracteres.length - 1;
        
        //mientras izquierda sea menor que derecha se ejecuta 
        while (izquierda < derecha) {
        	//uso un auxiliar para guardar temporalmente
            char aux = caracteres[izquierda];
            //guardo en la posición de izquierda el valor de derecha para ir invirtiendo
            caracteres[izquierda] = caracteres[derecha];
            //el valor de derecha ahora toma el valor de izquierda al inicio del ciclo
            caracteres[derecha] = aux;
            //la variable izquierda va incrementando
            izquierda++;
            //la variable derecha va decrementando
            derecha--;
        }

        return new String(caracteres);
	}
}