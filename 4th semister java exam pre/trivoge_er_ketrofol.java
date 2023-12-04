// public class trivoge_er_ketrofol{
//     public static void main(String[] args) {
//         int a = 100, b = 100, c = 100;
//         if(((a+b)>c) && ((b+c)>a) && ((c+a)>b)){
//             int s = (a+b+c)/2;
//             double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//             System.out.println(area);
//         }
//         else{
//             System.out.println("Triangle Is Not Posible");
//         }
//     }
// }


public class trivoge_er_ketrofol {
   public static void main(String []args) {
      int a = 10, b = 10, c = 10;
      if(((a+b)>c) && ((b+c)>a) && ((c+a)>b)){
        int s = (a+b+c)/2;
        double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
      }
      else{
        System.out.println("Triangle Is Not Posible");
      }
   }
}