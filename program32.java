
// Java Bangla Tutorials 47 : Series (part-1)

import java.util.Scanner;

public class program32 {
 public static void main(String[] args) {
   System.out.println("\n");

   
            Scanner input = new Scanner(System.in);
            int n,sum = 0;

            System.out.printf("Enter N Number :  ");
            n = input.nextInt();

            for(int i=1; i<=n; i++){
             System.out.printf(i+" ");
             sum = sum + i;
            }
            System.out.println();
            System.out.println("The Sum Is : "+sum);
 }
}
