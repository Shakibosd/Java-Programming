import java.util.Scanner;
public class leap_year{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int year = input.nextInt();
            if(year%400==0){
                System.out.println("Leap Year");
            }
            else if(year%4==0 && year%100!=0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap Year");
            }
        }
    }
}