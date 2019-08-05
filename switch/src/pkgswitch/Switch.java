
package pkgswitch;
import java.util.*;
public class Switch {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.print("Please enter a Letter Mark (A-F): ");
       String numToLetter = input.next();
       
       switch(numToLetter){
           case "A": case "B":
               System.out.println("A");
               break;
          
           default:
               System.out.println("ERROR");
           
         //A,B = 100;
         //C,D = 75
         //E,F = 50
       }
    }
   
}
