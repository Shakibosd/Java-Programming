// import java.util.Scanner;
// public class palindrome{
//    public static void main(String []args){
//       Scanner sc = new Scanner(System.in);
//       int num, sum=0, r, tmp;
//       num = sc.nextInt();
//       tmp = num;
//       while(tmp!=0){
//         r = tmp % 10;
//         sum = sum * 10 + r;
//         tmp = tmp / 10;
//       }
//       if(sum==num){
//         System.out.println("Palindrome");
//       }
//       else{
//         System.out.println("Not Palindrome");
//       }
//    }
// }

import java.util.Scanner;
public class palindrome {
   public static void main(String []args) {
      try (Scanner sc = new Scanner(System.in)) {
        int sum=0, tmp, r, num;
          num = sc.nextInt();
          tmp = num;
          while (tmp!=0) {
            r = tmp % 10;
            sum = sum * 10 + r;
            tmp = tmp / 10;
          }
          if(sum==num){
            System.out.println("Palindrome");
          }
          else{
            System.out.println("Not Palindrome");
          }
    }
   }
}