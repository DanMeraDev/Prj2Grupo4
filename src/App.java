import java.util.Scanner;

public class App {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       boolean bandera=true;
       String jhCaracter; 
       int jhTamano=0;
       char jhchar;
       JarrinHelen jHn=new JarrinHelen();

       do{
           try {
                do{
                    System.out.println("Ingrese el tamano para las series");
                    jhTamano=Integer.parseInt(sc.nextLine());
                }while(jhTamano<=0);
                bandera = true;
           } catch (NumberFormatException e) {
                bandera=false;
                System.out.println("Debe ser un numero mayor a cero(0)");
           }
       }while(bandera==false);

       do{
        System.out.println("Ingrese el caracter");
        jhCaracter=sc.nextLine();
       }while(jhCaracter.length()!=1);
       jhchar=jhCaracter.charAt(0);

       System.out.println("\n------------------------------------SERIES NUMERICAS-----------------------------------------");
       jHn.jhSN1(jhTamano); 
       jHn.jhSN2(jhTamano); 
       jHn.jhSN3(jhTamano);
       System.out.println("\n------------------------------------SERIES DE CARACTERES-----------------------------------------");
       jHn.jhSC1(jhTamano, jhchar);
       jHn.jhSC2(jhTamano, jhchar);
       System.out.println("\n------------------------------------FIGURAS-----------------------------------------");
       jHn.jhF1(jhTamano, jhchar);
       jHn.jhF2(jhTamano, jhchar);
       jHn.jhF3(jhTamano, jhchar);
    }
}

