
// Java Bangla Tutorials 28 : Logical Operator (part-2)
import java.util.Scanner;
public class program21 {
   public static void main(String[] args) {
       System.out.println("\n");

       Scanner input = new Scanner(System.in);
       char ch;

       System.out.printf("Enter Any Letter :  ");
       ch = input.next().charAt(0);
       
       if(ch>='a' && ch<='z'){
        System.out.println("Small Letter");
       }
       else if(ch>='A' && ch<='Z'){
        System.out.println("Capital Letter");
       }
       else{
        System.out.println("Not A Letter");
       }
       
   }
}
