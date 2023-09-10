// Java Bangla Tutorials 70 : Introduction to Array

public class program43 {
 public static void main(String[] args) {
  System.out.println();

  int[] number = new int[6];
  
  number[0] = 10;
  number[1] = 20;
  number[2] = 30;
  number[3] = 40;
  number[4] = 50;
  number[5] = 60;
  
  System.out.println("Number Two Index Value = "+number[2]);

  int len = number.length;
  System.out.println("Array Length = "+len);

  int sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5];
  System.out.println("Addition = "+sum);

  int sum1 = number[0] * number[1] * number[2] * number[3] * number[4] * number[5];
  System.out.println("Multiplaction = "+sum1);
 }
}
