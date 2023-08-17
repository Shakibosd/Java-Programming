// Java Bangla Tutorials 46 : print Even number from m to n

import java.util.Scanner;

public class program31 {
 public static void main(String[] args){
    
       System.out.println("\n");
       
       /*
       int sum = 0;

       for(int i = 1; i <= 10; i++){
         sum = sum + i;
       }
       System.out.println("The Sum Is = "+sum);*/

       
       Scanner input = new Scanner(System.in);
       int m,n;
       int sum = 0;

       System.out.printf("Enter Initial Number :  ");
       m = input.nextInt();

       
       System.out.printf("Enter Final Number :  ");
       n = input.nextInt();

       for(int i = m; i <= n; i++){
         sum = sum + i;
       }
       System.out.println("The Sum Is : "+sum);
 }   
}
