package day1018;
// 무한루프를 사용한
// 메뉴 프로그램
import java.util.Scanner;
public class Ex06Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.println("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 입력 코드 실행
                
            }else if(userChoice ==2) {
                // 출력 코드 실행
                
            }else if(userChoice ==3) {
                // 종료 코드 실행
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
            
            
        }
        
        scanner.close();
    }
}
