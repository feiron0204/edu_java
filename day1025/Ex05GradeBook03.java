package day1025;
// 전역 변수를 사용한 학생관리 프로그램

import java.util.Scanner;
import util.ScannerUtil;
public class Ex05GradeBook03 {
    // 전역 상수
    public static final int SUBJECT_SIZE=3;
    public static final int STUDENT_SIZE=5;
    public static final int SCORE_MIN=0;
    public static final int SCORE_MAX=100;
    
    // 전역 변수
    public static Scanner scanner = new Scanner(System.in);
    public static int[] idArray = new int[STUDENT_SIZE];
    public static String[] nameArray = new String[STUDENT_SIZE];
    public static int[] koreanArray = new int[STUDENT_SIZE];
    public static int[] englishArray = new int[STUDENT_SIZE];
    public static int[] mathArray = new int[STUDENT_SIZE];
    public static int nextIndex=0;
    
    // 입력을 담당하는 메소드
    public static void insert() {
        if(nextIndex<STUDENT_SIZE) {
            // 아직 배열에 빈 칸이 존재하므로
            // 입력가능
            String message;
            
            message = "번호를 입력해주세요.";
            idArray[nextIndex]=ScannerUtil.nextInt(scanner, message);
            
            message = "이름를 입력해주세요.";
            nameArray[nextIndex]=ScannerUtil.nextLine(scanner, message);
            
            message = "국어 점수를 입력해주세요.";
            koreanArray[nextIndex]=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
            
            message = "영어 점수를 입력해주세요.";
            englishArray[nextIndex]=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
            
            message = "수학 점수를 입력해주세요.";
            mathArray[nextIndex]=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
            
            nextIndex++;
        }else {
            // 배열에 모든칸에 정보가 들어있으므로
            // 경고 메세지만 출력
            System.out.println("더이상 입력하실 수 없습니다.");
        }
    }
    // 목록 출력을 담당하는 메소드
    public static void printAll() {
        if(nextIndex>0) {
            // 입력된 학생이 하나라도 존재하므로
            // for 문을 사용하여 개별 출력하는 메소드를 호출한다.
            for(int i=0;i<nextIndex;i++) {
                printOne(i);
            }
        }else {
            // 입력된 학생이 하나도 없으므로
            // 경고 메세지만 출력
            System.out.println("아직 입력된 정보가 존재하지 않습니다.");
        }
    }
    // 개별 출력을 담당하는 메소드
    public static void printOne(int index) {
        int sum=koreanArray[index]+englishArray[index]+mathArray[index];
        double average = (double)sum/SUBJECT_SIZE;
        
        System.out.printf("번호: %d번 이름: %s\n", idArray[index],nameArray[index]);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", koreanArray[index],englishArray[index],mathArray[index]);
        System.out.printf("총점: %03d점 평균: %06.2f점\n",sum, average);
    }
    // 메뉴메소드
    public static void showMenu() {
        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner,message,1,3);
            
            if(userChoice==1) {
                insert();
                
            }else if(userChoice==2) {
                printAll();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        showMenu();
        
        scanner.close();
        
    }
}
