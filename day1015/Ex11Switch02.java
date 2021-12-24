package day1015;
// 의도적으로 break를 생략해서
// 작성해야할 코드를 줄여보자

// 사용자로부터 월을 입력 받아서
// 해당 월의 마지막 날짜가 언제인지 출력해주는 프로그램
import java.util.Scanner;
public class Ex11Switch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("월을 입력해주세요.");
        System.out.print("> ");
        int month = scanner.nextInt();
        
        switch(month) {
        case 2:
            System.out.println("28일까지 입니다.");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("30일까지 입니다.");
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("31일까지입니다.");
            break;
                
        }
        
        
        
        scanner.close();
    }

}
