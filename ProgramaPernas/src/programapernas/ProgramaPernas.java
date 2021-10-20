/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Dell G5
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        System.out.println("Quantas pernas?");
        
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch(perna){
            case 1:
                tipo="saci";
                       
                break;
           case 2:
               tipo="Bipede";
               break;
           case 4:
               tipo="Quadrupede";
               break;
           case 6:
               tipo="Aranha";
               break;
           default:
               tipo="ET";
        }
       
        
        System.out.println(tipo);
        
        
        
    }
    
}
