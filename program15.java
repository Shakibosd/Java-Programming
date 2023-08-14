
// Java Bangla Tutorials 26 : Checking Vowel/Consonant

import java.util.Scanner;

public class program15 {
      public static void main(String[] args){
         
            System.out.println("\n");

            Scanner input = new Scanner(System.in);
            char ch;

            System.out.printf("Enter Any Letter :  ");
            ch = input.next().charAt(0); 

            if(ch == 'a'){
             System.out.println("Vowel");
            }
            else if(ch == 'e'){
             System.out.println("Vowel");
            }
            else if(ch == 'i'){
             System.out.println("Vowel");
            }
            else if(ch == 'o'){
             System.out.println("Vowel");
            }
            else if(ch == 'u'){
             System.out.println("Vowel");
            }
            else{
             System.out.println("Consonent");
            }
      }   
}

