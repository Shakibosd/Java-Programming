import java.util.Scanner;
public class digat_somikoron{
   public static void main(String []args){
      try (Scanner sc = new Scanner(System.in)){
        double a, b, c, d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = ((b*b)-(4*a*c));
        if(d>0){
          double r1 = (-b+Math.sqrt(d)/2*a);
          double r2 = (-b+Math.sqrt(d)/2*a);
          System.out.println(r1);
          System.out.println(r2);
        }
        else if(d==0){
          double r = (-b/(2*a));
          System.out.println("The Root Are : "+r);
        }
        else{
          System.out.println("The Root Are Not Posible");
        }
      }
   }
}
