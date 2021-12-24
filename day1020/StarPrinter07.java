package day1020;

// 별찍기 7번
import java.util.Scanner;

public class StarPrinter07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 7번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        // 윗부분을 담당하는 i for문
        for (int i = 1; i <= userNumber-1; i++) {
            String stars="";
            
            for(int j=1; j<=i; j++) {
                stars+="*";    
            }
            
            System.out.println(stars);
        }
        // 아랫부분을 담당하는 i for문
        for (int i = 1; i <= userNumber; i++) {
            String stars="";
            
            for(int j = i;j<=userNumber;j++) {
                stars +="*";
            }
            System.out.println(stars);
        }

        scanner.close();
    }
}
