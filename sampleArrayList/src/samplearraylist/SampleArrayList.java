/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplearraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MatMat
 */
public class SampleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int choiceInput = 0;
        int numOfBooks = 0;
        int choiceBorrow;
        String bookName = "";
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> library = new ArrayList<String>();
        
        while(choiceInput != 4){
            
            System.out.println("Library System");
            System.out.println("Main Menu. Please choose a function: ");
            System.out.println("1. Add Books");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice here: ");
            choiceInput = input.nextInt();
            System.out.println("");

            if (choiceInput == 1){
                System.out.print("How many books will you enter?: ");
                numOfBooks = input.nextInt();
                for(int i = 1; i <= numOfBooks ; i++){
                    System.out.print("Add book #" + i + ": ");
                    bookName = input.next();
                    library.add(bookName);
                }
                System.out.println("Done!");
                System.out.println("");
            }else if(choiceInput == 2){
                   System.out.println("Here are the following books that you can borrow: " + library);
                   System.out.println("");
            }else if(choiceInput == 3){
                System.out.println("Enter the index of the book you want to borrow: ");
                choiceBorrow = input.nextInt();
                System.out.println(library.get(choiceBorrow) + " has been borrowed!");
                library.remove(choiceBorrow);
                System.out.println("");
            } else if (choiceInput > 4){
                System.out.println("Error");
            }

     }
        
    }

 }
           
        

    

