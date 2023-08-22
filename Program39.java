
// Java Bangla Tutorials 57 : sum of digits (practical)

import java.util.Scanner;

public class Program39 {
 public static void main(String[] args) {
  System.out.println();

  int number, sum=0, r, temp;
  Scanner input = new Scanner(System.in);
  System.out.printf("Enter Any Number :  ");
  number = input.nextInt();

  temp = number;
  
  while(temp!=0){
   r = temp % 10;
   sum = sum + r;
   temp = temp / 10;
  }
  System.out.println("Sum Of Digit : "+sum);
 }
}
