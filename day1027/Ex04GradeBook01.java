package day1027;
// 학생 한명의 정보를 관리하는 프로그램을 만들되
// Student 구조체를 사용하고, 입력과 출력을 분리하시오 -> ver 1.0

// ver 2.0: 배열로 5명을 관리하는 프로그램을 작성하시오.

// ver 3.0: ArrayUtil에 Student 배열을 동적할당하는 메소드를 만들고
//          그것을 사용하여 학생들을 관리하는 프로그램을 작성하시오.
//          이때에는 개별 수정, 삭제도 가능해야 합니다.

// 숙제: 게시판을 구조체로 만들고 동적할당을 적용시켜서
//      관리하는 프로그램을 만드시오
import java.util.Scanner;
import struct.Student;
import util.ScannerUtil;

public class Ex04GradeBook01 {
    public static final int SCORE_MIN=0;
    public static final int SCORE_MAX=100;
    public static final int SUBJECT_SIZE=3;
    public static final int INPUT_CODE=1;
    public static final int PRINT_CODE=2;
    public static final int EXIT_CODE=3;
    public static Scanner scanner=new Scanner(System.in);
    public static Student student=new Student();
    //입력메소드
    public static void input() {
        String message;
        message="학생 번호를 입력해주세요.";
        student.id=ScannerUtil.nextInt(scanner, message);
        message="학생 이름를 입력해주세요.";
        student.name=ScannerUtil.nextLine(scanner, message);
        message="학생 국어 점수를 입력해주세요.";
        student.korean=ScannerUtil.nextInt(scanner, message);
        message="학생 영어 점수를 입력해주세요.";
        student.english=ScannerUtil.nextInt(scanner, message);
        message="학생 수학 점수를 입력해주세요.";
        student.math=ScannerUtil.nextInt(scanner, message);
    }
    //출력메소드
    public static void print() {
        if(student.name==null) {
            System.out.println("아직 입력된값이 없습니다.");
        }else {
            int sum = student.korean+student.english+student.math;
            double average = (double) sum / SUBJECT_SIZE;

            System.out.printf("번호: %d번 이름: %s\n", student.id, student.name);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", student.korean,
                    student.english, student.math);
            System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

        }
            
    }
    //메뉴메소드
    public static void selectMenu() {
        while(true) {
            String message;
            message="1. 입력 2. 출력 3. 종료";
            int userChoice=ScannerUtil.nextInt(scanner, message);
            if(userChoice==INPUT_CODE) {
                input();
            }else if(userChoice==PRINT_CODE) {
                print();
            }else if(userChoice==EXIT_CODE) {
                System.out.println("사용해 주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }
    //메인메소드
    public static void main(String[] args) {
        selectMenu();
    }
}
