// Java Bangla Tutorials 50 : Multiplication Table ( গুণের নামতা )

import java.util.Scanner;

public class program35 {
 public static void main(String[] args) {
  System.out.println();

  Scanner input = new Scanner(System.in);
  int number;

  System.out.printf("Enter Any Number :  ");
  number = input.nextInt();
  
  for(int i = 1; i <= 10; i++){
   System.out.println(number+" x "+i +" = "+number*i);
  }
 }
}
