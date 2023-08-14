
// Java Bangla Tutorials 22 : Control Statement ( if,else )

import java.util.Scanner;

public class program13 {
      public static void main(String[] args){
         
            System.out.println("\n");
            Scanner input = new Scanner(System.in);
            int number;

            System.out.printf("Enter Any Integer :  ");
            number = input.nextInt();

            if (number>0){
                System.out.println("Positive");
            }

            else if(number<0){
                System.out.println("Negative");
            }

            else{
                System.out.println("Equal To Zero");
            }
      }   
}

