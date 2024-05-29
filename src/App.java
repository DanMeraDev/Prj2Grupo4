import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner msScam=new Scanner(System.in);
        MaldonadoShirley msSeries= new MaldonadoShirley();
        int msTam;
        while (true) {
            System.out.print("Por favor ingrese un número entero positivo mayor o igual a 1: ");
            try {
                msTam= Integer.parseInt(msScam.nextLine());
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
            String msCar= msScam.nextLine();
            if (msCar.length() != 1) {
                System.out.println("Por favor, ingrese solo un carácter.");
            } else {
                msCaracteres= msCar.charAt(0);
                break;
            }
        }
        System.out.println("Carácter ingresado: " + msCaracteres);
        System.out.println("......................................................................................SERIES NUMERICAS.....................................................");
       msSeries. msSN4(msTam);
        msSeries. msSN5(msTam);
        System.out.println("................................................................................SERIES CON CARACTERES..............................................");
        msSeries. smSC3(msCaracteres, msTam);
        msSeries. smSC4(msCaracteres, msTam);
        System.out.println("..............................................................................................FIGURAS....................................................................");
        msSeries. smFig4(msCaracteres, msTam);
        msSeries. msFig5(msCaracteres, msTam);
        msSeries. msFig6(msCaracteres, msTam);
        msSeries. msFig7(msTam);
        msScam.close();
    }
}
