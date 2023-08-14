
// Java Bangla Tutorials 24 : Checking Even/Odd Number
import java.util.Scanner;
public class program14 {
      public static void main(String[] args){
         
            System.out.println("\n");
 
            Scanner input = new Scanner(System.in);
            int number;

            System.out.printf("Enter Any Positive Integer :  ");
            number = input.nextInt();

            if(number%2==0){
             System.out.println("Even");
            }     

            else{
             System.out.println("Odd");
            }

      }   
}
