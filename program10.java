
// Java Bangla Tutorials 19 : Temperature Converter

import java.util.Scanner;

public class program10 {
      public static void main(String[] args){
         
            System.out.println("\n");

            Scanner input = new Scanner(System.in);
            double cels,farn;

            System.out.printf("Celsius = ");
            cels = input.nextDouble();

            farn = 1.8 * cels + 32;
            System.out.println("Fahrenheit = "+farn);
      }   
}





