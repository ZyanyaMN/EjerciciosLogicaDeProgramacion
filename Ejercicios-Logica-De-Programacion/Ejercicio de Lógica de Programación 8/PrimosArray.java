import java.util.Scanner; //Importo scanner

public class PrimosArray {

	public static void main(String[]args) {
		
	//Inicializo scanner
		Scanner scanner = new Scanner(System.in);
	//declaro la variable donde se guardan los 10 números
		
	int[] numeros = new int[10];

	// Solicito los 10 números
	for (int i = 0; i < 10; i++) {
		System.out.print("Ingrese el número " + (i + 1) + ": ");
	    numeros[i] = scanner.nextInt();
	}

	//Despliego el arreglo inicial con sus índices
	System.out.println("Array original con sus índices:");
	for (int i = 0; i < numeros.length; i++) {
		System.out.println(i + " - " + numeros[i]);
	}

	// Ordeno los números primos al principio
	int[] primos = new int[10]; //inicializo un nuevo arreglo
	int noPrimosIndex = 0; //creo variable que me ayudará a guardar los números no primos
	int primosIndex = 0; //creo variable que me ayudará a guardar números primos

	for (int i = 0; i < numeros.length; i++) {
		if (esPrimo(numeros[i])) { //llamo a la función que me dice si es primo o no
			primos[primosIndex] = numeros[i]; //si es el caso guardo valor
	        primosIndex++; //se incrementa mi variable
	     } else {
	        numeros[noPrimosIndex] = numeros[i]; //si no es el caso de que sea primo guardo
	        noPrimosIndex++; //se incrementa mi variable
	     }
	 }

	 // Mostrar el nuevo arreglo
	 System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
	 for (int i = 0; i < primosIndex; i++) {
		 System.out.println(i + " - " + primos[i]);
	 }
	 for (int i = 0; i < noPrimosIndex; i++) {
		 System.out.println(i + primosIndex + " - " + numeros[i]);
	 }
	 
	 scanner.close(); //Cierro escaner
}

	// Cre función para verificar si un número es primo
	public static boolean esPrimo(int numero) {
		if (numero <= 1) { //si mi número es menor o igual a 1 devuelvo falso
			return false;
	    }
	    for (int i = 2; i <= Math.sqrt(numero); i++) { //se detiene hasta que i sea menor o igual a la raíz de mi número
	    	if (numero % i == 0) { //si el módulo de mi número dividido por i es cero 
	    		return false; //devuelve falso
	        }
	    }
	    	return true; //si no devuelve true
	    }
	
}
	
	
	

