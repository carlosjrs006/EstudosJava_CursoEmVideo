/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell G5
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, s  = 0;
    int par   = -1;
    int impar = 0;
    int total = 0;
    int acima = 0;
    int media = 0;
   
      do{
         n= Integer.parseInt(JOptionPane.showInputDialog(null,
                 "<html>Informe um numero: <br><en>(valor 0 interrompe)</en></br><</html> "));
        s += n;
        if(n != 0){
            total++;
        }
        if (n % 2 == 0){
            par++;
        }else{    
            impar++;
        }
        if(n > 100){
            acima++;
        }
        media = s / total;
    } while(n != 0);
    JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr>" +
            "<br>Somatório vale " + s 
            + "<br>Total de Valores: " + total  
            + "<br>Total de Pares: " + par 
            + "<br>Total de Ímpares: " + impar
            + "<br>Acima de 100: " + acima
            + "<br>Média dos valores: " + media 
            + "</html>");
    }

    
    
}
