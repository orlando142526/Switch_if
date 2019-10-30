
package diassemanacorrespondiente;

import java.util.Scanner;
public class DiasSemanaCorrespondiente {

  
    public static void main(String[] args) {
        // TODO code application logic here
        //Dias de la Semana
        
         Scanner sc=new Scanner(System.in);
     Dias dia=new Dias();
        
     
     System.out.println("Dime un número");
    int valor=sc.nextInt();
    
    dia.diaSemana(valor);
        
dia.diaSwitch(valor);
    }
    
}
