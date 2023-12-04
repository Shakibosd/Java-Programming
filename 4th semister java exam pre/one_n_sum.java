import java.util.Scanner;
public class one_n_sum{
    public static void main(String[] args){
        int sum=0, i, n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        for(i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
