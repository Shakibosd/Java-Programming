import java.util.Scanner;
public class two_num_sum{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int addition = a + b;
            System.out.println(addition);
        }
    }
}