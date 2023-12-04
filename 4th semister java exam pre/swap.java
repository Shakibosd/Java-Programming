import java.util.Scanner;
public class swap{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int tmp;
            tmp = a;
            a=b;
            b=tmp;
            System.out.print(a);
            System.out.print(" "+b);
        }
    }
}