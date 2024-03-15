package Utils;

import java.util.Scanner;

public class UI {
    public static String LeeString (String arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(arg);
        String result = teclado.nextLine();
        return result;
    }
    public static boolean LeeBoolean(String arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println(arg);
        boolean result = teclado.nextBoolean();

        return result;
    }
    public static void ImprimeString(String arg){
        System.out.println(arg);
    }
}
