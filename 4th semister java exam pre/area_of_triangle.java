//area of rectengle
import java.util.Scanner;
public class area_of_triangle{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int area = a * b;
            System.out.println(area);
        }
    }
}