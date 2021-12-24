package day1018;
// 사용자로부터 점수를 입력받아서

// 90이상: A
// 80~89: B
// 70~79: C
// 60~69: D
// 그외: F가 출력되는 프로그램을 작성하시오
// 단, 사용자가 유효하지 않은 점수를 입력하면,
// 올바른 점수가 입력될때까지 다시 입력을 받으시오
// 10시 20분 까지

import java.util.Scanner;

public class Ex03GradePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력해 주세요: ");
        int score = scanner.nextInt();

        while (score < 0 || score > 100) {
            System.out.print("잘못된 입력입니다. 다시 점수를 입력해 주세요: ");
            score = scanner.nextInt();
        }
        
        if(score >=90) {
            System.out.println("A 입니다.");
        }else if(score >=80) {
            System.out.println("B 입니다.");
        }else if(score >=70) {
            System.out.println("C 입니다.");
        }else if(score >=60) {
            System.out.println("D 입니다.");
        }else {
            System.out.println("F 입니다.");
        }

        scanner.close();
        /*강사님해답
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("점수를 입력해주세요.");
         * System.out.print("> ");
         * 
         * int score = scanner.nextInt();
         * 
         * while( !( score >= 0 && score <= 100) ) {
         *  System.out.println("잘못 입력하셨습니다.");
         *  System.out.println("점수를 입력해주세요.");
         *  System.out.print("> ");
         *  score = scanner.nextInt();
         * } 
         * 
         * 
         * if(score >= 90){
         *  System.out.println("A");
         * } else if(score >= 80){
         *  System.out.println("B");
         * } else if(score >= 70){
         *  System.out.println("C");
         * } else if(score >= 60){
         *  System.out.println("D");
         * } else {
         *  System.out.println("F");
         * }
         * 
         * 
         * 
         * scanner.close();
         */

   
    }

}
