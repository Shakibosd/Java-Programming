import java.util.Scanner;
public class switch_case{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int mark = sc.nextInt();
            String grade;
            switch(mark / 10){
                case 10:
                case 9:
                case 8:
                    grade = "A+";
                    break;
                case 7:
                    grade = "A";
                    break;
                case 6:
                    grade = "B";
                    break;
                case 5:
                    grade = "D";
                    break;
                case 4:
                    grade = "E";
                    break;
                default:
                    grade = "F"; 
                    break;   
            }
            System.out.println(grade);
        }
    }
}
