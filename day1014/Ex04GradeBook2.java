package day1014;
// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 점수를 입력받아서
// 다음과 같은 양식으로 출력되게 코드를 작성하시오

// 결과)
// 번호 : ##번 이름 : ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

//3시 10분까지

import java.util.Scanner;

public class Ex04GradeBook2 {
    public static void main(String[] args) {
        // 상수
        // 1. 과목의 갯수
        final int SUBJECT_SIZE=3;
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        // 입력받기
        System.out.println("번호를 입력해주세요");
        System.out.print("> ");
        int num = scanner.nextInt();
        System.out.println("이름를 입력해주세요");
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("국어점수를 입력해주세요");
        System.out.print("> ");
        int kor = scanner.nextInt();
        System.out.println("영어점수를 입력해주세요");
        System.out.print("> ");
        int eng = scanner.nextInt();
        System.out.println("수학점수를 입력해주세요");
        System.out.print("> ");
        int mat = scanner.nextInt();
        
        // 총점, 평균계산
        int sum = kor+eng+mat;
        /*
         * double avg = (double)sum/3;
         * 매직넘버 3...
         * 프로그램입장에선 왜나왔는지 모름
         * 
         * 이런경우를 하드 코딩이라하고
         * 아래경우를 소프트 코딩이라고 함.<-유지보수가 쉬움
         */
        double avg = (double)sum/SUBJECT_SIZE;
        
        // 출력하기
        System.out.println("결과)");
        System.out.printf("번호: %d번 이름: %s\n",num,name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, mat);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, avg);
        
       
        
        
        scanner.close();
        
    }

}
