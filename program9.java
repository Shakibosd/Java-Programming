//Java Bangla Tutorials 18 : Area of triangle and circle

import java.util.Scanner;

public class program9 {
 public static void main(String[] args){
    
       System.out.println("\n");

       Scanner input = new Scanner(System.in);
       double radius,area;

       System.out.printf("Enter radius : ");
       radius = input.nextDouble();

       area = 3.1416 * radius * radius;
       System.out.println("Area Of Circle : "+area);
 }
 
}