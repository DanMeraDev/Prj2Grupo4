/*
 * Clase MontalvanAlvaro
 * @version 1.0
 * @author: Alvaro Montalvan
 */

public class MontalvanAlvaro {
    int amTamano;
    int amResultado;

    /**
     * se construyen las series numericas
     */
    public void amSN8(int amTamano){
        amResultado = 3;
        for (int i = 0; i < amTamano; i++) {
            System.out.print(amResultado + " ");
            amResultado = amResultado + 5;
        }  
    }
    public void amSN9(int amTamano){
        amResultado = 2;
        for (int i = 0; i < amTamano; i++) {
            System.out.print(amResultado + " ");
            amResultado = amResultado * 2;
        }  
    }
    /**
     * se construyen las series de caracteres
     */
    public void amSC7(int amTamano){
        char amLetra = 'a';
        int amContador = 1;
        int amIterador = 1;

        while (amTamano > 0 && amLetra <= 'z') {
            if (!(amContador % 2 == 0)) {
                for (int i = 0; i < amIterador; i++) {
                    System.out.print(amLetra);
                }
                System.out.print(" ");
                amIterador = amIterador + 2;
            }else{
                for (int i = 0; i < amIterador; i++) {
                    System.out.print(amLetra);
                }
                System.out.print(" ");
                amIterador = amIterador + 3;
            }
            amLetra++;
            amContador++;
            amTamano--;
        }
    }
    public void amSC8(int amTamano){
        char amLetra = 'a';
        int amIterador = 1;

        while (amTamano > 0 && amLetra <= 'z') {
            for (int i = 0; i < amIterador; i++) {
                System.out.print(amLetra);
            }
            System.out.print(" ");
            amIterador += 2;
            amLetra++;
            amTamano--;
        }
    }
    /**
     * se construyen las figuras
     */
    public void amF12(int amTamano){
        for (int i = 0; i < amTamano; i++) {
            for (int j = 1; j <= amTamano - i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
    public void amF13(int amTamano){
        for (int i = 0; i < amTamano; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void amF14(int amTamano){

        for (int i = 0; i < amTamano; i++) {
            for (int j = 0; j < amTamano - i - 1; j++) {
                System.out.print("  ");
            }
            int amCoeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(amCoeficiente + "   ");
                amCoeficiente = amCoeficiente * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
    public void amF15(int amTamano){
        for (int i = 0; i < amTamano; i++) {
            int coeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coeficiente + "  ");
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}