package day1014;
// 사용자로부터 입력을 받아서
// 번호: ### 번
// 이름: ###
// 국어: ### 점
// 영어: ### 점
// 수학: ### 점
// 총점: ### 점
// 평균: ##.## 점
// 의 형태로 출력되는 프로그램을 작성하시오.
// 단, 사용자로부터 입력받는 값의 순서는 위의 출력되는 순서와 같습니다.
// 11시까지
import java.util.Scanner;

public class Ex01GradeBook {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        
        //변수 선언 및 입력값받기
        System.out.println("번호를 입력하시오.");
        System.out.print("> ");
        int num = scanner.nextInt();
        
        System.out.println("이름를 입력하시오.");
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.println("국어점수를 입력하시오.");
        System.out.print("> ");
        int kor = scanner.nextInt();
        
        System.out.println("영어점수를 입력하시오.");
        System.out.print("> ");
        int eng = scanner.nextInt();
        
        System.out.println("수학점수를 입력하시오.");
        System.out.print("> ");
        int mat = scanner.nextInt();
        //출력하기
        System.out.println("번호: "+num+" 번");
        System.out.println("이름: "+name);
        System.out.println("국어: "+kor+" 점");
        System.out.println("영어: "+eng+" 점");
        System.out.println("수학: "+mat+" 점");
        System.out.println("총점: "+(kor+eng+mat)+" 점");
        System.out.println("평균: "+(kor+eng+mat)/3.0+" 점");
        
        scanner.close();
        
        
    }

}
