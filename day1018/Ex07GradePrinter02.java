package day1018;
// 사용자로부터 점수를 입력받아서

// A, B, C, D, F 를 출력하는 프로그램
// 사용자가 점수를 입력할때마다
// 해당 점수가 무엇인지를 출력하게 코드를 작성하시오.
// 단, 사용자가 잘못된 점수을 입력하면
// 올바른 점수를 입력하게 코드를 작성하시오.

// 단, 사용자가 점수를 -1을 입력하면
// 프로그램이 종료되게 코드를 작성하시오
import java.util.Scanner;

public class Ex07GradePrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //상수설정
        final int SCORE_MAX = 100;
        final int SCORE_MIN = 0;
        final int GRADE_A = 90;
        final int GRADE_B = 80;
        final int GRADE_C = 70;
        final int GRADE_D = 60;
        final int END_CODE = -1;
        
        //무한루프~~
        while (true) {
            
            //값입력받기
            System.out.println("점수를 입력해주세요");
            System.out.print("> ");
            int score = scanner.nextInt();
            /*
             * score가 -1일경우 다시받는다에 넣지않고 맨마지막 때 -1인지만
             * 선별하면 코드가 더 깔끔
             */
            //엥? -1?
            if (score == END_CODE) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            //잘못된값일경우 다시받기
            while (!(score >= SCORE_MIN && score <= SCORE_MAX)) {
                System.out.println("다시 점수를 입력해주세요");
                System.out.print("> ");
                score = scanner.nextInt();
                
                //엥? -1?????
                //일단 다시받는 while 탈출
                if (score == END_CODE) 
                    break;
            }
            
            // 위에서 -1 받아왔으니 그대로 나가기
            if (score == END_CODE) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            //등급받기
            String result = "F";
            if (score >= GRADE_A) {
                result = "A";
            } else if (score >= GRADE_B) {
                result = "B";
            } else if (score >= GRADE_C) {
                result = "C";
            } else if (score >= GRADE_D) {
                result = "D";
            }
            
            //등급출력
            System.out.printf("당신의 등급은[%s] 입니다.\n", result);
        }
        scanner.close();
        
        
        /*강사님해답
         *  Scanner scanner = new Scanner(System.in);
         *  while(true){
         *   System.out.println("점수를 입력해주세요.");
         *   System.out.print("> ");
         *   int score = scanner.nextInt();
         *   
         *   while( score <-1 || score > 100){
         *   
         *    System.out.println("잘못 입력하셨습니다.");
         *    System.out.println("점수를 입력해주세요.");
         *    System.out.print("> ");
         *    score = scanner.nextInt();
         *    
         *   }
         *  
         *   if(score == -1){
         *   System.out.println("사용해주셔서 감사합니다.");
         *   break;
         *  } else if (score >= 90){
         *  System.out.println("A");
         *  }else if (score >= 80){
         *  System.out.println("B");
         *  }else if (score >= 70){
         *  System.out.println("C");
         *  }else if (score >= 60){
         *  System.out.println("D");
         *  }else{
         *   System.out.println("F");
         *  }
         *
         *  }
         *  
         *  
         *  scanner.close();
         */

    }

}
