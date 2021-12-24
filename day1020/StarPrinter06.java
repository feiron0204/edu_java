package day1020;

// 별찍기 6번
import java.util.Scanner;

public class StarPrinter06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 6번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        for(int i=1; i<=userNumber;i++) {
            String stars="";
            // 공백을 담당하는 j for 문
            for(int j=1; j<=i-1;j++) {
                stars += " ";
            }
            // 별을 담당하는 j for 문
            for(int j=1;j<=2*userNumber+1-2*i;j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }

        scanner.close();
    }
}
