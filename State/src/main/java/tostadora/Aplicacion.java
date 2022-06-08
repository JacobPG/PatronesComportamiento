
package tostadora;

import java.util.Scanner;

/**
 *
 * @author JacobPG
 */
public class Aplicacion {
    
    
    public static void main(String[] args) {
        Integer nivelTostado = null;
        Scanner entradaEscaner = new Scanner (System.in);
        String entradaTeclado;
        Boolean isRunning = true;
        
        System.out.println("\tIniciando el Proceso.");
        Tostadora tostadora = new Tostadora();
        
        while (isRunning){
            System.out.println("Digite Enter para insertar los panes.");
            entradaTeclado = entradaEscaner.nextLine ();
            tostadora.ponerPanes();
            while(true){
                System.out.println("Digite la intensidad [1-4] para tostat los panes:");
                entradaTeclado = entradaEscaner.nextLine ();
                try{nivelTostado = Integer.parseInt(entradaTeclado);}
                catch (NumberFormatException ex){System.out.println("La intensidad debe estar entre 1 a 4"); continue;}
                if (nivelTostado<1 || nivelTostado>4){
                    System.out.println("La intensidad debe estar entre 1 a 4"); continue;
                }
                break;
            }
            tostadora.tirarPalanca(nivelTostado);
            
            while(true){
                System.out.println("¿Desea tostar nuevamente? [SI|NO]");
                entradaTeclado = entradaEscaner.nextLine().toUpperCase();
                if("SI".equals(entradaTeclado)) break;
                else if("NO".equals(entradaTeclado)){isRunning = false; break;}
                else System.out.println("Debe escribir SI o NO\n");                
            }  
        }
    }

}
