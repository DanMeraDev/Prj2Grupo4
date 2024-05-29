import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
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

    }



}