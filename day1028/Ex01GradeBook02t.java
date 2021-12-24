package day1028;
// Student 구조체를 사용하여
// 5명을 배열로 관리하는 프로그램
import util.ScannerUtil;
import java.util.Scanner;
import struct.Student;

public class Ex01GradeBook02t {
    // 상수
    public static final int STUDENT_SIZE=5;
    public static final int SUBJECT_SIZE=3;
    public static final int SCORE_MIN=0;
    public static final int SCORE_MAX=100;
    
    // 변수
    public static Scanner scanner = new Scanner(System.in);
    public static Student[] studentArray=new Student[STUDENT_SIZE];
    public static int nextIndex=0;
    
    public static void insert() {
        if(nextIndex<STUDENT_SIZE) {
            Student s=new Student();
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
            
            studentArray[nextIndex]=s;
            
            nextIndex++;
            /*
             * 위에 두줄합쳐서 studentArray[nextIndex++]=s; 십가능
             */
             
        }else {
            System.out.println("더이상 입력하실 수 없습니다.");
        }
    }
    
    public static void print() {
        if(nextIndex>0) {
            for(int i=0;i<nextIndex;i++) {
                Student s=studentArray[i];
                /*
                 * 위의 코드 한줄은 아래 값 호출할때 stud~~~~[i].~~ 쓰기 귀차느니 쓰는 코드
                 */
                int sum = s.korean+s.english+s.math;
                double average=(double)sum/SUBJECT_SIZE;
                
                System.out.println((i+1)+"번째 학생 정보");
                System.out.printf("번호: %d번 이름: %s\n",s.id,s.name);
                System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",s.korean,s.english,s.math);
                System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
                System.out.println("----------------------\n");
                
            }
        }else {
            System.out.println("아직 등록된 학생이 존재하지 않습니다.");
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
