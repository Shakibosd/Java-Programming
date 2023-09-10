
// Java Bangla Tutorials 71 : Array ( finding sum and average )

import java.util.Scanner;

public class program44 {
      public static void main(String[] args){
       System.out.println();
       Scanner input = new Scanner(System.in);

       double sum = 0;
       double[] number = new double[5];
       System.out.printf("Enter Five Number : ");

       for(int i = 0; i < number.length; i++){
        number[i] = input.nextDouble();
       }
       for(int i = 0; i < number.length; i++){
        sum = sum + number[i];
       }

       System.out.println("The Sum Is : "+sum);
       System.out.println("The Average Is : "+sum/5);
      }   
}

