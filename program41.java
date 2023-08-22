//Java Bangla Tutorials 60 : Palindrome number (Theory)

import java.util.Scanner;
public class program41 {
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
   if(number==sum){
     System.out.println("Palindrome");
   }
   else{
    System.out.println("Not Palindrome");
   }
 }
}

