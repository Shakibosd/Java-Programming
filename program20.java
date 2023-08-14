
// Java Bangla Tutorials 27 : Logical Operator (part-1)

import java.util.Scanner;
public class program20 {
      public static void main(String[] args){
         
            System.out.println("\n");

             Scanner input = new Scanner(System.in);
             char ch;

            System.out.printf("Enter Any Letter :  ");
            ch = input.next().charAt(0); 

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
             System.out.println("Vowel");
            }
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
             System.out.println("Vowel");
            }
            else{
             System.out.println("Consonent");
            }
      }   
}