
// Java Bangla Tutorials 26:  Leap Year 

import java.util.Scanner;

public class program18 {
      public static void main(String[] args){
         
            System.out.println("\n");
            
            Scanner input = new Scanner(System.in);
            int year;

            System.out.printf("Enter Any Year :  ");
            year = input.nextInt();

            if(year%12==0){
             System.out.println("Leap Year");
            }
            else{
             System.out.println("No Leap Year");
            }
      }   
}



