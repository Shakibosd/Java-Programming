import java.util.Scanner;
public class celsius_fahrenheit{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            double cen = input.nextDouble();
            double far = (cen*9/5)+32;
            System.out.println(far);
        }
    }
}