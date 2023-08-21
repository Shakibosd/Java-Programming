
// Java Bangla Tutorials 51 : Prime Number মৌলিক সংখ্যা | part-1

import java.util.Scanner;

public class program36 {
 public static void main(String[] args) {
  System.out.println();

  Scanner input = new Scanner(System.in);
  System.out.printf("Enter Any Positive Integer :  ");
  int num = input.nextInt();

  int count = 0;

  for(int i = 2; i < num; i++){
   if(num%i == 0){
     count++;
     break;
   }

  }
  
  if(count==0){
   System.out.println(num+" = Prime Number");
  }
  else{
    System.out.println(num+" = Not Prime");
  }

 }
}
