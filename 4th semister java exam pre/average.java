import java.util.Scanner;
public class average{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int ave = (a+b+c)/3;
            System.out.println(ave);
        }
    }
}