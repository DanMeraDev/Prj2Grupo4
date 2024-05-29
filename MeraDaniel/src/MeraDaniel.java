/**
 * Clase MeraDaniel
 * @version 1.0
 * @author: Daniel Mera
 */

public class MeraDaniel {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * construye una serie numérica
     */
    public void dmSN6() {
        if(size > 0) {
            for (int i = 1; i <= size; i++) {
                if(i == size) {
                    System.out.print((int)(Math.pow(i, 2)) + " ...");
                } else {
                    System.out.print((int) (Math.pow(i, 2)) + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Número inválido - Serie Númerica 6");
        }
    }

    /**
     * construye una serie numérica
     */
    public void dmSN7() {
        if(size > 0) {
            for (int i = 1; i <= size*3; i = i + 3) {
                if(i == (size+1)) {
                    System.out.print(i + " ...");
                } else {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Número inválido - Serie Númerica 7");
        }
    }

    /**
     * construye una serie de caractéres
     */
    public void dmSC5() {
        // \ | / - | \ | / - | \ | / - | ...
        if(size > 0) {
            for (int i = 1; i < size; i++) {
                if(i == 1 || (i-1)%5==0){
                    System.out.print((char)(92) + " ");
                } else if (i == 3 || (i-3)%5==0) {
                    System.out.print("/ ");
                } else if (i == 4 || (i-4)%5==0) {
                    System.out.print("- ");
                } else if (i%5==0 || i%10==2 || i%10==7) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Número inválido - Serie de Caracteres 5");
        }
    }

    /**
     * construye una serie de caractéres
     * @param upper: Determina si las letras serán mayúsculas o no
     */
    public void dmSC6(boolean upper) {
       if(size > 26 || size < 1) {
           System.out.println("Número inválido  - Serie de Caracteres 6");
       } else {
           for(int i = 0; i < size; i++) {
               if(upper) {
                   System.out.print((char)(i+65) + ", ");
               } else System.out.print((char)(i+97) + ", ");
           }
           System.out.println();
       }

    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF8(String character) {
        if(size > 0 && character.length()==1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("    ");
                }
                System.out.println(character+character+character+"|");
            }
            System.out.println();
        } else System.out.println("Número o Caracter inválido - Figura 8");
    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF9(String character) {
        if(size > 0 || character.length()==1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("    ");
                }
                if (i == 0) {
                    System.out.print(character+character+character);
                } else {
                    System.out.print(character+character+character+"|");
                    for (int j = 0; j < (2 * i - 1); j++) {
                        System.out.print("    ");
                    }
                    System.out.print("|"+character+character+character);
                }
                System.out.println();
            }
            System.out.println();
        } else System.out.println("Número inválido o Caracter - Figura 9");
    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF10(String character) {
        if(size > 0 || character.length()==1) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("    ");
                }
                System.out.println("|"+character+'+'+character);
            }
            System.out.println();
        } else System.out.println("Número inválido o Caracter - Figura 10");
    }

    /**
     * construye una figura determinada
     * @param character: determina el caracter a utilizar para la figura
     */
    public void dmF11(String character) {
        if(size > 0 || character.length()==1) {
            StringBuilder line = new StringBuilder();
            StringBuilder space = new StringBuilder();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    space.append(" ");
                }
                System.out.print(space.toString());
                line.append(character);
                System.out.println("|" + line.toString());
            }
            System.out.println();
        } else System.out.println("Número inválido o Caracter - Figura 11");
    }

}
