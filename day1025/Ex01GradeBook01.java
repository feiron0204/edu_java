package day1025;

import java.util.Scanner;
import util.ScannerUtil;
public class Ex01GradeBook01 {
    public static void main(String[] args) {
        final int SCORE_MIN=0;
        final int SCORE_MAX = 100;
        final int SUBJECT_SIZE=3;
        Scanner scanner=new Scanner(System.in);
        int id = 0;
        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
        boolean inputSwitch = false;
        
        while(true) {
            String menu ="1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, menu, 1, 3);
                
            if(userChoice ==1) {
                String message = "번호를 입력해주세요.";
                id=ScannerUtil.nextInt(scanner, message);
                
                message = "이름을 입력해주세요.";
                name=ScannerUtil.nextLine(scanner, message);
                
                message = "국어 점수를 입력해주세요.";
                korean=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
                
                message = "영어 점수를 입력해주세요.";
                english=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
                
                message = "수학 점수를 입력해주세요.";
                math=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
                
                inputSwitch=true;
            }else if (userChoice==2) {
                if(inputSwitch){
                    System.out.printf("번호: %d번 이름: %s\n", id,name);
                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean,english,math);
                    int sum = korean + english + math;
                    double average =(double)sum/SUBJECT_SIZE;
                    System.out.printf("종점: %03d점 평균: %06.2f점\n", sum, average);
                }else {
                    System.out.println("아직 입력된 정보가 존재하지 않습니다.");
                }
            }else if (userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        
        
        
        scanner.close();
    }

}
