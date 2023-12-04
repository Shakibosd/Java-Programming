import java.util.Scanner;
public class prime {
   public static void main(String []args) {
      try (Scanner sc = new Scanner(System.in)) {
        int num, cnt=0;
          num = sc.nextInt();
          for(int i=2; i<num; i++){
            if(num%i==0){
                cnt++;
                break;
            }
          }
          if(cnt==0){
             System.out.println("Prime");
          }
          else{
             System.out.println("Not Prime");
          }
    }
   }
}
