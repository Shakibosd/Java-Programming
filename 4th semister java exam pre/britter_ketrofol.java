import java.util.Scanner;
public class britter_ketrofol{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            double area = Math.PI*r*r;
            System.out.println(area);
        }
    }
}
