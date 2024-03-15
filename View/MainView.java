package View;

import java.util.Scanner;

public class MainView {
    static Scanner teclado = new Scanner(System.in);
    public static void bienvenida() {
        printColoredText("***************************************************", ANSI_ROJO);
        printColoredText("M       M    A    RRRRR   V       V  EEEEE  L     " , ANSI_AZUL);
        printColoredText("MM     MM   A A   R    R   V     V   E      L     ", ANSI_AZUL);
        printColoredText("M M   M M  AAAAA  RRRRR     V   V    EEEE   L     ", ANSI_AZUL);
        printColoredText("M  M M  M A     A R   R      V V     E      L     ", ANSI_AZUL);
        printColoredText("M   M   M A     A R    R      V      EEEEE  LLLL  ", ANSI_AZUL);
        printColoredText("***************************************************", ANSI_ROJO);
    }

    public static int menuSistema() {
        int opcion = 0;
        printColoredText("Pulsa 1 para listar Personajes ", ANSI_MORADO);
        printColoredText("Pulsa 2 para añadir un Personaje ", ANSI_CLARO);
        printColoredText("Pulsa 3 para borrar un Personaje ", ANSI_MORADO);
        printColoredText("Pulsa 4 para Guardar", ANSI_CLARO);
        printColoredText("Pulsa 5 para editar Personaje",ANSI_MORADO);
        printColoredText("Pulsa 0 para salir", ANSI_MORADO);
        opcion = teclado.nextInt();
        return opcion;
    }

    public static int menuTipoPersonaje() {
        int opcion = 0;
        printColoredText("Elige el tipo de personaje a listar",ANSI_MORADO);
        printColoredText("Pulse 1 para listar SuperHeroes", ANSI_CLARO);
        printColoredText("Pulse 2 para listar Villanos",ANSI_MORADO);
        printColoredText("Pulse 3 para listar AntiHeroe", ANSI_CLARO);
        printColoredText("Pulse 4 para listar Todos",ANSI_MORADO);
        printColoredText("Pulsa 0 para salir ", ANSI_CLARO);
        opcion = teclado.nextInt();
        return opcion;
    }

    public static int menuAnadirTipoPersonaje() {
        int opcion = 0;
        printColoredText("Elige el tipo de personaje a añadir",ANSI_MORADO);
        printColoredText("Pulse 1 para añadir un SuperHeroe", ANSI_CLARO);
        printColoredText("Pulse 2 para añadir Villano",ANSI_MORADO);
        printColoredText("Pulse 3 para añadir AntiHeroe", ANSI_CLARO);
        printColoredText("Pulsa 0 para salir ",ANSI_MORADO);
        opcion = teclado.nextInt();
        return opcion;

    }

    public static int menuBorrarTipoPersonaje() {
        int opcion = 0;
        printColoredText("Elige el tipo de personaje a borrar",ANSI_MORADO);
        printColoredText("Pulse 1 para borrar un SuperHeroe", ANSI_CLARO);
        printColoredText("Pulse 2 para borrar Villanos",ANSI_MORADO);
        printColoredText("Pulse 3 para borrar AntiHeroe", ANSI_CLARO);
        printColoredText("Pulsa 0 para salir ", ANSI_CLARO);
        opcion = teclado.nextInt();
        return opcion;

    }
    // Códigos de escape ANSI para algunos colores
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_ROJO = "\u001B[31m";
    public static final String ANSI_CLARO = "\u001B[36m";
    public static final String ANSI_MORADO ="\u001B[35m";
    public static final String ANSI_AZUL = "\u001B[34m";


    /**
     * Imprime un mensaje en el color especificado y luego resetea el color.
     * @param message El mensaje a imprimir.
     * @param colorCode El código de color ANSI para el mensaje.
     */
    public static void printColoredText(String message, String colorCode) {
        System.out.println(colorCode + message + ANSI_RESET);
    }
}
