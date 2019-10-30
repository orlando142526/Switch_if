/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diassemanacorrespondiente;

/**
 *
 * @author DANIELCASTELAO\oyagualendara
 */
public class Dias {
    public void diaSemana (int num){

if (num==1)
    System.out.println("Hoy es Lunes");
else
    if (num==2)
        System.out.println("Hoy es Martes");
    else
        if (num==3)
            System.out.println("Hoy es Miércoles");
        else    
            if (num==4)
                System.out.println("Hoy es Jueves");
            else
                if (num==5)
                    System.out.println("Hoy es Viernes");
                else
                    if (num==6)
                        System.out.println("Hoy es Sábado");
                    else    
                        if (num==7)
                            System.out.println("Hoy es Domingo");

  }


  public void diaSwitch(int num){
      
      switch(num){
          case 1: System.out.println("Lunes");
        break;
          case 2: System.out.println("Martes");
        break;
          case 3: System.out.println("Miércoles");  
        break;
          case 4: System.out.println("Jueves");
        break;
          case 5: System.out.println("Viernes");
        break;  
          case 6: System.out.println("Sábado");
        break;  
          case 7: System.out.println("Domingo");
        break;  
          default :System.out.println("NÚMERO ERRÓNEO");  
      
      }
      
            
  }
  
  
  
 
  
}

