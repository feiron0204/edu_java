package day1027;

import java.util.Scanner;
import util.ScannerUtil;
import struct.Student;
public class Ex04GradeBook01t {
    // 상수
    public static final int SUBJECT_SIZE=3;
    public static final int SCORE_MIN=0;
    public static final int SCORE_MAX=100;
    // 변수
    public static Scanner scanner = new Scanner(System.in);
    public static Student s=null;
    
    public static void insert() {
        s=new Student();
        
        String message;
        
        message="학생의 번호를 입력해주세요.";
        s.id=ScannerUtil.nextInt(scanner, message);
        
        message="학생의 이름를 입력해주세요.";
        s.name=ScannerUtil.nextLine(scanner, message);
        
        message="학생의 국어 점수를 입력해주세요.";
        s.korean=ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        
        message="학생의 영어 점수를 입력해주세요.";
        s.english=ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        
        message="학생의 수학 점수를 입력해주세요.";
        s.math=ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
    }
    
    public static void print() {
        if(s!=null) {
            int sum=s.korean+s.english+s.math;
            double average=(double)sum/SUBJECT_SIZE;
            
            System.out.printf("번호: %d 이름: %s \n", s.id,s.name);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s.korean,s.english,s.math);
            System.out.printf("총점: %03d점 평균: %06.2f점\n", sum,average);
        }else {
            System.out.println("아직 입력된 정보가 없습니다.");
        }
    }
    
    public static void showMenu() {
        String message="1. 입력 2. 출력 3. 종료";
        
        while(true) {
            int userChoice=ScannerUtil.nextInt(scanner, message);
            if(userChoice==1) {
                insert();
            }else if(userChoice==2) {
                print();
            }else if(userChoice==3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    public static void main(String[] args) {
        showMenu();
    }
}
