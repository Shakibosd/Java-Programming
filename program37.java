
// Java Bangla Tutorials 53 : Prime Numbers from m to n

import java.util.Scanner;

public class program37 {
 public static void main(String[] args) {
  System.out.println();
   int m, n, count=0;

    Scanner input = new Scanner(System.in);
    System.out.printf("Enter Initial Number :  ");
    m = input.nextInt();

    System.out.printf("Enter Final Number :  ");
    n = input.nextInt();

    for(int i=m; i<=n; i++){
     for(int j=2; j<=i-1; j++){
      if(i%j==0){
       count++;
       break;
      }
     }
     if(count==0)
       System.out.println(i);
     count=0;
    }
 }
}
