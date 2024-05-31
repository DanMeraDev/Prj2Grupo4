import java.util.Scanner;

public class App {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
        Grupo 4
        Integrantes

            Jarrin Helen
            Maldonado Shirley
            Morales Leonel
            Montalvan Alvaro
            Mera Daniel
         */

        // Helen Jarrin
        boolean bandera = true;
        String jhCaracter;
        int jhTamano = 0;
        char jhchar;
        JarrinHelen jHn = new JarrinHelen();

        do {
            try {
                do {
                    System.out.println("Ingrese el tamano para las series");
                    jhTamano = Integer.parseInt(sc.nextLine());
                } while (jhTamano <= 0);
                bandera = true;
            } catch (NumberFormatException e) {
                bandera = false;
                System.out.println("Debe ser un numero mayor a cero(0)");
            }
        } while (bandera == false);

        do {
            System.out.println("Ingrese el caracter");
            jhCaracter = sc.nextLine();
        } while (jhCaracter.length() != 1);
        jhchar = jhCaracter.charAt(0);

        System.out.println("\n-----------------------------------------SERIES NUMERICAS-------------------------------------------------");
        jHn.jhSN1(jhTamano);
        jHn.jhSN2(jhTamano);
        jHn.jhSN3(jhTamano);
        System.out.println("\n--------------------------------------------SERIES DE CARACTERES--------------------------------------------------");
        jHn.jhSC1(jhTamano, jhchar);
        jHn.jhSC2(jhTamano, jhchar);
        System.out.println("\n------------------------------------------------FIGURAS-----------------------------------------------------------");
        jHn.jhF1(jhTamano, jhchar);
        jHn.jhF2(jhTamano, jhchar);
        jHn.jhF3(jhTamano, jhchar);


        // Shirley Maldonado
        Scanner msScam = new Scanner(System.in);
        MaldonadoShirley msSeries = new MaldonadoShirley();
        int msTam;
        while (true) {
            System.out.print("Por favor ingrese un número entero positivo mayor o igual a 1: ");
            try {
                msTam = Integer.parseInt(msScam.nextLine());
                if (msTam >= 1) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número entero positivo mayor o igual a 1.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero.");
            }
        }
        System.out.println("el tamano ingresado es: " + msTam);
        char msCaracteres;
        while (true) {
            System.out.print("Por favor ingrese un carácter: ");
            String msCar = msScam.nextLine();
            if (msCar.length() != 1) {
                System.out.println("Por favor, ingrese solo un carácter.");
            } else {
                msCaracteres = msCar.charAt(0);
                break;
            }
        }
        System.out.println("Carácter ingresado: " + msCaracteres);
        System.out.println("......................................................................................SERIES NUMERICAS.....................................................");
        msSeries.msSN4(msTam);
        msSeries.msSN5(msTam);
        System.out.println("................................................................................SERIES CON CARACTERES..............................................");
        msSeries.smSC3(msCaracteres, msTam);
        msSeries.smSC4(msCaracteres, msTam);
        System.out.println("..............................................................................................FIGURAS....................................................................");
        msSeries.smFig4(msCaracteres, msTam);
        msSeries.msFig5(msCaracteres, msTam);
        msSeries.msFig6(msCaracteres, msTam);
        msSeries.msFig7(msTam);
        msScam.close();

        // Daniel Mera
        MeraDaniel m = new MeraDaniel();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un tamano para las series: ");
        try {
            int size = sc.nextInt();
            m.setSize(size);
            System.out.println("Series numéricas");
            m.dmSN6();
            m.dmSN7();
            System.out.println("Series de caracteres");
            m.dmSC6(true);
            m.dmSC5();
            System.out.println("Figuras");
            m.dmF8("_");
            m.dmF9("_");
            m.dmF10("_");
            m.dmF11("_");
        } catch (Exception e) {
            System.out.println("Valor incorrecto");
        }

        // Alvaro Montalvan
        Scanner scanner = new Scanner(System.in);
        int amTamano;
        MontalvanAlvaro mA = new MontalvanAlvaro();

        System.out.print("Introduce un tamaño para las series: ");
        amTamano = obtenerTamanoValido(scanner);

        System.out.print("------------SERIES NUMERICAS------------\n");
        mA.amSN8(amTamano);
        System.out.println();
        mA.amSN9(amTamano);
        System.out.println();


        System.out.print("\n------------SERIES DE CARACTERES------------\n");
        mA.amSC7(amTamano);
        System.out.println();
        mA.amSC8(amTamano);
        System.out.println();

        System.out.print("\n------------FIGURAS------------\n");
        mA.amF12(amTamano);
        System.out.println();
        mA.amF13(amTamano);
        System.out.println();
        mA.amF14(amTamano);
        System.out.println();
        mA.amF15(amTamano);

        scanner.close();

        // Leonel Morales
        MoralesLeonel LM = new MoralesLeonel();

        ejecutarSerie(LM, "SN10");
        ejecutarSerie(LM, "SN12");
        ejecutarSerie(LM, "SC9");
        ejecutarFigura(LM, "F16");
        ejecutarFigura(LM, "F17");
        ejecutarFigura(LM, "F18");
        ejecutarFigura(LM, "F19");

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

