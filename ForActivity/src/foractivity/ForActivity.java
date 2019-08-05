package foractivity;
import java.util.*;

public class ForActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        
        if(firstNum < secondNum){
            for (int i = firstNum; i <= secondNum; i++){
                System.out.println(i);
            }
        }else if (firstNum > secondNum){
            for (int i = firstNum; i >= secondNum; i--){
                System.out.println(i);
            }
        }else if (firstNum == secondNum){
            System.out.println("They're equal!");
        }
        
    }
    
}
