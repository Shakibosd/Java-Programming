
//Java Bangla Tutorials 15 : Arithmetic Operator | Type casting

import java.util.Scanner;
public class program6 {
      public static void main(String[] args){
         
            System.out.println("\n");

            Scanner input = new Scanner(System.in);
            int number1, number2, result;
            
            System.out.printf("Enter First Number :  ");
            number1 = input.nextInt();

            System.out.printf("Enter Secoend Number :  ");
            number2 = input.nextInt();

            result = number1 + number2;
            System.out.println("Addition = "+result);

            result = number1 - number2;
            System.out.println("Subtraction = "+result);

            result = number1 * number2;
            System.out.println("Multiplication = "+result);

            double result2 = (double) number1 / number2;
            System.out.println("Division = "+result2);

            result = number1 % number2;
            System.out.println("Remainder = "+result);         

      }   
}



