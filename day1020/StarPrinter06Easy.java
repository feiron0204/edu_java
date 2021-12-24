package day1020;

// 별찍기 6번
import java.util.Scanner;

public class StarPrinter06Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("별찍기 6번");
        System.out.println("------------------------------------\n");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
//5번에서 i만 5,4,3,2,1 로 바꿔주면 6됨 짜잔
        for(int i=userNumber; i>=1;i--) {
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
