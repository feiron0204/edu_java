package day1018;
// 컴퓨터가 1~100 사이의 랜덤한 숫자를 뽑으면

// 사용자가 그 숫자가 무엇인지 맞추는 게임

// 이 프로그램에는 플레이하기, 최고 기록 보기, 종료 3가지 기능이 있다.
// 1. 플레이하기
//    플레이하기의 경우, 매번 플레이할 때마다 컴퓨터가 1~100 사이의 숫자를
//    렌덤하게 뽑아주는데, 사용자는 그 숫자를 맞추면 된다.
//    만약 사용자가 입력한 숫자가 그 숫자보다 크면 "DOWN" 이 출력되고,
//    입력한 숫자가 컴퓨터 숫자보다 작으면 "UP" 이라고 출력 되서
//    사용자가 힌트를 얻을 수 있게 만들어준다.
//    점수의경우, 플레이를 처음 시작하면 1점이고, 입력할 때 마다 1점이 추가도니다.
//    사용자가 컴퓨터 점수를 맞추면
//    축하 메세지와 함께 몇번만에 맞췄는지 모여주고,
//    만약 새로운 최고기록이라면 최고기록이 경신 되었음을 알려주면 된다.

// 2. 최고 기록 보기
//    최고 기록같은 경우에는, 더 적은 점수가 최고 기록이 되는데
//    만약 한번도 플레이 하지 않았을 경우에는"아직 플레이 기록이 없습니다" 라는 메세지만 출력이 되어야 한다.

// 5시 10분까지
import java.util.Scanner;
import java.util.Random;

public class Ex10RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int NUM_RANGE = 100;
        final int PLAY_CODE = 1;
        final int LEADER_CODE = 2;
        final int EXIT_CODE = 3;
        final int ESCAPE_NUM = 0;
        boolean leaderBoardSwitch = false;
        int leaderBoard = 0;

        System.out.println("UP & DOWN 게임!!");
        while (true) {
            System.out.println("1. 플레이하기 2. 최고 기록보기 3. 종료");
            int userChoice = scanner.nextInt();
            if (userChoice == PLAY_CODE) {
                int score = 0;
                int hiddenNum = random.nextInt(NUM_RANGE) + 1;
                System.out.println("예상되는 값을 입력해주세요.");
                System.out.println("(게임을 포기하시려면 0을 입력하세요)");
                System.out.print("> ");
                int playerNum = scanner.nextInt();
                

                while (!(hiddenNum == playerNum) && playerNum != ESCAPE_NUM) {
                    while (playerNum > NUM_RANGE || playerNum < ESCAPE_NUM) {
                        System.out.printf("값의 범위는 1~%d입니다.\n", NUM_RANGE);
                        System.out.println("다시 입력해주세요.");
                        System.out.print("> ");
                        playerNum = scanner.nextInt();
                    }
                    if (hiddenNum > playerNum) {
                        System.out.println("UP입니다.");
                        score = score + 1;
                    }
                    if (hiddenNum < playerNum) {
                        System.out.println("DOWN입니다.");
                        score = score + 1;
                    }
                    System.out.println("다시 입력해주세요.");
                    System.out.print("> ");
                    playerNum = scanner.nextInt();

                    if (playerNum == ESCAPE_NUM) {
                        break;
                    }

                }
                if (playerNum != ESCAPE_NUM) {
                    score = score + 1;
                    System.out.printf("축하합니다!! 당신은 %d번으로 맞추셨습니다.\n", score);
                    if (leaderBoard==0) {
                        leaderBoard = score;
                    }else if(leaderBoard>score) {
                        leaderBoard = score;
                    }
                    
                    leaderBoardSwitch = true;
                    
                }

            } else if (userChoice == LEADER_CODE) {
                if (leaderBoardSwitch) {
                    System.out.printf("현재 최고기록: %d회\n", leaderBoard);
                } else {
                    System.out.println("아직 플레이 기록이 없습니다.");
                }

            } else if (userChoice == EXIT_CODE) {
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력해 주세요");
            }

        }
        /*강사님해답
         * final int NUMBER_MIN=1;
         * final int NUMBER_MAX=100;
         * 
         * Scanner scanner = Scanner(System.in);
         * Random random = new Random();
         * int bestScore=0;
         * 
         * while(true){
         *  System.out.println("1. 플레이하기 2. 기록보기 3. 종료");
         *  System.out.print("> ");
         *  int userChoice = scanner.nextInt();
         *  
         *  if(userChoice==1){
         *  
         *  // 플레이 구현
         *  // 1. 컴퓨터 숫자 지정
         *  int computerNumber = random.nextInt(NUMBER_MAX)+1;
         *  // 2. 현재 정수 초기화
         *  int currentScore = 1;
         *  // 3. 사용자로부터 입력
         *  //    매번 입력마다, 현재 정수 1증가 포함
         *  System.out.println("1~100 사이의 숫자를 입력해주세요.");
         *  System.out.print("> ");
         *  int userNumber = scanner.nextInt();
         *  
         *   while(userNumber < NUMBER_MIN || userNumber > NUMBER_MAX){
         *   System.out.println("잘못입력하셨습니다.");
         *   System.out.println("1~100 사이의 숫자를 입력해주세요.");
         *   System.out.print("> ");
         *   }
         *   
         *   while(userNumber != computerNumber){
         *   
         *   if(userNumber > computerNumber){
         *   System.out.println("DOWN");
         *   }else{
         *   System.out.println("UP");
         *   }
         *   System.out.println("1~100 사이의 숫자를 입력해주세요.");
         *   System.out.println("> ");
         *   userNumber = scanner.nextInt();
         *   
         *   while(userNumber<NUMBER_MIN||userNumber>NUMBER_MAX){
         *   System.out.println("잘못입력하셧씁니다.");
         *   System.out.println("1~100사이의 숫자를 입력해주세요.");
         *   System.out.print("> ");
         *   userNumber = scanner.nextInt();
         *   }
         *   currentScore++;
         *   }
         *  // 4. 플레이 결과 출력
         *  System.out.println("짝짝짝! 정답입니다!");
         *  System.out.println("사용자의 입력 횟수: "+currentScore);
         *  
         *  if(bestScore > 0){
         *  System.out.println("기존 최고 기록: " + bestScore);
         *  }
         *  // 5. 최고기록과 비교
         *  if(currentScore < bestScore||bestScore==0){
         *  System.out.println("짝짝짝! 새로운 최고 기록입니다!");
         *  bestScore=currentScore;
         *  }
         *  }else if(userChoice==2){
         *   if(bestScore >0){
         *    System.out.println("현재 최고 기록: "+bestScore+"회");
         *   }else{
         *    System.out.println("아직 플레이 기록이 존재하지 않습니다.");
         *   }
         *  }else if(userChoice==3){
         *   System.out.println("플레이해주셔서 감사합니다.");
         *   break;
         *  }
         *  
         * }
         * 
         * scanner.close();
         */

        scanner.close();
    }

}
