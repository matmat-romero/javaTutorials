
package logicaleasy;
import java.util.*;

public class LogicalEasy {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Username: ");
         String userName = input.next();
         System.out.print("Password: ");
         String passWord = input.next();
         
         if("yo".equals(userName)&&"123".equals(passWord)){
             System.out.print("Success!");
         }else{
             System.out.print("Failed!");
         }
    }
    
}
