/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author Dell G5
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String mes[] = {
            "jan",
           "fev" ,
            "mar",
            "abr",
            "mai",
            "jun",
            "jul",
            "ago",
            "set",
            "out",
            "nov",
            "dez",};
      int tot[] = {
          31,
          28,
          31,
          30,
          31,
          30,
          31,
          31,
          30,
          31,
          30,
          31 };
      
      
      for(int i =0; i< mes.length; i++){
          System.out.println("O mes de "+mes[i]+" tem "+tot[i]+" dias.");
      }
      
    }
    
}
