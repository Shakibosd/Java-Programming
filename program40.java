
// Java Bangla Tutorials 58 : How To Reverse A Number (Theory)

import java.util.Scanner;

public class program40 {
 public static void main(String[] args) {
  System.out.println();

  int number, sum=0, r, temp;
  Scanner input = new Scanner(System.in);
  System.out.printf("Enter Any Number :  ");
  number = input.nextInt();

  temp = number;
  
  while(temp!=0){
   r = temp % 10;
   sum = sum * 10 + r;
   temp = temp / 10;
  }
  System.out.println("Revers Number =  : "+sum);
 }
}
