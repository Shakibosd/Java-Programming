//Java Bangla Tutorials 54 : Fibonacci series | 0 1 1 2 3 5 ... n

import java.util.Scanner;

public class program38 {
  public static void main(String[] args) {
    System.out.println();
    int n, first=0, second=1, fibo;

    Scanner input = new Scanner(System.in);
    System.out.printf("How Many Number :  ");
    n = input.nextInt();

    System.out.printf(first+" "+second);
    for(int i=3; i<=n; i++){
     
      fibo = first + second;
      System.out.print(" "+fibo);

      first = second;
      second = fibo;
    }
    System.out.println(" ");
  }
}
