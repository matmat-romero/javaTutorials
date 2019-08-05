package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length;
        int width;
        int perimeter;

        System.out.print("Enter perimeter: ");
        length = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();

        perimeter = (2*length) + (2*width);

        System.out.println("The perimeter is " + perimeter);


    }
}
