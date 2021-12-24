package game;
// 컴퓨터가 설정한 배열을 맞추는게임
// 4자리수로 일단은하자
// 숫자는 같고 자리만다르다? 1ball
// 숫자와 자리가 모두 같다? 1strike
// 다맞으면 homerun~~~ 
// 정답 및 입력횟수 공개, 최고점 공개
// 입력횟수가 적을수록 최고점
import java.util.Scanner;
import java.util.Random;

public class Ex00BaseBallGame {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner = new Scanner(System.in);
        final int PLAY_CODE=1;
        final int HIGHSCORE_CODE=2;
        final int EXIT_CODE=3;
        final int NUMBER_SIZE=4;
        final int NUMBER_MIN=0;
        final int NUMBER_MAX=9;
        
        System.out.println("-------BaseBallGame-------");
        int highScore=0;
        
        while(true) {
            System.out.println("1. 게임하기 2. 최고점수보기 3. 종료");
            System.out.print("> ");
            int selectManu=scanner.nextInt();
            
            if(selectManu==PLAY_CODE) {
                //게임시작!!!
                int score=0;
                // 컴퓨터가 중복없는 4자리 만든다
                int[] computerNum=new int[NUMBER_SIZE];
                for(int i=0;i<NUMBER_SIZE;i++) {
                    computerNum[i]=random.nextInt(10);
                }
                // 중복제거
                boolean sameNumSwitch=true;
                while(sameNumSwitch) {
                    sameNumSwitch=false;
                    for(int i=0;i<computerNum.length;i++) {
                        for(int j=i+1;j<computerNum.length;j++) {
                            if(computerNum[i]==computerNum[j]) {
                                computerNum[i]=random.nextInt(NUMBER_SIZE);
                                sameNumSwitch=true;
                            }
                        }
                    }
                    if(computerNum[0]==0) {
                        computerNum[0]=random.nextInt(NUMBER_SIZE);
                        sameNumSwitch=true;
                    }
                    
                }
               // 테스트용 오픈북
               // System.out.printf("%d%d%d%d\n",computerNum[0],computerNum[1],computerNum[2],computerNum[3]);
                
               
                
                // 이제 맞을때까지 돌려~~~
                while(true) {
                    // 4자리 입력 받아보자
                    int[] playerNum=new int[NUMBER_SIZE];
                    //중복된 숫자 입력? 다시입력해
                    boolean playerNumSwitch2=true;
                    while(playerNumSwitch2) {
                        playerNumSwitch2=false;
//                        for(int i=0;i<playerNum.length;i++) {
//                            System.out.println((i+1)+"번째 자리 숫자를 예상해주세요");
//                            playerNum[i]=scanner.nextInt();
//                        }
                        System.out.println("4자리 숫자를 예상해주세요.");
                        System.out.print("> ");
                        int player4Num=scanner.nextInt();
                        playerNum[0]=player4Num/1000;
                        player4Num=player4Num-playerNum[0]*1000;
                        playerNum[1]=player4Num/100;
                        player4Num=player4Num-playerNum[1]*100;
                        playerNum[2]=player4Num/10;
                        
                        playerNum[3]=player4Num%10;
                        
                        for(int i=0;i<playerNum.length;i++) {
                            for(int j=i+1;j<playerNum.length;j++) {
                                if(playerNum[i]==playerNum[j]) {
                                    playerNumSwitch2=true;
                                }
                            }
                            if(playerNum[i]<NUMBER_MIN||playerNum[i]>NUMBER_MAX) {
                                playerNumSwitch2=true;
                            }   
                        }
                        
                        if(playerNumSwitch2) {
                            System.out.println("범위를 초과하였거나 중복 숫자가 있습니다.\n 다시 입력해 주세요.");
                        }
                        
                    }
                    score++;
                    // 헐 다맞음? 그럼 횟수랑 최고기록이랑 정답공개!
                    if(playerNum[1]==computerNum[1]&&playerNum[2]==computerNum[2]&&playerNum[3]==computerNum[3]&&playerNum[0]==computerNum[0]) {
                        System.out.println("!!!축하합니다!!!홈런!!!");
                        System.out.println("사용자가 예상한 수: "+playerNum[0]+playerNum[1]+playerNum[2]+playerNum[3]);
                        System.out.println("컴퓨터가 골랐던 수: "+computerNum[0]+computerNum[1]+computerNum[2]+computerNum[3]);
                        System.out.println("시도 횟수: "+score);
                        if(highScore!=0) {
                            if(score<highScore) {
                                System.out.println("최고기록을 경신하셧습니다!! 기존기록: "+highScore);
                                highScore=score;
                            }else {
                                System.out.println("현재 최고기록은 "+highScore+"입니다.");
                            }
                        }else {
                            highScore=score;
                        }
                        break;
                    }else {
                        //비교 드가자~~
                        int ball=0;
                        int strike=0;
                        
                        for(int i=0;i<NUMBER_SIZE;i++) {
                            if(computerNum[i]==playerNum[i]) {
                                strike++;
                            }
                        }
                        
                        for(int i=0;i<NUMBER_SIZE;i++) {
                            for(int j=0;j<NUMBER_SIZE;j++) {
                                if(computerNum[i]==playerNum[j]) {
                                    if(i!=j) {
                                        ball++;
                                    }
                                }
                            }
                        }
                        
                        System.out.printf("사용자가 예상한 숫자 :%d%d%d%d\n",playerNum[0],playerNum[1],playerNum[2],playerNum[3]);
                        System.out.printf("%d strike %d ball 입니다.\n",strike,ball);
                        
                        
                        
                        
                    }
                }
            }else if(selectManu==HIGHSCORE_CODE) {
                // 최고점수는?
                if(highScore==0) {
                    // 최고점수가 0이다? 아직 실행 안됬네이거
                    System.out.println("아직 점수 결과가 없습니다.");
                }else {
                    System.out.println("최단횟수는 "+highScore+"회 입니다.");
                }
                    
                
            }else if(selectManu==EXIT_CODE) {
                System.out.println("게임해주셔서 감사합니다!");
                break;
            }else {
                System.out.println("다시 입력해주세요.");
                System.out.print("> ");
                selectManu=scanner.nextInt();
            }
        }
        scanner.close();
    }

}
