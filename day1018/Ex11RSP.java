package day1018;
// 가위바위보 게임을 만들어보세요

// 해당 게임에는
// 1. 플레이 2. 기록보기 3. 종료
// 3가지 기능이 있습니다.

// 1. 플레이
//    사용자가 1. 가위 2. 바위 3. 보 중 하나를 선택하면
//    컴퓨터가 선택한 결과와 함께 출력해주고
//    승리, 패배, 무승부 중 하나의 값이 출력되도록 코드를 작성하시오
// 2. 기록 보기
//    ###승 ###무 ###패 (승률: ##.##%)
//    플레이기록없을경우 "아직 기록이 없습니다."

import java.util.Scanner;
import java.util.Random;

public class Ex11RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int RANGE_MAX = 3;
        final int RANGE_MIN = 1;
        final int PLAY_CODE = 1;
        final int LEADER_CODE = 2;
        final int EXIT_CODE = 3;

        System.out.println("가위! 바위! 보! 게임");

        int win = 0;
        int lose = 0;
        int draw = 0;

        while (true) {
            int userChoice;

            System.out.println("1. 플레이 2. 기록보기 3. 종료");
            System.out.print("> ");
            userChoice = scanner.nextInt();

            if (userChoice == PLAY_CODE) {

                int computerSet = random.nextInt(RANGE_MAX) + 1;
                System.out.println("무엇을 내실지 선택하세요!");
                System.out.println("1. 가위! 2. 바위! 3. 보!");
                System.out.print("> ");
                int userSet = scanner.nextInt();
                while (userSet > RANGE_MAX || userSet < RANGE_MIN) {
                    System.out.println("다시 내세요!!!!");
                    System.out.println("1. 가위! 2. 바위! 3. 보!");
                    System.out.print("> ");
                    userSet = scanner.nextInt();
                }
                if (userSet == 1) {
                    System.out.println("당 신 : 가위");
                    switch (computerSet) {
                    case 1:
                        System.out.println("컴퓨터 : 가위");
                        System.out.println("비겼습니다.");
                        draw++;
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 바위");
                        System.out.println("졌습니다.");
                        lose++;
                        break;
                    case 3:
                        System.out.println("컴퓨터 : 보");
                        System.out.println("이겼습니다.");
                        win++;
                        break;
                    }

                } else if (userSet == 2) {
                    System.out.println("당 신 : 바위");
                    switch (computerSet) {
                    case 1:
                        System.out.println("컴퓨터 : 가위");
                        System.out.println("이겼습니다.");
                        win++;
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 바위");
                        System.out.println("비겼습니다.");
                        draw++;
                        break;
                    case 3:
                        System.out.println("컴퓨터 : 보");
                        System.out.println("졌습니다.");
                        lose++;
                        break;
                    }
                } else if (userSet == 3) {
                    System.out.println("당 신 : 보");
                    switch (computerSet) {
                    case 1:
                        System.out.println("컴퓨터 : 가위");
                        System.out.println("졌습니다.");
                        lose++;
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 바위");
                        System.out.println("이겼습니다.");
                        win++;
                        break;
                    case 3:
                        System.out.println("컴퓨터 : 보");
                        System.out.println("비겼습니다.");
                        draw++;
                        break;
                    }

                }

            } else if (userChoice == LEADER_CODE) {
                int round = win + lose + draw;
                double winRate = (double) win / round * 100;
                if (round == 0) {
                    System.out.println("아직 기록이 없습니다.");
                } else {
                    System.out.printf("%3d승 %3d무 %3d패 (승률: %5.2f%%)\n", win, draw, lose, winRate);
                }

            } else if (userChoice == EXIT_CODE) {
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못된 접근입니다.");
            }
            System.out.println("-----------------------");

        }

        scanner.close();
    }

}
