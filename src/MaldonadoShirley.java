public class MaldonadoShirley {
    /**
     * esta funcion es de tipo void, la cual imprimira una serie numerica de numeros primos
     * @param msTamano: este parametro es entero y el el tamano ingresado por el ususario, representa hasta
     * que limite se imprimira la serie
     */
    public void  msSN4(int msTamano){
        System.out.println("Se presenta la serie numerica 4");   
        int msContadorP= 0;
        int msNumero= 2; 
        while (msContadorP< msTamano) {
             int msContador= 0;
             for (int i= 1; i<= msNumero; i++) {
                if (msNumero % i== 0) {
                    msContador++;
                }
            }
            if (msContador== 2) { 
                System.out.print(msNumero + " ");
                msContadorP++;  
            }
            msNumero++; 
        }
        System.out.println("");
    }
    /**
     * esta funcion es de tipo void, la cual realizara la imoresion de una serie numerica Fibonnasi en el numerador 
     * y una serie con suma en el denominador
     * @param tamano: es de tipo int, este numero entero es el tamano ingresado por el usuario
     */
    public void msSN5(int tamano){
        System.out.println("Se presenta la serie  numerica 5");
        int valor1 = 0;
        int valor2= 1;
        int suma;
        for (int i = 0; i < tamano; i++) {
            int denominator= 2 + (i * 2);
            System.out.print(valor1 + "/" + denominator + " ");
            suma= valor1 + valor2;
            valor1= valor2;
            valor2= suma;
        }
        System.out.println("");
    }
    /**
     * esat funcion es de tipo void, la cual imprimira una serie de un carcater que va conforme a los numeros primos
     * @param smCaracter: es de tipo char, el cual es elcaracter que se imprimira
     * @param smTamano: es de tipo int, y es hasta donde se realizara la serie
     */
    public void smSC3(char smCaracter,  int smTamano){
        System.out.println("Se presenta la serie de caracteres 3");
        int msNumeroInicio = 2; 
        for (int i = 1; i <= smTamano; msNumeroInicio++) {
            boolean msPrimo = true;
            for (int j = 2; j * j <= msNumeroInicio; j++) {
                if (msNumeroInicio % j == 0) {
                    msPrimo = false;
                    break;
                }
            }
            if (msPrimo) {
                for (int k= 0; k< msNumeroInicio && i<= smTamano; k++, i++) {
                    System.out.print(smCaracter);
                }
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    /**
     * esta funcion es de tipo void, la cual imprimira una serie de caracteres distintos 
     * @param smCaracter: es de tipo char, es el caracter que se imprimira al inicio, y desde ahi se seguira la serie
     * @param smTamano: es de tipo int, el entero sera el tamano hasta dinde llegara la serie
     */
    public void smSC4(char smCaracter,  int smTamano){
        System.out.println("Se presenta la serie de caracteres 4");
        char[] msSecuencia = {smCaracter, '-', '*', '/'};
        for (int i = 0; i <smTamano; i++) {
            char msNuevoChar= msSecuencia[i % msSecuencia.length];
            System.out.print(msNuevoChar + " ");
        }
        System.out.println("");
    }
    /**
     * esta funcion es de tipo void, se encargara de imprimir una figura de triangulo alineado a la derecha
     * @param smCaracter: este parametro es de tipo char, es el caracter que se va a imprimir
     * @param smTamano: es de tipo int, el entero va a ser el tamano de lamatriz
     */
    public void smFig4(char smCaracter, int smTamano){
        System.out.println("se imprimira la figura 4");
        for(int i=1; i<=smTamano; i++){
            for (int j=1; j<= (smTamano -i); j++){
                System.out.print(" ");                
            }
            for(int k=1; k<= i; k++){
                System.out.print(smCaracter);
            }            
            System.out.println("");
        }
    }
    /**
     * esta funcion  es de tipo vooid, y es la que se encargara de imprimir una piramide
     * @param caracter: es de tipo char, este carcater es ingresado por el usuario, para completar la 
     * piramide con este caracter
     * @param tamano: es de tipo int, el entero es el tamano de la matriz
     */
    public void msFig5(char caracter, int tamano){
        System.out.println("Se inprimira la figura 5");
        for (int i=1; i<=tamano; i++){
            for(int j=1; j<=tamano -i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
    /**
     * esta funcion es de tipo void, y es la cual imprimira una figura de piramide invertida
     * @param caracter: es de tipo char, este caracter es ingresado por el ususario
     * @param tamano: es de tipo int, este entero es el tamano de la figura 
     */
    public void msFig6(char caracter, int tamano){
        System.out.println("Se imprimira la figuar 6"); 
        for (int i=tamano; i>=1; i--){
            for(int k=1; k<=tamano -i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
   /**
    * esta funcion de tipo void se encargara de imprimir una figura con forma de gradas
    * @param smTamano:este parametro es de tipo entero 
    * esta funcion no retornara ya que es de tipo void
    */
    public void msFig7(int smTamano){
        System.out.println("Se imprimira la figura 7");
        for(int i=1; i<=smTamano; i++){
            if (i!=1) {
                for(int j=1; j<= (i*2)-1; j++){
                    System.out.print(" ");
                }
            }else{
                System.out.print(" __");
            }
            if (i!=1) {                
                System.out.print("|"+ "__");
            }
            System.out.println("");
        }
    }
}
