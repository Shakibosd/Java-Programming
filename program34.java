
// Java Bangla Tutorials 49 : find factorial of a number

import java.io.PrintStream;
import java.util.Scanner;

public class program34 {
 public static void main(String[] args) {
  System.out.println();

     Scanner input = new Scanner(System.in);
     int number,fact=1;

     System.out.printf("Enter Any Positive Integer :  ");
     number = input.nextInt();

     for(int i = number; i>=1; i--){
       fact = fact * i;
     }
     System.out.println("Factorial = "+fact);

 }
}
