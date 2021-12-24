package day1027;
// 5명의 정보를 관리하는 학생 관리프로그램을 작성하시오.

// 조건 1. 메인 메소드의 내부의 코드를 최소화시키시오
// 조건 2. 국어, 영어, 수학을 별개의 배열로 관리하는 것이 아니라
//        한개의 점수 배열로 관리되게 코드를 작성하시오(=즉 2차원 배열을 쓰시오)

import java.util.Scanner;
import util.ScannerUtil;
public class Ex02GradeBook {
    // 상수설정
    public static final int INPUT_CODE=1;
    public static final int PRINT_CODE=2;
    public static final int EXIT_CODE=3;
    public static final int SUBJECT_SIZE=3;
    public static final int STUDENT_SIZE=5;
    public static final int SCORE_MAX=100;
    public static final int SCORE_MIN=0;
    public static final int KOREAN_INDEX=0;
    public static final int ENGLISH_INDEX=1;
    public static final int MATH_INDEX=2;
    
    // 전역변수 설정
    public static Scanner scanner = new Scanner(System.in);
    public static int[] idArray=new int[STUDENT_SIZE];
    public static String[] nameArray=new String[STUDENT_SIZE];
    public static int[][] scoreArray=new int[STUDENT_SIZE][SUBJECT_SIZE];
    public static int index=0;
    
    //메뉴설정 화면
    public static void mainMenu() {
        String massage;
        while(true) {
            
            massage="1. 입력 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, massage, INPUT_CODE, EXIT_CODE);
            if(userChoice==INPUT_CODE) {
                inputScore();
            }else if(userChoice==PRINT_CODE) {
                printAll();
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    // 입력화면
    public static void inputScore() {
        if(index<STUDENT_SIZE) {
            
            String massage;
            massage="학생의 번호를 입력해주세요";
            idArray[index]=ScannerUtil.nextInt(scanner,massage);
            massage="학생의 이름를 입력해주세요";
            nameArray[index]=ScannerUtil.nextLine(scanner, massage);
            massage="학생의 국어점수를 입력해주세요";
            scoreArray[index][KOREAN_INDEX]=ScannerUtil.nextInt(scanner, massage,SCORE_MIN,SCORE_MAX);
            massage="학생의 영어점수를 입력해주세요";
            scoreArray[index][ENGLISH_INDEX]=ScannerUtil.nextInt(scanner, massage,SCORE_MIN,SCORE_MAX);
            massage="학생의 수학점수를 입력해주세요";
            scoreArray[index][MATH_INDEX]=ScannerUtil.nextInt(scanner, massage,SCORE_MIN,SCORE_MAX);
            index++;
        }else {
            System.out.println("더이상 입력하실수 없습니다.");
        }
        
    }
    //전체 출력화면
    public static void printAll() {
        if(index==0) {
            System.out.println("아직 입력정보가 없습니다.");
        }else {
            for(int i=0;i<index;i++) {
                printOne(i);
            }            
        }
    }
    //개별 출력화면
    public static void printOne(int i) {
        int sum=scoreArray[i][KOREAN_INDEX]+scoreArray[i][ENGLISH_INDEX]+scoreArray[i][MATH_INDEX];
        double average=(double)sum/SUBJECT_SIZE;
        System.out.printf("번호: %d 이름: %s \n",idArray[i],nameArray[i]);
        System.out.printf("국어: %03d 영어: %03d 수학: %03d\n", scoreArray[i][KOREAN_INDEX],scoreArray[i][ENGLISH_INDEX],scoreArray[i][MATH_INDEX]);
        System.out.printf("합계: %03d 평균: %06.2f\n", sum,average);
    }
    
    
    
    
    public static void main(String[] args) {
        mainMenu();
    }
}
