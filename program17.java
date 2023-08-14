
// Java Bangla Tutorials 26: Maximum/Minimum

import java.util.Scanner;

public class program17 {
      public static void main(String[] args){
         
            System.out.println("\n");

            
            Scanner input = new Scanner(System.in);
            int num1, num2;

            System.out.printf("Enter First Number :  ");
            num1 = input.nextInt();

            System.out.printf("Enter Second Number :  ");
            num2 = input.nextInt();
   
            if(num1>num2){
             System.out.println("First Number Maximum");
            }
            else if(num2<num1){
             System.out.println("First Number Maximum");
            }
            else{
             System.out.println("Second Number Minimum");
            }
        
      }   
}

