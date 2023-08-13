//Java Bangla Tutorials 18 : Area of triangle and circle

import java.util.Scanner;

public class program8 {
 public static void main(String[] args){
    
       System.out.println("\n");

       Scanner input = new Scanner(System.in);
       double base, height,area;

       System.out.printf("Enter base : ");
       base = input.nextDouble();
       
       System.out.printf("Enter hight : ");
       height = input.nextDouble();

       area = 0.5 * base * height;
      System.out.println("Area Of Triangle : "+area);
 }
 
}