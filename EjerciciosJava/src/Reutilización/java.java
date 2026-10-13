import java.util.Scanner;

public class Reutilizacion {
    private static final Scanner scanner = new Scanner(System.in);

    // Método para ingresar números reales (double)
    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    // Método para ingresar números enteros (int)
    public static int ingresarEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Método para ingresar palabras individuales (String)
    public static String ingresarTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    // Método para ingresar líneas completas de texto (String)
    public static String ingresarLinea(String mensaje) {
        System.out.print(mensaje);
        scanner.nextLine(); // Limpiar búfer de entrada
        return scanner.nextLine();
    }
}