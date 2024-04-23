/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condition_statement;

import java.util.*;
public class Condition_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       operation op = new operation();
        Scanner sc = new Scanner(System.in);
        conditionals con = new conditionals();
       int num;
        System.out.print(" please enter number a \n");
        op.a=sc.nextInt();
         System.out.print(" please enter number b \n");
        op.b=sc.nextInt();
 
     
     
        System.out.print("choose between 1,2,3,4 "
                + "1 : add \n"
               + "2 : sub \n"
                + "3 : div \n"
               + "4 : prod \n ");
        num=sc.nextInt();
        
       switch(num){
           case 1:
                op.add();
            break;
             case 2:
              
                op.sub();
            break;
             case 3:
               op.div();
            break;
             case 4:
               op.prod();
            break;
       }
        
          System.out.print(" please enter number d \n");   
        con.d=sc.nextInt();
        con.iseven();
        
        
                
    }
    
}
