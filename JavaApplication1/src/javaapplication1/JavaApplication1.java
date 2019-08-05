
package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] account = {
            {"mark",""},
            {"123",""}
        };
        String newAcct ;
  
        System.out.print("Register an account? Y/N: ");
        newAcct = input.next();
            System.out.println("");        
        
        if ("Y".equals(newAcct)||"y".equals(newAcct)){
            System.out.print("Please create your account name: ");
            String newAccount = input.next();
            System.out.print("Please create your account password: ");
            String newPassword = input.next();
            account[0][1] = newAccount;
            account[1][1] = newPassword;
            
            
            System.out.println("Your new account is: " + account[0][1] + ". Your password is hidden.");
            
            System.out.println("Please login");

            
            System.out.print("Enter your username: ");
            String userName = input.next();
            System.out.print("Enter your password: ");
            String passWord = input.next();
            
            if(account[0][0].equals(userName)&&account[1][0].equals(passWord)||account[0][1].equals(userName)&&account[1][1].equals(passWord) ){
                System.out.println("Success!");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Please login");
            
                        System.out.print("Enter your username: ");
            String userName = input.next();
            System.out.print("Enter your password: ");
            String passWord = input.next();
            
            if(account[0][0].equals(userName)&&account[1][0].equals(passWord) ||account[0][1].equals(userName)&&account[1][1].equals(passWord) ){
                System.out.println("Success!");
            }else{
                System.out.println("Failed");
            }
        }
        
    }
    
}
