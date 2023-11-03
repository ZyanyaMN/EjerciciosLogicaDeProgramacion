package ejercicio7;
import java.util.Scanner; // Importo la clase Scanner para leer la entrada del usuario

public class MinutosRestantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializo un objeto Scanner para leer la entrada del usuario

        // Defino los días de la semana y los minutos restantes hasta el fin de semana
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        int[] minutosHastaFinDeSemana = {60 * 24 * 3 + 60 * 15, 60 * 24 * 2 + 60 * 15, 60 * 24 * 1 + 60 * 15, 60 * 15, 60 * 15};

        String diaSemana;
        int hora, minutos;

        // Solicito al usuario ingresar un día de la semana válido
        while (true) {
            System.out.print("Ingrese un día de la semana (lunes a viernes): ");
            diaSemana = scanner.nextLine().toLowerCase();

            if (isValidDiaSemana(diaSemana)) { // Verifico si el día ingresado es válido
                break;
            } else {
                System.out.println("Día de la semana no válido. Por favor, ingrese un día válido.");
            }
        }

        // Solicito al usuario ingresar una hora válida
        while (true) {
            System.out.print("Ingrese la hora (0-23): ");
            hora = scanner.nextInt();
            scanner.nextLine();

            if (hora >= 0 && hora <= 23) { // Verifico si la hora ingresada es válida
                break;
            } else {
                System.out.println("Hora no válida. Por favor, ingrese una hora válida.");
            }
        }

        // Solicito al usuario ingresar minutos válidos
        while (true) {
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();
            scanner.nextLine();

            if (minutos >= 0 && minutos <= 59) { // Verifico si los minutos ingresados son válidos
                break;
            } else {
                System.out.println("Minutos no válidos. Por favor, ingrese minutos válidos.");
            }
        }

        // Calculo los minutos restantes hasta el fin de semana y lo muestro
        int minutosHastaFinSemana = calcularMinutosHastaFinSemana(diaSemana, hora, minutos, diasSemana, minutosHastaFinDeSemana);
        System.out.println("Faltan " + minutosHastaFinSemana + " minutos para el fin de semana.");
    }

    // Verifico si el día de la semana ingresado es válido
    public static boolean isValidDiaSemana(String diaSemana) {
        String[] diasValidos = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        for (String diaValido : diasValidos) {
            if (diaSemana.equals(diaValido)) {
                return true;
            }
        }
        return false;
    }

    // Calculo los minutos restantes hasta el fin de semana
    public static int calcularMinutosHastaFinSemana(String diaSemana, int hora, int minutos, String[] diasSemana, int[] minutosHastaFinDeSemana) {
        int minutosHastaFinSemana = 0;
        int diaIndex = -1;

        // Encuentro el índice del día de la semana ingresado en el array de días de la semana
        for (int i = 0; i < diasSemana.length; i++) {
            if (diaSemana.equals(diasSemana[i])) {
                diaIndex = i;
                break;
            }
        }

        // Si el día es válido, calculo los minutos restantes hasta el fin de semana
        if (diaIndex >= 0) {
            minutosHastaFinSemana = minutosHastaFinDeSemana[diaIndex];
            minutosHastaFinSemana += (hora * 60 + minutos);
        }

        return minutosHastaFinSemana; // Devuelvo los minutos restantes hasta el fin de semana
    }
}
