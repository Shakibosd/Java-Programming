
// Java Bangla Tutorials 19 : Temperature Converter

import java.util.Scanner;

public class program11 {
      public static void main(String[] args){
         
            System.out.println("\n");

            Scanner input = new Scanner(System.in);
            double cels,farn;

            System.out.printf("Fahrenheit = ");
            farn = input.nextDouble();

            cels = 0.5555555556 * (farn - 32);
            System.out.println("Celsius = "+cels);
      }   
}





