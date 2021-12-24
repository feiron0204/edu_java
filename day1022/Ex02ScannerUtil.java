package day1022;
import java.util.Scanner;
import util.ScannerUtil;
public class Ex02ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "1. 입력 2. 출력 3. 종료";
        
        int userChoice=ScannerUtil.nextInt(scanner, message);
        
        message= "1부터 5 사이의 값을 넣어주세요.";
        userChoice = ScannerUtil.nextInt(scanner, message, 1, 5);
        
        System.out.println(userChoice);
        
        scanner.close();
    }

}
