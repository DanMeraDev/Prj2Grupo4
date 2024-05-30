
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MoralesLeonel LM = new MoralesLeonel();

        ejecutarSerie(LM, "SN10");
        ejecutarSerie(LM, "SN12");
        ejecutarSerie(LM, "SC9");
        ejecutarFigura(LM, "F16");
        ejecutarFigura(LM, "F17");
        ejecutarFigura(LM, "F18");
        ejecutarFigura(LM, "F19");
    }

    public static void ejecutarSerie(MoralesLeonel LM, String serie) {
        System.out.println("Ingrese el tamaño para " + serie + ":");
        Integer terminos = leerEntero();
        if (terminos != null) {
            LM.setTamano(terminos);
            System.out.print(serie + ": ");
            if (serie.equals("SN10")) {
                LM.LMSn10();
            } else if (serie.equals("SN12")) {
                LM.LMS12();
            } else if (serie.equals("SC9")) {
                LM.LMSC9();
            }
        }
    }

    public static void ejecutarFigura(MoralesLeonel LM, String figura) {
        System.out.println("Ingrese el tamaño para " + figura + ":");
        Integer tamano = leerEntero();
        if (tamano != null) {
            LM.setTamano(tamano);
            System.out.println(figura + ": ");
            if (figura.equals("F16")) {
                LM.LMf16();
            } else if (figura.equals("F17")) {
                LM.LMf17();
            } else if (figura.equals("F18")) {
                LM.LMf18();
            } else if (figura.equals("F19")) {
                LM.LMf19();
            }
        }
    }

    public static Integer leerEntero() {
        while (true) {
            try {
                String input = sc.next();
                if (input.equalsIgnoreCase("null")) {
                    return null;
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido o 'null':");
            }
        }
    }
}
