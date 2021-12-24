package day1020;

// 별찍기 5번
import java.util.Scanner;

public class StarPrinter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 5번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        for(int i=1; i<=userNumber;i++) {
            String stars="";
            // 공백을 담당하는 j for 문 하나
            for(int j =1; j<=userNumber-i;j++) {
                stars+=" ";
            }
            
            // 별을 담당하는 j for 문
            for(int j=1; j<=2*i-1;j++) {
                stars+="*";
            }
            System.out.println(stars);
            
        }
        scanner.close();
    }
}
