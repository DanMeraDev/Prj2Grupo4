import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int amTamano;
        MontalvanAlvaro m = new MontalvanAlvaro();

        System.out.print("Introduce un tamaño para las series: ");
        amTamano = obtenerTamanoValido(scanner);

        System.out.print("------------SERIES NUMERICAS------------\n");
        m.amSN8(amTamano);
        System.out.println();
        m.amSN9(amTamano);
        System.out.println();


        System.out.print("\n------------SERIES DE CARACTERES------------\n");
        m.amSC7(amTamano);
        System.out.println();
        m.amSC8(amTamano);
        System.out.println();

        System.out.print("\n------------FIGURAS------------\n");
        m.amF12(amTamano);
        System.out.println();
        m.amF13(amTamano);
        System.out.println();
        m.amF14(amTamano);
        System.out.println();
        m.amF15(amTamano);

        scanner.close();
    }

    /**
     * valida que el usuario ingrese un numero mayor que 0
     */
    public static int obtenerTamanoValido(Scanner scanner) {
        int amTamano = 0;
        while (true) {
            System.out.print("Introduce un tamaño: ");
            amTamano = scanner.nextInt();
            if (amTamano > 0) {
                break;
            } else {
                System.out.println("El tamaño debe ser un número mayor a 0. Intenta de nuevo.");
            }
        }
        return amTamano;
    }
}