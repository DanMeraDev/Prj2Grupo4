/**
 * Deber PoliReto
 * Clase MoralesLeonel
 * @version 1.0
 * Esta clase proporciona una serie de métodos para realizar operaciones basadas en el tamaño proporcionado.
 * @author Leonel Morales
 */
public class MoralesLeonel {
    private int tamano; 

    /**
     * Obtiene el tamaño actual.
     * @return El tamaño actual.
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Establece el tamaño.
     * @param tamano El nuevo tamaño a establecer.
     */
    public void setTamano(Integer tamano) {
        if (tamano == null) {
            System.out.println("El tamaño no puede ser nulo.");
            return;
        }
        if (tamano <= 0) {
            System.out.println("El tamaño debe ser un número mayor a 0.");
            return;
        }
        this.tamano = tamano;
    }

    /**
     * Genera una serie numerica
     */
    public void LMSn10() {
        int LMinicio = 3;
        for (int LMi = 0; LMi < tamano; LMi++) {
            System.out.print(LMinicio + " ");
            LMinicio *= 3;
        }
        System.out.println();
    }

    /**
     * Genera una serie de números basada en una secuencia matemática.
     */
    public void LMS12() {
        int LMinicia = 2;
        for (int LMj = 0; LMj < tamano; LMj++) {
            System.out.print(LMinicia + " ");
            LMinicia += 2 * (LMj + 2);
        }
        System.out.println();
    }

    /**
     * Genera una secuencia de caracteres basada en la posición en el alfabeto.
     */
    public void LMSC9() {
        char letra = 'a';
        for (int LMi = 0; LMi < tamano; LMi++) {
            if (LMi < 3) {
                System.out.print(letra + " ");
            } else {
                int repeticiones = 1;
                if (letra == 'd' || letra == 'e') {
                    repeticiones = 2;
                } else {
                    repeticiones = (letra - 'a' + 1) * 2 - 1;
                }
                for (int j = 0; j < repeticiones; j++) {
                    System.out.print(letra);
                }
                System.out.print(" ");
            }
            letra++;
        }
        System.out.println();
    }

    /**
     * Genera un patrón de caracteres en forma de cruz.
     */
    public void LMf16(){
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == j || i + j == tamano - 1) {
                    if (i % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Genera un patrón numérico en forma de cruz.
     */
    public void LMf17(){
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == j || i + j == tamano - 1) {
                    if (i % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Genera un triángulo de Pascal.
     */
    public void LMf18() {
        int[][] matriz = new int[tamano][tamano];
    
        for (int i = 0; i < tamano; i++) {
            matriz[i][0] = 1; 
            matriz[i][i] = 2; 
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i-1][j-1] + matriz[i-1][j];
            }
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }

    /**
     * Genera un patrón especial.
     */
    public void LMf19() {     
        if (tamano > 5) {
            System.out.println("El tamaño máximo permitido es 5.");
            return;
        }
        int[][] numeros = {
            {},
            {},
            {3},
            {4, 5},
            {5, 9, 7},
            {6,14,16,9}
        };
        for (int i = 0; i <= tamano; i++) {
            System.out.print("     ");
            
            if (i > 0) {
                System.out.print("+");
            }
            for (int j = 0; j < i; j++) {
                if (i < numeros.length && j < numeros[i].length) {
                    System.out.print(" " + numeros[i][j]);
                }
            }   
            System.out.print(" *");
            System.out.println(); 
        }
    }
}
