/**
 * Clase JarrinHelen
 * @version 1.0
 * @author: Helen_Jarrin
 */
public class JarrinHelen {
    /** 
     * construye la serie numerica 01 con jhTamano
     * @param jhTamano: tamano de la serie
    */
    public void jhSN1(int jhTamano){
        System.out.println("\nSerie Numerica 01");
        long v1=0,v2=1,sum;
    
        for(int i=0; i<jhTamano;i++){
            if(i<2){ 
                System.out.print(i + " " );
            }else{    
                sum=v1+v2;
                v1=v2;
                v2=sum;
                System.out.print(sum + " ");
            }    
        }
        System.err.println("");
    }
    /**
     * construye la serie numerica 02 con jhTamano
     * @param jhTamano: tamano de la serie
     */
    public void jhSN2(int jhTamano){
        System.out.println("\nSerie Numerica 02");
        for(int i=0; i<jhTamano;i++){
            if((i+1)%2==0)
                System.out.print(0 + " ");
            else
                System.out.print((i+1) + " ");
        }
        System.out.println("");
    }
    /**
     * construye la serie numerica 03 con jhTamano
     * @param jhTamano: tamano de la serie
     */
    public void jhSN3(int jhTamano){
        long  nume1=0, nume2=1, sum, denom=1;
        System.out.println("\nSerie Numerica 03");
        for(int i=0;i<jhTamano;i++){
            if(i<2){
                System.out.print(i+"/"+denom+" ");
            }else{
                sum=nume1+nume2;
                nume1=nume2;
                nume2=sum;
                System.out.print(sum+"/"+denom+" ");
            }
            denom=denom+2;
        }
        System.out.println("");
    }

    /**
     * construye la serie de caracteres 01 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la serie
     * @param jhCaracter: caracter que va en la serie
     */
    public void jhSC1(int jhTamano,char jhCaracter){
        System.out.println("\nSerie de caracteres 01");
        char caracQuemado='+';
        for(int i=0; i<jhTamano;i++){
            if(i%2==0)
                System.out.print(caracQuemado+" ");
            else
                System.out.print(jhCaracter + " ");
        }
        System.out.println("");
    }
    /**
     * construye la serie de caracteres 02 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la serie
     * @param jhCaracter: caracter que va en la serie
     */
    public void jhSC2(int jhTamano, char jhCaracter){
        System.out.println("\nSerie de caracteres 02");
        long v1=1,v2=1, cant;
    
        for(int i=0; i<jhTamano;i++){
            if(i<2){ 
                cant=v1;
            }else{    
                cant=v1+v2;
                v1=v2;
                v2=cant;
            } 
            for(int j=0; j<cant;j++){
                System.out.print(jhCaracter  );
            } 
            System.out.print(" ");  
        }
        System.out.println("");
    }
    /**
     * construye la figura 01 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la figura
     * @param jhCaracter: caracter de la figura
     */
    public void jhF1(int jhTamano, char jhCaracter){
        System.out.println("\nFigura 01");
        for(int i=0; i<jhTamano;i++){
            for(int j=0; j<jhTamano;j++){
                if((i==0||i==(jhTamano-1))||(j==0 || j==jhTamano-1))
                    System.out.print(jhCaracter+" ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    /**
     *  construye la figura 02 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la figura
     * @param jhCaracter: caracter de la figura
     */
    public void jhF2(int jhTamano, char jhCaracter){
        char cQuemado='+';
        System.out.println("\nFigura 02");

        for(int i=0; i<jhTamano;i++){
            for(int j=0; j<jhTamano;j++){
                if((i==0||i==(jhTamano-1))||(j==0 || j==jhTamano-1))
                    if(((i%2==0&&j%2!=0)||(j%2==0 && i%2!=0)))
                        System.out.print(cQuemado + " ");
                    else
                        System.out.print(jhCaracter +" ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    /**
     *  construye la figura 03 con jhTamano y jhCaracter
     * @param jhTamano: tamano de la figura
     * @param jhCaracter: caracter de la figura
     */
    public void jhF3(int jhTamano, char jhCaracter){
        System.out.println("\nFigura 03");

        for(int i=0; i<jhTamano; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(jhCaracter + " ");
            }
            System.out.println("");
        }
    }
}
