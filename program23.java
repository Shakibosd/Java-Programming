
// Java Bangla Tutorials 34 : Conditional Operator

import java.util.Scanner;

public class program23 {
  public static void main(String[] args) {
    System.out.println("\n");

    Scanner input = new Scanner(System.in);
    int number1,number2,large;

    System.out.printf("Enter Two Number :  ");
    number1 = input.nextInt();
    number2 = input.nextInt();

    large = (number1>number2) ? number1 : number2;
    System.out.println("Largest Number = "+large);

  }
}
