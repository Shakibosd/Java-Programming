
// Java Bangla Tutorials 26:  Pass/Fail

import java.util.Scanner;

public class program19 {
      public static void main(String[] args){
         
            System.out.println("\n");

            Scanner input = new Scanner(System.in);
            int mark;

            System.out.printf("Enter Any Number :  ");
            mark = input.nextInt();

            if(mark>=33){
               System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }

      }   
}

