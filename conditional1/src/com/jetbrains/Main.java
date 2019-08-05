package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int number = 5;
	int userNumber;

	System.out.print("Please enter a number: ");
	userNumber = input.nextInt();

        if (userNumber > number) {
            System.out.println("It is greater");
        } else if (userNumber == number){
            System.out.println("It is equal");
        } else{
            System.out.println("It is lesser");
        }

        //User enters a number
        //odd, even




    }
}
