/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.*;
public class JavaApplication12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] accounts = {"matthew", "mark"};
        String choiceMenu = "";
        
        while(choiceMenu != "A" || choiceMenu != "B"){
                    System.out.print("What do you want to do? "
                + "A. Check Accounts, B. Login: ");
        choiceMenu = input.next();
        }

        
        if ("A".equals(choiceMenu)){
            for (int i = 0; i < accounts.length;i++){
                System.out.print(accounts[i] + " ");
            }
        }else if ("B".equals(choiceMenu)){
            System.out.print("Login Details: ");
            String loginDetails = input.next();
            
            if (loginDetails.equals(accounts[0])||loginDetails.equals(accounts[1])){
                System.out.println("Success");
            }else{
                System.out.println("Failed");
            }
        }
    }
    
}
