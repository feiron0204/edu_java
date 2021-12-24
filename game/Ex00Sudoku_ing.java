package game;
//스도쿠

//너도 이차원배열 배우고만들자
// 가로 세로 1~9까지 한구역당 1~9까지
// 랜덤하게 쫙뿌리고
// 30% 만 오픈해주자
// 나머지는 맞추기..

// 가능한가...

// 일단 문제만드는 메소드만들고

// 30% 랜덤지정<- 요거어케하지?
// 스위치넣어서 온오프?
// 난이도를넣자 level 1,2,3
// 3은 18개 공개 2는 36개 3은 

// 지정된거 공개<-요건또어케하지?
// 스위치 온인것들만 공개?
// 오프면 스페이스바

// 사용자입력
// 칸 입력
// 번호입력
// 가로세로 공간 1~9 안곂치는지만 확인<-요 메소드가 중요할듯
// 곂치는값있으면 불가!!!

// 수정하고싶으면 지우기도해야되네..
// 지우기메소드
// 지우기입력
// 칸입력
// 칸비워주기

// 게임종료는?
// 모든칸이채워지고 1~9 안곂치면 뭐...종료
//아마도 게임판모습 그리고 인덱스?

// | 1  2  3 | 4  5  6 | 7  8  9
//-+---------+---------+---------
//1|00 01 02 |03 04 05 |06 07 08            
//2|10 11 12 |13 14 15 |16 17 18         
//3|20 21 22 |23 24 25 |26 27 28    
//-+---------+---------+---------
//4|30 31 32 |33 34 35 |36 37 38    
//5|40 41 42 |43 44 45 |46 47 48    
//6|50 51 52 |53 54 55 |56 57 58    
//-+---------+---------+---------
//7|60 61 62 |63 64 65 |66 67 68       
//8|70 71 72 |73 74 75 |76 77 78       
//9|80 81 82 |83 84 85 |86 87 88
//
//구역당 특징
// 세로축
//j를 3으로나눴을때 몫이 0 나머지가 0,1,2 | j를3으로나눴을때 몫이 1 나머지가 0,1,2 | j를 3으로나눴을때 몫이 2 나머지가 0,1,2
//
// 가로축
//i를 3으로나눴을때 몫이 0 나머지가 0,1,2 | i를3으로나눴을때 몫이 1 나머지가 0,1,2 | i를 3으로나눴을때 몫이 2 나머지가 0,1,2
//   
//
//
//1 2 3
//4 5 6
//7 8 9
//
//
//1: i,j, 모두 3으로 나눴을때 몫이0, 나머지가 0,1,2
//2: i 3으로 나눴을때 몫이0, 나머지가 0,1,2  j 3으로 나눴을때 몫이1, 나머지가 0,1,2
//3: i 3으로 나눴을때 몫이0, 나머지가 0,1,2  j 3으로 나눴을때 몫이2, 나머지가 0,1,2
//4: i 3으로 나눴을때 몫이1, 나머지가 0,1,2  j 3으로 나눴을때 몫이0, 나머지가 0,1,2
//5: i,j, 모두 3으로 나눴을때 몫이1, 나머지가 0,1,2
//6: i 3으로 나눴을때 몫이1, 나머지가 0,1,2  j 3으로 나눴을때 몫이2, 나머지가 0,1,2
//7: i 3으로 나눴을때 몫이2, 나머지가 0,1,2  j 3으로 나눴을때 몫이0, 나머지가 0,1,2
//8: i 3으로 나눴을때 몫이2, 나머지가 0,1,2  j 3으로 나눴을때 몫이1, 나머지가 0,1,2
//9: i,j 모두 3으로 나눴을때 몫이2, 나머지가 0,1,2

//뭐든 중복나오면 바로 스위치 ture 리턴
import util.ArrayUtil;
import util.ScannerUtil;
import java.util.Random;
import java.util.Scanner;

public class Ex00Sudoku_ing {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    // 문제 만들어주는 메소드
    // 중복까지 걸러야한다
    private static int[][] table() {
        int[][] temp = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean sameSwitch = true;
                int count = 0;
                while (sameSwitch) {
                    int randomNum = random.nextInt(9) + 1;
                    if (!ArrayUtil.contains(temp[i], randomNum)) {
                        if (i == 0) {
                            temp[i][j] = randomNum;
                            sameSwitch = false;
                        }
                        boolean row = true;
                        for (int k = 0; k < i; k++) {
                            if (randomNum == temp[k][j]) {
                                row = false;

                            }
                        }
                        if (row) {
                            switch (i % 3) {
                            case 0:
                                switch (j % 3) {
                                case 0:
                                    if (randomNum != temp[i + 1][j] && randomNum != temp[i + 2][j]
                                            && randomNum != temp[i][j + 1] && randomNum != temp[i][j + 2]
                                            && randomNum != temp[i + 1][j + 1] && randomNum != temp[i + 1][j + 2]
                                            && randomNum != temp[i + 2][j + 1] && randomNum != temp[i + 2][j + 2]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                case 1:
                                    if (randomNum != temp[i][j - 1] && randomNum != temp[i][j + 1]
                                            && randomNum != temp[i + 1][j - 1] && randomNum != temp[i + 1][j]
                                            && randomNum != temp[i + 1][j + 1] && randomNum != temp[i + 2][j - 1]
                                            && randomNum != temp[i + 2][j] && randomNum != temp[i + 2][j + 1]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                case 2:
                                    if (randomNum != temp[i][j - 2] && randomNum != temp[i][j - 1]
                                            && randomNum != temp[i + 1][j - 2] && randomNum != temp[i + 1][j - 1]
                                            && randomNum != temp[i + 1][j] && randomNum != temp[i + 2][j - 2]
                                            && randomNum != temp[i + 2][j - 1] && randomNum != temp[i + 2][j]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                }
                                break;
                            case 1:
                                switch (j % 3) {
                                case 0:
                                    if (randomNum != temp[i - 1][j] && randomNum != temp[i - 1][j + 1]
                                            && randomNum != temp[i - 1][j + 2] && randomNum != temp[i][j + 1]
                                            && randomNum != temp[i][j + 2] && randomNum != temp[i + 1][j]
                                            && randomNum != temp[i + 1][j + 1] && randomNum != temp[i + 1][j + 2]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                case 1:
                                    if (randomNum != temp[i - 1][j - 1] && randomNum != temp[i - 1][j]
                                            && randomNum != temp[i - 1][j + 1] && randomNum != temp[i][j - 1]
                                            && randomNum != temp[i][j + 1] && randomNum != temp[i + 1][j - 1]
                                            && randomNum != temp[i + 1][j] && randomNum != temp[i + 1][j + 1]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                case 2:
                                    if (randomNum != temp[i - 1][j - 2] && randomNum != temp[i - 1][j - 1]
                                            && randomNum != temp[i - 1][j] && randomNum != temp[i][j - 2]
                                            && randomNum != temp[i][j - 1] && randomNum != temp[i + 1][j - 2]
                                            && randomNum != temp[i + 1][j - 1] && randomNum != temp[i + 1][j]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                }
                                break;
                            case 2:
                                switch (j % 3) {
                                case 0:
                                    if (randomNum != temp[i - 2][j] && randomNum != temp[i - 2][j + 1]
                                            && randomNum != temp[i - 2][j + 2] && randomNum != temp[i - 1][j]
                                            && randomNum != temp[i - 1][j + 1] && randomNum != temp[i - 1][j + 2]
                                            && randomNum != temp[i][j + 1] && randomNum != temp[i][j + 2]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                case 1:
                                    if (randomNum != temp[i - 2][j - 1] && randomNum != temp[i - 2][j]
                                            && randomNum != temp[i - 2][j + 1] && randomNum != temp[i - 1][j - 1]
                                            && randomNum != temp[i - 1][j] && randomNum != temp[i - 1][j + 1]
                                            && randomNum != temp[i][j - 1] && randomNum != temp[i][j + 1]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                case 2:
                                    if (randomNum != temp[i - 2][j - 2] && randomNum != temp[i - 2][j - 1]
                                            && randomNum != temp[i - 2][j] && randomNum != temp[i - 1][j - 2]
                                            && randomNum != temp[i - 1][j - 1] && randomNum != temp[i - 1][j]
                                            && randomNum != temp[i][j - 2] && randomNum != temp[i][j - 1]) {
                                        temp[i][j] = randomNum;
                                        sameSwitch = false;

                                    }
                                    break;
                                }
                                break;
                            }
                        }
                    }

                    count++;
                    if (count == 1000) {
                        break;
                    }
                }
                if (count == 1000) {
                    temp = new int[9][9];
                i = 0;
                j = -1;
                }
            }
        }

//        //중복제거해서 스위치 끄자
//        boolean sameSwitch=true;
//        while(sameSwitch) {
//            sameSwitch=false;
//            sameSwitch=same(temp);
//        }
        return temp;

    }

    // 중복 가려주는 메소드
//    private static boolean same(int[][] table) {
//        for(int i=0;i<9;i++) {
//            for(int j=0;j<9;j++) {
//                for(int k=0;k<9;k++) {
//                    if(table[i][j]==table[i][k]) {
//                        if(j!=k) {
//                            table[i][j]=random.nextInt(9)+1;
//                            return true;
//                        }
//                    }else if(table[i][j]==table[k][j]) {
//                        if(i!=k) {
//                            table[i][j]=random.nextInt(9)+1;
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
    // 이랬더니 하루 왼종일 걸림... 그냥 처음부터 넣어줄때 걸러서 넣어야할듯
//        return false;
//    }
    // 문제판 보여주는 메소드
    private static void showTable(int[][] table) {
        System.out.println("i|j1  2  3 | 4  5  6 | 7  8  9");
        System.out.println("-+---------+---------+---------");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < 9; j++) {
                if(table[i][j]==0) {
                    System.out.print("   ");
                }else {
                    System.out.print(" " + table[i][j] + " ");
                    
                }
                if (j % 3 == 2) {
                    System.out.print("|");
                }

            }
            System.out.println();
            if (i % 3 == 2) {
                System.out.println("-+---------+---------+---------");
            }
        }
    }
    // 난이도에 따라 테이블 숫자 지우는 메소드
    public static int[][] level(int[][] table,int level){
        
        if(level==1) {
            for(int n=0;n<27;n++) {
                int i=random.nextInt(9);
                int j=random.nextInt(9);
                table[i][j]=0;
                
            }
        }else if(level==2){
            for(int n=0;n<45;n++) {
                int i=random.nextInt(9);
                int j=random.nextInt(9);
                table[i][j]=0;
                
            }
        }else if(level==3) {
            for(int n=0;n<63;n++) {
                int i=random.nextInt(9);
                int j=random.nextInt(9);
                table[i][j]=0;
                
            }
        }
        
        return table;
    }
    //게임진행
    public static void gameStart() {
        
        // 입력하기
        
        // 초기화하기
        
        // 그만두기
        
    }
    public static void main(String[] args) {
        int[][] table = table();
        table=level(table,ScannerUtil.nextInt(scanner, "단계를 설정하세요(1~3 단계)",1,3));
        final int[][] questTable=table;
        int[][] playerTable = table;
        showTable(playerTable);
        boolean end=true;
        while(end) {
            // 게임진행 메소드 호출
            
            
            
            
            
            for(int i=0;i<9;i++) {
                for(int j=0;j<9;j++) {
                    if(playerTable[i][j]==0) {
                        end=false;
                    }
                }
            }
        }
        System.out.println("고생하셨습니다.");
    }

}
