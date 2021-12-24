package day1018;
// 사용자로부터 번호, 이름, 국어, 수학 점수를 입력받아서

// 다음 형식에 맞추어 출력하는 프로그램을 작성하시오
// 출력해야하는 형식
// 번호: ###번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

// 조건1. 메뉴를 사용하여 
//       입력과 출력을 분리하시오
//      (힌트: 변수의 선언 위치)
// 조건2. 사용자가 국영수 점수를 입력할 때
//      잘못된 점수를 입력할 경우
//      다시 입력을 받도록 코드를 작성하시오

// 심화. 만약 사용자가 아무런 입력 없이 출력을 들어갈 때에는
//     "아직 입력된 정보가 없습니다" 가 출력되게 코드를 작성하시오

//1시20분까지
import java.util.Scanner;

public class Ex08GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 변수선언
        final int SCORE_MAX = 100;
        final int SCORE_MIN = 0;
        final int SUB_NUM = 3;
        final int INPUT_NUM = 1;
        final int OUTPUT_NUM = 2;
        final int EXIT_NUM = 3;
        int num = 0;
        String name = "홍길동";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sum = 0;
        double avg = 0;
        int inputCheck = 0;
        // 일단 무한루프돌려~~~
        while (true) {

            System.out.println("-사용하실 메뉴를 선택해주세요.-");
            System.out.print("1. 입력\n2. 출력\n3. 종료\n");
            System.out.print("> ");
            int menu = scanner.nextInt();

            if (menu == INPUT_NUM) {
                // 1. 입력메뉴
                System.out.println("번호를 입력해주세요.");
                System.out.print("> ");
                num = scanner.nextInt();
                
                System.out.println("이름를 입력해주세요.");
                System.out.print("> ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                System.out.println("국어점수를 입력해주세요.");
                System.out.print("> ");
                kor = scanner.nextInt();
                // 잘못입력했으면?
                while (kor > SCORE_MAX || kor < SCORE_MIN) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("국어점수를 다시 입력해주세요.");
                    System.out.print("> ");
                    kor = scanner.nextInt();
                }

                System.out.println("영어점수를 입력해주세요.");
                System.out.print("> ");
                eng = scanner.nextInt();
                // 잘좀입력해봐
                while (eng > SCORE_MAX || eng < SCORE_MIN) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("영어점수를 다시 입력해주세요.");
                    System.out.print("> ");
                    eng = scanner.nextInt();
                }
                
                System.out.println("수학점수를 입력해주세요.");
                System.out.print("> ");
                mat = scanner.nextInt();
                // 멍청앙...
                while (mat > SCORE_MAX || mat < SCORE_MIN) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("수학점수를 다시 입력해주세요.");
                    System.out.print("> ");
                    mat = scanner.nextInt();
                }
                // 입력값을 이용해서 총점 평균 계산
                sum = kor + eng + mat;
                avg = (double) sum / SUB_NUM;
                /*
                 * 인풋체크도 1,0아니라 boolean 쓰면 편안~
                 */
                inputCheck = 1;// 입력확인
/*
 * 합산과 평균같은경우 그냥 출력에서 선언해주고 계산해주면됨... 맨위에서 할필요 없음
 */
                System.out.println("\n모든 정보의입력이 완료되었습니다.");
                System.out.println("메인화면으로 돌아갑니다.\n");

            } else if (menu == OUTPUT_NUM) {
                if (inputCheck == 0) {
                    // 입력미실시의 경우
                    System.out.println("아직 입력된 정보가 없습니다.\n메인화면으로 돌아갑니다.\n");
                } else {
                    // 2. 출력메뉴
                    System.out.println("------------------------------------");
                    System.out.printf("번호: %d번 이름: %s\n", num, name);
                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, mat);
                    System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, avg);
                    System.out.println("\n출력이 완료되었습니다.\n메인화면으로 돌아갑니다.\n");
                }

            } else if (menu == EXIT_NUM) {
                // 3. 종료
                System.out.println("\n-프로그램이 종료됩니다-");
                System.out.println("사용해주셔서 감사합니다.");
                break;

            } else {
                // 메뉴에서1,2,3도 못누르넹
                System.out.println("잘못 입력하셨습니다.\n");
            }
        }
        /*강사님해답
         * final int SUBJECT_SIZE = 3;
         * final int SCORE_MIN = 0;
         * final int SCORE_MAX = 100;
         * 
         * Scanner scanner = new Scanner(System.in);
         * int id = 0;
         * String name = "";
         * int korean = 0;
         * int english = 0;
         * int math = 0;
         * 
         * boolean inputSwitch = false;
         * 
         * while(true){
         *  System.out.println("1. 입력 2. 출력 3. 종료");
         *  System.out.print("> ");
         *  
         *  int userChoice = scanner.nextInt();
         *  
         *  if(userChoice ==1){
         *   
         *   System.out.println("번호를 입력해주세요.");
         *   System.out.print("> ");
         *   id = scanner.nextInt();
         *   
         *   System.out.println("이름을 입력해주세요.");
         *   System.out.print("> ");
         *   scanner.nextLine();
         *   name = scanner.nextLine();
         *   
         *   System.out.println("국어 점수를 입력해주세요.");
         *   System.out.print("> ");
         *   korean = scanner.nextInt();
         *   while(korean <SCORE_MIN || korean>SCORE_MAX){
         *    System.out.println("잘못 입력하셨습니다.");
         *    System.out.println("국어 점수를 입력해주세요.");
         *    System.out.print("> ");
         *    korean = scanner.nextInt();
         *   }
         *   
         *   System.out.println("영어 점수를 입력해주세요.");
         *   System.out.print("> ");
         *   english = scanner.nextInt();
         *   while(english <SCORE_MIN || english>SCORE_MAX){
         *    System.out.println("잘못 입력하셨습니다.");
         *    System.out.println("영어 점수를 입력해주세요.");
         *    System.out.print("> ");
         *    english = scanner.nextInt();
         *   }
         *   
         *   System.out.println("수학 점수를 입력해주세요.");
         *   System.out.print("> ");
         *   math = scanner.nextInt();
         *   while(math <SCORE_MIN || math>SCORE_MAX){
         *    System.out.println("잘못 입력하셨습니다.");
         *    System.out.println("수학 점수를 입력해주세요.");
         *    System.out.print("> ");
         *    math = scanner.nextInt();
         *   }
         *   inputSwitch=true;
         *   
         *  }else if(userChoice==2){
         *   if(inputSwitch){
         *  //boolean값 안써도 초기점수 초기화를 
         *  //점수범위밖의숫자로 해두고 그걸로 판별도 가능
         *  //name.isEmpty()-> name에 한글자라도 있으면 false
         *    int sum = korean + english + math;
         *    double average = (double)sum/SUBJECT_SIZE;
         *   
         *    System.out.printf("번호: %d번 이름: %s\n",id,name);
         *    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",korean,english,math);
         *    System.out.printf("총점: %03d점 평균: %06.2f점\n",sum,average);
         *   }else{
         *   System.out.println("아직 입력된 정보가 없습니다.);
         *  }else if(userChoice==3){
         *  
         *   System.out.println("사용해주셔서 감사합니다.");
         *   break;
         *  }
         * 
         * }
         * 
         * 
         * scanner.close();
         */

        scanner.close();
    }

}
