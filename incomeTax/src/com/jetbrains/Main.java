package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salaryYear;
        double taxRate;
        double taxPayable;

        System.out.print("Enter salary for a year: ");
        salaryYear = input.nextFloat();

        if (salaryYear > 60000){
            taxRate = 0.30;
            taxPayable = salaryYear * taxRate;
        } else if (salaryYear > 40000){
            taxRate = 0.20;
            taxPayable = salaryYear * taxRate;
        } else if (salaryYear > 20000){
            taxRate = 0.10;
            taxPayable = salaryYear * taxRate;
        } else {
            taxRate = 0;
            taxPayable = salaryYear * taxRate;
        }
        System.out.printf("$%.2f ",taxPayable);
    }
}

//20,000 below 0% tax
//20,001 to 40,000 10% tax
//40,001 to 60,000 20% tax
//60,001 above 30% tax
//tax = Salary * taxPercentage
