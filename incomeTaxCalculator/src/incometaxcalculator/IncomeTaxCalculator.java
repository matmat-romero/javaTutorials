package incometaxcalculator;
import java.util.*;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terminator = -1;
        double salaryPerYear = 0, taxPercentage, totalTax;
  
        while(salaryPerYear != -1){
            System.out.print("Enter yearly salary: ");
            salaryPerYear = input.nextDouble();

            if (salaryPerYear > 60000 ){
                taxPercentage = 0.3;           
            }else if (salaryPerYear > 40000){
                taxPercentage = 0.2;
            }else if (salaryPerYear > 20000){
                taxPercentage = 0.1;
            }else{
                taxPercentage = 0;
            }

            totalTax = salaryPerYear*taxPercentage;
            System.out.println("Total tax: " + totalTax);
        
        }

    }
}
//60000 above = 30%
//40000 above = 20%
//20000 above = 10%
//20000 and below = 0%