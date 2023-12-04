

import java.util.Scanner;

public class fibonacci {
   public static void main(String []args) {
      try (Scanner sc = new Scanner(System.in)) {
        int n, first = 0, second = 1, fibo, cnt = 0;
          n = sc.nextInt();
          while(cnt<n){
            if(cnt<=1){
                fibo = cnt;
            }
            else{
                fibo = first + second;
                first = second;
                second = fibo;
            }
            System.out.print(" "+fibo);
            cnt++;
          }
    }
   }
}