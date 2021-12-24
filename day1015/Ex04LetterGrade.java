package day1015;
// 사용자로부터 점수를 입력받아서
// 90~ : A
// 80~ : B
// 70~ : C
// 60~ : D
// 그외 : F

// 가 출력되는 프로그램을 작성하시오
// 12시 15분까지
import java.util.Scanner;
public class Ex04LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //변수 입력받기
        System.out.print("점수를 입력하시오: ");
        int score = scanner.nextInt();
        //점수분류
        if(score>=90) {
            System.out.println("A 입니다.");
        }else if(score>=80) {
            System.out.println("B 입니다.");
        }else if(score>=70) {
            System.out.println("C 입니다.");
        }else if(score>=60) {
            System.out.println("D 입니다.");
        }else {
            System.out.println("F 입니다.");
        }
        
        
        scanner.close();
    }
}
